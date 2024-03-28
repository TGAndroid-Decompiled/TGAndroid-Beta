package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Components.AnimatedAvatarContainer;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.UsersSelectActivity;
public class UsersSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    private GroupCreateAdapter adapter;
    private ArrayList<GroupCreateSpan> allSpans;
    public boolean allowSelf;
    AnimatedAvatarContainer animatedAvatarContainer;
    private int containerHeight;
    private GroupCreateSpan currentDeletingSpan;
    private FilterUsersActivityDelegate delegate;
    public boolean doNotNewChats;
    private EditTextBoldCursor editText;
    private StickerEmptyView emptyView;
    private int fieldY;
    private int filterFlags;
    private ImageView floatingButton;
    private boolean ignoreScrollEvent;
    private ArrayList<Long> initialIds;
    private boolean isInclude;
    private RecyclerListView listView;
    public boolean noChatTypes;
    private FlickerLoadingView progressView;
    private ScrollView scrollView;
    private boolean searchWas;
    private boolean searching;
    private LongSparseArray<GroupCreateSpan> selectedContacts;
    private int selectedCount;
    private SpansContainer spansContainer;
    private int ttlPeriod;
    private int type;

    public interface FilterUsersActivityDelegate {
        void didSelectChats(ArrayList<Long> arrayList, int i);
    }

    static int access$2172(UsersSelectActivity usersSelectActivity, int i) {
        int i2 = i & usersSelectActivity.filterFlags;
        usersSelectActivity.filterFlags = i2;
        return i2;
    }

    static int access$508(UsersSelectActivity usersSelectActivity) {
        int i = usersSelectActivity.selectedCount;
        usersSelectActivity.selectedCount = i + 1;
        return i;
    }

    static int access$510(UsersSelectActivity usersSelectActivity) {
        int i = usersSelectActivity.selectedCount;
        usersSelectActivity.selectedCount = i - 1;
        return i;
    }

    public void setTtlPeriod(int i) {
        this.ttlPeriod = i;
    }

    private static class ItemDecoration extends RecyclerView.ItemDecoration {
        private boolean single;
        private int skipRows;

        private ItemDecoration() {
        }

        @Override
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int width = recyclerView.getWidth();
            int childCount = recyclerView.getChildCount() - (!this.single ? 1 : 0);
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                View childAt2 = i < childCount + (-1) ? recyclerView.getChildAt(i + 1) : null;
                if (recyclerView.getChildAdapterPosition(childAt) >= this.skipRows && !(childAt instanceof GraySectionCell) && !(childAt2 instanceof GraySectionCell)) {
                    float bottom = childAt.getBottom();
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, Theme.dividerPaint);
                }
                i++;
            }
        }

        @Override
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.top = 1;
        }
    }

    public class SpansContainer extends ViewGroup {
        private View addingSpan;
        private boolean animationStarted;
        private ArrayList<Animator> animators;
        private AnimatorSet currentAnimation;
        private View removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList<>();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int min;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int dp = size - AndroidUtilities.dp(26.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + i3 > dp) {
                        dp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i3 = 0;
                    }
                    if (childAt.getMeasuredWidth() + i4 > dp) {
                        dp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i4 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(13.0f) + i3;
                    if (!this.animationStarted) {
                        View view = this.removingSpan;
                        if (childAt == view) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i4);
                            childAt.setTranslationY(dp3);
                        } else if (view != null) {
                            float f = dp4;
                            if (childAt.getTranslationX() != f) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f));
                            }
                            float f2 = dp2;
                            if (childAt.getTranslationY() != f2) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, f2));
                            }
                        } else {
                            childAt.setTranslationX(dp4);
                            childAt.setTranslationY(dp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        i3 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                    }
                    i4 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                }
            }
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                min = (Math.min(point.x, point.y) - AndroidUtilities.dp(158.0f)) / 3;
            }
            if (dp - i3 < min) {
                dp2 += AndroidUtilities.dp(40.0f);
                i3 = 0;
            }
            if (dp - i4 < min) {
                dp3 += AndroidUtilities.dp(40.0f);
            }
            UsersSelectActivity.this.editText.measure(View.MeasureSpec.makeMeasureSpec(dp - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            if (!this.animationStarted) {
                int dp5 = dp3 + AndroidUtilities.dp(42.0f);
                int dp6 = i3 + AndroidUtilities.dp(16.0f);
                UsersSelectActivity.this.fieldY = dp2;
                if (this.currentAnimation == null) {
                    UsersSelectActivity.this.containerHeight = dp5;
                    UsersSelectActivity.this.editText.setTranslationX(dp6);
                    UsersSelectActivity.this.editText.setTranslationY(UsersSelectActivity.this.fieldY);
                } else {
                    int dp7 = dp2 + AndroidUtilities.dp(42.0f);
                    if (UsersSelectActivity.this.containerHeight != dp7) {
                        this.animators.add(ObjectAnimator.ofInt(UsersSelectActivity.this, "containerHeight", dp7));
                    }
                    float f3 = dp6;
                    if (UsersSelectActivity.this.editText.getTranslationX() != f3) {
                        this.animators.add(ObjectAnimator.ofFloat(UsersSelectActivity.this.editText, View.TRANSLATION_X, f3));
                    }
                    if (UsersSelectActivity.this.editText.getTranslationY() != UsersSelectActivity.this.fieldY) {
                        this.animators.add(ObjectAnimator.ofFloat(UsersSelectActivity.this.editText, View.TRANSLATION_Y, UsersSelectActivity.this.fieldY));
                    }
                    UsersSelectActivity.this.editText.setAllowDrawCursor(false);
                    this.currentAnimation.playTogether(this.animators);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                }
            } else if (this.currentAnimation != null && !UsersSelectActivity.this.ignoreScrollEvent && this.removingSpan == null) {
                UsersSelectActivity.this.editText.bringPointIntoView(UsersSelectActivity.this.editText.getSelectionStart());
            }
            setMeasuredDimension(size, UsersSelectActivity.this.containerHeight);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            UsersSelectActivity.this.allSpans.add(groupCreateSpan);
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                UsersSelectActivity.access$508(UsersSelectActivity.this);
            }
            UsersSelectActivity.this.selectedContacts.put(uid, groupCreateSpan);
            UsersSelectActivity.this.editText.setHintVisible(false, TextUtils.isEmpty(UsersSelectActivity.this.editText.getText()));
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SpansContainer.this.addingSpan = null;
                        SpansContainer.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                        UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                    }
                });
                this.currentAnimation.setDuration(150L);
                this.addingSpan = groupCreateSpan;
                this.animators.clear();
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.SCALE_X, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.SCALE_Y, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.ALPHA, 0.0f, 1.0f));
            }
            addView(groupCreateSpan);
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            UsersSelectActivity.this.ignoreScrollEvent = true;
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                UsersSelectActivity.access$510(UsersSelectActivity.this);
            }
            UsersSelectActivity.this.selectedContacts.remove(uid);
            UsersSelectActivity.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpan = null;
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                    UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                    if (UsersSelectActivity.this.allSpans.isEmpty()) {
                        UsersSelectActivity.this.editText.setHintVisible(true, true);
                    }
                }
            });
            this.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public UsersSelectActivity(boolean z, ArrayList<Long> arrayList, int i) {
        this.selectedContacts = new LongSparseArray<>();
        this.allSpans = new ArrayList<>();
        this.isInclude = z;
        this.filterFlags = i;
        this.initialIds = arrayList;
        this.type = 0;
        this.allowSelf = true;
    }

    public UsersSelectActivity asPrivateChats() {
        this.type = 2;
        this.allowSelf = false;
        return this;
    }

    public UsersSelectActivity(int i) {
        this.selectedContacts = new LongSparseArray<>();
        this.allSpans = new ArrayList<>();
        this.type = i;
        this.allowSelf = i != 1;
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override
    public void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            if (this.type == 2) {
                if (groupCreateSpan.getUid() == -9223372036854775800L) {
                    this.filterFlags &= -2;
                } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                    this.filterFlags &= -3;
                } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                    this.filterFlags &= -5;
                } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                    this.filterFlags &= -9;
                }
            } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_CONTACTS ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_GROUPS ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_CHANNELS ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_BOTS ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ ^ (-1);
            } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
                this.filterFlags &= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED ^ (-1);
            }
            updateHint();
            checkVisibleRows();
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    @Override
    public View createView(final Context context) {
        Object chat;
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        if (this.type == 1) {
            AnimatedAvatarContainer animatedAvatarContainer = new AnimatedAvatarContainer(getContext());
            this.animatedAvatarContainer = animatedAvatarContainer;
            ActionBar actionBar = this.actionBar;
            boolean z = LocaleController.isRTL;
            actionBar.addView(animatedAvatarContainer, LayoutHelper.createFrame(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.type;
        if (i == 0 || i == 2) {
            if (this.isInclude) {
                this.actionBar.setTitle(LocaleController.getString("FilterAlwaysShow", R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString("FilterNeverShow", R.string.FilterNeverShow));
            }
        } else if (i == 1) {
            updateHint();
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    UsersSelectActivity.this.finishFragment();
                } else if (i2 == 1) {
                    UsersSelectActivity.this.onDonePressed(true);
                }
            }
        });
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                int dp;
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size2);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    dp = AndroidUtilities.dp(144.0f);
                } else {
                    dp = AndroidUtilities.dp(56.0f);
                }
                UsersSelectActivity.this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                UsersSelectActivity.this.listView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                UsersSelectActivity.this.emptyView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                UsersSelectActivity.this.progressView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                if (UsersSelectActivity.this.floatingButton != null) {
                    int dp2 = AndroidUtilities.dp(Build.VERSION.SDK_INT < 21 ? 60.0f : 56.0f);
                    UsersSelectActivity.this.floatingButton.measure(View.MeasureSpec.makeMeasureSpec(dp2, 1073741824), View.MeasureSpec.makeMeasureSpec(dp2, 1073741824));
                }
            }

            @Override
            protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                UsersSelectActivity.this.scrollView.layout(0, 0, UsersSelectActivity.this.scrollView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight());
                UsersSelectActivity.this.listView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.listView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.listView.getMeasuredHeight());
                UsersSelectActivity.this.emptyView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.emptyView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.emptyView.getMeasuredHeight());
                UsersSelectActivity.this.progressView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.emptyView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.progressView.getMeasuredHeight());
                if (UsersSelectActivity.this.floatingButton != null) {
                    int dp = LocaleController.isRTL ? AndroidUtilities.dp(14.0f) : ((i4 - i2) - AndroidUtilities.dp(14.0f)) - UsersSelectActivity.this.floatingButton.getMeasuredWidth();
                    int dp2 = ((i5 - i3) - AndroidUtilities.dp(14.0f)) - UsersSelectActivity.this.floatingButton.getMeasuredHeight();
                    UsersSelectActivity.this.floatingButton.layout(dp, dp2, UsersSelectActivity.this.floatingButton.getMeasuredWidth() + dp, UsersSelectActivity.this.floatingButton.getMeasuredHeight() + dp2);
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean drawChild = super.drawChild(canvas, view, j);
                if (view == UsersSelectActivity.this.listView || view == UsersSelectActivity.this.emptyView) {
                    ((BaseFragment) UsersSelectActivity.this).parentLayout.drawHeaderShadow(canvas, UsersSelectActivity.this.scrollView.getMeasuredHeight());
                }
                return drawChild;
            }
        };
        this.fragmentView = viewGroup;
        ViewGroup viewGroup2 = viewGroup;
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
                if (UsersSelectActivity.this.ignoreScrollEvent) {
                    UsersSelectActivity.this.ignoreScrollEvent = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top += UsersSelectActivity.this.fieldY + AndroidUtilities.dp(20.0f);
                rect.bottom += UsersSelectActivity.this.fieldY + AndroidUtilities.dp(50.0f);
                return super.requestChildRectangleOnScreen(view, rect, z2);
            }
        };
        this.scrollView = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_windowBackgroundWhite));
        viewGroup2.addView(this.scrollView);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
        this.spansContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UsersSelectActivity.this.lambda$createView$0(view);
            }
        });
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (UsersSelectActivity.this.currentDeletingSpan != null) {
                    UsersSelectActivity.this.currentDeletingSpan.cancelDeleteAnimation();
                    UsersSelectActivity.this.currentDeletingSpan = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.editText.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText));
        this.editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.editText.setCursorColor(Theme.getColor(Theme.key_groupcreate_cursor));
        this.editText.setCursorWidth(1.5f);
        this.editText.setInputType(655536);
        this.editText.setSingleLine(true);
        this.editText.setBackgroundDrawable(null);
        this.editText.setVerticalScrollBarEnabled(false);
        this.editText.setHorizontalScrollBarEnabled(false);
        this.editText.setTextIsSelectable(false);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setImeOptions(268435462);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.spansContainer.addView(this.editText);
        this.editText.setHintText(LocaleController.getString("SearchForPeopleAndGroups", R.string.SearchForPeopleAndGroups));
        this.editText.setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        this.editText.setOnKeyListener(new View.OnKeyListener() {
            private boolean wasEmpty;

            @Override
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (i2 == 67) {
                    if (keyEvent.getAction() == 0) {
                        this.wasEmpty = UsersSelectActivity.this.editText.length() == 0;
                    } else if (keyEvent.getAction() == 1 && this.wasEmpty && !UsersSelectActivity.this.allSpans.isEmpty()) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) UsersSelectActivity.this.allSpans.get(UsersSelectActivity.this.allSpans.size() - 1);
                        UsersSelectActivity.this.spansContainer.removeSpan(groupCreateSpan);
                        if (UsersSelectActivity.this.type == 2) {
                            if (groupCreateSpan.getUid() == -9223372036854775800L) {
                                UsersSelectActivity.access$2172(UsersSelectActivity.this, -2);
                            } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                                UsersSelectActivity.access$2172(UsersSelectActivity.this, -3);
                            } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                                UsersSelectActivity.access$2172(UsersSelectActivity.this, -5);
                            } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                                UsersSelectActivity.access$2172(UsersSelectActivity.this, -9);
                            }
                        } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_CONTACTS ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_GROUPS ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_CHANNELS ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_BOTS ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ ^ (-1));
                        } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
                            UsersSelectActivity.access$2172(UsersSelectActivity.this, MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED ^ (-1));
                        }
                        UsersSelectActivity.this.updateHint();
                        UsersSelectActivity.this.checkVisibleRows();
                        return true;
                    }
                }
                return false;
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (UsersSelectActivity.this.editText.length() == 0) {
                    UsersSelectActivity.this.closeSearch();
                    return;
                }
                if (!UsersSelectActivity.this.adapter.searching) {
                    UsersSelectActivity.this.searching = true;
                    UsersSelectActivity.this.searchWas = true;
                    UsersSelectActivity.this.adapter.setSearching(true);
                    UsersSelectActivity.this.listView.setFastScrollVisible(false);
                    UsersSelectActivity.this.listView.setVerticalScrollBarEnabled(true);
                    UsersSelectActivity.this.emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                }
                UsersSelectActivity.this.emptyView.showProgress(true);
                UsersSelectActivity.this.adapter.searchDialogs(UsersSelectActivity.this.editText.getText().toString());
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(10);
        this.progressView.showDate(false);
        this.progressView.setItemsCount(3);
        FlickerLoadingView flickerLoadingView2 = this.progressView;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        int i3 = Theme.key_listSelector;
        flickerLoadingView2.setColors(i2, i3, i3);
        viewGroup2.addView(this.progressView);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(this, context, this.progressView, 1) {
            @Override
            public void setVisibility(int i4) {
                super.setVisibility(i4);
                if (i4 != 0) {
                    showProgress(false, false);
                }
            }
        };
        this.emptyView = stickerEmptyView;
        stickerEmptyView.showProgress(ContactsController.getInstance(this.currentAccount).isLoadingContacts());
        this.emptyView.title.setText(LocaleController.getString("NoContacts", R.string.NoContacts));
        viewGroup2.addView(this.emptyView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.addItemDecoration(new ItemDecoration());
        viewGroup2.addView(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i4) {
                UsersSelectActivity.this.lambda$createView$1(context, view, i4);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                if (i4 == 1) {
                    AndroidUtilities.hideKeyboard(UsersSelectActivity.this.editText);
                }
            }
        });
        ImageView imageView = new ImageView(context);
        this.floatingButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
        this.floatingButton.setImageResource(R.drawable.floating_check);
        if (i4 >= 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            ImageView imageView2 = this.floatingButton;
            Property property = View.TRANSLATION_Z;
            stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(imageView2, property, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButton, property, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
            this.floatingButton.setStateListAnimator(stateListAnimator);
            this.floatingButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
        }
        viewGroup2.addView(this.floatingButton);
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UsersSelectActivity.this.lambda$createView$2(view);
            }
        });
        this.floatingButton.setContentDescription(LocaleController.getString("Next", R.string.Next));
        int i5 = this.isInclude ? 5 : 3;
        for (int i6 = 1; i6 <= i5; i6++) {
            int i7 = 4;
            String str = "non_contacts";
            if (this.type == 2) {
                if (i6 == 1) {
                    str = "existing_chats";
                    i7 = 1;
                } else if (i6 != 2 || this.doNotNewChats) {
                    if (i6 != (!this.doNotNewChats ? 1 : 0) + 2) {
                        i7 = 8;
                    }
                    str = "contacts";
                } else {
                    str = "new_chats";
                    i7 = 2;
                }
            } else if (this.isInclude) {
                if (i6 == 1) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i6 == 2) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i6 == 3) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i6 == 4) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i6 == 1) {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i6 == 2) {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((this.filterFlags & i7) != 0) {
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.editText.getContext(), str);
                this.spansContainer.addSpan(groupCreateSpan, false);
                groupCreateSpan.setOnClickListener(this);
            }
        }
        ArrayList<Long> arrayList = this.initialIds;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.initialIds.size();
            for (int i8 = 0; i8 < size; i8++) {
                Long l = this.initialIds.get(i8);
                if (l.longValue() > 0) {
                    chat = getMessagesController().getUser(l);
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-l.longValue()));
                }
                if (chat != null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.editText.getContext(), chat);
                    this.spansContainer.addSpan(groupCreateSpan2, false);
                    groupCreateSpan2.setOnClickListener(this);
                }
            }
        }
        updateHint();
        return this.fragmentView;
    }

    public void lambda$createView$0(View view) {
        this.editText.clearFocus();
        this.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.editText);
    }

    public void lambda$createView$1(android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.lambda$createView$1(android.content.Context, android.view.View, int):void");
    }

    public void lambda$createView$2(View view) {
        onDonePressed(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        EditTextBoldCursor editTextBoldCursor = this.editText;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.showProgress(false);
            }
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            if (this.listView != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.listView.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                    return;
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.listView.getChildAt(i3);
                    if (childAt instanceof GroupCreateUserCell) {
                        ((GroupCreateUserCell) childAt).update(intValue);
                    }
                }
            }
        } else if (i == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    @Keep
    public void setContainerHeight(int i) {
        this.containerHeight = i;
        SpansContainer spansContainer = this.spansContainer;
        if (spansContainer != null) {
            spansContainer.requestLayout();
        }
    }

    @Keep
    public int getContainerHeight() {
        return this.containerHeight;
    }

    public void checkVisibleRows() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1716307998:
                            if (str.equals("archived")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -268161860:
                            if (str.equals("new_chats")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 151051367:
                            if (str.equals("existing_chats")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    j = -9223372036854775800L;
                    switch (c) {
                        case 0:
                            j = Long.MIN_VALUE;
                            break;
                        case 1:
                            j = -9223372036854775807L;
                            break;
                        case 2:
                            j = -9223372036854775806L;
                            break;
                        case 3:
                            j = -9223372036854775805L;
                            break;
                        case 4:
                            j = -9223372036854775804L;
                            break;
                        case 5:
                            j = -9223372036854775803L;
                            break;
                        case 6:
                            j = -9223372036854775802L;
                            break;
                        case 7:
                        case '\b':
                            break;
                        default:
                            j = -9223372036854775801L;
                            break;
                    }
                } else if (object instanceof TLRPC$User) {
                    j = ((TLRPC$User) object).id;
                } else {
                    j = object instanceof TLRPC$Chat ? -((TLRPC$Chat) object).id : 0L;
                }
                if (j != 0) {
                    groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public boolean onDonePressed(boolean z) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i < this.selectedContacts.size(); i++) {
            if (this.selectedContacts.keyAt(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(this.selectedContacts.keyAt(i)));
            }
        }
        FilterUsersActivityDelegate filterUsersActivityDelegate = this.delegate;
        if (filterUsersActivityDelegate != null) {
            filterUsersActivityDelegate.didSelectChats(arrayList, this.filterFlags);
        }
        finishFragment();
        return true;
    }

    public void closeSearch() {
        this.searching = false;
        this.searchWas = false;
        this.adapter.setSearching(false);
        this.adapter.searchDialogs(null);
        this.listView.setFastScrollVisible(true);
        this.listView.setVerticalScrollBarEnabled(false);
        this.emptyView.title.setText(LocaleController.getString("NoContacts", R.string.NoContacts));
    }

    public void updateHint() {
        int i = this.type;
        if (i == 0) {
            int i2 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i3 = this.selectedCount;
            if (i3 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i2, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i3), Integer.valueOf(this.selectedCount), Integer.valueOf(i2)));
            }
        } else if (i == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.selectedCount == 0) {
                this.animatedAvatarContainer.getTitle().setText(LocaleController.getString("SelectChats", R.string.SelectChats), true);
                if (this.ttlPeriod > 0) {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString("SelectChatsForAutoDelete", R.string.SelectChatsForAutoDelete), true);
                    return;
                } else {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString("SelectChatsForDisableAutoDelete", R.string.SelectChatsForDisableAutoDelete), true);
                    return;
                }
            }
            AnimatedTextView title = this.animatedAvatarContainer.getTitle();
            int i4 = this.selectedCount;
            title.setText(LocaleController.formatPluralString("Chats", i4, Integer.valueOf(i4)));
            if (this.ttlPeriod > 0) {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getPluralString("SelectChatsForAutoDelete2", this.selectedCount));
            } else {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getPluralString("SelectChatsForDisableAutoDelete2", this.selectedCount));
            }
        }
    }

    public void setDelegate(FilterUsersActivityDelegate filterUsersActivityDelegate) {
        this.delegate = filterUsersActivityDelegate;
    }

    public class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        private Context context;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private boolean searching;
        private final int usersStartRow;
        private ArrayList<Object> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private ArrayList<TLObject> contacts = new ArrayList<>();

        @Override
        public String getLetter(int i) {
            return null;
        }

        public GroupCreateAdapter(Context context) {
            this.context = context;
            if (!UsersSelectActivity.this.noChatTypes) {
                if (UsersSelectActivity.this.type == 2) {
                    this.usersStartRow = (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 5;
                } else if (UsersSelectActivity.this.type == 0) {
                    if (UsersSelectActivity.this.isInclude) {
                        this.usersStartRow = 7;
                    } else {
                        this.usersStartRow = 5;
                    }
                } else {
                    this.usersStartRow = 0;
                }
            } else {
                this.usersStartRow = 0;
            }
            boolean z = UsersSelectActivity.this.type != 2;
            boolean z2 = UsersSelectActivity.this.type != 2;
            ArrayList<TLRPC$Dialog> allDialogs = UsersSelectActivity.this.getMessagesController().getAllDialogs();
            int size = allDialogs.size();
            boolean z3 = false;
            for (int i = 0; i < size; i++) {
                TLRPC$Dialog tLRPC$Dialog = allDialogs.get(i);
                if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                    if (DialogObject.isUserDialog(tLRPC$Dialog.id)) {
                        TLRPC$User user = UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(tLRPC$Dialog.id));
                        if (user != null && ((UsersSelectActivity.this.allowSelf || !UserObject.isUserSelf(user)) && (!user.bot || z))) {
                            this.contacts.add(user);
                            if (UserObject.isUserSelf(user)) {
                                z3 = true;
                            }
                        }
                    } else {
                        TLRPC$Chat chat = UsersSelectActivity.this.getMessagesController().getChat(Long.valueOf(-tLRPC$Dialog.id));
                        if (z2 && chat != null) {
                            this.contacts.add(chat);
                        }
                    }
                }
            }
            if (!z3 && UsersSelectActivity.this.allowSelf) {
                this.contacts.add(0, UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(UsersSelectActivity.this.getUserConfig().clientUserId)));
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setAllowGlobalResults(false);
            this.searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i2) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i2);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i2) {
                    UsersSelectActivity.GroupCreateAdapter.this.lambda$new$0(i2);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
        }

        public void lambda$new$0(int i) {
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress()) {
                UsersSelectActivity.this.emptyView.showProgress(false);
            }
            notifyDataSetChanged();
        }

        public void setSearching(boolean z) {
            if (this.searching == z) {
                return;
            }
            this.searching = z;
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            if (this.searching) {
                return this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size() + this.searchAdapterHelper.getGlobalSearch().size();
            }
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            int i = 0;
            if (!usersSelectActivity.noChatTypes) {
                if (usersSelectActivity.type == 2) {
                    i = (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 3;
                } else if (UsersSelectActivity.this.type == 0) {
                    i = UsersSelectActivity.this.isInclude ? 7 : 5;
                }
            }
            return i + this.contacts.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(this.context, 1, 0, true);
            } else {
                groupCreateUserCell = new GraySectionCell(this.context);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.GroupCreateAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (this.searching) {
                return 1;
            }
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            if (usersSelectActivity.noChatTypes) {
                if (i == 0) {
                    return 2;
                }
            } else if (usersSelectActivity.type == 2) {
                if (i == 0 || i == (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 4) {
                    return 2;
                }
            } else if (UsersSelectActivity.this.type == 0) {
                if (UsersSelectActivity.this.isInclude) {
                    if (i == 0 || i == 6) {
                        return 2;
                    }
                } else if (i == 0 || i == 4) {
                    return 2;
                }
            }
            return 1;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).recycle();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            final boolean z = UsersSelectActivity.this.type != 2;
            final boolean z2 = UsersSelectActivity.this.type != 2;
            if (str == null) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.this.lambda$searchDialogs$3(str, z2, z);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$searchDialogs$3(final String str, final boolean z, final boolean z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.this.lambda$searchDialogs$2(str, z, z2);
                }
            });
        }

        public void lambda$searchDialogs$2(final String str, final boolean z, final boolean z2) {
            this.searchAdapterHelper.queryServerSearch(str, true, z, z, UsersSelectActivity.this.allowSelf, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.this.lambda$searchDialogs$1(str, z2, z);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable);
        }

        public void lambda$searchDialogs$1(java.lang.String r19, boolean r20, boolean r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UsersSelectActivity.GroupCreateAdapter.lambda$searchDialogs$1(java.lang.String, boolean, boolean):void");
        }

        private void updateSearchResults(final ArrayList<Object> arrayList, final ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.this.lambda$updateSearchResults$4(arrayList, arrayList2);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2) {
            if (this.searching) {
                this.searchRunnable = null;
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList);
                if (this.searching && !this.searchAdapterHelper.isSearchInProgress()) {
                    UsersSelectActivity.this.emptyView.showProgress(false);
                }
                notifyDataSetChanged();
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                UsersSelectActivity.this.lambda$getThemeDescriptions$3();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        ActionBar actionBar = this.actionBar;
        int i3 = ThemeDescription.FLAG_BACKGROUND;
        int i4 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_groupcreate_hintText));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_groupcreate_cursor));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_groupcreate_sectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        int i5 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i5));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i5));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$3() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(0);
                }
            }
        }
    }
}
