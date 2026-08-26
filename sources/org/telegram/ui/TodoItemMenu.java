package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class TodoItemMenu extends Dialog {
    private AudioVisualizerDrawable audioVisualizerDrawable;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private ChatMessageCell cell;
    private float clipBottom;
    private float clipTop;
    private FrameLayout containerView;
    public final Context context;
    private Runnable dismissListener;
    private boolean dismissing;
    private boolean dismissingWithAlpha;
    private float dtx1;
    private float dtx2;
    private float dty1;
    private float dty2;
    private boolean hasDestTranslation;
    private boolean hasTranslation;
    private float heightdiff;
    private TextView hintTextView;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private Insets insets;
    private boolean isOut;
    private FrameLayout menuContainer;
    private MessageObject messageObject;
    private View messageOptionsView;
    private float messageOptionsViewMaxWidth;
    private ChatMessageCell myCell;
    private ChatMessageCell myTaskCell;
    private boolean open;
    private ValueAnimator open2Animator;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openProgress2;
    private ReactionsContainerLayout reactionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private boolean setCellInvisible;
    private boolean setTaskInvisible;
    private MessagePreviewView.TabsView tabsView;
    private int taskId;
    private View taskOptionsView;
    private float taskOptionsViewMaxWidth;
    private float tx;
    private float ty;
    private ViewPagerFixed viewPager;
    private FrameLayout windowView;

    public class AnonymousClass4 extends ViewPagerFixed.Adapter {
        final Context val$context;

        public AnonymousClass4(Context context) {
            this.val$context = context;
        }

        public void lambda$createView$0(View view) {
            TodoItemMenu.this.dismiss(true);
        }

        @Override
        public void bindView(View view, int i, int i2) {
        }

        @Override
        public View createView(int i) {
            FrameLayout frameLayout = new FrameLayout(this.val$context);
            frameLayout.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 26));
            return frameLayout;
        }

        @Override
        public int getItemCount() {
            return 2;
        }
    }

    public TodoItemMenu(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.taskOptionsViewMaxWidth = -1.0f;
        this.messageOptionsViewMaxWidth = -1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (TodoItemMenu.this.openProgress <= 0.0f || TodoItemMenu.this.blurBitmapPaint == null) {
                    canvas2 = canvas;
                } else {
                    TodoItemMenu.this.blurMatrix.reset();
                    float width = getWidth() / TodoItemMenu.this.blurBitmap.getWidth();
                    TodoItemMenu.this.blurMatrix.postScale(width, width);
                    TodoItemMenu.this.blurBitmapShader.setLocalMatrix(TodoItemMenu.this.blurMatrix);
                    TodoItemMenu.this.blurBitmapPaint.setAlpha((int) (TodoItemMenu.this.openProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), TodoItemMenu.this.blurBitmapPaint);
                }
                if (TodoItemMenu.this.setCellInvisible && TodoItemMenu.this.cell != null) {
                    TodoItemMenu.this.cell.setVisibility(4);
                    TodoItemMenu.this.setCellInvisible = false;
                }
                if (TodoItemMenu.this.setTaskInvisible && TodoItemMenu.this.cell != null) {
                    TodoItemMenu.this.cell.doNotDrawTaskId = TodoItemMenu.this.taskId;
                    TodoItemMenu.this.cell.invalidate();
                    TodoItemMenu.this.setTaskInvisible = false;
                }
                super.dispatchDraw(canvas2);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                TodoItemMenu.this.dismiss();
                return true;
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                TodoItemMenu.this.setupTranslation();
            }

            @Override
            public void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                TodoItemMenu.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 11));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.windowView);
        FrameLayout frameLayout2 = this.windowView;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view != TodoItemMenu.this.myCell && view != TodoItemMenu.this.myTaskCell) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(TodoItemMenu.this.clipTop, 0.0f, TodoItemMenu.this.openProgress), getWidth(), AndroidUtilities.lerp(TodoItemMenu.this.clipBottom, getHeight(), TodoItemMenu.this.openProgress));
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        this.containerView = frameLayout3;
        frameLayout3.setClipToPadding(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                TodoItemMenu.this.updateTranslation();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new AnonymousClass4(context));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                TodoItemMenu.this.updateTranslation();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt == TodoItemMenu.this.messageOptionsView && TodoItemMenu.this.messageOptionsViewMaxWidth > 0.0f) {
                        TodoItemMenu.this.messageOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) TodoItemMenu.this.messageOptionsViewMaxWidth), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else if (childAt == TodoItemMenu.this.taskOptionsView && TodoItemMenu.this.taskOptionsViewMaxWidth > 0.0f) {
                        TodoItemMenu.this.taskOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) TodoItemMenu.this.taskOptionsViewMaxWidth), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else if (childAt == TodoItemMenu.this.reactionsView) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(TodoItemMenu.this.reactionsView.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.menuContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, -1, 119));
        MessagePreviewView.TabsView tabsView = new MessagePreviewView.TabsView(context, resourcesProvider);
        this.tabsView = tabsView;
        tabsView.addTab(0, LocaleController.getString(R.string.TodoMenuTabTask));
        this.tabsView.addTab(1, LocaleController.getString(R.string.TodoMenuTabList));
        this.containerView.addView(this.tabsView, LayoutHelper.createFrame(-1, 66, 80));
        MessagePreviewView.TabsView tabsView2 = this.tabsView;
        ViewPagerFixed viewPagerFixed2 = this.viewPager;
        Objects.requireNonNull(viewPagerFixed2);
        tabsView2.setOnTabClick(new PollItemMenu$$ExternalSyntheticLambda15(viewPagerFixed2, 0));
        MessagePreviewView.TabsView tabsView3 = this.tabsView;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(tabsView3, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider));
        blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
        tabsView3.setBackground(blurredBackgroundDrawableCreate);
        TextView textView = new TextView(context);
        this.hintTextView = textView;
        textView.setTextSize(1, 13.0f);
        this.hintTextView.setTextColor(this.tabsView.getColor());
        this.hintTextView.setText(LocaleController.getString(R.string.TodoMenuHint));
        this.hintTextView.setGravity(17);
        this.containerView.addView(this.hintTextView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        FrameLayout frameLayout5 = this.windowView;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                TodoItemMenu.this.insets = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                TodoItemMenu.this.containerView.setPadding(TodoItemMenu.this.insets.left, TodoItemMenu.this.insets.top, TodoItemMenu.this.insets.right, TodoItemMenu.this.insets.bottom);
                TodoItemMenu.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        };
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout5, onApplyWindowInsetsListener);
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final TodoItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$animateOpenTo$16(valueAnimator3);
                        break;
                    default:
                        this.f$0.lambda$animateOpenTo$17(valueAnimator3);
                        break;
                }
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TodoItemMenu.this.openProgress = z ? 1.0f : 0.0f;
                TodoItemMenu.this.windowView.invalidate();
                TodoItemMenu.this.containerView.invalidate();
                TodoItemMenu.this.updateTranslation();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final TodoItemMenu f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$animateOpenTo$16(valueAnimator4);
                        break;
                    default:
                        this.f$0.lambda$animateOpenTo$17(valueAnimator4);
                        break;
                }
            }
        });
        this.open2Animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TodoItemMenu.this.openProgress2 = z ? 1.0f : 0.0f;
            }
        });
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        this.iBlur3Factory.invalidateAllLinkedViews();
    }

    public void lambda$animateOpenTo$16(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.windowView.invalidate();
        this.containerView.invalidate();
        updateTranslation();
    }

    public void lambda$animateOpenTo$17(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$dismiss$14() {
        super.dismiss();
    }

    public void lambda$dismiss$15(boolean z) {
        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda0(this, 2));
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            chatMessageCell.setVisibility(0);
            if (!z) {
                ChatMessageCell chatMessageCell2 = this.cell;
                chatMessageCell2.syncTodoCheck(chatMessageCell2.getTodoIndex(this.taskId), this.myTaskCell);
            }
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawTaskId = -1;
            chatMessageCell3.invalidate();
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.dismissListener = null;
        }
    }

    public void lambda$new$0(View view) {
        dismiss();
    }

    public void lambda$prepareBlur$13(View view, Bitmap bitmap, Bitmap bitmap2) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap3 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    public void lambda$setCell$1(ChatActivity chatActivity, int i) {
        if (chatActivity.isInScheduleMode()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
        } else {
            ChatMessageCell chatMessageCell = this.myTaskCell;
            chatMessageCell.toggleTodoCheck(chatMessageCell.getTodoIndex(i), false);
        }
        dismiss(true);
    }

    public void lambda$setCell$2(ChatActivity chatActivity, int i) {
        if (chatActivity.isInScheduleMode()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
        } else {
            ChatMessageCell chatMessageCell = this.myTaskCell;
            chatMessageCell.toggleTodoCheck(chatMessageCell.getTodoIndex(i), false);
        }
        dismiss(true);
    }

    public void lambda$setCell$3(ChatActivity chatActivity, TLRPC.TodoItem todoItem) {
        MessageObject messageObject = this.messageObject;
        chatActivity.showFieldPanelForReplyQuote(messageObject, ChatActivity.ReplyQuote.from(messageObject, todoItem.id));
        dismiss(false);
    }

    public void lambda$setCell$4(String str) {
        AndroidUtilities.addToClipboard(str);
        dismiss(true);
    }

    public void lambda$setCell$5(TLRPC.TodoItem todoItem) {
        AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(todoItem.title, false));
        dismiss(true);
    }

    public void lambda$setCell$6(ChatActivity chatActivity, TLRPC.MessageMedia messageMedia, ArrayList arrayList, boolean z, int i) {
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = this.messageObject.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        this.messageObject.messageOwner.media = messageMedia;
        chatActivity.getSendMessagesHelper().editMessage(this.messageObject, null, null, null, null, null, null, false, false, null);
    }

    public void lambda$setCell$7(ChatActivity chatActivity, int i) {
        PollCreateActivity pollCreateActivity = new PollCreateActivity(chatActivity, true, Boolean.FALSE);
        pollCreateActivity.setEditing(MessageObject.getMedia(this.messageObject), false, i);
        pollCreateActivity.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda7(0, this, chatActivity));
        chatActivity.presentFragment(pollCreateActivity);
        dismiss(false);
    }

    public void lambda$setCell$8(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i, ChatActivity chatActivity) {
        int i2 = 0;
        while (i2 < tL_messageMediaToDo.todo.list.size()) {
            if (tL_messageMediaToDo.todo.list.get(i2).id == i) {
                tL_messageMediaToDo.todo.list.remove(i2);
                i2--;
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i3).id == i) {
                tL_messageMediaToDo.completions.remove(i3);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i3--;
            }
            i3++;
        }
        this.messageObject.messageOwner.media = tL_messageMediaToDo;
        chatActivity.getSendMessagesHelper().editMessage(this.messageObject, null, null, null, null, null, null, false, false, null);
        chatActivity.updateVisibleRows();
        dismiss(false);
    }

    public void lambda$setupMessageOptions$10() {
        dismiss(false);
    }

    public void lambda$setupMessageOptions$11(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
        boolean z = true;
        if (i != 1 && i != 13) {
            z = false;
        }
        dismiss(z);
    }

    public boolean lambda$setupMessageOptions$12(View view, MotionEvent motionEvent) {
        if (this.messageOptionsView == null || motionEvent.getAction() != 0) {
            return false;
        }
        Drawable backgroundDrawable = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.messageOptionsView).getBackgroundDrawable();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(backgroundDrawable.getBounds());
        rectF.offset(this.messageOptionsView.getX(), this.messageOptionsView.getY());
        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        dismiss(true);
        return true;
    }

    public void lambda$setupMessageOptions$9() {
        dismiss(false);
    }

    private void prepareBlur(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        ScrimOptions.makeGlobalBlurBitmaps(new OAuthSheet$$ExternalSyntheticLambda19(12, this, view));
    }

    public void setupTranslation() {
        if (this.hasTranslation || this.windowView.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int i = iArr[0];
            Insets insets = this.insets;
            this.tx = i - insets.left;
            float f = iArr[1] - insets.top;
            this.ty = f;
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dtx1 = 0.0f;
                this.dty1 = f;
                if (this.messageOptionsView != null) {
                    float height = f + this.cell.getHeight() + this.messageOptionsView.getHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets2 = this.insets;
                    if (height > ((height2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets3 = this.insets;
                        this.dty1 = ((((height3 - insets3.top) - insets3.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - this.messageOptionsView.getHeight();
                    }
                }
                int todoIndex = this.myTaskCell.getTodoIndex(this.taskId);
                this.myTaskCell.getPollButtonTop(todoIndex);
                float pollButtonBottom = this.myTaskCell.getPollButtonBottom(todoIndex);
                this.dtx2 = 0.0f;
                float f2 = this.ty;
                this.dty2 = f2;
                int i2 = (int) pollButtonBottom;
                float f3 = i2;
                float f4 = f2 + f3;
                int height4 = this.windowView.getHeight();
                Insets insets4 = this.insets;
                if (f4 > (((height4 - insets4.top) - insets4.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                    int height5 = this.windowView.getHeight();
                    Insets insets5 = this.insets;
                    this.dty2 = ((((height5 - insets5.top) - insets5.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - i2;
                }
                View view = this.taskOptionsView;
                if (view != null) {
                    float height6 = this.dty2 + f3 + view.getHeight();
                    int height7 = this.windowView.getHeight();
                    Insets insets6 = this.insets;
                    if (height6 > (((height7 - insets6.top) - insets6.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                        int height8 = this.windowView.getHeight();
                        Insets insets7 = this.insets;
                        this.dty2 = (((((height8 - insets7.top) - insets7.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - i2) - this.taskOptionsView.getHeight();
                    }
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    public void updateTranslation() {
        float positionAnimated = this.viewPager.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -this.viewPager.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(this.viewPager.getWidth(), 0, positionAnimated);
        if (this.hasTranslation) {
            View view = this.messageOptionsView;
            if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) view;
                this.dtx1 = 0.0f;
                float f = this.ty;
                this.dty1 = f;
                if (view != null) {
                    float height = f + this.cell.getHeight() + actionBarPopupWindowLayout.getVisibleHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets = this.insets;
                    if (height > ((height2 - insets.top) - insets.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets2 = this.insets;
                        this.dty1 = ((((height3 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - actionBarPopupWindowLayout.getVisibleHeight();
                    }
                }
            }
        }
        this.myCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx1, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp2);
        this.myCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty1, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        View view2 = this.messageOptionsView;
        if (view2 != null) {
            if (this.isOut) {
                view2.setTranslationX(((this.myCell.getPollButtonsLeft() + ((this.dtx1 + fLerp2) + this.myCell.getLeft())) - AndroidUtilities.dp(8.0f)) - this.messageOptionsView.getLeft());
            } else {
                view2.setTranslationX((((this.dtx1 + fLerp2) + (this.myCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myCell.getLeft()) - this.messageOptionsView.getLeft());
            }
            this.messageOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.messageOptionsView.getX() - fLerp2);
            this.messageOptionsView.setTranslationY(((this.myCell.getY() + this.myCell.getHeight()) - this.messageOptionsView.getTop()) - this.menuContainer.getTop());
            this.messageOptionsView.setAlpha(this.openProgress);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.messageOptionsView.setScaleX(fLerp3);
            this.messageOptionsView.setScaleY(fLerp3);
        }
        this.myTaskCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx2, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp);
        this.myTaskCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty2, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        if (this.taskOptionsView != null) {
            int todoIndex = this.myTaskCell.getTodoIndex(this.taskId);
            this.myTaskCell.getPollButtonTop(todoIndex);
            float pollButtonBottom = this.myTaskCell.getPollButtonBottom(todoIndex);
            if (this.isOut) {
                this.taskOptionsView.setTranslationX(((this.myTaskCell.getPollButtonsLeft() + ((this.dtx2 + fLerp) + this.myTaskCell.getLeft())) - AndroidUtilities.dp(8.0f)) - this.taskOptionsView.getLeft());
            } else {
                this.taskOptionsView.setTranslationX((((this.dtx2 + fLerp) + (this.myTaskCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myTaskCell.getLeft()) - this.taskOptionsView.getLeft());
            }
            this.taskOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.taskOptionsView.getX() - fLerp2);
            this.taskOptionsView.setTranslationY(((this.myTaskCell.getY() + ((int) pollButtonBottom)) - this.taskOptionsView.getTop()) - this.menuContainer.getTop());
            this.taskOptionsView.setAlpha(this.openProgress);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.taskOptionsView.setScaleX(fLerp4);
            this.taskOptionsView.setScaleY(fLerp4);
        }
        if (this.dismissingWithAlpha) {
            this.myCell.setAlpha(this.openProgress);
            this.myTaskCell.setAlpha(this.openProgress);
        }
        if (this.reactionsView != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((this.myCell.getBoundsLeft() + this.myCell.getBoundsRight()) / 2.0f) - (this.reactionsView.getWidth() * 0.8f));
            this.reactionsView.setTranslationX(fMax);
            this.reactionsView.setTranslationY(Math.max(0.0f, ((this.myCell.getY() - this.reactionsView.getHeight()) + AndroidUtilities.dp(22.0f)) - this.menuContainer.getTop()));
            this.reactionsView.setAlpha(this.openProgress);
            View windowView = this.reactionsView.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.openProgress);
            }
        }
        this.hintTextView.setTranslationX(fLerp);
        this.hintTextView.setAlpha(this.openProgress);
        this.tabsView.setSelectedTab(positionAnimated);
        this.tabsView.setAlpha(this.openProgress);
    }

    @Override
    public void dismiss() {
        dismiss(true);
    }

    public boolean isShown() {
        return !this.dismissing;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.currentTheme.isDark());
    }

    public void setCell(final ChatActivity chatActivity, ChatMessageCell chatMessageCell, final int i) {
        final int i2;
        TLRPC.TodoItem todoItem;
        this.cell = chatMessageCell;
        this.taskId = i;
        TLRPC.TodoCompletion todoCompletion = null;
        MessageObject messageObject = chatMessageCell != null ? chatMessageCell.getMessageObject() : null;
        this.messageObject = messageObject;
        this.isOut = messageObject != null && messageObject.isOutOwner();
        if (this.cell != null) {
            this.clipTop = chatActivity.getChatListViewPadding() - AndroidUtilities.dp(4.0f);
            this.clipBottom = chatMessageCell.parentBoundsBottom;
            if (chatMessageCell.getParent() instanceof View) {
                View view = (View) chatMessageCell.getParent();
                this.clipTop = view.getY() + this.clipTop;
                this.clipBottom = view.getY() + this.clipBottom;
            }
            final int width = this.cell.getWidth();
            final int height = this.cell.getHeight();
            this.heightdiff = height - this.cell.getHeight();
            ChatMessageSharedResources chatMessageSharedResources = null;
            ChatMessageCell chatMessageCell2 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, chatMessageSharedResources, this.cell.getResourcesProvider()) {
                private final Path clipPath = new Path();
                private final Paint shadowPaint = new Paint(1);

                @Override
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    super.drawOverlays(canvas);
                }

                @Override
                public void onDraw(Canvas canvas) {
                    canvas.save();
                    int todoIndex = getTodoIndex(i);
                    float pollButtonTop = getPollButtonTop(todoIndex);
                    float pollButtonBottom = getPollButtonBottom(todoIndex);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPollButtonsLeft(), pollButtonTop, getPollButtonsRight(), pollButtonBottom);
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(TodoItemMenu.this.openProgress * 0.2f, -16777216));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.shadowPaint);
                    canvas.clipPath(this.clipPath);
                    super.onDraw(canvas);
                    canvas.restore();
                }

                @Override
                public void onFactorChangeFinished(int i3, float f, FactorAnimator factorAnimator) {
                }

                @Override
                public void onMeasure(int i3, int i4) {
                    setMeasuredDimension(width, height);
                }

                @Override
                public void setPressed(boolean z) {
                }
            };
            i2 = i;
            this.myTaskCell = chatMessageCell2;
            this.cell.copyParamsTo(chatMessageCell2);
            this.myTaskCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myTaskCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell3) {
                    return false;
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3) {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i3, float f, float f2) {
                    return false;
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell3, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem2) {
                    return false;
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2) {
                    return false;
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell3, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public void didPressAppUpdateButton() {
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell3, TLObject tLObject, boolean z) {
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell3, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                public void didPressDialogButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell3) {
                }

                public void didPressEmojiStatus() {
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell3, int i3, int i4) {
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell3, int i3) {
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell3, int i3) {
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell3, float f, float f2, boolean z) {
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell3, int i3) {
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell3, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell3, int i3, float f, float f2, boolean z) {
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell3, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell3, boolean z) {
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem2, boolean z) {
                    if (TodoItemMenu.this.cell.getDelegate() != null) {
                        return TodoItemMenu.this.cell.getDelegate().didPressToDoButton(TodoItemMenu.this.cell, todoItem2, z);
                    }
                    return false;
                }

                public void didPressTopicButton(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell3, CharacterStyle characterStyle, boolean z) {
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2, boolean z) {
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell3, TLRPC.User user, TLRPC.Document document, String str) {
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell3, String str) {
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell3, long j) {
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell3, ArrayList arrayList, int i3, int i4, int i5) {
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell3, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell3.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell3, float f, float f2) {
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell3) {
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3, boolean z, Runnable runnable) {
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject2);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell3) {
                }

                public boolean drawingVideoPlayerContainer() {
                    return false;
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z) {
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell3, boolean z) {
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell3) {
                    return 0;
                }

                @Override
                public String getAdminRank(long j) {
                    return null;
                }

                @Override
                public int getChatMode() {
                    return 0;
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell3) {
                    return null;
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell3) {
                    return null;
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public void invalidateBlur() {
                }

                @Override
                public boolean isAdmin(long j) {
                    return false;
                }

                @Override
                public boolean isLandscape() {
                    return false;
                }

                @Override
                public boolean isOwner(long j) {
                    return false;
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell3, int i3) {
                    return false;
                }

                @Override
                public boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i3, int i4) {
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell3, MessageObject messageObject2, boolean z) {
                    return false;
                }

                @Override
                public void needReloadPolls() {
                }

                @Override
                public void needShowPremiumBulletin(int i3) {
                }

                public void needShowPremiumFeatures(String str) {
                }

                @Override
                public boolean onAccessibilityAction(int i3, Bundle bundle) {
                    return false;
                }

                @Override
                public void onDiceFinished() {
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell3, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell3, boolean z) {
                    return false;
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return true;
                }

                public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell3) {
                    return false;
                }

                public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell3) {
                    return false;
                }

                @Override
                public void videoTimerReached() {
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell3, z);
                }
            });
            ChatMessageCell chatMessageCell3 = this.myTaskCell;
            MessageObject messageObject2 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell4 = this.cell;
            chatMessageCell3.setMessageObject(messageObject2, currentMessagesGroup, chatMessageCell4.pinnedBottom, chatMessageCell4.pinnedTop, chatMessageCell4.firstInChat);
            this.containerView.addView(this.myTaskCell, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
            ChatMessageCell chatMessageCell5 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, chatMessageSharedResources, this.cell.getResourcesProvider()) {
                @Override
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    super.drawOverlays(canvas);
                }

                @Override
                public void onFactorChangeFinished(int i3, float f, FactorAnimator factorAnimator) {
                }

                @Override
                public void onMeasure(int i3, int i4) {
                    setMeasuredDimension(width, height);
                }

                @Override
                public void setPressed(boolean z) {
                }
            };
            this.myCell = chatMessageCell5;
            this.cell.copyVisiblePartTo(chatMessageCell5);
            this.cell.copyParamsTo(this.myCell);
            this.myCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell6) {
                    return false;
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6) {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i3, float f, float f2) {
                    return false;
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell6, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem2) {
                    return false;
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2) {
                    return false;
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell6, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public void didPressAppUpdateButton() {
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell6, TLObject tLObject, boolean z) {
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell6, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                public void didPressDialogButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell6) {
                }

                public void didPressEmojiStatus() {
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell6, int i3, int i4) {
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell6, int i3) {
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell6, int i3) {
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell6, float f, float f2, boolean z) {
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell6, int i3) {
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell6, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell6, int i3, float f, float f2, boolean z) {
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell6, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell6, boolean z) {
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem2, boolean z) {
                    return false;
                }

                public void didPressTopicButton(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell6, CharacterStyle characterStyle, boolean z) {
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2, boolean z) {
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell6, TLRPC.User user, TLRPC.Document document, String str) {
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell6, String str) {
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell6, long j) {
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell6, ArrayList arrayList, int i3, int i4, int i5) {
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell6, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell6.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell6, float f, float f2) {
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject3) {
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell6) {
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6, boolean z, Runnable runnable) {
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject3) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject3);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell6) {
                }

                public boolean drawingVideoPlayerContainer() {
                    return false;
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z) {
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell6, boolean z) {
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell6) {
                    return 0;
                }

                @Override
                public String getAdminRank(long j) {
                    return null;
                }

                @Override
                public int getChatMode() {
                    return 0;
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell6) {
                    return null;
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell6) {
                    return null;
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public void invalidateBlur() {
                }

                @Override
                public boolean isAdmin(long j) {
                    return false;
                }

                @Override
                public boolean isLandscape() {
                    return false;
                }

                @Override
                public boolean isOwner(long j) {
                    return false;
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell6, int i3) {
                    return false;
                }

                @Override
                public boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public void needOpenWebView(MessageObject messageObject3, String str, String str2, String str3, String str4, int i3, int i4) {
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell6, MessageObject messageObject3, boolean z) {
                    return false;
                }

                @Override
                public void needReloadPolls() {
                }

                @Override
                public void needShowPremiumBulletin(int i3) {
                }

                public void needShowPremiumFeatures(String str) {
                }

                @Override
                public boolean onAccessibilityAction(int i3, Bundle bundle) {
                    return false;
                }

                @Override
                public void onDiceFinished() {
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell6, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject3) {
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell6, boolean z) {
                    return false;
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject3) {
                    return true;
                }

                public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell6) {
                    return false;
                }

                public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell6) {
                    return false;
                }

                @Override
                public void videoTimerReached() {
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell6, z);
                }
            });
            ChatMessageCell chatMessageCell6 = this.myCell;
            MessageObject messageObject3 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup2 = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell7 = this.cell;
            chatMessageCell6.setMessageObject(messageObject3, currentMessagesGroup2, chatMessageCell7.pinnedBottom, chatMessageCell7.pinnedTop, chatMessageCell7.firstInChat);
            this.containerView.addView(this.myCell, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
        } else {
            i2 = i;
        }
        this.viewPager.bringToFront();
        this.menuContainer.bringToFront();
        this.tabsView.bringToFront();
        this.viewPager.onTabAnimationUpdate(false);
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, this.resourcesProvider, (View) null);
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.messageObject);
        final int i3 = 0;
        while (true) {
            if (i3 >= tL_messageMediaToDo.todo.list.size()) {
                i3 = -1;
                todoItem = null;
                break;
            } else {
                if (tL_messageMediaToDo.todo.list.get(i3).id == i2) {
                    todoItem = tL_messageMediaToDo.todo.list.get(i3);
                    break;
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < tL_messageMediaToDo.completions.size(); i4++) {
            if (tL_messageMediaToDo.completions.get(i4).id == i2) {
                todoCompletion = tL_messageMediaToDo.completions.get(i4);
                break;
            }
        }
        if (this.messageObject.canCompleteTodo()) {
            if (todoCompletion != null) {
                itemOptionsMakeOptions.addText(LocaleController.formatTodoCompletedDate(todoCompletion.date), 14);
                itemOptionsMakeOptions.addGap();
                final int i5 = 0;
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable(this) {
                    public final TodoItemMenu f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$setCell$1(chatActivity, i2);
                                break;
                            case 1:
                                this.f$0.lambda$setCell$2(chatActivity, i2);
                                break;
                            default:
                                this.f$0.lambda$setCell$7(chatActivity, i2);
                                break;
                        }
                    }
                });
            } else {
                final int i6 = 1;
                itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable(this) {
                    public final TodoItemMenu f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$setCell$1(chatActivity, i2);
                                break;
                            case 1:
                                this.f$0.lambda$setCell$2(chatActivity, i2);
                                break;
                            default:
                                this.f$0.lambda$setCell$7(chatActivity, i2);
                                break;
                        }
                    }
                });
            }
        }
        if (todoItem != null) {
            if (chatActivity != null) {
                itemOptionsMakeOptions.add(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new TodoItemMenu$$ExternalSyntheticLambda11(this, chatActivity, todoItem, 0));
            }
            if (this.messageObject.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(this.messageObject.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(this.messageObject.getDialogId()));
                StringBuilder sb = new StringBuilder("https://");
                sb.append(messagesController.linkPrefix);
                sb.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    publicUsername = "c/" + (-this.messageObject.getDialogId());
                }
                sb.append(publicUsername);
                sb.append("/");
                sb.append(this.messageObject.getId());
                sb.append("?task=");
                sb.append(todoItem.id);
                itemOptionsMakeOptions.add(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new ThemeActivity$$ExternalSyntheticLambda9(4, this, sb.toString()));
            }
            itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ThemeActivity$$ExternalSyntheticLambda9(5, this, todoItem));
        }
        if (this.messageObject.canEditMessage(chatActivity.currentChat)) {
            final int i7 = 2;
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable(this) {
                public final TodoItemMenu f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$setCell$1(chatActivity, i3);
                            break;
                        case 1:
                            this.f$0.lambda$setCell$2(chatActivity, i3);
                            break;
                        default:
                            this.f$0.lambda$setCell$7(chatActivity, i3);
                            break;
                    }
                }
            });
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new OAuthSheet$$ExternalSyntheticLambda9(this, tL_messageMediaToDo, i2, chatActivity, 18));
            }
        }
        itemOptionsMakeOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
        itemOptionsMakeOptions.setBlurBackground(this.iBlur3Factory, (BlurredBackgroundProvider) BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        itemOptionsMakeOptions.setupSelectors();
        ViewGroup layout = itemOptionsMakeOptions.getLayout();
        this.taskOptionsView = layout;
        layout.setPivotX(0.0f);
        this.taskOptionsView.setPivotY(0.0f);
        this.menuContainer.addView(this.taskOptionsView, LayoutHelper.createFrame(-2, -2, 51));
    }

    public void setOnDismissListener(Runnable runnable) {
        this.dismissListener = runnable;
    }

    public void setupMessageOptions(final ChatActivity chatActivity, ArrayList<Integer> arrayList, ArrayList<CharSequence> arrayList2, ArrayList<Integer> arrayList3, Utilities.Callback<Integer> callback) {
        TLRPC.ChatFull chatFull;
        boolean z;
        ItemOptions itemOptions;
        TodoItemMenu todoItemMenu;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final MessageObject messageObject = this.messageObject;
        List<TLRPC.TL_availableReaction> enabledReactionsList = chatActivity.getMediaDataController().getEnabledReactionsList();
        boolean z2 = (chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || chatActivity.currentUser != null || !messageObject.hasReactions() || (ChatObject.isChannel(chatActivity.currentChat) && !chatActivity.currentChat.megagroup) || ChatObject.isMonoForum(chatActivity.currentChat) || enabledReactionsList.isEmpty() || !messageObject.messageOwner.reactions.can_see_list || messageObject.isSecretMedia()) ? false : true;
        boolean z3 = !messageObject.isForwardedChannelPost() ? messageObject.isSecretMedia() || chatActivity.getChatMode() == 5 || chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || !messageObject.isReactionsAvailable() || ((((chatFull = chatActivity.chatInfo) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(chatActivity.currentChat)) && chatActivity.currentUser == null && !ChatObject.isMonoForum(chatActivity.currentChat))) || enabledReactionsList.isEmpty()) : (chatFull3 = chatActivity.getMessagesController().getChatFull(-messageObject.getFromChatId())) != null && (chatActivity.isSecretChat() || chatActivity.getChatMode() == 5 || chatActivity.isInScheduleMode() || !messageObject.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
        boolean z4 = (z2 || chatActivity.isInScheduleMode() || chatActivity.currentChat == null || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || ConnectionsManager.getInstance(chatActivity.getCurrentAccount()).getCurrentTime() - messageObject.messageOwner.date >= chatActivity.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(chatActivity.currentChat) && ChatObject.isChannel(chatActivity.currentChat)) || (chatFull2 = chatActivity.chatInfo) == null || chatFull2.participants_count > chatActivity.getMessagesController().chatReadMarkSizeThreshold || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || chatActivity.getChatMode() == 3 || !messageObject.canSetReaction() || ChatObject.isMonoForum(chatActivity.currentChat)) ? false : true;
        if (chatActivity.currentChat != null && !messageObject.isOut() && ChatObject.isMonoForum(chatActivity.currentChat) && ChatObject.canManageMonoForum(chatActivity.getCurrentAccount(), chatActivity.currentChat)) {
            long j = chatActivity.currentChat.linked_monoforum_id;
            messageObject.getFromChatId();
        }
        if (z2 || chatActivity.currentChat != null || chatActivity.currentEncryptedChat != null || (user = chatActivity.currentUser) == null || UserObject.isUserSelf(user) || UserObject.isReplyUser(chatActivity.currentUser) || UserObject.isAnonymous(chatActivity.currentUser)) {
            z = false;
        } else {
            TLRPC.User user2 = chatActivity.currentUser;
            if (user2.bot || UserObject.isService(user2.id) || (((userFull = chatActivity.userInfo) != null && userFull.read_dates_private) || chatActivity.isInScheduleMode() || !messageObject.isOutOwner() || !messageObject.isSent() || messageObject.isEditing() || messageObject.isSending() || messageObject.isSendError() || messageObject.isContentUnread() || messageObject.isUnread() || chatActivity.getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date >= chatActivity.getMessagesController().pmReadDateExpirePeriod || (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                z = false;
            } else {
                z = true;
            }
        }
        TLRPC.User user3 = chatActivity.currentUser;
        boolean z5 = (user3 == null || !(UserObject.isReplyUser(user3) || UserObject.isAnonymous(chatActivity.currentUser))) && !chatActivity.isInScheduleMode() && messageObject.isEdited() && !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest);
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, chatActivity.getResourceProvider(), (View) null, z2 || z4);
        if (z4) {
            final MessageSeenView messageSeenView = new MessageSeenView(getContext(), chatActivity.getCurrentAccount(), messageObject, chatActivity.currentChat);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.addView(messageSeenView, LayoutHelper.createFrame(-1, 36.0f));
            final ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, false);
            actionBarMenuSubItem.setItemHeight(44);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
            actionBarMenuSubItem.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            final LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
            linearLayout.setOrientation(1);
            final RecyclerListView recyclerListViewCreateListView = messageSeenView.createListView();
            frameLayout2.addView(actionBarMenuSubItem);
            linearLayout.addView(frameLayout2);
            linearLayout.addView(new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator), LayoutHelper.createLinear(-1, 8));
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bulletin.hideVisible();
                    itemOptionsMakeOptions.closeSwipeback();
                }
            });
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (messageSeenView.users.isEmpty()) {
                        return;
                    }
                    if (messageSeenView.users.size() != 1 || (messageSeenView.dates.size() > 0 && messageSeenView.dates.get(0).intValue() > 0)) {
                        if (SharedConfig.messageSeenHintCount > 0 && chatActivity.contentView.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                            chatActivity.messageSeenPrivacyBulletin = BulletinFactory.of(Bulletin.BulletinWindow.make(TodoItemMenu.this.getContext()), TodoItemMenu.this.resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)));
                            chatActivity.messageSeenPrivacyBulletin.setDuration(4000);
                            chatActivity.messageSeenPrivacyBulletin.show();
                            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
                        }
                        recyclerListViewCreateListView.requestLayout();
                        linearLayout.requestLayout();
                        recyclerListViewCreateListView.getAdapter().notifyDataSetChanged();
                        itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                        return;
                    }
                    TLObject tLObject = messageSeenView.users.get(0);
                    if (tLObject == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    chatActivity.presentFragment(new ProfileActivity(bundle));
                    TodoItemMenu.this.dismiss(false);
                }
            };
            itemOptions = itemOptionsMakeOptions;
            todoItemMenu = this;
            messageSeenView.setOnClickListener(onClickListener);
            linearLayout.addView(recyclerListViewCreateListView, LayoutHelper.createLinear(-1, -2));
            itemOptionsMakeSwipeback.addView(linearLayout);
            itemOptions.addView(frameLayout);
            itemOptions.addGap();
        } else {
            itemOptions = itemOptionsMakeOptions;
            todoItemMenu = this;
            if (z) {
                itemOptions.addView(new MessagePrivateSeenView(todoItemMenu.getContext(), 0, messageObject, new TodoItemMenu$$ExternalSyntheticLambda0(todoItemMenu, 0), todoItemMenu.resourcesProvider), LayoutHelper.createLinear(-1, 36));
                itemOptions.addGap();
            } else if (z5) {
                MessagePrivateSeenView messagePrivateSeenView = new MessagePrivateSeenView(todoItemMenu.getContext(), 1, messageObject, new TodoItemMenu$$ExternalSyntheticLambda0(todoItemMenu, 1), todoItemMenu.resourcesProvider);
                messageObject = messageObject;
                itemOptions.addView(messagePrivateSeenView, LayoutHelper.createLinear(-1, 36));
                itemOptions.addGap();
            } else {
                messageObject = messageObject;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            itemOptions.add(arrayList.get(i).intValue(), arrayList2.get(i), new TodoItemMenu$$ExternalSyntheticLambda2(todoItemMenu, callback, arrayList3.get(i).intValue(), 0));
        }
        itemOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, todoItemMenu.resourcesProvider)));
        itemOptions.setBlurBackground(todoItemMenu.iBlur3Factory, (BlurredBackgroundProvider) BlurredBackgroundProviderImpl.scrimMenuBackground(todoItemMenu.resourcesProvider), false);
        itemOptions.setupSelectors();
        ViewGroup layout = itemOptions.getLayout();
        todoItemMenu.messageOptionsView = layout;
        layout.setPivotX(0.0f);
        todoItemMenu.messageOptionsView.setPivotY(0.0f);
        todoItemMenu.menuContainer.addView(todoItemMenu.messageOptionsView, LayoutHelper.createFrame(-2, -2, 51));
        View view = todoItemMenu.messageOptionsView;
        if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            int i2 = 0;
            ((ActionBarPopupWindow.ActionBarPopupWindowLayout) view).setOnSizeChangedListener(new TodoItemMenu$$ExternalSyntheticLambda3(todoItemMenu, i2));
            todoItemMenu.messageOptionsView.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(todoItemMenu, i2));
        }
        if (z3) {
            final ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout((chatActivity.getUserConfig().getClientUserId() > chatActivity.getDialogId() ? 1 : (chatActivity.getUserConfig().getClientUserId() == chatActivity.getDialogId() ? 0 : -1)) == 0 ? 3 : 0, chatActivity, todoItemMenu.getContext(), chatActivity.getCurrentAccount(), todoItemMenu.resourcesProvider);
            reactionsContainerLayout.forceAttachToParent = true;
            float f = 22;
            reactionsContainerLayout.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f));
            reactionsContainerLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
                @Override
                public final boolean allowLongPress() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
                }

                @Override
                public final boolean drawBackground() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
                }

                @Override
                public final void drawRoundRect(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i3, boolean z6) {
                    ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f2, f3, f4, i3, z6);
                }

                @Override
                public void hideMenu() {
                    TodoItemMenu.this.dismiss(false);
                }

                @Override
                public final boolean needEnterText() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
                }

                @Override
                public final void onEmojiWindowDismissed() {
                    ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
                }

                @Override
                public void onReactionClicked(View view2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z6, boolean z7) {
                    float f2;
                    float f3;
                    int i3;
                    float f4;
                    float f5;
                    BaseCell baseCellFindMessageCell = chatActivity.findMessageCell(messageObject.getId(), true);
                    if (baseCellFindMessageCell instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) baseCellFindMessageCell;
                        ReactionsLayoutInBubble.ReactionButton reactionButton = chatMessageCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                        if (reactionButton != null) {
                            ReactionsLayoutInBubble reactionsLayoutInBubble = chatMessageCell.reactionsLayoutInBubble;
                            f2 = (reactionButton.width / 2.0f) + reactionsLayoutInBubble.x + reactionButton.x;
                            f3 = reactionsLayoutInBubble.y + reactionButton.y;
                            i3 = reactionButton.height;
                            f5 = f2;
                            f4 = (i3 / 2.0f) + f3;
                        } else {
                            f4 = 0.0f;
                            f5 = 0.0f;
                        }
                    } else {
                        if (baseCellFindMessageCell instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) baseCellFindMessageCell;
                            ReactionsLayoutInBubble.ReactionButton reactionButton2 = chatActionCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                            if (reactionButton2 != null) {
                                ReactionsLayoutInBubble reactionsLayoutInBubble2 = chatActionCell.reactionsLayoutInBubble;
                                f2 = (reactionButton2.width / 2.0f) + reactionsLayoutInBubble2.x + reactionButton2.x;
                                f3 = reactionsLayoutInBubble2.y + reactionButton2.y;
                                i3 = reactionButton2.height;
                                f5 = f2;
                                f4 = (i3 / 2.0f) + f3;
                            }
                        }
                        f4 = 0.0f;
                        f5 = 0.0f;
                    }
                    chatActivity.selectReaction(baseCellFindMessageCell, messageObject, reactionsContainerLayout, view2, f5, f4, visibleReaction, false, (visibleReaction == null || !visibleReaction.isStar) ? z6 : true, z7, false);
                    TodoItemMenu.this.dismiss(false);
                }
            });
            FrameLayout frameLayout3 = todoItemMenu.menuContainer;
            todoItemMenu.reactionsView = reactionsContainerLayout;
            frameLayout3.addView(reactionsContainerLayout, LayoutHelper.createFrame(-2, (int) ((reactionsContainerLayout.getTopOffset() / AndroidUtilities.density) + 52.0f + f), 51));
            reactionsContainerLayout.setMessage(messageObject, chatActivity.chatInfo, true);
            todoItemMenu.reactionsView.setTransitionProgress(1.0f);
        }
        todoItemMenu.updateTranslation();
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(null);
            this.setTaskInvisible = true;
            this.open = true;
            animateOpenTo(true, null);
        }
    }

    public void dismiss(boolean z) {
        ChatMessageCell chatMessageCell;
        ReactionsContainerLayout reactionsContainerLayout;
        if (z && (reactionsContainerLayout = this.reactionsView) != null && reactionsContainerLayout.getReactionsWindow() != null && !this.reactionsView.getReactionsWindow().dismissed) {
            this.reactionsView.dismissWindow();
            return;
        }
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        this.hasTranslation = false;
        this.viewPager.cancelTouches();
        boolean z2 = this.viewPager.getCurrentPosition() == 1;
        if (z && z2) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.setVisibility(4);
                this.cell.invalidate();
            }
        } else if (!z && (chatMessageCell = this.cell) != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawTaskId = -1;
            chatMessageCell3.invalidate();
        }
        this.dismissingWithAlpha = !z;
        setupTranslation();
        this.open = false;
        animateOpenTo(false, new PollItemMenu$$ExternalSyntheticLambda0(this, z2, 11));
        this.windowView.invalidate();
    }
}
