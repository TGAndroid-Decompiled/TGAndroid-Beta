package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;

public class CalendarActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_ARCHIVED_STORIES = 3;
    public static final int TYPE_CHAT_ACTIVITY = 0;
    public static final int TYPE_MEDIA_CALENDAR = 1;
    public static final int TYPE_PROFILE_STORIES = 2;
    TextPaint activeTextPaint;
    CalendarAdapter adapter;
    BackDrawable backDrawable;
    Paint blackoutPaint;
    private View blurredView;
    private FrameLayout bottomBar;
    private int calendarType;
    Callback callback;
    private boolean canClearHistory;
    ChatActivity chatActivity;
    private boolean checkEnterItems;
    FrameLayout contentView;
    private int dateSelectedEnd;
    private int dateSelectedStart;
    private long dialogId;
    boolean endReached;
    private boolean inSelectionMode;
    private boolean isOpened;
    int lastDaysSelected;
    int lastId;
    boolean lastInSelectionMode;
    LinearLayoutManager layoutManager;
    RecyclerListView listView;
    private boolean loading;
    private SpoilerEffect mediaSpoilerEffect;
    SparseArray<SparseArray<PeriodDay>> messagesByYearMounth;
    private int minDate;
    int minMontYear;
    int monthCount;
    private Path path;
    private int photosVideosTypeFilter;
    TextView removeDaysButton;
    TextView selectDaysButton;
    HintView selectDaysHint;
    private Paint selectOutlinePaint;
    private Paint selectPaint;
    int selectedMonth;
    int selectedYear;
    private ValueAnimator selectionAnimator;
    int startFromMonth;
    int startFromYear;
    int startOffset;
    private StoriesController.StoriesList storiesList;
    private int storiesPlaceDay;
    private StoryViewer.HolderDrawAbove storiesPlaceDrawAbove;
    private StoryViewer.PlaceProvider storiesPlaceProvider;
    TextPaint textPaint;
    TextPaint textPaint2;
    private long topicId;

    public class AnonymousClass1 implements StoryViewer.PlaceProvider {
        public AnonymousClass1() {
        }

        public void lambda$findView$0(Canvas canvas, RectF rectF, float f, boolean z) {
            CalendarActivity.this.blackoutPaint.setAlpha((int) (80.0f * f));
            float fLerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f);
            canvas.drawRoundRect(rectF, fLerp, fLerp, CalendarActivity.this.blackoutPaint);
            float fClamp = Utilities.clamp((f - 0.5f) / 0.5f, 1.0f, 0.0f);
            if (fClamp > 0.0f) {
                int alpha = CalendarActivity.this.activeTextPaint.getAlpha();
                CalendarActivity.this.activeTextPaint.setAlpha((int) (alpha * fClamp));
                canvas.save();
                float fMin = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
                canvas.scale(fMin, fMin, rectF.centerX(), rectF.centerY());
                canvas.drawText(Integer.toString(CalendarActivity.this.storiesPlaceDay + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), CalendarActivity.this.activeTextPaint);
                canvas.restore();
                CalendarActivity.this.activeTextPaint.setAlpha(alpha);
            }
        }

        @Override
        public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
            if (CalendarActivity.this.listView != null) {
                loop0: for (int i4 = 0; i4 < CalendarActivity.this.listView.getChildCount(); i4++) {
                    View childAt = CalendarActivity.this.listView.getChildAt(i4);
                    if (childAt instanceof MonthView) {
                        MonthView monthView = (MonthView) childAt;
                        if (monthView.messagesByDays != null) {
                            for (int i5 = 0; i5 < monthView.messagesByDays.size(); i5++) {
                                ArrayList<Integer> arrayList = monthView.messagesByDays.valueAt(i5).storyItems;
                                if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                    ImageReceiver imageReceiver = monthView.imagesByDays.get(CalendarActivity.this.storiesPlaceDay = monthView.messagesByDays.keyAt(i5));
                                    if (imageReceiver == null) {
                                        break loop0;
                                    }
                                    transitionViewHolder.storyImage = imageReceiver;
                                    if (CalendarActivity.this.storiesPlaceDrawAbove == null) {
                                        CalendarActivity.this.storiesPlaceDrawAbove = new PhotoViewer$55$$ExternalSyntheticLambda2(this, 4);
                                    }
                                    transitionViewHolder.drawAbove = CalendarActivity.this.storiesPlaceDrawAbove;
                                    transitionViewHolder.view = monthView;
                                    transitionViewHolder.clipParent = CalendarActivity.this.fragmentView;
                                    transitionViewHolder.clipTop = AndroidUtilities.dp(36.0f);
                                    transitionViewHolder.clipBottom = CalendarActivity.this.fragmentView.getBottom();
                                    transitionViewHolder.avatarImage = null;
                                    return true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public void loadNext(boolean z) {
        }

        @Override
        public void preLayout(long j, int i, Runnable runnable) {
            if (CalendarActivity.this.listView == null) {
                runnable.run();
            }
            CalendarActivity.this.listView.post(runnable);
        }
    }

    public class CalendarAdapter extends RecyclerView.Adapter {
        private CalendarAdapter() {
        }

        @Override
        public int getItemCount() {
            return CalendarActivity.this.monthCount;
        }

        @Override
        public long getItemId(int i) {
            CalendarActivity calendarActivity = CalendarActivity.this;
            return (((long) (calendarActivity.startFromYear - (i / 12))) * 100) + ((long) (calendarActivity.startFromMonth - (i % 12)));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MonthView monthView = (MonthView) viewHolder.itemView;
            CalendarActivity calendarActivity = CalendarActivity.this;
            int i2 = calendarActivity.startFromYear - (i / 12);
            int i3 = calendarActivity.startFromMonth - (i % 12);
            if (i3 < 0) {
                i3 += 12;
                i2--;
            }
            monthView.setDate(i2, i3, calendarActivity.messagesByYearMounth.get((i2 * 100) + i3), monthView.currentYear == i2 && monthView.currentMonthInYear == i3);
            monthView.startSelectionAnimation(CalendarActivity.this.dateSelectedStart, CalendarActivity.this.dateSelectedEnd);
            monthView.setSelectionValue(1.0f);
            CalendarActivity.this.updateRowSelections(monthView, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(CalendarActivity.this.new MonthView(viewGroup.getContext()));
        }

        public CalendarAdapter(CalendarActivity calendarActivity, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public interface Callback {
        void onDateSelected(int i, int i2);
    }

    public class MonthView extends FrameLayout {
        boolean attached;
        int cellCount;
        int currentMonthInYear;
        int currentYear;
        int daysInMonth;
        GestureDetectorCompat gestureDetector;
        SparseArray<ImageReceiver> imagesByDays;
        SparseArray<PeriodDay> messagesByDays;
        private SparseArray<ValueAnimator> rowAnimators;
        private SparseArray<RowAnimationValue> rowSelectionPos;
        int startDayOfWeek;
        int startMonthTime;
        SimpleTextView titleView;

        public class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
            final Context val$context;
            final CalendarActivity val$this$0;

            public AnonymousClass2(CalendarActivity calendarActivity, Context context) {
                this.val$this$0 = calendarActivity;
                this.val$context = context;
            }

            private PeriodDay getDayAtCoord(float f, float f2) {
                PeriodDay periodDay;
                MonthView monthView = MonthView.this;
                if (monthView.messagesByDays == null) {
                    return null;
                }
                int i = monthView.startDayOfWeek;
                float measuredWidth = monthView.getMeasuredWidth() / 7.0f;
                float fDp = AndroidUtilities.dp(52.0f);
                int iDp = AndroidUtilities.dp(44.0f) / 2;
                int i2 = 0;
                for (int i3 = 0; i3 < MonthView.this.daysInMonth; i3++) {
                    float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                    float fDp2 = (fDp / 2.0f) + (i2 * fDp) + AndroidUtilities.dp(44.0f);
                    float f4 = iDp;
                    if (f >= f3 - f4 && f <= f3 + f4 && f2 >= fDp2 - f4 && f2 <= fDp2 + f4 && (periodDay = MonthView.this.messagesByDays.get(i3, null)) != null) {
                        return periodDay;
                    }
                    i++;
                    if (i >= 7) {
                        i2++;
                        i = 0;
                    }
                }
                return null;
            }

            public void lambda$onLongPress$0(BaseFragment baseFragment, PeriodDay periodDay) {
                CalendarActivity.this.finishFragment();
                ((ChatActivity) baseFragment).jumpToDate(periodDay.date);
            }

            public void lambda$onLongPress$1(PeriodDay periodDay, View view) {
                if (((BaseFragment) CalendarActivity.this).parentLayout != null && ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size() >= 3) {
                    BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack());
                    if (baseFragment instanceof ChatActivity) {
                        AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, (ChatActivity) baseFragment, periodDay, 2), 300L);
                    }
                }
                CalendarActivity.this.finishPreviewFragment();
            }

            public void lambda$onLongPress$2(PeriodDay periodDay, View view) {
                CalendarActivity calendarActivity = CalendarActivity.this;
                calendarActivity.dateSelectedStart = calendarActivity.dateSelectedEnd = periodDay.date;
                CalendarActivity.this.inSelectionMode = true;
                CalendarActivity.this.updateTitle();
                CalendarActivity.this.animateSelection();
                CalendarActivity.this.finishPreviewFragment();
            }

            public void lambda$onLongPress$3(View view) {
                if (((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size() >= 3) {
                    final BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack());
                    if (baseFragment instanceof ChatActivity) {
                        CalendarActivity calendarActivity = CalendarActivity.this;
                        AlertsCreator.createClearDaysDialogAlert(calendarActivity, 1, calendarActivity.getMessagesController().getUser(Long.valueOf(CalendarActivity.this.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                            @Override
                            public void run(boolean z) {
                                CalendarActivity.this.finishFragment();
                                ((ChatActivity) baseFragment).deleteHistory(CalendarActivity.this.dateSelectedStart, CalendarActivity.this.dateSelectedEnd + 86400, z);
                            }
                        }, null);
                    }
                }
                CalendarActivity.this.finishPreviewFragment();
            }

            public void lambda$onLongPress$4(View view) {
                CalendarActivity.this.finishPreviewFragment();
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                final PeriodDay dayAtCoord;
                super.onLongPress(motionEvent);
                if (CalendarActivity.this.calendarType != 0 || AndroidUtilities.isTablet() || (dayAtCoord = getDayAtCoord(motionEvent.getX(), motionEvent.getY())) == null) {
                    return;
                }
                try {
                    MonthView.this.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                Bundle bundle = new Bundle();
                if (CalendarActivity.this.dialogId > 0) {
                    bundle.putLong("user_id", CalendarActivity.this.dialogId);
                } else {
                    bundle.putLong("chat_id", -CalendarActivity.this.dialogId);
                }
                bundle.putInt("start_from_date", dayAtCoord.date);
                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                ChatActivity chatActivity = new ChatActivity(bundle);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(CalendarActivity.this.getParentActivity(), R.drawable.popup_fixed_alert, CalendarActivity.this.getResourceProvider(), 0);
                actionBarPopupWindowLayout.setBackgroundColor(CalendarActivity.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, CalendarActivity.this.getParentActivity(), null, true, false);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message);
                actionBarMenuSubItem.setMinimumWidth(160);
                final int i = 0;
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(this) {
                    public final CalendarActivity.MonthView.AnonymousClass2 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$onLongPress$1(dayAtCoord, view);
                                break;
                            default:
                                this.f$0.lambda$onLongPress$2(dayAtCoord, view);
                                break;
                        }
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                if (CalendarActivity.this.canClearHistory) {
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, CalendarActivity.this.getParentActivity(), null, false, false);
                    actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select);
                    actionBarMenuSubItem2.setMinimumWidth(160);
                    final int i2 = 1;
                    actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(this) {
                        public final CalendarActivity.MonthView.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$onLongPress$1(dayAtCoord, view);
                                    break;
                                default:
                                    this.f$0.lambda$onLongPress$2(dayAtCoord, view);
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, CalendarActivity.this.getParentActivity(), null, false, true);
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete);
                    actionBarMenuSubItem3.setMinimumWidth(160);
                    final int i3 = 0;
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(this) {
                        public final CalendarActivity.MonthView.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$onLongPress$3(view);
                                    break;
                                default:
                                    this.f$0.lambda$onLongPress$4(view);
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindowLayout.addView(actionBarMenuSubItem3);
                }
                actionBarPopupWindowLayout.setFitItems(true);
                CalendarActivity.this.blurredView = new View(this.val$context) {
                    @Override
                    public void setAlpha(float f) {
                        super.setAlpha(f);
                        View view = CalendarActivity.this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                };
                final int i4 = 1;
                CalendarActivity.this.blurredView.setOnClickListener(new View.OnClickListener(this) {
                    public final CalendarActivity.MonthView.AnonymousClass2 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onLongPress$3(view);
                                break;
                            default:
                                this.f$0.lambda$onLongPress$4(view);
                                break;
                        }
                    }
                });
                CalendarActivity.this.blurredView.setVisibility(8);
                CalendarActivity.this.blurredView.setFitsSystemWindows(true);
                ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getOverlayContainerView().addView(CalendarActivity.this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
                CalendarActivity.this.prepareBlurBitmap();
                CalendarActivity.this.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                PeriodDay dayAtCoord;
                if (((BaseFragment) CalendarActivity.this).parentLayout == null) {
                    return false;
                }
                if (((CalendarActivity.this.calendarType == 1 && MonthView.this.messagesByDays != null) || CalendarActivity.this.storiesList != null) && (dayAtCoord = getDayAtCoord(motionEvent.getX(), motionEvent.getY())) != null && dayAtCoord.messageObject != null) {
                    CalendarActivity calendarActivity = CalendarActivity.this;
                    if (calendarActivity.callback != null) {
                        if (calendarActivity.storiesList != null) {
                            StoryViewer orCreateStoryViewer = CalendarActivity.this.getOrCreateStoryViewer();
                            Context context = MonthView.this.getContext();
                            MessageObject messageObject = dayAtCoord.messageObject;
                            TL_stories.StoryItem storyItem = messageObject.storyItem;
                            int id = messageObject.getId();
                            StoriesController.StoriesList storiesList = CalendarActivity.this.storiesList;
                            StoryViewer.PlaceProvider placeProvider = CalendarActivity.this.storiesPlaceProvider;
                            orCreateStoryViewer.currentAccount = UserConfig.selectedAccount;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(storiesList.dialogId));
                            orCreateStoryViewer.dayStoryId = id;
                            orCreateStoryViewer.open(UserConfig.selectedAccount, context, storyItem, arrayList, 0, storiesList, null, placeProvider, true);
                        } else {
                            CalendarActivity.this.callback.onDateSelected(dayAtCoord.messageObject.getId(), dayAtCoord.startOffset);
                            CalendarActivity.this.finishFragment();
                        }
                    }
                }
                MonthView monthView = MonthView.this;
                if (monthView.messagesByDays != null) {
                    if (CalendarActivity.this.inSelectionMode) {
                        PeriodDay dayAtCoord2 = getDayAtCoord(motionEvent.getX(), motionEvent.getY());
                        if (dayAtCoord2 != null) {
                            if (CalendarActivity.this.selectionAnimator != null) {
                                CalendarActivity.this.selectionAnimator.cancel();
                                CalendarActivity.this.selectionAnimator = null;
                            }
                            if (CalendarActivity.this.dateSelectedStart == 0 && CalendarActivity.this.dateSelectedEnd == 0) {
                                CalendarActivity calendarActivity2 = CalendarActivity.this;
                                calendarActivity2.dateSelectedStart = calendarActivity2.dateSelectedEnd = dayAtCoord2.date;
                            } else if (CalendarActivity.this.dateSelectedStart == dayAtCoord2.date && CalendarActivity.this.dateSelectedEnd == dayAtCoord2.date) {
                                CalendarActivity calendarActivity3 = CalendarActivity.this;
                                calendarActivity3.dateSelectedStart = calendarActivity3.dateSelectedEnd = 0;
                            } else if (CalendarActivity.this.dateSelectedStart == dayAtCoord2.date) {
                                CalendarActivity calendarActivity4 = CalendarActivity.this;
                                calendarActivity4.dateSelectedStart = calendarActivity4.dateSelectedEnd;
                            } else if (CalendarActivity.this.dateSelectedEnd == dayAtCoord2.date) {
                                CalendarActivity calendarActivity5 = CalendarActivity.this;
                                calendarActivity5.dateSelectedEnd = calendarActivity5.dateSelectedStart;
                            } else if (CalendarActivity.this.dateSelectedStart != CalendarActivity.this.dateSelectedEnd) {
                                CalendarActivity calendarActivity6 = CalendarActivity.this;
                                calendarActivity6.dateSelectedStart = calendarActivity6.dateSelectedEnd = dayAtCoord2.date;
                            } else if (dayAtCoord2.date > CalendarActivity.this.dateSelectedEnd) {
                                CalendarActivity.this.dateSelectedEnd = dayAtCoord2.date;
                            } else {
                                CalendarActivity.this.dateSelectedStart = dayAtCoord2.date;
                            }
                            CalendarActivity.this.updateTitle();
                            CalendarActivity.this.animateSelection();
                        }
                    } else {
                        PeriodDay dayAtCoord3 = getDayAtCoord(motionEvent.getX(), motionEvent.getY());
                        if (dayAtCoord3 != null && ((BaseFragment) CalendarActivity.this).parentLayout != null && ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size() >= 2) {
                            BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack());
                            if (baseFragment instanceof ChatActivity) {
                                CalendarActivity.this.finishFragment();
                                ((ChatActivity) baseFragment).jumpToDate(dayAtCoord3.date);
                            }
                        } else if (dayAtCoord3 != null) {
                            CalendarActivity calendarActivity7 = CalendarActivity.this;
                            if (calendarActivity7.chatActivity != null) {
                                calendarActivity7.finishFragment();
                                CalendarActivity.this.chatActivity.jumpToDate(dayAtCoord3.date);
                            }
                        }
                    }
                }
                return false;
            }
        }

        public MonthView(Context context) {
            super(context);
            this.messagesByDays = new SparseArray<>();
            this.imagesByDays = new SparseArray<>();
            this.rowAnimators = new SparseArray<>();
            this.rowSelectionPos = new SparseArray<>();
            setWillNotDraw(false);
            this.titleView = new SimpleTextView(context);
            if (CalendarActivity.this.calendarType == 0 && CalendarActivity.this.canClearHistory) {
                this.titleView.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, 1));
                this.titleView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MonthView monthView;
                        MonthView monthView2 = MonthView.this;
                        if (monthView2.messagesByDays != null && CalendarActivity.this.inSelectionMode) {
                            int i = 0;
                            int i2 = -1;
                            int i3 = -1;
                            while (true) {
                                monthView = MonthView.this;
                                if (i >= monthView.daysInMonth) {
                                    break;
                                }
                                PeriodDay periodDay = monthView.messagesByDays.get(i, null);
                                if (periodDay != null) {
                                    if (i2 == -1) {
                                        i2 = periodDay.date;
                                    }
                                    i3 = periodDay.date;
                                }
                                i++;
                            }
                            if (i2 < 0 || i3 < 0) {
                                return;
                            }
                            CalendarActivity.this.dateSelectedStart = i2;
                            CalendarActivity.this.dateSelectedEnd = i3;
                            CalendarActivity.this.updateTitle();
                            CalendarActivity.this.animateSelection();
                        }
                    }
                });
            }
            this.titleView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            this.titleView.setTextSize(15);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setGravity(17);
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(this.titleView, LayoutHelper.createFrame(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
            GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, new AnonymousClass2(CalendarActivity.this, context));
            this.gestureDetector = gestureDetectorCompat;
            gestureDetectorCompat.mDetector.setIsLongpressEnabled(CalendarActivity.this.calendarType == 0);
        }

        public void lambda$animateRow$1(RowAnimationValue rowAnimationValue, float f, float f2, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            rowAnimationValue.startX = DiffUtil.m(f2, f, fFloatValue, f);
            rowAnimationValue.endX = DiffUtil.m(f4, f3, fFloatValue, f3);
            rowAnimationValue.alpha = DiffUtil.m(f6, f5, fFloatValue, f5);
            invalidate();
        }

        public boolean lambda$new$0(View view) {
            if (this.messagesByDays == null) {
                return false;
            }
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < this.daysInMonth; i3++) {
                PeriodDay periodDay = this.messagesByDays.get(i3, null);
                if (periodDay != null) {
                    if (i == -1) {
                        i = periodDay.date;
                    }
                    i2 = periodDay.date;
                }
            }
            if (i >= 0 && i2 >= 0) {
                CalendarActivity.this.inSelectionMode = true;
                CalendarActivity.this.dateSelectedStart = i;
                CalendarActivity.this.dateSelectedEnd = i2;
                CalendarActivity.this.updateTitle();
                CalendarActivity.this.animateSelection();
            }
            return false;
        }

        public void setSelectionValue(float f) {
            if (this.messagesByDays != null) {
                for (int i = 0; i < this.daysInMonth; i++) {
                    PeriodDay periodDay = this.messagesByDays.get(i, null);
                    if (periodDay != null) {
                        float f2 = periodDay.fromSelProgress;
                        periodDay.selectProgress = DiffUtil.m(periodDay.toSelProgress, f2, f, f2);
                        float f3 = periodDay.fromSelSEProgress;
                        periodDay.selectStartEndProgress = DiffUtil.m(periodDay.toSelSEProgress, f3, f, f3);
                    }
                }
            }
            invalidate();
        }

        public void startSelectionAnimation(int i, int i2) {
            if (this.messagesByDays != null) {
                for (int i3 = 0; i3 < this.daysInMonth; i3++) {
                    PeriodDay periodDay = this.messagesByDays.get(i3, null);
                    if (periodDay != null) {
                        periodDay.fromSelProgress = periodDay.selectProgress;
                        int i4 = periodDay.date;
                        periodDay.toSelProgress = (i4 < i || i4 > i2) ? 0.0f : 1.0f;
                        periodDay.fromSelSEProgress = periodDay.selectStartEndProgress;
                        if (i4 == i || i4 == i2) {
                            periodDay.toSelSEProgress = 1.0f;
                        } else {
                            periodDay.toSelSEProgress = 0.0f;
                        }
                    }
                }
            }
        }

        public void animateRow(final int i, int i2, int i3, final boolean z, boolean z2) {
            final float f;
            final float f2;
            final float f3;
            float f4;
            final float f5;
            ValueAnimator valueAnimator = this.rowAnimators.get(i);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float measuredWidth = getMeasuredWidth() / 7.0f;
            RowAnimationValue rowAnimationValue = this.rowSelectionPos.get(i);
            if (rowAnimationValue != null) {
                float f6 = rowAnimationValue.startX;
                f2 = rowAnimationValue.endX;
                f3 = rowAnimationValue.alpha;
                f = f6;
            } else {
                f = (measuredWidth / 2.0f) + (i2 * measuredWidth);
                f2 = f;
                f3 = 0.0f;
            }
            if (z) {
                f4 = (measuredWidth / 2.0f) + (i2 * measuredWidth);
            } else {
                f4 = f;
            }
            if (z) {
                f5 = (measuredWidth / 2.0f) + (i3 * measuredWidth);
            } else {
                f5 = f2;
            }
            float f7 = z ? 1.0f : 0.0f;
            final RowAnimationValue rowAnimationValue2 = new RowAnimationValue(f, f2);
            this.rowSelectionPos.put(i, rowAnimationValue2);
            if (!z2) {
                rowAnimationValue2.startX = f4;
                rowAnimationValue2.endX = f5;
                rowAnimationValue2.alpha = f7;
                invalidate();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(Easings.easeInOutQuad);
            final float f8 = f4;
            final float f9 = f7;
            final float f10 = f5;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$animateRow$1(rowAnimationValue2, f, f8, f2, f5, f3, f9, valueAnimator2);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    RowAnimationValue rowAnimationValue3 = rowAnimationValue2;
                    rowAnimationValue3.startX = f8;
                    rowAnimationValue3.endX = f10;
                    rowAnimationValue3.alpha = f9;
                    MonthView.this.invalidate();
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    MonthView.this.rowAnimators.remove(i);
                    if (z) {
                        return;
                    }
                    MonthView.this.rowSelectionPos.remove(i);
                }
            });
            duration.start();
            this.rowAnimators.put(i, duration);
        }

        public void dismissRowAnimations(boolean z) {
            for (int i = 0; i < this.rowSelectionPos.size(); i++) {
                animateRow(this.rowSelectionPos.keyAt(i), 0, 0, false, z);
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            if (this.imagesByDays != null) {
                for (int i = 0; i < this.imagesByDays.size(); i++) {
                    this.imagesByDays.valueAt(i).onAttachedToWindow();
                }
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            if (this.imagesByDays != null) {
                for (int i = 0; i < this.imagesByDays.size(); i++) {
                    this.imagesByDays.valueAt(i).onDetachedFromWindow();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            boolean[] zArr;
            float f;
            boolean[] zArr2;
            float f2;
            float f3;
            float f4;
            ?? r7;
            Canvas canvas2 = canvas;
            super.onDraw(canvas);
            int i = this.startDayOfWeek;
            float measuredWidth = getMeasuredWidth() / 7.0f;
            float fDp = AndroidUtilities.dp(52.0f);
            float f5 = 44.0f;
            int iDp = AndroidUtilities.dp(44.0f);
            boolean z = false;
            int i2 = 0;
            while (true) {
                zArr = null;
                f = 2.0f;
                if (i2 >= Math.ceil((this.startDayOfWeek + this.daysInMonth) / 7.0f)) {
                    break;
                }
                float fDp2 = (fDp / 2.0f) + (i2 * fDp) + AndroidUtilities.dp(44.0f);
                RowAnimationValue rowAnimationValue = this.rowSelectionPos.get(i2);
                if (rowAnimationValue != null) {
                    CalendarActivity.this.selectPaint.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false));
                    CalendarActivity.this.selectPaint.setAlpha((int) (rowAnimationValue.alpha * 40.8f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f6 = iDp / 2.0f;
                    rectF.set(rowAnimationValue.startX - f6, fDp2 - f6, rowAnimationValue.endX + f6, fDp2 + f6);
                    float fDp3 = AndroidUtilities.dp(32.0f);
                    canvas2.drawRoundRect(rectF, fDp3, fDp3, CalendarActivity.this.selectPaint);
                }
                i2++;
            }
            int i3 = i;
            int i4 = 0;
            int i5 = 0;
            while (i5 < this.daysInMonth) {
                float f7 = (i3 * measuredWidth) + (measuredWidth / f);
                float fDp4 = AndroidUtilities.dp(f5) + (fDp / f) + (i4 * fDp);
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                SparseArray<PeriodDay> sparseArray = this.messagesByDays;
                ?? r5 = sparseArray != null ? sparseArray.get(i5, zArr) : zArr;
                int i6 = i5 + 1;
                if (iCurrentTimeMillis < (i6 * 86400) + this.startMonthTime) {
                    i4 = i4;
                    zArr2 = zArr;
                    int alpha = CalendarActivity.this.textPaint.getAlpha();
                    CalendarActivity.this.textPaint.setAlpha((int) (alpha * 0.3f));
                    canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.textPaint);
                    CalendarActivity.this.textPaint.setAlpha(alpha);
                } else {
                    if (CalendarActivity.this.minDate > 0) {
                        if (CalendarActivity.this.minDate > ((i5 + 2) * 86400) + this.startMonthTime) {
                            i4 = i4;
                            zArr2 = zArr;
                            int alpha2 = CalendarActivity.this.textPaint.getAlpha();
                            CalendarActivity.this.textPaint.setAlpha((int) (alpha2 * 0.3f));
                            canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.textPaint);
                            CalendarActivity.this.textPaint.setAlpha(alpha2);
                        }
                    }
                    if (r5 == 0 || !r5.hasImage) {
                        i4 = i4;
                        ?? r8 = r5;
                        if (r8 == 0 || r8.selectStartEndProgress < 0.01f) {
                            zArr2 = null;
                            canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.textPaint);
                        } else {
                            CalendarActivity.this.selectPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                            CalendarActivity.this.selectPaint.setAlpha((int) (r8.selectStartEndProgress * 255.0f));
                            canvas2.drawCircle(f7, fDp4, AndroidUtilities.dp(44.0f) / 2.0f, CalendarActivity.this.selectPaint);
                            Paint paint = CalendarActivity.this.selectOutlinePaint;
                            int i7 = Theme.key_chat_messagePanelVoiceBackground;
                            paint.setColor(Theme.getColor(null, i7, false));
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f7 - (AndroidUtilities.dp(44.0f) / 2.0f), fDp4 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f7, (AndroidUtilities.dp(44.0f) / 2.0f) + fDp4);
                            canvas2.drawArc(rectF2, -90.0f, r8.selectStartEndProgress * 360.0f, false, CalendarActivity.this.selectOutlinePaint);
                            int iDp2 = (int) (AndroidUtilities.dp(7.0f) * r8.selectStartEndProgress);
                            zArr2 = null;
                            CalendarActivity.this.selectPaint.setColor(Theme.getColor(null, i7, false));
                            CalendarActivity.this.selectPaint.setAlpha((int) (r8.selectStartEndProgress * 255.0f));
                            canvas2.drawCircle(f7, fDp4, (AndroidUtilities.dp(44.0f) - iDp2) / 2.0f, CalendarActivity.this.selectPaint);
                            float f8 = r8.selectStartEndProgress;
                            if (f8 != 1.0f) {
                                int alpha3 = CalendarActivity.this.textPaint.getAlpha();
                                CalendarActivity.this.textPaint.setAlpha((int) ((1.0f - f8) * alpha3));
                                canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.textPaint);
                                CalendarActivity.this.textPaint.setAlpha(alpha3);
                                int alpha4 = CalendarActivity.this.textPaint.getAlpha();
                                CalendarActivity.this.activeTextPaint.setAlpha((int) (alpha4 * f8));
                                canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.activeTextPaint);
                                CalendarActivity.this.activeTextPaint.setAlpha(alpha4);
                            } else {
                                canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.activeTextPaint);
                            }
                        }
                    } else {
                        if (this.imagesByDays.get(i5) != null) {
                            if (!CalendarActivity.this.checkEnterItems || r5.wasDrawn) {
                                f4 = 2.0f;
                            } else {
                                r5.enterAlpha = 0.0f;
                                f4 = 2.0f;
                                r5.startEnterDelay = Math.max(0.0f, ((getY() + fDp4) / CalendarActivity.this.listView.getMeasuredHeight()) * 150.0f);
                            }
                            float f9 = r5.startEnterDelay;
                            if (f9 > 0.0f) {
                                float f10 = f9 - 16.0f;
                                r5.startEnterDelay = f10;
                                if (f10 < 0.0f) {
                                    r5.startEnterDelay = 0.0f;
                                } else {
                                    invalidate();
                                }
                            }
                            if (r5.startEnterDelay >= 0.0f) {
                                float f11 = r5.enterAlpha;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.07272727f;
                                    r5.enterAlpha = f12;
                                    if (f12 > 1.0f) {
                                        r5.enterAlpha = 1.0f;
                                    } else {
                                        invalidate();
                                    }
                                }
                            }
                            f3 = r5.enterAlpha;
                            if (f3 != 1.0f) {
                                canvas2.save();
                                float f13 = (0.2f * f3) + 0.8f;
                                canvas2.scale(f13, f13, f7, fDp4);
                            }
                            f2 = 1.0f;
                            int iDp3 = (int) (AndroidUtilities.dp(7.0f) * r5.selectProgress);
                            if (r5.selectStartEndProgress >= 0.01f) {
                                CalendarActivity.this.selectPaint.setColor(Theme.getColor(zArr, Theme.key_windowBackgroundWhite, z));
                                CalendarActivity.this.selectPaint.setAlpha((int) (r5.selectStartEndProgress * 255.0f));
                                canvas2.drawCircle(f7, fDp4, AndroidUtilities.dp(44.0f) / f4, CalendarActivity.this.selectPaint);
                                CalendarActivity.this.selectOutlinePaint.setColor(Theme.getColor(zArr, Theme.key_chat_messagePanelVoiceBackground, z));
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(f7 - (AndroidUtilities.dp(44.0f) / f4), fDp4 - (AndroidUtilities.dp(44.0f) / f4), (AndroidUtilities.dp(44.0f) / f4) + f7, (AndroidUtilities.dp(44.0f) / f4) + fDp4);
                                r7 = r5;
                                canvas2 = canvas;
                                canvas2.drawArc(rectF3, -90.0f, r5.selectStartEndProgress * 360.0f, false, CalendarActivity.this.selectOutlinePaint);
                            } else {
                                r7 = r5;
                            }
                            this.imagesByDays.get(i5).setAlpha(r7.enterAlpha);
                            this.imagesByDays.get(i5).setImageCoords(f7 - ((AndroidUtilities.dp(44.0f) - iDp3) / f4), fDp4 - ((AndroidUtilities.dp(44.0f) - iDp3) / f4), AndroidUtilities.dp(44.0f) - iDp3, AndroidUtilities.dp(44.0f) - iDp3);
                            this.imagesByDays.get(i5).draw(canvas2);
                            if (this.messagesByDays.get(i5) != null && this.messagesByDays.get(i5).messageObject != null && this.messagesByDays.get(i5).messageObject.hasMediaSpoilers()) {
                                float fDp5 = (AndroidUtilities.dp(44.0f) - iDp3) / f4;
                                CalendarActivity.this.path.rewind();
                                CalendarActivity.this.path.addCircle(f7, fDp4, fDp5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(CalendarActivity.this.path);
                                CalendarActivity.this.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f * r7.enterAlpha)));
                                CalendarActivity.this.mediaSpoilerEffect.setBounds((int) (f7 - fDp5), (int) (fDp4 - fDp5), (int) (f7 + fDp5), (int) (fDp5 + fDp4));
                                CalendarActivity.this.mediaSpoilerEffect.draw(canvas2);
                                invalidate();
                                canvas2.restore();
                            }
                            CalendarActivity.this.blackoutPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (r7.enterAlpha * 80.0f)));
                            canvas2.drawCircle(f7, fDp4, (AndroidUtilities.dp(44.0f) - iDp3) / f4, CalendarActivity.this.blackoutPaint);
                            r7.wasDrawn = true;
                            if (f3 != 1.0f) {
                                canvas2.restore();
                            }
                        } else {
                            i4 = i4;
                            f7 = f7;
                            fDp4 = fDp4;
                            f2 = 1.0f;
                            f3 = 1.0f;
                        }
                        if (f3 != f2) {
                            int alpha5 = CalendarActivity.this.textPaint.getAlpha();
                            CalendarActivity.this.textPaint.setAlpha((int) ((f2 - f3) * alpha5));
                            canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.textPaint);
                            CalendarActivity.this.textPaint.setAlpha(alpha5);
                            int alpha6 = CalendarActivity.this.textPaint.getAlpha();
                            CalendarActivity.this.activeTextPaint.setAlpha((int) (alpha6 * f3));
                            canvas2.drawText(Integer.toString(i6), f7, AndroidUtilities.dp(5.0f) + fDp4, CalendarActivity.this.activeTextPaint);
                            CalendarActivity.this.activeTextPaint.setAlpha(alpha6);
                        } else {
                            canvas2.drawText(Integer.toString(i6), f7, fDp4 + AndroidUtilities.dp(5.0f), CalendarActivity.this.activeTextPaint);
                        }
                        zArr2 = null;
                    }
                }
                i3++;
                if (i3 >= 7) {
                    i4++;
                    i3 = 0;
                } else {
                    i4 = i4;
                }
                zArr = zArr2;
                i5 = i6;
                f5 = 44.0f;
                z = false;
                f = 2.0f;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.cellCount * 52) + 44), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.gestureDetector.mDetector.onTouchEvent(motionEvent);
        }

        public void setDate(int i, int i2, SparseArray<PeriodDay> sparseArray, boolean z) {
            boolean z2 = false;
            boolean z3 = (i == this.currentYear && i2 == this.currentMonthInYear) ? false : true;
            this.currentYear = i;
            this.currentMonthInYear = i2;
            this.messagesByDays = sparseArray;
            ImageReceiver imageReceiver = null;
            if (z3 && this.imagesByDays != null) {
                for (int i3 = 0; i3 < this.imagesByDays.size(); i3++) {
                    this.imagesByDays.valueAt(i3).onDetachedFromWindow();
                    this.imagesByDays.valueAt(i3).setParentView(null);
                }
                this.imagesByDays = null;
            }
            if (sparseArray != null) {
                if (this.imagesByDays == null) {
                    this.imagesByDays = new SparseArray<>();
                }
                int i4 = 0;
                while (i4 < sparseArray.size()) {
                    int iKeyAt = sparseArray.keyAt(i4);
                    if (this.imagesByDays.get(iKeyAt, imageReceiver) == null && sparseArray.get(iKeyAt).hasImage) {
                        ImageReceiver imageReceiver2 = new ImageReceiver();
                        imageReceiver2.setParentView(this);
                        MessageObject messageObject = sparseArray.get(iKeyAt).messageObject;
                        if (messageObject != null) {
                            boolean zHasMediaSpoilers = messageObject.hasMediaSpoilers();
                            if (messageObject.isVideo()) {
                                TLRPC.Document document = messageObject.getDocument();
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                                if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2) {
                                    closestPhotoSizeWithSize2 = null;
                                }
                                if (closestPhotoSizeWithSize != null) {
                                    if (messageObject.strippedThumb != null) {
                                        imageReceiver2.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", messageObject.strippedThumb, null, messageObject, 0);
                                    } else {
                                        imageReceiver2.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), zHasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", (String) null, messageObject, 0);
                                    }
                                }
                            } else {
                                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, z2, closestPhotoSizeWithSize3, z2);
                                    if (messageObject.mediaExists || DownloadController.getInstance(((BaseFragment) CalendarActivity.this).currentAccount).canDownloadMedia(messageObject)) {
                                        if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                            closestPhotoSizeWithSize3 = null;
                                        }
                                        if (messageObject.strippedThumb != null) {
                                            imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), zHasMediaSpoilers ? "5_5_b" : "44_44", null, null, messageObject.strippedThumb, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        } else {
                                            imageReceiver2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), zHasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        }
                                    } else {
                                        BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                                        if (bitmapDrawable != null) {
                                            imageReceiver2.setImage(null, null, bitmapDrawable, null, messageObject, 0);
                                        } else {
                                            imageReceiver2.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", (String) null, messageObject, 0);
                                        }
                                    }
                                }
                            }
                            imageReceiver2.setRoundRadius(AndroidUtilities.dp(22.0f));
                            this.imagesByDays.put(iKeyAt, imageReceiver2);
                        }
                    }
                    i4++;
                    z2 = false;
                    imageReceiver = null;
                }
            }
            int i5 = i2 + 1;
            this.daysInMonth = YearMonth.of(i, i5).lengthOfMonth();
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, 0);
            this.startDayOfWeek = (calendar.get(7) + 6) % 7;
            this.startMonthTime = (int) (calendar.getTimeInMillis() / 1000);
            int i6 = this.daysInMonth + this.startDayOfWeek;
            this.cellCount = ((int) (i6 / 7.0f)) + (i6 % 7 == 0 ? 0 : 1);
            calendar.set(i, i5, 0);
            this.titleView.setText(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true));
            CalendarActivity.this.updateRowSelections(this, false);
        }
    }

    public static final class RowAnimationValue {
        float alpha;
        float endX;
        float startX;

        public RowAnimationValue(float f, float f2) {
            this.startX = f;
            this.endX = f2;
        }
    }

    public CalendarActivity(Bundle bundle, int i, int i2) {
        super(bundle);
        this.textPaint = new TextPaint(1);
        this.activeTextPaint = new TextPaint(1);
        this.textPaint2 = new TextPaint(1);
        this.selectOutlinePaint = new Paint(1);
        this.selectPaint = new Paint(1);
        this.blackoutPaint = new Paint(1);
        this.messagesByYearMounth = new SparseArray<>();
        this.startOffset = 0;
        this.path = new Path();
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.photosVideosTypeFilter = i;
        if (i2 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) i2) * 1000);
            this.selectedYear = calendar.get(1);
            this.selectedMonth = calendar.get(2);
        }
        this.selectOutlinePaint.setStyle(Paint.Style.STROKE);
        this.selectOutlinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.selectOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void animateSelection() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 29));
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                for (int i = 0; i < CalendarActivity.this.listView.getChildCount(); i++) {
                    ((MonthView) CalendarActivity.this.listView.getChildAt(i)).startSelectionAnimation(CalendarActivity.this.dateSelectedStart, CalendarActivity.this.dateSelectedEnd);
                }
            }
        });
        duration.start();
        this.selectionAnimator = duration;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            updateRowSelections((MonthView) this.listView.getChildAt(i), true);
        }
        for (int i2 = 0; i2 < this.listView.getCachedChildCount(); i2++) {
            MonthView monthView = (MonthView) this.listView.getCachedChildAt(i2);
            updateRowSelections(monthView, false);
            monthView.startSelectionAnimation(this.dateSelectedStart, this.dateSelectedEnd);
            monthView.setSelectionValue(1.0f);
        }
        for (int i3 = 0; i3 < this.listView.getHiddenChildCount(); i3++) {
            MonthView monthView2 = (MonthView) this.listView.getHiddenChildAt(i3);
            updateRowSelections(monthView2, false);
            monthView2.startSelectionAnimation(this.dateSelectedStart, this.dateSelectedEnd);
            monthView2.setSelectionValue(1.0f);
        }
        for (int i4 = 0; i4 < this.listView.getAttachedScrapChildCount(); i4++) {
            MonthView monthView3 = (MonthView) this.listView.getAttachedScrapChildAt(i4);
            updateRowSelections(monthView3, false);
            monthView3.startSelectionAnimation(this.dateSelectedStart, this.dateSelectedEnd);
            monthView3.setSelectionValue(1.0f);
        }
    }

    public void checkLoadNext() {
        if (this.loading || this.endReached) {
            return;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof MonthView) {
                MonthView monthView = (MonthView) childAt;
                int i3 = (monthView.currentYear * 100) + monthView.currentMonthInYear;
                if (i3 < i) {
                    i = i3;
                }
            }
        }
        int i4 = this.minMontYear;
        if ((i4 % 100) + ((i4 / 100) * 12) + 3 >= (i % 100) + ((i / 100) * 12)) {
            loadNext();
        }
    }

    public void lambda$animateSelection$4(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            ((MonthView) this.listView.getChildAt(i)).setSelectionValue(fFloatValue);
        }
    }

    public void lambda$createView$0(View view) {
        this.inSelectionMode = true;
        updateTitle();
    }

    public void lambda$createView$1(View view) {
        int i = this.lastDaysSelected;
        if (i != 0) {
            AlertsCreator.createClearDaysDialogAlert(this, i, getMessagesController().getUser(Long.valueOf(this.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                @Override
                public void run(boolean z) {
                    CalendarActivity.this.finishFragment();
                    if (((BaseFragment) CalendarActivity.this).parentLayout == null || ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size() < 2) {
                        CalendarActivity calendarActivity = CalendarActivity.this;
                        ChatActivity chatActivity = calendarActivity.chatActivity;
                        if (chatActivity != null) {
                            chatActivity.deleteHistory(calendarActivity.dateSelectedStart, CalendarActivity.this.dateSelectedEnd + 86400, z);
                            return;
                        }
                        return;
                    }
                    BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack());
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).deleteHistory(CalendarActivity.this.dateSelectedStart, CalendarActivity.this.dateSelectedEnd + 86400, z);
                    }
                }
            }, null);
            return;
        }
        if (this.selectDaysHint == null) {
            HintView hintView = new HintView(this.contentView.getContext(), 8);
            this.selectDaysHint = hintView;
            hintView.setExtraTranslationY(AndroidUtilities.dp(24.0f));
            this.contentView.addView(this.selectDaysHint, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.selectDaysHint.setText(LocaleController.getString(R.string.SelectDaysTooltip));
        }
        this.selectDaysHint.showForView(this.bottomBar, true);
    }

    public void lambda$loadNext$2(TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        AnonymousClass1 anonymousClass1;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            ?? r3 = 0;
            int i = 0;
            while (true) {
                anonymousClass1 = null;
                if (i >= tL_messages_searchResultsCalendar.periods.size()) {
                    break;
                }
                calendar.setTimeInMillis(((long) tL_messages_searchResultsCalendar.periods.get(i).date) * 1000);
                int i2 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray<PeriodDay> sparseArray = this.messagesByYearMounth.get(i2);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    this.messagesByYearMounth.put(i2, sparseArray);
                }
                PeriodDay periodDay = new PeriodDay(this, anonymousClass1);
                periodDay.messageObject = new MessageObject(this.currentAccount, tL_messages_searchResultsCalendar.messages.get(i), false, false);
                periodDay.date = (int) (calendar.getTimeInMillis() / 1000);
                int i3 = this.startOffset + tL_messages_searchResultsCalendar.periods.get(i).count;
                this.startOffset = i3;
                periodDay.startOffset = i3;
                int i4 = calendar.get(5) - 1;
                if (sparseArray.get(i4, null) == null || !sparseArray.get(i4, null).hasImage) {
                    sparseArray.put(i4, periodDay);
                }
                int i5 = this.minMontYear;
                if (i2 < i5 || i5 == 0) {
                    this.minMontYear = i2;
                }
                i++;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i6 = tL_messages_searchResultsCalendar.min_date;
            this.minDate = i6;
            while (true) {
                calendar.setTimeInMillis(((long) i6) * 1000);
                calendar.set(11, r3);
                calendar.set(12, r3);
                calendar.set(13, r3);
                calendar.set(14, r3);
                if (calendar.getTimeInMillis() / 1000 > iCurrentTimeMillis) {
                    break;
                }
                int i7 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray<PeriodDay> sparseArray2 = this.messagesByYearMounth.get(i7);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    this.messagesByYearMounth.put(i7, sparseArray2);
                }
                int i8 = calendar.get(5) - 1;
                if (sparseArray2.get(i8, null) == null) {
                    PeriodDay periodDay2 = new PeriodDay(this, anonymousClass1);
                    periodDay2.hasImage = r3;
                    periodDay2.date = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray2.put(i8, periodDay2);
                }
                i6 += 86400;
                r3 = 0;
            }
            this.loading = r3;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                this.endReached = true;
            } else {
                this.lastId = ((TLRPC.Message) zzin.m(1, tL_messages_searchResultsCalendar.messages)).id;
                this.endReached = r3;
                checkLoadNext();
            }
            if (this.isOpened) {
                this.checkEnterItems = true;
            }
            this.listView.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - ((long) tL_messages_searchResultsCalendar.min_date)) / 2629800)) + 1;
            this.adapter.notifyItemRangeChanged(r3, this.monthCount);
            int i9 = this.monthCount;
            if (timeInMillis > i9) {
                this.adapter.notifyItemRangeInserted(i9 + 1, timeInMillis);
                this.monthCount = timeInMillis;
            }
            if (this.endReached) {
                resumeDelayedFragmentAnimation();
            }
        }
    }

    public void lambda$loadNext$3(Calendar calendar, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(14, this, tL_error, tLObject, calendar));
    }

    private void loadNext() {
        if (this.loading || this.endReached) {
            return;
        }
        if (this.storiesList != null) {
            updateFromStoriesList();
            StoriesController.StoriesList storiesList = this.storiesList;
            storiesList.getClass();
            storiesList.load(100, Collections.EMPTY_LIST, false);
            this.loading = this.storiesList.isLoading();
            return;
        }
        this.loading = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i = this.photosVideosTypeFilter;
        if (i == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.dialogId);
        if (this.topicId != 0 && this.dialogId == getUserConfig().getClientUserId()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.topicId);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.lastId;
        Calendar calendar = Calendar.getInstance();
        this.listView.lambda$onCellEnter$52(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new IntroActivity$$ExternalSyntheticLambda6(15, this, calendar));
    }

    public void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (((ActionBarLayout) this.parentLayout).getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (((ActionBarLayout) this.parentLayout).getView().getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        ((ActionBarLayout) this.parentLayout).getView().draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    public void updateColors() {
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.activeTextPaint.setColor(-1);
        TextPaint textPaint = this.textPaint;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textPaint.setColor(Theme.getColor(null, i, false));
        this.textPaint2.setColor(Theme.getColor(null, i, false));
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        BackDrawable backDrawable = this.backDrawable;
        backDrawable.color = Theme.getColor(null, i, false);
        backDrawable.invalidateSelf();
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_listSelector, false), false);
    }

    private void updateFromStoriesList() {
        AnonymousClass1 anonymousClass1;
        this.loading = this.storiesList.isLoading();
        Calendar calendar = Calendar.getInstance();
        this.messagesByYearMounth.clear();
        this.minDate = Integer.MAX_VALUE;
        int i = 0;
        while (true) {
            anonymousClass1 = null;
            if (i >= this.storiesList.messageObjects.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            this.minDate = Math.min(this.minDate, messageObject.messageOwner.date);
            calendar.setTimeInMillis(((long) messageObject.messageOwner.date) * 1000);
            int i2 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray<PeriodDay> sparseArray = this.messagesByYearMounth.get(i2);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                this.messagesByYearMounth.put(i2, sparseArray);
            }
            int i3 = calendar.get(5) - 1;
            PeriodDay periodDay = sparseArray.get(i3);
            if (periodDay == null) {
                periodDay = new PeriodDay(this, anonymousClass1);
                periodDay.storyItems = new ArrayList<>();
            }
            periodDay.storyItems.add(Integer.valueOf(messageObject.getId()));
            periodDay.messageObject = messageObject;
            periodDay.date = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray.put(i3, periodDay);
            int i4 = this.minMontYear;
            if (i2 < i4 || i4 == 0) {
                this.minMontYear = i2;
            }
            i++;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i5 = this.minDate; i5 < iCurrentTimeMillis; i5 += 86400) {
            calendar.setTimeInMillis(((long) i5) * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i6 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray<PeriodDay> sparseArray2 = this.messagesByYearMounth.get(i6);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                this.messagesByYearMounth.put(i6, sparseArray2);
            }
            int i7 = calendar.get(5) - 1;
            if (sparseArray2.get(i7, null) == null) {
                PeriodDay periodDay2 = new PeriodDay(this, anonymousClass1);
                periodDay2.hasImage = false;
                periodDay2.date = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray2.put(i7, periodDay2);
            }
        }
        this.endReached = this.storiesList.done;
        if (this.isOpened) {
            this.checkEnterItems = true;
        }
        this.listView.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - ((long) this.minDate)) / 2629800)) + 1;
        this.adapter.notifyItemRangeChanged(0, this.monthCount);
        int i8 = this.monthCount;
        if (timeInMillis > i8) {
            this.adapter.notifyItemRangeInserted(i8 + 1, timeInMillis);
            this.monthCount = timeInMillis;
        }
        if (this.endReached) {
            resumeDelayedFragmentAnimation();
        }
    }

    public void updateRowSelections(MonthView monthView, boolean z) {
        int i;
        int i2;
        if (this.dateSelectedStart == 0 || this.dateSelectedEnd == 0) {
            monthView.dismissRowAnimations(z);
            return;
        }
        if (monthView.messagesByDays == null) {
            return;
        }
        if (!z) {
            monthView.dismissRowAnimations(false);
        }
        int i3 = monthView.startDayOfWeek;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < monthView.daysInMonth; i7++) {
            PeriodDay periodDay = monthView.messagesByDays.get(i7, null);
            if (periodDay != null && (i2 = periodDay.date) >= this.dateSelectedStart && i2 <= this.dateSelectedEnd) {
                if (i4 == -1) {
                    i4 = i3;
                }
                i5 = i3;
            }
            i3++;
            if (i3 >= 7) {
                if (i4 == -1 || i5 == -1) {
                    i = i6;
                    monthView.animateRow(i, 0, 0, false, z);
                } else {
                    i = i6;
                    monthView.animateRow(i, i4, i5, true, z);
                }
                i6 = i + 1;
                i3 = 0;
                i4 = -1;
                i5 = -1;
            }
        }
        if (i4 == -1 || i5 == -1) {
            monthView.animateRow(i6, 0, 0, false, z);
        } else {
            monthView.animateRow(i6, i4, i5, true, z);
        }
    }

    public void updateTitle() {
        String string;
        HintView hintView;
        if (!this.canClearHistory) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.backDrawable.setRotation(0.0f, true);
            return;
        }
        int i = this.dateSelectedStart;
        int i2 = this.dateSelectedEnd;
        int iAbs = (i == i2 && i == 0) ? 0 : (Math.abs(i - i2) / 86400) + 1;
        boolean z = this.lastInSelectionMode;
        int i3 = this.lastDaysSelected;
        if (iAbs == i3 && z == this.inSelectionMode) {
            return;
        }
        boolean z2 = i3 > iAbs;
        this.lastDaysSelected = iAbs;
        boolean z3 = this.inSelectionMode;
        this.lastInSelectionMode = z3;
        if (iAbs > 0) {
            string = LocaleController.formatPluralString("Days", iAbs, new Object[0]);
            this.backDrawable.setRotation(1.0f, true);
        } else if (z3) {
            string = LocaleController.getString(R.string.SelectDays);
            this.backDrawable.setRotation(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.backDrawable.setRotation(0.0f, true);
        }
        if (iAbs > 1) {
            this.removeDaysButton.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (iAbs > 0 || this.inSelectionMode) {
            this.removeDaysButton.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.setTitleAnimated(string, z2, 150L);
        if ((!this.inSelectionMode || iAbs > 0) && (hintView = this.selectDaysHint) != null) {
            hintView.hide();
        }
        if (iAbs > 0 || this.inSelectionMode) {
            if (this.removeDaysButton.getVisibility() == 8) {
                this.removeDaysButton.setAlpha(0.0f);
                this.removeDaysButton.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.removeDaysButton.setVisibility(0);
            this.selectDaysButton.animate().setListener(null).cancel();
            this.removeDaysButton.animate().setListener(null).cancel();
            this.selectDaysButton.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new HideViewAfterAnimation(this.selectDaysButton)).start();
            this.removeDaysButton.animate().alpha(iAbs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.selectDaysButton.setEnabled(false);
            this.removeDaysButton.setEnabled(true);
            return;
        }
        if (this.selectDaysButton.getVisibility() == 8) {
            this.selectDaysButton.setAlpha(0.0f);
            this.selectDaysButton.setTranslationY(AndroidUtilities.dp(20.0f));
        }
        this.selectDaysButton.setVisibility(0);
        this.selectDaysButton.animate().setListener(null).cancel();
        this.removeDaysButton.animate().setListener(null).cancel();
        this.selectDaysButton.animate().alpha(1.0f).translationY(0.0f).start();
        this.removeDaysButton.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new HideViewAfterAnimation(this.removeDaysButton)).start();
        this.selectDaysButton.setEnabled(true);
        this.removeDaysButton.setEnabled(false);
    }

    @Override
    public View createView(Context context) {
        this.textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        TextPaint textPaint = this.textPaint;
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        this.textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        this.textPaint2.setTextAlign(align);
        this.textPaint2.setTypeface(AndroidUtilities.bold());
        this.activeTextPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.activeTextPaint.setTypeface(AndroidUtilities.bold());
        this.activeTextPaint.setTextAlign(align);
        this.contentView = new FrameLayout(context) {
            int lastSize;

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.lastSize != measuredWidth) {
                    this.lastSize = measuredWidth;
                    CalendarActivity.this.adapter.notifyDataSetChanged();
                }
            }
        };
        createActionBar(context);
        this.contentView.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                CalendarActivity.this.checkEnterItems = false;
            }
        };
        this.listView = recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        this.layoutManager.setReverseLayout(true);
        RecyclerListView recyclerListView2 = this.listView;
        CalendarAdapter calendarAdapter = new CalendarAdapter(this, null);
        this.adapter = calendarAdapter;
        recyclerListView2.setAdapter(calendarAdapter);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                CalendarActivity.this.checkLoadNext();
            }
        });
        boolean z = this.calendarType == 0 && this.canClearHistory;
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z ? 48.0f : 0.0f));
        final String[] strArr = {LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)};
        final Drawable drawableMutate = context.getDrawable(R.drawable.header_shadow).mutate();
        this.contentView.addView(new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i = 0; i < 7; i++) {
                    canvas.drawText(strArr[i], (measuredWidth / 2.0f) + (i * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), CalendarActivity.this.textPaint2);
                }
                drawableMutate.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawableMutate.draw(canvas);
            }
        }, LayoutHelper.createFrame(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (CalendarActivity.this.dateSelectedStart == 0 && CalendarActivity.this.dateSelectedEnd == 0 && !CalendarActivity.this.inSelectionMode) {
                        CalendarActivity.this.finishFragment();
                        return;
                    }
                    CalendarActivity.this.inSelectionMode = false;
                    CalendarActivity.this.dateSelectedStart = 0;
                    CalendarActivity.this.dateSelectedEnd = 0;
                    CalendarActivity.this.updateTitle();
                    CalendarActivity.this.animateSelection();
                }
            }
        });
        this.fragmentView = this.contentView;
        Calendar calendar = Calendar.getInstance();
        this.startFromYear = calendar.get(1);
        int i = calendar.get(2);
        this.startFromMonth = i;
        int i2 = this.selectedYear;
        if (i2 != 0) {
            int iM = CalendarActivity$$ExternalSyntheticOutline0.m(this.startFromYear, i2, 12, i) - this.selectedMonth;
            this.monthCount = iM + 1;
            this.layoutManager.scrollToPositionWithOffset(iM, AndroidUtilities.dp(120.0f));
        }
        if (this.monthCount < 3) {
            this.monthCount = 3;
        }
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        this.actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.setRotation(0.0f, false);
        loadNext();
        updateColors();
        this.activeTextPaint.setColor(-1);
        if (z) {
            FrameLayout frameLayout = new FrameLayout(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), Theme.dividerPaint);
                }
            };
            this.bottomBar = frameLayout;
            frameLayout.setWillNotDraw(false);
            this.bottomBar.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.bottomBar.setClipChildren(false);
            TextView textView = new TextView(context);
            this.selectDaysButton = textView;
            textView.setGravity(17);
            this.selectDaysButton.setTextSize(1, 15.0f);
            this.selectDaysButton.setTypeface(AndroidUtilities.bold());
            final int i3 = 0;
            this.selectDaysButton.setOnClickListener(new View.OnClickListener(this) {
                public final CalendarActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$createView$0(view);
                            break;
                        default:
                            this.f$0.lambda$createView$1(view);
                            break;
                    }
                }
            });
            this.selectDaysButton.setText(LocaleController.getString(R.string.SelectDays));
            this.selectDaysButton.setAllCaps(true);
            TextView textViewM = zzkj.m(this.bottomBar, this.selectDaysButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f), context);
            this.removeDaysButton = textViewM;
            textViewM.setGravity(17);
            this.removeDaysButton.setTextSize(1, 15.0f);
            this.removeDaysButton.setTypeface(AndroidUtilities.bold());
            final int i4 = 1;
            this.removeDaysButton.setOnClickListener(new View.OnClickListener(this) {
                public final CalendarActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$createView$0(view);
                            break;
                        default:
                            this.f$0.lambda$createView$1(view);
                            break;
                    }
                }
            });
            this.removeDaysButton.setAllCaps(true);
            this.removeDaysButton.setVisibility(8);
            this.bottomBar.addView(this.removeDaysButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.contentView.addView(this.bottomBar, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = this.selectDaysButton;
            int i5 = Theme.key_chat_fieldOverlayText;
            textView2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i5, false), 51), 2, -1));
            TextView textView3 = this.removeDaysButton;
            int i6 = Theme.key_text_RedBold;
            textView3.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i6, false), 51), 2, -1));
            this.selectDaysButton.setTextColor(Theme.getColor(null, i5, false));
            this.removeDaysButton.setTextColor(Theme.getColor(null, i6, false));
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && this.storiesList == ((StoriesController.StoriesList) objArr[0])) {
            updateFromStoriesList();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public void didSetColor() {
                CalendarActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
            }
        };
        new ArrayList();
        int i = Theme.default_shadow_color;
        return super.getThemeDescriptions();
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!this.inSelectionMode) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.inSelectionMode = false;
            this.dateSelectedEnd = 0;
            this.dateSelectedStart = 0;
            updateTitle();
            animateSelection();
        }
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = getArguments().getLong("dialog_id");
        this.topicId = getArguments().getLong("topic_id");
        int i = getArguments().getInt("type");
        this.calendarType = i;
        if (i == 2) {
            this.storiesList = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesList(this.dialogId, 0, -1, true);
        } else if (i == 3) {
            this.storiesList = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesList(this.dialogId, 1, -1, true);
        }
        if (this.storiesList != null) {
            this.storiesPlaceProvider = new AnonymousClass1();
        }
        if (this.dialogId >= 0) {
            this.canClearHistory = true;
        } else {
            this.canClearHistory = false;
        }
        if (this.storiesList != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.storiesList != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        View view;
        if (z && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.blurredView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.isOpened = true;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setChatActivity(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
    }

    public class PeriodDay {
        int date;
        float enterAlpha;
        float fromSelProgress;
        float fromSelSEProgress;
        boolean hasImage;
        MessageObject messageObject;
        float selectProgress;
        float selectStartEndProgress;
        float startEnterDelay;
        int startOffset;
        ArrayList<Integer> storyItems;
        float toSelProgress;
        float toSelSEProgress;
        boolean wasDrawn;

        private PeriodDay() {
            this.enterAlpha = 1.0f;
            this.startEnterDelay = 1.0f;
            this.hasImage = true;
        }

        public PeriodDay(CalendarActivity calendarActivity, AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
