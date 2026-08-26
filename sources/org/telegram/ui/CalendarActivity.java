package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.zzcv;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedPaint;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;

public final class CalendarActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public final TextPaint activeTextPaint;
    public AppIconsSelectorCell.AnonymousClass1 adapter;
    public BackDrawable backDrawable;
    public final Paint blackoutPaint;
    public MonthView.AnonymousClass2.C00032 blurredView;
    public PhotoViewer.AnonymousClass19 bottomBar;
    public int calendarType;
    public PhotoViewer.AnonymousClass18 callback;
    public boolean canClearHistory;
    public ChatActivity chatActivity;
    public boolean checkEnterItems;
    public AnonymousClass2 contentView;
    public int dateSelectedEnd;
    public int dateSelectedStart;
    public long dialogId;
    public boolean endReached;
    public boolean inSelectionMode;
    public boolean isOpened;
    public int lastDaysSelected;
    public int lastId;
    public boolean lastInSelectionMode;
    public LinearLayoutManager layoutManager;
    public ChatActivity.AnonymousClass34 listView;
    public boolean loading;
    public final SpoilerEffect mediaSpoilerEffect;
    public final SparseArray messagesByYearMounth;
    public int minDate;
    public int minMontYear;
    public int monthCount;
    public final Path path;
    public final int photosVideosTypeFilter;
    public TextView removeDaysButton;
    public TextView selectDaysButton;
    public HintView selectDaysHint;
    public final Paint selectOutlinePaint;
    public final Paint selectPaint;
    public final int selectedMonth;
    public final int selectedYear;
    public ValueAnimator selectionAnimator;
    public int startFromMonth;
    public int startFromYear;
    public int startOffset;
    public StoriesController.StoriesList storiesList;
    public int storiesPlaceDay;
    public WindowVisibilityManager$$ExternalSyntheticLambda0 storiesPlaceDrawAbove;
    public PhotoViewer.AnonymousClass18 storiesPlaceProvider;
    public final TextPaint textPaint;
    public final TextPaint textPaint2;
    public long topicId;

    public final class AnonymousClass2 extends FrameLayout {
        public final int $r8$classId = 0;
        public int lastSize;
        public final BaseFragment this$0;

        public AnonymousClass2(CalendarActivity calendarActivity, Context context) {
            super(context);
            this.this$0 = calendarActivity;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                    if (this.lastSize != measuredWidth) {
                        this.lastSize = measuredWidth;
                        ((CalendarActivity) this.this$0).adapter.mObservable.notifyChanged();
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    int i5 = i4 - i2;
                    int i6 = this.lastSize;
                    if (i6 != -1 && Math.abs(i6 - i5) > AndroidUtilities.dp(20.0f)) {
                        ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) this.this$0;
                        chatRightsEditActivity.listView.smoothScrollToPosition(chatRightsEditActivity.rowCount - 1);
                    }
                    this.lastSize = i5;
                    break;
            }
        }

        public AnonymousClass2(ChatRightsEditActivity chatRightsEditActivity, Context context) {
            super(context);
            this.this$0 = chatRightsEditActivity;
            this.lastSize = -1;
        }
    }

    public final class MonthView extends FrameLayout {
        public int cellCount;
        public int currentMonthInYear;
        public int currentYear;
        public int daysInMonth;
        public final zzcv gestureDetector;
        public SparseArray imagesByDays;
        public SparseArray messagesByDays;
        public final SparseArray rowAnimators;
        public final SparseArray rowSelectionPos;
        public int startDayOfWeek;
        public int startMonthTime;
        public final SimpleTextView titleView;

        public final class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
            public final Context val$context;

            public final class C00032 extends View {
                public C00032(Context context) {
                    super(context);
                }

                @Override
                public final void setAlpha(float f) {
                    super.setAlpha(f);
                    View view = CalendarActivity.this.fragmentView;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            }

            public AnonymousClass2(Context context) {
                this.val$context = context;
            }

            public final PeriodDay getDayAtCoord(float f, float f2) {
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
                for (int i3 = 0; i3 < monthView.daysInMonth; i3++) {
                    float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                    float fDp2 = (fDp / 2.0f) + (i2 * fDp) + AndroidUtilities.dp(44.0f);
                    float f4 = iDp;
                    if (f >= f3 - f4 && f <= f3 + f4 && f2 >= fDp2 - f4 && f2 <= fDp2 + f4 && (periodDay = (PeriodDay) monthView.messagesByDays.get(i3, null)) != null) {
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

            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public final void onLongPress(MotionEvent motionEvent) {
                final PeriodDay dayAtCoord;
                super.onLongPress(motionEvent);
                MonthView monthView = MonthView.this;
                if (CalendarActivity.this.calendarType != 0 || AndroidUtilities.isTablet() || (dayAtCoord = getDayAtCoord(motionEvent.getX(), motionEvent.getY())) == null) {
                    return;
                }
                try {
                    monthView.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                Bundle bundle = new Bundle();
                CalendarActivity calendarActivity = CalendarActivity.this;
                long j = calendarActivity.dialogId;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putInt("start_from_date", dayAtCoord.date);
                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                ChatActivity chatActivity = new ChatActivity(bundle);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, calendarActivity.getParentActivity(), calendarActivity.getResourceProvider());
                actionBarPopupWindowLayout.setBackgroundColor(calendarActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, calendarActivity.getParentActivity(), null, true, false);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
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
                                CalendarActivity.MonthView.AnonymousClass2 anonymousClass2 = this.f$0;
                                CalendarActivity.MonthView monthView2 = CalendarActivity.MonthView.this;
                                INavigationLayout iNavigationLayout = ((BaseFragment) CalendarActivity.this).parentLayout;
                                CalendarActivity calendarActivity2 = CalendarActivity.this;
                                if (iNavigationLayout != null && ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack().size() >= 3) {
                                    BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack());
                                    if (baseFragment instanceof ChatActivity) {
                                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(anonymousClass2, (ChatActivity) baseFragment, dayAtCoord), 300L);
                                    }
                                }
                                calendarActivity2.finishPreviewFragment();
                                break;
                            default:
                                CalendarActivity.MonthView monthView3 = CalendarActivity.MonthView.this;
                                CalendarActivity calendarActivity3 = CalendarActivity.this;
                                int i2 = dayAtCoord.date;
                                calendarActivity3.dateSelectedEnd = i2;
                                calendarActivity3.dateSelectedStart = i2;
                                calendarActivity3.inSelectionMode = true;
                                calendarActivity3.updateTitle();
                                CalendarActivity calendarActivity4 = CalendarActivity.this;
                                calendarActivity4.animateSelection();
                                calendarActivity4.finishPreviewFragment();
                                break;
                        }
                    }
                });
                ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                anonymousClass2.addView(actionBarMenuSubItem);
                if (calendarActivity.canClearHistory) {
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, calendarActivity.getParentActivity(), null, false, false);
                    actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
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
                                    CalendarActivity.MonthView.AnonymousClass2 anonymousClass3 = this.f$0;
                                    CalendarActivity.MonthView monthView2 = CalendarActivity.MonthView.this;
                                    INavigationLayout iNavigationLayout = ((BaseFragment) CalendarActivity.this).parentLayout;
                                    CalendarActivity calendarActivity2 = CalendarActivity.this;
                                    if (iNavigationLayout != null && ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack().size() >= 3) {
                                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack());
                                        if (baseFragment instanceof ChatActivity) {
                                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(anonymousClass3, (ChatActivity) baseFragment, dayAtCoord), 300L);
                                        }
                                    }
                                    calendarActivity2.finishPreviewFragment();
                                    break;
                                default:
                                    CalendarActivity.MonthView monthView3 = CalendarActivity.MonthView.this;
                                    CalendarActivity calendarActivity3 = CalendarActivity.this;
                                    int i3 = dayAtCoord.date;
                                    calendarActivity3.dateSelectedEnd = i3;
                                    calendarActivity3.dateSelectedStart = i3;
                                    calendarActivity3.inSelectionMode = true;
                                    calendarActivity3.updateTitle();
                                    CalendarActivity calendarActivity4 = CalendarActivity.this;
                                    calendarActivity4.animateSelection();
                                    calendarActivity4.finishPreviewFragment();
                                    break;
                            }
                        }
                    });
                    anonymousClass2.addView(actionBarMenuSubItem2);
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, calendarActivity.getParentActivity(), null, false, true);
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
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
                                    final CalendarActivity.MonthView.AnonymousClass2 anonymousClass3 = this.f$0;
                                    CalendarActivity.MonthView monthView2 = CalendarActivity.MonthView.this;
                                    int size = ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size();
                                    CalendarActivity calendarActivity2 = CalendarActivity.this;
                                    if (size >= 3) {
                                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack());
                                        if (baseFragment instanceof ChatActivity) {
                                            final ChatActivity chatActivity2 = (ChatActivity) baseFragment;
                                            AlertsCreator.createClearDaysDialogAlert(calendarActivity2, 1, calendarActivity2.getMessagesController().getUser(Long.valueOf(calendarActivity2.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                                                @Override
                                                public final void run(boolean z) {
                                                    AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                                    CalendarActivity.this.finishFragment();
                                                    CalendarActivity calendarActivity3 = CalendarActivity.this;
                                                    chatActivity2.deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z);
                                                }
                                            }, null);
                                        }
                                    }
                                    calendarActivity2.finishPreviewFragment();
                                    break;
                                default:
                                    CalendarActivity.this.finishPreviewFragment();
                                    break;
                            }
                        }
                    });
                    anonymousClass2.addView(actionBarMenuSubItem3);
                }
                actionBarPopupWindowLayout.setFitItems(true);
                calendarActivity.blurredView = new C00032(this.val$context);
                final int i4 = 1;
                calendarActivity.blurredView.setOnClickListener(new View.OnClickListener(this) {
                    public final CalendarActivity.MonthView.AnonymousClass2 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                final CalendarActivity.MonthView.AnonymousClass2 anonymousClass3 = this.f$0;
                                CalendarActivity.MonthView monthView2 = CalendarActivity.MonthView.this;
                                int size = ((ActionBarLayout) ((BaseFragment) CalendarActivity.this).parentLayout).getFragmentStack().size();
                                CalendarActivity calendarActivity2 = CalendarActivity.this;
                                if (size >= 3) {
                                    BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout, 3, ((ActionBarLayout) ((BaseFragment) calendarActivity2).parentLayout).getFragmentStack());
                                    if (baseFragment instanceof ChatActivity) {
                                        final ChatActivity chatActivity2 = (ChatActivity) baseFragment;
                                        AlertsCreator.createClearDaysDialogAlert(calendarActivity2, 1, calendarActivity2.getMessagesController().getUser(Long.valueOf(calendarActivity2.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                                            @Override
                                            public final void run(boolean z) {
                                                AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                                CalendarActivity.this.finishFragment();
                                                CalendarActivity calendarActivity3 = CalendarActivity.this;
                                                chatActivity2.deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z);
                                            }
                                        }, null);
                                    }
                                }
                                calendarActivity2.finishPreviewFragment();
                                break;
                            default:
                                CalendarActivity.this.finishPreviewFragment();
                                break;
                        }
                    }
                });
                calendarActivity.blurredView.setVisibility(8);
                calendarActivity.blurredView.setFitsSystemWindows(true);
                ((ActionBarLayout) ((BaseFragment) calendarActivity).parentLayout).getOverlayContainerView().addView(calendarActivity.blurredView, LayoutHelper.createFrame(-1.0f, -1));
                CalendarActivity.access$2700(calendarActivity);
                calendarActivity.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
            }

            @Override
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                PeriodDay dayAtCoord;
                MessageObject messageObject;
                PhotoViewer.AnonymousClass18 anonymousClass18;
                SharedMediaLayout sharedMediaLayout;
                MonthView monthView = MonthView.this;
                if (((BaseFragment) CalendarActivity.this).parentLayout != null) {
                    CalendarActivity calendarActivity = CalendarActivity.this;
                    if (((calendarActivity.calendarType == 1 && monthView.messagesByDays != null) || calendarActivity.storiesList != null) && (dayAtCoord = getDayAtCoord(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = dayAtCoord.messageObject) != null && (anonymousClass18 = calendarActivity.callback) != null) {
                        if (calendarActivity.storiesList != null) {
                            StoryViewer orCreateStoryViewer = calendarActivity.getOrCreateStoryViewer();
                            Context context = monthView.getContext();
                            MessageObject messageObject2 = dayAtCoord.messageObject;
                            TL_stories.StoryItem storyItem = messageObject2.storyItem;
                            int id = messageObject2.getId();
                            StoriesController.StoriesList storiesList = calendarActivity.storiesList;
                            PhotoViewer.AnonymousClass18 anonymousClass19 = calendarActivity.storiesPlaceProvider;
                            orCreateStoryViewer.currentAccount = UserConfig.selectedAccount;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(storiesList.dialogId));
                            orCreateStoryViewer.dayStoryId = id;
                            orCreateStoryViewer.open(UserConfig.selectedAccount, context, storyItem, arrayList, 0, storiesList, null, anonymousClass19, true);
                        } else {
                            int id2 = messageObject.getId();
                            int i = dayAtCoord.startOffset;
                            int i2 = -1;
                            int i3 = 0;
                            while (true) {
                                sharedMediaLayout = (SharedMediaLayout) anonymousClass18.this$0;
                                if (i3 >= sharedMediaLayout.sharedMediaData[0].messages.size()) {
                                    break;
                                }
                                if (((MessageObject) sharedMediaLayout.sharedMediaData[0].messages.get(i3)).getId() == id2) {
                                    i2 = i3;
                                }
                                i3++;
                            }
                            SharedMediaLayout.MediaPage mediaPage = sharedMediaLayout.getMediaPage(0);
                            if (i2 < 0 || mediaPage == null) {
                                sharedMediaLayout.jumpToDate(0, id2, i, true);
                            } else {
                                SharedMediaLayout.AnonymousClass17 anonymousClass17 = mediaPage.layoutManager;
                                anonymousClass17.scrollToPositionWithOffset(i2, 0, anonymousClass17.mShouldReverseLayout);
                            }
                            if (mediaPage != null) {
                                mediaPage.highlightMessageId = id2;
                                mediaPage.highlightAnimation = false;
                            }
                            calendarActivity.finishFragment();
                        }
                    }
                    if (monthView.messagesByDays != null) {
                        if (calendarActivity.inSelectionMode) {
                            PeriodDay dayAtCoord2 = getDayAtCoord(motionEvent.getX(), motionEvent.getY());
                            if (dayAtCoord2 != null) {
                                ValueAnimator valueAnimator = calendarActivity.selectionAnimator;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    calendarActivity.selectionAnimator = null;
                                }
                                int i4 = calendarActivity.dateSelectedStart;
                                if (i4 == 0 && calendarActivity.dateSelectedEnd == 0) {
                                    int i5 = dayAtCoord2.date;
                                    calendarActivity.dateSelectedEnd = i5;
                                    calendarActivity.dateSelectedStart = i5;
                                } else {
                                    int i6 = dayAtCoord2.date;
                                    if (i4 == i6 && calendarActivity.dateSelectedEnd == i6) {
                                        calendarActivity.dateSelectedEnd = 0;
                                        calendarActivity.dateSelectedStart = 0;
                                    } else if (i4 == i6) {
                                        calendarActivity.dateSelectedStart = calendarActivity.dateSelectedEnd;
                                    } else {
                                        int i7 = calendarActivity.dateSelectedEnd;
                                        if (i7 == i6) {
                                            calendarActivity.dateSelectedEnd = i4;
                                        } else if (i4 != i7) {
                                            calendarActivity.dateSelectedEnd = i6;
                                            calendarActivity.dateSelectedStart = i6;
                                        } else if (i6 > i7) {
                                            calendarActivity.dateSelectedEnd = i6;
                                        } else {
                                            calendarActivity.dateSelectedStart = i6;
                                        }
                                    }
                                }
                                calendarActivity.updateTitle();
                                calendarActivity.animateSelection();
                                return false;
                            }
                        } else {
                            PeriodDay dayAtCoord3 = getDayAtCoord(motionEvent.getX(), motionEvent.getY());
                            if (dayAtCoord3 != null && ((BaseFragment) calendarActivity).parentLayout != null && ((ActionBarLayout) ((BaseFragment) calendarActivity).parentLayout).getFragmentStack().size() >= 2) {
                                BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) calendarActivity).parentLayout).getFragmentStack());
                                if (baseFragment instanceof ChatActivity) {
                                    calendarActivity.finishFragment();
                                    ((ChatActivity) baseFragment).jumpToDate(dayAtCoord3.date);
                                    return false;
                                }
                            } else if (dayAtCoord3 != null && calendarActivity.chatActivity != null) {
                                calendarActivity.finishFragment();
                                calendarActivity.chatActivity.jumpToDate(dayAtCoord3.date);
                            }
                        }
                    }
                }
                return false;
            }
        }

        public MonthView(Context context) {
            super(context);
            this.messagesByDays = new SparseArray();
            this.imagesByDays = new SparseArray();
            this.rowAnimators = new SparseArray();
            this.rowSelectionPos = new SparseArray();
            setWillNotDraw(false);
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            if (CalendarActivity.this.calendarType == 0 && CalendarActivity.this.canClearHistory) {
                simpleTextView.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 2));
                simpleTextView.setOnClickListener(new ChatActivity.AnonymousClass109(this, 4));
            }
            simpleTextView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            simpleTextView.setTextSize(15);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setGravity(17);
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(simpleTextView, LayoutHelper.createFrame(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
            zzcv zzcvVar = new zzcv(context, new AnonymousClass2(context));
            this.gestureDetector = zzcvVar;
            ((GestureDetector) zzcvVar.zza).setIsLongpressEnabled(CalendarActivity.this.calendarType == 0);
        }

        public static void access$1100(MonthView monthView, int i, int i2) {
            if (monthView.messagesByDays != null) {
                for (int i3 = 0; i3 < monthView.daysInMonth; i3++) {
                    PeriodDay periodDay = (PeriodDay) monthView.messagesByDays.get(i3, null);
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

        public static void access$1200(MonthView monthView, float f) {
            if (monthView.messagesByDays != null) {
                for (int i = 0; i < monthView.daysInMonth; i++) {
                    PeriodDay periodDay = (PeriodDay) monthView.messagesByDays.get(i, null);
                    if (periodDay != null) {
                        float f2 = periodDay.fromSelProgress;
                        periodDay.selectProgress = DiffUtil.m(periodDay.toSelProgress, f2, f, f2);
                        float f3 = periodDay.fromSelSEProgress;
                        periodDay.selectStartEndProgress = DiffUtil.m(periodDay.toSelSEProgress, f3, f, f3);
                    }
                }
            }
            monthView.invalidate();
        }

        public final void animateRow(final int i, int i2, int i3, final boolean z, boolean z2) {
            float f;
            float f2;
            final float f3;
            float f4;
            final float f5;
            SparseArray sparseArray = this.rowAnimators;
            ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float measuredWidth = getMeasuredWidth() / 7.0f;
            SparseArray sparseArray2 = this.rowSelectionPos;
            RowAnimationValue rowAnimationValue = (RowAnimationValue) sparseArray2.get(i);
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
            final RowAnimationValue rowAnimationValue2 = new RowAnimationValue();
            rowAnimationValue2.startX = f;
            rowAnimationValue2.endX = f2;
            sparseArray2.put(i, rowAnimationValue2);
            if (!z2) {
                rowAnimationValue2.startX = f4;
                rowAnimationValue2.endX = f5;
                rowAnimationValue2.alpha = f7;
                invalidate();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(Easings.easeInOutQuad);
            final float f8 = f2;
            final float f9 = f7;
            final float f10 = f;
            final float f11 = f4;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CalendarActivity.MonthView monthView = this.f$0;
                    monthView.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f12 = f11;
                    float f13 = f10;
                    float fM = DiffUtil.m(f12, f13, fFloatValue, f13);
                    CalendarActivity.RowAnimationValue rowAnimationValue3 = rowAnimationValue2;
                    rowAnimationValue3.startX = fM;
                    float f14 = f5;
                    float f15 = f8;
                    rowAnimationValue3.endX = DiffUtil.m(f14, f15, fFloatValue, f15);
                    float f16 = f9;
                    float f17 = f3;
                    rowAnimationValue3.alpha = DiffUtil.m(f16, f17, fFloatValue, f17);
                    monthView.invalidate();
                }
            };
            final float f12 = f5;
            duration.addUpdateListener(animatorUpdateListener);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationCancel(Animator animator) {
                    float f13 = f11;
                    RowAnimationValue rowAnimationValue3 = rowAnimationValue2;
                    rowAnimationValue3.startX = f13;
                    rowAnimationValue3.endX = f12;
                    rowAnimationValue3.alpha = f9;
                    MonthView.this.invalidate();
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    MonthView monthView = MonthView.this;
                    SparseArray sparseArray3 = monthView.rowAnimators;
                    int i4 = i;
                    sparseArray3.remove(i4);
                    if (z) {
                        return;
                    }
                    monthView.rowSelectionPos.remove(i4);
                }
            });
            duration.start();
            sparseArray.put(i, duration);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.imagesByDays != null) {
                for (int i = 0; i < this.imagesByDays.size(); i++) {
                    ((ImageReceiver) this.imagesByDays.valueAt(i)).onAttachedToWindow();
                }
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.imagesByDays != null) {
                for (int i = 0; i < this.imagesByDays.size(); i++) {
                    ((ImageReceiver) this.imagesByDays.valueAt(i)).onDetachedFromWindow();
                }
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            CalendarActivity calendarActivity;
            PeriodDay periodDay;
            Paint paint;
            PeriodDay periodDay2;
            int i;
            float f;
            float f2;
            float f3;
            PeriodDay periodDay3;
            MonthView monthView = this;
            Canvas canvas2 = canvas;
            super.onDraw(canvas);
            int i2 = monthView.startDayOfWeek;
            float f4 = 7.0f;
            float measuredWidth = monthView.getMeasuredWidth() / 7.0f;
            float fDp = AndroidUtilities.dp(52.0f);
            float f5 = 44.0f;
            int iDp = AndroidUtilities.dp(44.0f);
            int i3 = 0;
            while (true) {
                double d = i3;
                double dCeil = Math.ceil((monthView.startDayOfWeek + monthView.daysInMonth) / f4);
                calendarActivity = CalendarActivity.this;
                periodDay = null;
                paint = calendarActivity.selectPaint;
                if (d >= dCeil) {
                    break;
                }
                float fDp2 = (fDp / 2.0f) + (i3 * fDp) + AndroidUtilities.dp(44.0f);
                RowAnimationValue rowAnimationValue = (RowAnimationValue) monthView.rowSelectionPos.get(i3);
                if (rowAnimationValue != null) {
                    paint.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false));
                    paint.setAlpha((int) (rowAnimationValue.alpha * 40.8f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f6 = iDp / 2.0f;
                    rectF.set(rowAnimationValue.startX - f6, fDp2 - f6, rowAnimationValue.endX + f6, fDp2 + f6);
                    float fDp3 = AndroidUtilities.dp(32.0f);
                    canvas2.drawRoundRect(rectF, fDp3, fDp3, paint);
                }
                i3++;
                f4 = 7.0f;
            }
            int i4 = i2;
            int i5 = 0;
            int i6 = 0;
            while (i6 < monthView.daysInMonth) {
                float f7 = (i4 * measuredWidth) + (measuredWidth / 2.0f);
                float fDp4 = AndroidUtilities.dp(f5) + (fDp / 2.0f) + (i5 * fDp);
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                SparseArray sparseArray = monthView.messagesByDays;
                PeriodDay periodDay4 = sparseArray != null ? (PeriodDay) sparseArray.get(i6, periodDay) : periodDay;
                int i7 = monthView.startMonthTime;
                int i8 = i6 + 1;
                int i9 = (i8 * 86400) + i7;
                TextPaint textPaint = calendarActivity.textPaint;
                if (iCurrentTimeMillis < i9 || ((i = calendarActivity.minDate) > 0 && i > ((i6 + 2) * 86400) + i7)) {
                    i5 = i5;
                    measuredWidth = measuredWidth;
                    fDp = fDp;
                    periodDay2 = null;
                    int alpha = textPaint.getAlpha();
                    textPaint.setAlpha((int) (alpha * 0.3f));
                    canvas2.drawText(Integer.toString(i8), f7, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                    textPaint.setAlpha(alpha);
                } else {
                    Paint paint2 = calendarActivity.selectOutlinePaint;
                    TextPaint textPaint2 = calendarActivity.activeTextPaint;
                    if (periodDay4 == null || !periodDay4.hasImage) {
                        i5 = i5;
                        PeriodDay periodDay5 = periodDay4;
                        measuredWidth = measuredWidth;
                        fDp = fDp;
                        if (periodDay5 == null || periodDay5.selectStartEndProgress < 0.01f) {
                            periodDay2 = null;
                            canvas2.drawText(Integer.toString(i8), f7, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                        } else {
                            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                            paint.setAlpha((int) (periodDay5.selectStartEndProgress * 255.0f));
                            canvas2.drawCircle(f7, fDp4, AndroidUtilities.dp(44.0f) / 2.0f, paint);
                            int i10 = Theme.key_chat_messagePanelVoiceBackground;
                            paint2.setColor(Theme.getColor(null, i10, false));
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f7 - (AndroidUtilities.dp(44.0f) / 2.0f), fDp4 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f7, (AndroidUtilities.dp(44.0f) / 2.0f) + fDp4);
                            canvas2.drawArc(rectF2, -90.0f, periodDay5.selectStartEndProgress * 360.0f, false, paint2);
                            int iDp2 = (int) (AndroidUtilities.dp(7.0f) * periodDay5.selectStartEndProgress);
                            periodDay2 = null;
                            paint.setColor(Theme.getColor(null, i10, false));
                            paint.setAlpha((int) (periodDay5.selectStartEndProgress * 255.0f));
                            canvas2.drawCircle(f7, fDp4, (AndroidUtilities.dp(44.0f) - iDp2) / 2.0f, paint);
                            float f8 = periodDay5.selectStartEndProgress;
                            if (f8 != 1.0f) {
                                int alpha2 = textPaint.getAlpha();
                                textPaint.setAlpha((int) ((1.0f - f8) * alpha2));
                                canvas2.drawText(Integer.toString(i8), f7, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                                textPaint.setAlpha(alpha2);
                                int alpha3 = textPaint.getAlpha();
                                textPaint2.setAlpha((int) (alpha3 * f8));
                                canvas2.drawText(Integer.toString(i8), f7, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                                textPaint2.setAlpha(alpha3);
                            } else {
                                canvas2.drawText(Integer.toString(i8), f7, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                            }
                        }
                    } else {
                        if (monthView.imagesByDays.get(i6) != null) {
                            float f9 = 0.0f;
                            if (calendarActivity.checkEnterItems && !periodDay4.wasDrawn) {
                                periodDay4.enterAlpha = 0.0f;
                                f9 = 0.0f;
                                periodDay4.startEnterDelay = Math.max(0.0f, ((monthView.getY() + fDp4) / calendarActivity.listView.getMeasuredHeight()) * 150.0f);
                            }
                            float f10 = periodDay4.startEnterDelay;
                            if (f10 > f9) {
                                float f11 = f10 - 16.0f;
                                periodDay4.startEnterDelay = f11;
                                if (f11 < f9) {
                                    periodDay4.startEnterDelay = f9;
                                } else {
                                    monthView.invalidate();
                                }
                            }
                            if (periodDay4.startEnterDelay >= f9) {
                                float f12 = periodDay4.enterAlpha;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.07272727f;
                                    periodDay4.enterAlpha = f13;
                                    if (f13 > 1.0f) {
                                        f3 = 1.0f;
                                        periodDay4.enterAlpha = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        monthView.invalidate();
                                    }
                                } else {
                                    f3 = 1.0f;
                                }
                            } else {
                                f3 = 1.0f;
                            }
                            float f14 = periodDay4.enterAlpha;
                            if (f14 != f3) {
                                canvas2.save();
                                float f15 = (0.2f * f14) + 0.8f;
                                canvas2.scale(f15, f15, f7, fDp4);
                            }
                            int iDp3 = (int) (periodDay4.selectProgress * AndroidUtilities.dp(7.0f));
                            if (periodDay4.selectStartEndProgress >= 0.01f) {
                                paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                                paint.setAlpha((int) (periodDay4.selectStartEndProgress * 255.0f));
                                canvas2.drawCircle(f7, fDp4, AndroidUtilities.dp(44.0f) / 2.0f, paint);
                                paint2.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false));
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(f7 - (AndroidUtilities.dp(44.0f) / 2.0f), fDp4 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f7, (AndroidUtilities.dp(44.0f) / 2.0f) + fDp4);
                                canvas2 = canvas;
                                periodDay3 = periodDay4;
                                f = f7;
                                canvas2.drawArc(rectF3, -90.0f, periodDay4.selectStartEndProgress * 360.0f, false, paint2);
                            } else {
                                f = f7;
                                periodDay3 = periodDay4;
                            }
                            ((ImageReceiver) monthView.imagesByDays.get(i6)).setAlpha(periodDay3.enterAlpha);
                            ((ImageReceiver) monthView.imagesByDays.get(i6)).setImageCoords(f - ((AndroidUtilities.dp(44.0f) - r28) / 2.0f), fDp4 - ((AndroidUtilities.dp(44.0f) - r28) / 2.0f), AndroidUtilities.dp(44.0f) - r28, AndroidUtilities.dp(44.0f) - r28);
                            ((ImageReceiver) monthView.imagesByDays.get(i6)).draw(canvas2);
                            if (monthView.messagesByDays.get(i6) != null && ((PeriodDay) monthView.messagesByDays.get(i6)).messageObject != null && ((PeriodDay) monthView.messagesByDays.get(i6)).messageObject.hasMediaSpoilers()) {
                                float fDp5 = (AndroidUtilities.dp(44.0f) - iDp3) / 2.0f;
                                Path path = calendarActivity.path;
                                path.rewind();
                                path.addCircle(f, fDp4, fDp5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                int alphaComponent = ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f * periodDay3.enterAlpha));
                                SpoilerEffect spoilerEffect = calendarActivity.mediaSpoilerEffect;
                                spoilerEffect.setColor(alphaComponent);
                                spoilerEffect.setBounds((int) (f - fDp5), (int) (fDp4 - fDp5), (int) (f + fDp5), (int) (fDp5 + fDp4));
                                spoilerEffect.draw(canvas2);
                                monthView.invalidate();
                                canvas2.restore();
                            }
                            Paint paint3 = calendarActivity.blackoutPaint;
                            paint3.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (periodDay3.enterAlpha * 80.0f)));
                            canvas2.drawCircle(f, fDp4, (AndroidUtilities.dp(44.0f) - r28) / 2.0f, paint3);
                            periodDay3.wasDrawn = true;
                            if (f14 != f3) {
                                canvas2.restore();
                            }
                            f2 = f14;
                        } else {
                            measuredWidth = measuredWidth;
                            fDp = fDp;
                            f = f7;
                            fDp4 = fDp4;
                            f2 = 1.0f;
                        }
                        if (f2 != 1.0f) {
                            int alpha4 = textPaint.getAlpha();
                            textPaint.setAlpha((int) ((1.0f - f2) * alpha4));
                            canvas2.drawText(Integer.toString(i8), f, AndroidUtilities.dp(5.0f) + fDp4, textPaint);
                            textPaint.setAlpha(alpha4);
                            int alpha5 = textPaint.getAlpha();
                            textPaint2.setAlpha((int) (alpha5 * f2));
                            canvas2.drawText(Integer.toString(i8), f, AndroidUtilities.dp(5.0f) + fDp4, textPaint2);
                            textPaint2.setAlpha(alpha5);
                        } else {
                            canvas2.drawText(Integer.toString(i8), f, fDp4 + AndroidUtilities.dp(5.0f), textPaint2);
                        }
                        periodDay2 = null;
                    }
                }
                i4++;
                if (i4 >= 7) {
                    i5++;
                    i4 = 0;
                } else {
                    i5 = i5;
                }
                monthView = this;
                periodDay = periodDay2;
                i6 = i8;
                measuredWidth = measuredWidth;
                fDp = fDp;
                f5 = 44.0f;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.cellCount * 52) + 44), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ((GestureDetector) this.gestureDetector.zza).onTouchEvent(motionEvent);
        }
    }

    public final class PeriodDay {
        public int date;
        public float fromSelProgress;
        public float fromSelSEProgress;
        public MessageObject messageObject;
        public float selectProgress;
        public float selectStartEndProgress;
        public int startOffset;
        public ArrayList storyItems;
        public float toSelProgress;
        public float toSelSEProgress;
        public boolean wasDrawn;
        public float enterAlpha = 1.0f;
        public float startEnterDelay = 1.0f;
        public boolean hasImage = true;
    }

    public final class RowAnimationValue {
        public float alpha;
        public float endX;
        public float startX;
    }

    public CalendarActivity(int i, int i2, Bundle bundle) {
        super(bundle);
        this.textPaint = new TextPaint(1);
        this.activeTextPaint = new TextPaint(1);
        this.textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        this.selectOutlinePaint = paint;
        this.selectPaint = new Paint(1);
        this.blackoutPaint = new Paint(1);
        this.messagesByYearMounth = new SparseArray();
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
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void access$2700(CalendarActivity calendarActivity) {
        if (calendarActivity.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (((ActionBarLayout) calendarActivity.parentLayout).getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (((ActionBarLayout) calendarActivity.parentLayout).getView().getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        ((ActionBarLayout) calendarActivity.parentLayout).getView().draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        calendarActivity.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        calendarActivity.blurredView.setAlpha(0.0f);
        calendarActivity.blurredView.setVisibility(0);
    }

    public final void animateSelection() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 5));
        duration.addListener(new ArticleViewer.AnonymousClass25(this, 8));
        duration.start();
        this.selectionAnimator = duration;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            updateRowSelections((MonthView) this.listView.getChildAt(i), true);
        }
        for (int i2 = 0; i2 < this.listView.getCachedChildCount(); i2++) {
            MonthView monthView = (MonthView) this.listView.getCachedChildAt(i2);
            updateRowSelections(monthView, false);
            MonthView.access$1100(monthView, this.dateSelectedStart, this.dateSelectedEnd);
            MonthView.access$1200(monthView, 1.0f);
        }
        for (int i3 = 0; i3 < this.listView.getHiddenChildCount(); i3++) {
            MonthView monthView2 = (MonthView) this.listView.getHiddenChildAt(i3);
            updateRowSelections(monthView2, false);
            MonthView.access$1100(monthView2, this.dateSelectedStart, this.dateSelectedEnd);
            MonthView.access$1200(monthView2, 1.0f);
        }
        for (int i4 = 0; i4 < this.listView.getAttachedScrapChildCount(); i4++) {
            MonthView monthView3 = (MonthView) this.listView.getAttachedScrapChildAt(i4);
            updateRowSelections(monthView3, false);
            MonthView.access$1100(monthView3, this.dateSelectedStart, this.dateSelectedEnd);
            MonthView.access$1200(monthView3, 1.0f);
        }
    }

    public final void checkLoadNext() {
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

    @Override
    public final View createView(Context context) {
        TextPaint textPaint = this.textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.activeTextPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.contentView = new AnonymousClass2(this, context);
        createActionBar(context);
        this.contentView.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 4);
        this.listView = anonymousClass34;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        anonymousClass34.setLayoutManager(linearLayoutManager);
        this.layoutManager.setReverseLayout(true);
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        AppIconsSelectorCell.AnonymousClass1 anonymousClass1 = new AppIconsSelectorCell.AnonymousClass1(this, 1);
        this.adapter = anonymousClass1;
        anonymousClass35.setAdapter(anonymousClass1);
        this.listView.addOnScrollListener(new ChatActivity.AnonymousClass53(this, 8));
        boolean z = this.calendarType == 0 && this.canClearHistory;
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z ? 48.0f : 0.0f));
        this.contentView.addView(new AnonymousClass5(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), LayoutHelper.createFrame(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 15));
        this.fragmentView = this.contentView;
        Calendar calendar = Calendar.getInstance();
        this.startFromYear = calendar.get(1);
        int i = calendar.get(2);
        this.startFromMonth = i;
        int i2 = this.selectedYear;
        if (i2 != 0) {
            int iM = zzkv.m(this.startFromYear, i2, 12, i) - this.selectedMonth;
            this.monthCount = iM + 1;
            LinearLayoutManager linearLayoutManager2 = this.layoutManager;
            linearLayoutManager2.scrollToPositionWithOffset(iM, AndroidUtilities.dp(120.0f), linearLayoutManager2.mShouldReverseLayout);
        }
        if (this.monthCount < 3) {
            this.monthCount = 3;
        }
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        this.actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.setRotation(0.0f, false);
        loadNext();
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        textPaint3.setColor(-1);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textPaint.setColor(Theme.getColor(null, i3, false));
        textPaint2.setColor(Theme.getColor(null, i3, false));
        this.actionBar.setTitleColor(Theme.getColor(null, i3, false));
        BackDrawable backDrawable2 = this.backDrawable;
        backDrawable2.color = Theme.getColor(null, i3, false);
        backDrawable2.invalidateSelf();
        this.actionBar.setItemsColor(Theme.getColor(null, i3, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_listSelector, false), false);
        textPaint3.setColor(-1);
        if (z) {
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 7);
            this.bottomBar = anonymousClass19;
            anonymousClass19.setWillNotDraw(false);
            this.bottomBar.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.bottomBar.setClipChildren(false);
            TextView textView = new TextView(context);
            this.selectDaysButton = textView;
            textView.setGravity(17);
            this.selectDaysButton.setTextSize(1, 15.0f);
            this.selectDaysButton.setTypeface(AndroidUtilities.bold());
            final int i4 = 0;
            this.selectDaysButton.setOnClickListener(new View.OnClickListener(this) {
                public final CalendarActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            CalendarActivity calendarActivity = this.f$0;
                            calendarActivity.inSelectionMode = true;
                            calendarActivity.updateTitle();
                            break;
                        default:
                            final CalendarActivity calendarActivity2 = this.f$0;
                            int i5 = calendarActivity2.lastDaysSelected;
                            if (i5 != 0) {
                                AlertsCreator.createClearDaysDialogAlert(calendarActivity2, i5, calendarActivity2.getMessagesController().getUser(Long.valueOf(calendarActivity2.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                                    @Override
                                    public final void run(boolean z2) {
                                        CalendarActivity calendarActivity3 = CalendarActivity.this;
                                        calendarActivity3.finishFragment();
                                        if (((BaseFragment) calendarActivity3).parentLayout == null || ((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout).getFragmentStack().size() < 2) {
                                            ChatActivity chatActivity = calendarActivity3.chatActivity;
                                            if (chatActivity != null) {
                                                chatActivity.deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z2);
                                                return;
                                            }
                                            return;
                                        }
                                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout).getFragmentStack());
                                        if (baseFragment instanceof ChatActivity) {
                                            ((ChatActivity) baseFragment).deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z2);
                                        }
                                    }
                                }, null);
                            } else {
                                if (calendarActivity2.selectDaysHint == null) {
                                    HintView hintView = new HintView(8, calendarActivity2.contentView.getContext(), null, false);
                                    calendarActivity2.selectDaysHint = hintView;
                                    hintView.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    calendarActivity2.contentView.addView(calendarActivity2.selectDaysHint, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    calendarActivity2.selectDaysHint.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                calendarActivity2.selectDaysHint.showForView(calendarActivity2.bottomBar, true);
                            }
                            break;
                    }
                }
            });
            this.selectDaysButton.setText(LocaleController.getString(R.string.SelectDays));
            this.selectDaysButton.setAllCaps(true);
            this.bottomBar.addView(this.selectDaysButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.removeDaysButton = textView2;
            textView2.setGravity(17);
            this.removeDaysButton.setTextSize(1, 15.0f);
            this.removeDaysButton.setTypeface(AndroidUtilities.bold());
            final int i5 = 1;
            this.removeDaysButton.setOnClickListener(new View.OnClickListener(this) {
                public final CalendarActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            CalendarActivity calendarActivity = this.f$0;
                            calendarActivity.inSelectionMode = true;
                            calendarActivity.updateTitle();
                            break;
                        default:
                            final CalendarActivity calendarActivity2 = this.f$0;
                            int i6 = calendarActivity2.lastDaysSelected;
                            if (i6 != 0) {
                                AlertsCreator.createClearDaysDialogAlert(calendarActivity2, i6, calendarActivity2.getMessagesController().getUser(Long.valueOf(calendarActivity2.dialogId)), null, false, new MessagesStorage.BooleanCallback() {
                                    @Override
                                    public final void run(boolean z2) {
                                        CalendarActivity calendarActivity3 = CalendarActivity.this;
                                        calendarActivity3.finishFragment();
                                        if (((BaseFragment) calendarActivity3).parentLayout == null || ((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout).getFragmentStack().size() < 2) {
                                            ChatActivity chatActivity = calendarActivity3.chatActivity;
                                            if (chatActivity != null) {
                                                chatActivity.deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z2);
                                                return;
                                            }
                                            return;
                                        }
                                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout, 2, ((ActionBarLayout) ((BaseFragment) calendarActivity3).parentLayout).getFragmentStack());
                                        if (baseFragment instanceof ChatActivity) {
                                            ((ChatActivity) baseFragment).deleteHistory(calendarActivity3.dateSelectedStart, calendarActivity3.dateSelectedEnd + 86400, z2);
                                        }
                                    }
                                }, null);
                            } else {
                                if (calendarActivity2.selectDaysHint == null) {
                                    HintView hintView = new HintView(8, calendarActivity2.contentView.getContext(), null, false);
                                    calendarActivity2.selectDaysHint = hintView;
                                    hintView.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    calendarActivity2.contentView.addView(calendarActivity2.selectDaysHint, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    calendarActivity2.selectDaysHint.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                calendarActivity2.selectDaysHint.showForView(calendarActivity2.bottomBar, true);
                            }
                            break;
                    }
                }
            });
            this.removeDaysButton.setAllCaps(true);
            this.removeDaysButton.setVisibility(8);
            this.bottomBar.addView(this.removeDaysButton, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.contentView.addView(this.bottomBar, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.selectDaysButton;
            int i6 = Theme.key_chat_fieldOverlayText;
            textView3.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i6, false), 51), 2, -1));
            TextView textView4 = this.removeDaysButton;
            int i7 = Theme.key_text_RedBold;
            textView4.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, i7, false), 51), 2, -1));
            this.selectDaysButton.setTextColor(Theme.getColor(null, i6, false));
            this.removeDaysButton.setTextColor(Theme.getColor(null, i7, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && this.storiesList == ((StoriesController.StoriesList) objArr[0])) {
            updateFromStoriesList();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i = Theme.default_shadow_color;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    public final void lambda$loadNext$2(TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray;
        long j;
        long j2;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            int i = 0;
            while (true) {
                int size = tL_messages_searchResultsCalendar.periods.size();
                sparseArray = this.messagesByYearMounth;
                j = 1000;
                if (i >= size) {
                    break;
                }
                calendar.setTimeInMillis(((long) tL_messages_searchResultsCalendar.periods.get(i).date) * 1000);
                int i2 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i2, sparseArray2);
                }
                PeriodDay periodDay = new PeriodDay();
                periodDay.messageObject = new MessageObject(this.currentAccount, tL_messages_searchResultsCalendar.messages.get(i), false, false);
                periodDay.date = (int) (calendar.getTimeInMillis() / 1000);
                int i3 = this.startOffset + tL_messages_searchResultsCalendar.periods.get(i).count;
                this.startOffset = i3;
                periodDay.startOffset = i3;
                int i4 = calendar.get(5) - 1;
                if (sparseArray2.get(i4, null) == null || !((PeriodDay) sparseArray2.get(i4, null)).hasImage) {
                    sparseArray2.put(i4, periodDay);
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
                calendar.setTimeInMillis(((long) i6) * j);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                j2 = j;
                if (calendar.getTimeInMillis() / j > iCurrentTimeMillis) {
                    break;
                }
                int i7 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i7);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i7, sparseArray3);
                }
                int i8 = calendar.get(5) - 1;
                if (sparseArray3.get(i8, null) == null) {
                    PeriodDay periodDay2 = new PeriodDay();
                    periodDay2.hasImage = false;
                    periodDay2.date = (int) (calendar.getTimeInMillis() / j2);
                    sparseArray3.put(i8, periodDay2);
                }
                i6 += 86400;
                j = j2;
            }
            this.loading = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                this.endReached = true;
            } else {
                this.lastId = ((TLRPC.Message) zziq.m(1, tL_messages_searchResultsCalendar.messages)).id;
                this.endReached = false;
                checkLoadNext();
            }
            if (this.isOpened) {
                this.checkEnterItems = true;
            }
            this.listView.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / j2) - ((long) tL_messages_searchResultsCalendar.min_date)) / 2629800)) + 1;
            this.adapter.mObservable.notifyItemRangeChanged(0, this.monthCount, null);
            int i9 = this.monthCount;
            if (timeInMillis > i9) {
                this.adapter.mObservable.notifyItemRangeInserted(i9 + 1, timeInMillis);
                this.monthCount = timeInMillis;
            }
            if (this.endReached) {
                resumeDelayedFragmentAnimation();
            }
        }
    }

    public final void loadNext() {
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
        this.listView.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ChatActivity$$ExternalSyntheticLambda208(13, this, calendar));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
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
    public final boolean onFragmentCreate() {
        this.dialogId = getArguments().getLong("dialog_id");
        this.topicId = getArguments().getLong("topic_id");
        int i = getArguments().getInt("type");
        this.calendarType = i;
        if (i == 2) {
            this.storiesList = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesList(this.dialogId, 0, -1, true);
        } else if (i == 3) {
            this.storiesList = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesList(this.dialogId, 1, -1, true);
        }
        StoriesController.StoriesList storiesList = this.storiesList;
        if (storiesList != null) {
            this.storiesPlaceProvider = new PhotoViewer.AnonymousClass18(this, 12);
        }
        if (this.dialogId >= 0) {
            this.canClearHistory = true;
        } else {
            this.canClearHistory = false;
        }
        if (storiesList != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.storiesList != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        MonthView.AnonymousClass2.C00032 c00032;
        if (z && (c00032 = this.blurredView) != null && c00032.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        MonthView.AnonymousClass2.C00032 c00032 = this.blurredView;
        if (c00032 == null || c00032.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.isOpened = true;
    }

    public final void updateFromStoriesList() {
        this.loading = this.storiesList.isLoading();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.messagesByYearMounth;
        sparseArray.clear();
        this.minDate = Integer.MAX_VALUE;
        for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            this.minDate = Math.min(this.minDate, messageObject.messageOwner.date);
            calendar.setTimeInMillis(((long) messageObject.messageOwner.date) * 1000);
            int i2 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i2, sparseArray2);
            }
            int i3 = calendar.get(5) - 1;
            PeriodDay periodDay = (PeriodDay) sparseArray2.get(i3);
            if (periodDay == null) {
                periodDay = new PeriodDay();
                periodDay.storyItems = new ArrayList();
            }
            periodDay.storyItems.add(Integer.valueOf(messageObject.getId()));
            periodDay.messageObject = messageObject;
            periodDay.date = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i3, periodDay);
            int i4 = this.minMontYear;
            if (i2 < i4 || i4 == 0) {
                this.minMontYear = i2;
            }
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i5 = this.minDate; i5 < iCurrentTimeMillis; i5 += 86400) {
            calendar.setTimeInMillis(((long) i5) * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i6 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i6);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i6, sparseArray3);
            }
            int i7 = calendar.get(5) - 1;
            if (sparseArray3.get(i7, null) == null) {
                PeriodDay periodDay2 = new PeriodDay();
                periodDay2.hasImage = false;
                periodDay2.date = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i7, periodDay2);
            }
        }
        this.endReached = this.storiesList.done;
        if (this.isOpened) {
            this.checkEnterItems = true;
        }
        this.listView.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - ((long) this.minDate)) / 2629800)) + 1;
        AppIconsSelectorCell.AnonymousClass1 anonymousClass1 = this.adapter;
        anonymousClass1.mObservable.notifyItemRangeChanged(0, this.monthCount, null);
        int i8 = this.monthCount;
        if (timeInMillis > i8) {
            this.adapter.mObservable.notifyItemRangeInserted(i8 + 1, timeInMillis);
            this.monthCount = timeInMillis;
        }
        if (this.endReached) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void updateRowSelections(MonthView monthView, boolean z) {
        int i;
        int i2;
        if (this.dateSelectedStart == 0 || this.dateSelectedEnd == 0) {
            for (int i3 = 0; i3 < monthView.rowSelectionPos.size(); i3++) {
                monthView.animateRow(monthView.rowSelectionPos.keyAt(i3), 0, 0, false, z);
            }
            return;
        }
        if (monthView.messagesByDays == null) {
            return;
        }
        if (!z) {
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = monthView.rowSelectionPos;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                monthView.animateRow(sparseArray.keyAt(i4), 0, 0, false, false);
                i4++;
            }
        }
        int i5 = monthView.startDayOfWeek;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        for (int i9 = 0; i9 < monthView.daysInMonth; i9++) {
            PeriodDay periodDay = (PeriodDay) monthView.messagesByDays.get(i9, null);
            if (periodDay != null && (i2 = periodDay.date) >= this.dateSelectedStart && i2 <= this.dateSelectedEnd) {
                if (i6 == -1) {
                    i6 = i5;
                }
                i7 = i5;
            }
            i5++;
            if (i5 >= 7) {
                if (i6 == -1 || i7 == -1) {
                    i = i8;
                    monthView.animateRow(i, 0, 0, false, z);
                } else {
                    i = i8;
                    monthView.animateRow(i, i6, i7, true, z);
                }
                i8 = i + 1;
                i5 = 0;
                i6 = -1;
                i7 = -1;
            }
        }
        if (i6 == -1 || i7 == -1) {
            monthView.animateRow(i8, 0, 0, false, z);
        } else {
            monthView.animateRow(i8, i6, i7, true, z);
        }
    }

    public final void updateTitle() {
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
        String str = string;
        if (iAbs > 1) {
            this.removeDaysButton.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (iAbs > 0 || this.inSelectionMode) {
            this.removeDaysButton.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.setTitleAnimated(str, z2, 150L, null);
        if ((!this.inSelectionMode || iAbs > 0) && (hintView = this.selectDaysHint) != null) {
            hintView.hide(true);
        }
        if (iAbs > 0 || this.inSelectionMode) {
            if (this.removeDaysButton.getVisibility() == 8) {
                this.removeDaysButton.setAlpha(0.0f);
                this.removeDaysButton.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.removeDaysButton.setVisibility(0);
            this.selectDaysButton.animate().setListener(null).cancel();
            this.removeDaysButton.animate().setListener(null).cancel();
            this.selectDaysButton.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new ChatActivity.AnonymousClass77(this.selectDaysButton)).start();
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
        this.removeDaysButton.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new ChatActivity.AnonymousClass77(this.removeDaysButton)).start();
        this.selectDaysButton.setEnabled(true);
        this.removeDaysButton.setEnabled(false);
    }

    public final class AnonymousClass5 extends View {
        public final int $r8$classId = 3;
        public Object this$0;
        public final Object val$daysOfWeek;
        public Object val$headerShadowDrawable;

        public AnonymousClass5(Activity activity) {
            super(activity);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false, false);
            this.val$daysOfWeek = animatedTextDrawable;
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setColor(-1);
            animatedTextDrawable.alpha = Color.alpha(-1);
            animatedTextDrawable.gravity = 17;
            textPaint.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.setCallback(this);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            switch (this.$r8$classId) {
                case 2:
                    TopicsTabsView.HorizontalTabView horizontalTabView = (TopicsTabsView.HorizontalTabView) this.this$0;
                    float fIsNotEmpty = horizontalTabView.counterText.isNotEmpty();
                    if (fIsNotEmpty > 0.0f) {
                        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fIsNotEmpty);
                        float fDp = AndroidUtilities.dp(16.66f);
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = horizontalTabView.counterText;
                        float fMax = Math.max(fDp, animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, fMax, getHeight());
                        canvas.save();
                        canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
                        float fDp2 = AndroidUtilities.dp(8.33f);
                        float fDp3 = AndroidUtilities.dp(8.33f);
                        int i = horizontalTabView.counterBackgroundColorKey;
                        AnimatedPaint animatedPaint = (AnimatedPaint) this.val$daysOfWeek;
                        animatedPaint.setColor(animatedPaint.color.set(Theme.getColor(i, animatedPaint.resourcesProvider), false));
                        animatedPaint.setColor(ColorUtils.blendARGB(horizontalTabView.selectT, animatedPaint.getColor(), horizontalTabView.getTextColor()));
                        animatedPaint.setAlpha((int) (animatedPaint.getAlpha() * fIsNotEmpty));
                        canvas.drawRoundRect(rectF, fDp2, fDp3, animatedPaint);
                        animatedTextDrawable.setBounds(rectF);
                        animatedTextDrawable.alpha = (int) (fIsNotEmpty * 255.0f);
                        int color = Theme.getColor(Theme.key_chats_unreadCounterText, (Theme.ResourcesProvider) this.val$headerShadowDrawable);
                        animatedTextDrawable.textPaint.setColor(color);
                        animatedTextDrawable.alpha = Color.alpha(color);
                        animatedTextDrawable.draw(canvas);
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 3:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 4:
                    GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog = (GroupCallActivity$CallEncryptionCell$EncryptionCallDialog) this.this$0;
                    if (groupCallActivity$CallEncryptionCell$EncryptionCallDialog.progress <= 0.0f || groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapPaint == null) {
                        canvas2 = canvas;
                    } else {
                        groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurMatrix.reset();
                        float width = getWidth() / groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmap.getWidth();
                        groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurMatrix.postScale(width, width);
                        groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapShader.setLocalMatrix(groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurMatrix);
                        groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapPaint.setAlpha((int) (groupCallActivity$CallEncryptionCell$EncryptionCallDialog.progress * 255.0f));
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapPaint);
                    }
                    QrActivity.AnonymousClass2 anonymousClass2 = (QrActivity.AnonymousClass2) this.val$headerShadowDrawable;
                    if (anonymousClass2 != null) {
                        boolean zIsAttachedToWindow = anonymousClass2.isAttachedToWindow();
                        int[] iArr = (int[]) this.val$daysOfWeek;
                        if (!zIsAttachedToWindow || anonymousClass2.getAlpha() <= 0.5f) {
                            groupCallActivity$CallEncryptionCell$EncryptionCallDialog.dismiss();
                        } else {
                            anonymousClass2.getLocationInWindow(iArr);
                        }
                        canvas2.save();
                        canvas2.translate(iArr[0] - ((1.0f - anonymousClass2.getScaleX()) * anonymousClass2.getMeasuredWidth()), iArr[1] - ((1.0f - anonymousClass2.getScaleY()) * anonymousClass2.getMeasuredHeight()));
                        if (((GroupCallActivity.CallEncryptionCellDrawable) anonymousClass2.this$0).draw(canvas2, anonymousClass2.getMeasuredWidth(), groupCallActivity$CallEncryptionCell$EncryptionCallDialog.progress)) {
                            invalidate();
                        }
                        canvas2.restore();
                    }
                    break;
                case 5:
                    super.dispatchDraw(canvas);
                    int iDp = AndroidUtilities.dp(48.0f);
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    int i2 = iDp + ((int) groupCreateActivity.animatorSelectorContainerHeight.factor);
                    Paint paint = (Paint) this.val$headerShadowDrawable;
                    paint.setColor(groupCreateActivity.getThemedColor(Theme.key_actionBarDefault));
                    RectF rectF2 = (RectF) this.val$daysOfWeek;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) groupCreateActivity).actionBar.getMeasuredHeight() + i2);
                    GroupCreateActivity.access$3700(groupCreateActivity, canvas, rectF2, paint);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f;
            PhotoViewerWebView photoViewerWebView;
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    float measuredWidth = getMeasuredWidth() / 7.0f;
                    for (int i = 0; i < 7; i++) {
                        canvas.drawText(((String[]) this.val$daysOfWeek)[i], (measuredWidth / 2.0f) + (i * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((CalendarActivity) this.this$0).textPaint2);
                    }
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    Drawable drawable = (Drawable) this.val$headerShadowDrawable;
                    drawable.setBounds(0, measuredHeight, measuredWidth2, measuredHeight2);
                    drawable.draw(canvas);
                    break;
                case 1:
                    super.onDraw(canvas);
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    if (!pipVideoOverlay.isWebView || ((photoViewerWebView = pipVideoOverlay.photoViewerWebView) != null && photoViewerWebView.isYouTube)) {
                        int width = getWidth();
                        int iDp = AndroidUtilities.dp(10.0f);
                        float f2 = (width - iDp) - iDp;
                        int i2 = iDp + ((int) (pipVideoOverlay.videoProgress * f2));
                        float height = getHeight() - AndroidUtilities.dp(8.0f);
                        float f3 = pipVideoOverlay.bufferProgress;
                        if (f3 != 0.0f) {
                            float f4 = iDp;
                            f = height;
                            canvas.drawLine(f4, f, (f2 * f3) + f4, height, (Paint) this.val$headerShadowDrawable);
                        } else {
                            f = height;
                        }
                        canvas.drawLine(iDp, f, i2, f, (Paint) this.val$daysOfWeek);
                    }
                    break;
                case 2:
                case 4:
                case 5:
                default:
                    super.onDraw(canvas);
                    break;
                case 3:
                    super.onDraw(canvas);
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.val$daysOfWeek;
                    int iDpf2 = (int) (AndroidUtilities.dpf2(30.0f) + animatedTextDrawable.getCurrentWidth());
                    int width2 = (getWidth() - iDpf2) / 2;
                    int i3 = iDpf2 + width2;
                    BlurredBackgroundDrawable blurredBackgroundDrawable = (BlurredBackgroundDrawable) this.val$headerShadowDrawable;
                    if (blurredBackgroundDrawable != null) {
                        blurredBackgroundDrawable.setBounds(width2, 0, i3, getHeight());
                        ((BlurredBackgroundDrawable) this.val$headerShadowDrawable).draw(canvas);
                    }
                    animatedTextDrawable.draw(canvas);
                    break;
                case 6:
                    LocationActivity locationActivity = (LocationActivity) this.this$0;
                    Drawable drawable2 = locationActivity.shadowDrawable;
                    Rect rect = (Rect) this.val$headerShadowDrawable;
                    drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                    locationActivity.shadowDrawable.draw(canvas);
                    int i4 = locationActivity.locationType;
                    if (i4 == 0 || i4 == 1) {
                        int iDp2 = AndroidUtilities.dp(36.0f);
                        int iDp3 = AndroidUtilities.dp(10.0f) + rect.top;
                        RectF rectF = (RectF) this.val$daysOfWeek;
                        rectF.set((getMeasuredWidth() - iDp2) / 2, iDp3, (getMeasuredWidth() + iDp2) / 2, AndroidUtilities.dp(4.0f) + iDp3);
                        int themedColor = locationActivity.getThemedColor(Theme.key_sheet_scrollUp);
                        Color.alpha(themedColor);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                    break;
                case 7:
                    super.onDraw(canvas);
                    AnimatedFloat animatedFloat = (AnimatedFloat) this.val$headerShadowDrawable;
                    animatedFloat.parent = this;
                    ((PeerStoriesView) this.this$0).getClass();
                    animatedFloat.set(0.0f, false);
                    float f5 = animatedFloat.value;
                    if (f5 != 0.0f) {
                        if (f5 != 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (animatedFloat.value * 255.0f), 31);
                        } else {
                            canvas.save();
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                        LoadingDrawable loadingDrawable = (LoadingDrawable) this.val$daysOfWeek;
                        loadingDrawable.setBounds(rectF2);
                        loadingDrawable.getClass();
                        loadingDrawable.setRadii(AndroidUtilities.dp(24.0f));
                        loadingDrawable.setColors(ColorUtils.setAlphaComponent(-1, 20), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 70));
                        loadingDrawable.draw(canvas);
                        invalidate();
                        canvas.restore();
                    }
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((TopicsTabsView.HorizontalTabView) this.this$0).counterText.currentWidth + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 3:
                    super.onSizeChanged(i, i2, i3, i4);
                    ((AnimatedTextView.AnimatedTextDrawable) this.val$daysOfWeek).setBounds(0, 0, i, i2);
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 2:
                    return ((TopicsTabsView.HorizontalTabView) this.this$0).counterText == drawable || super.verifyDrawable(drawable);
                case 3:
                    return super.verifyDrawable(drawable) || drawable == ((AnimatedTextView.AnimatedTextDrawable) this.val$daysOfWeek);
                default:
                    return super.verifyDrawable(drawable);
            }
        }

        public AnonymousClass5(CalendarActivity calendarActivity, Context context, String[] strArr, Drawable drawable) {
            super(context);
            this.this$0 = calendarActivity;
            this.val$daysOfWeek = strArr;
            this.val$headerShadowDrawable = drawable;
        }

        public AnonymousClass5(PipVideoOverlay pipVideoOverlay, Context context) {
            super(context);
            this.this$0 = pipVideoOverlay;
            Paint paint = new Paint();
            this.val$daysOfWeek = paint;
            Paint paint2 = new Paint();
            this.val$headerShadowDrawable = paint2;
            paint.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setColor(paint.getColor());
            paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
            paint2.setStyle(style);
            paint2.setStrokeCap(cap);
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        public AnonymousClass5(TopicsTabsView.HorizontalTabView horizontalTabView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.this$0 = horizontalTabView;
            this.val$headerShadowDrawable = resourcesProvider;
            this.val$daysOfWeek = new AnimatedPaint(resourcesProvider, this);
            horizontalTabView.counterText.setCallback(this);
        }

        public AnonymousClass5(GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog, Activity activity, QrActivity.AnonymousClass2 anonymousClass2) {
            super(activity);
            this.this$0 = groupCallActivity$CallEncryptionCell$EncryptionCallDialog;
            this.val$headerShadowDrawable = anonymousClass2;
            this.val$daysOfWeek = new int[2];
        }

        public AnonymousClass5(GroupCreateActivity groupCreateActivity, Context context) {
            super(context);
            this.this$0 = groupCreateActivity;
            this.val$daysOfWeek = new RectF();
            this.val$headerShadowDrawable = new Paint(1);
        }

        public AnonymousClass5(LocationActivity locationActivity, Context context, Rect rect) {
            super(context);
            this.this$0 = locationActivity;
            this.val$headerShadowDrawable = rect;
            this.val$daysOfWeek = new RectF();
        }

        public AnonymousClass5(PeerStoriesView peerStoriesView, Context context) {
            super(context);
            this.this$0 = peerStoriesView;
            this.val$daysOfWeek = new LoadingDrawable();
            this.val$headerShadowDrawable = new AnimatedFloat(250L, CubicBezierInterpolator.DEFAULT);
        }
    }
}
