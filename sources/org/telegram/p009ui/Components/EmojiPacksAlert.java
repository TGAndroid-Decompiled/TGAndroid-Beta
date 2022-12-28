package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.EmojiPacksAlert;
import org.telegram.p009ui.Components.EmojiView;
import org.telegram.p009ui.Components.LinkSpanDrawable;
import org.telegram.p009ui.Components.Premium.PremiumButtonView;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.p009ui.PremiumPreviewFragment;
import org.telegram.p009ui.ProfileActivity;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSetInstallResultArchive;
import org.telegram.tgnet.TLRPC$TL_stickerPack;

public class EmojiPacksAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private static Pattern urlPattern;
    private TextView addButtonView;
    private LongSparseArray<AnimatedEmojiDrawable> animatedEmojiDrawables;
    private FrameLayout buttonsView;
    private EmojiPacksLoader customEmojiPacks;
    private BaseFragment fragment;
    private Float fromY;
    private GridLayoutManager gridLayoutManager;
    private boolean hasDescription;
    private float lastY;
    private RecyclerListView listView;
    private ValueAnimator loadAnimator;
    private float loadT;
    boolean loaded;
    private View paddingView;
    private ActionBarPopupWindow popupWindow;
    private long premiumButtonClicked;
    private PremiumButtonView premiumButtonView;
    private CircularProgressDrawable progressDrawable;
    private TextView removeButtonView;
    private View shadowView;
    private boolean shown;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected void onButtonClicked(boolean z) {
    }

    protected void onCloseByLink() {
    }

    public static void access$5500(EmojiPacksAlert emojiPacksAlert, int i) {
        emojiPacksAlert.onSubItemClick(i);
    }

    public EmojiPacksAlert(final BaseFragment baseFragment, final Context context, final Theme.ResourcesProvider resourcesProvider, final ArrayList<TLRPC$InputStickerSet> arrayList) {
        super(context, false, resourcesProvider);
        this.shown = false;
        this.loaded = true;
        arrayList.size();
        this.fragment = baseFragment;
        fixNavigationBar();
        this.customEmojiPacks = new EmojiPacksLoader(this.currentAccount, arrayList) {
            @Override
            protected void onUpdate() {
                EmojiPacksAlert.this.updateButton();
                if (EmojiPacksAlert.this.listView == null || EmojiPacksAlert.this.listView.getAdapter() == null) {
                    return;
                }
                EmojiPacksAlert.this.listView.getAdapter().notifyDataSetChanged();
            }
        };
        this.progressDrawable = new CircularProgressDrawable(AndroidUtilities.m36dp(32.0f), AndroidUtilities.m36dp(3.5f), getThemedColor("featuredStickers_addButton"));
        new PorterDuffColorFilter(ColorUtils.setAlphaComponent(getThemedColor("windowBackgroundWhiteLinkText"), 178), PorterDuff.Mode.MULTIPLY);
        this.containerView = new FrameLayout(context) {
            boolean attached;
            private Paint paint = new Paint();
            private Path path = new Path();
            private Boolean lastOpen = null;
            SparseArray<ArrayList<EmojiImageView>> viewsGroupedByLines = new SparseArray<>();
            ArrayList<DrawingInBackgroundLine> lineDrawables = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> lineDrawablesTmp = new ArrayList<>();
            ArrayList<ArrayList<EmojiImageView>> unusedArrays = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> unusedLineDrawables = new ArrayList<>();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                EmojiPacksAlert emojiPacksAlert;
                float f;
                if (this.attached) {
                    this.paint.setColor(EmojiPacksAlert.this.getThemedColor("dialogBackground"));
                    this.paint.setShadowLayer(AndroidUtilities.m36dp(2.0f), 0.0f, AndroidUtilities.m36dp(-0.66f), 503316480);
                    this.path.reset();
                    float f2 = EmojiPacksAlert.this.lastY = emojiPacksAlert.getListTop();
                    if (EmojiPacksAlert.this.fromY != null) {
                        float lerp = AndroidUtilities.lerp(EmojiPacksAlert.this.fromY.floatValue(), ((BottomSheet) EmojiPacksAlert.this).containerView.getY() + f2, EmojiPacksAlert.this.loadT) - ((BottomSheet) EmojiPacksAlert.this).containerView.getY();
                        f = lerp - f2;
                        f2 = lerp;
                    } else {
                        f = 0.0f;
                    }
                    float clamp = 1.0f - MathUtils.clamp((f2 - ((BottomSheet) EmojiPacksAlert.this).containerView.getPaddingTop()) / AndroidUtilities.m36dp(32.0f), 0.0f, 1.0f);
                    float paddingTop = f2 - (((BottomSheet) EmojiPacksAlert.this).containerView.getPaddingTop() * clamp);
                    float m36dp = AndroidUtilities.m36dp((1.0f - clamp) * 14.0f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), getBottom() + m36dp);
                    this.path.addRoundRect(rectF, m36dp, m36dp, Path.Direction.CW);
                    canvas.drawPath(this.path, this.paint);
                    boolean z = clamp > 0.75f;
                    Boolean bool = this.lastOpen;
                    if (bool == null || z != bool.booleanValue()) {
                        EmojiPacksAlert emojiPacksAlert2 = EmojiPacksAlert.this;
                        Boolean valueOf = Boolean.valueOf(z);
                        this.lastOpen = valueOf;
                        emojiPacksAlert2.updateLightStatusBar(valueOf.booleanValue());
                    }
                    Theme.dialogs_onlineCirclePaint.setColor(EmojiPacksAlert.this.getThemedColor("key_sheet_scrollUp"));
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (MathUtils.clamp(paddingTop / AndroidUtilities.m36dp(20.0f), 0.0f, 1.0f) * Theme.dialogs_onlineCirclePaint.getAlpha()));
                    int m36dp2 = AndroidUtilities.m36dp(36.0f);
                    float m36dp3 = paddingTop + AndroidUtilities.m36dp(10.0f);
                    rectF.set((getMeasuredWidth() - m36dp2) / 2, m36dp3, (getMeasuredWidth() + m36dp2) / 2, AndroidUtilities.m36dp(4.0f) + m36dp3);
                    canvas.drawRoundRect(rectF, AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    EmojiPacksAlert.this.shadowView.setVisibility((EmojiPacksAlert.this.listView.canScrollVertically(1) || EmojiPacksAlert.this.removeButtonView.getVisibility() == 0) ? 0 : 4);
                    if (EmojiPacksAlert.this.listView != null) {
                        canvas.save();
                        canvas.translate(EmojiPacksAlert.this.listView.getLeft(), EmojiPacksAlert.this.listView.getTop() + f);
                        canvas.clipRect(0, 0, EmojiPacksAlert.this.listView.getWidth(), EmojiPacksAlert.this.listView.getHeight());
                        canvas.saveLayerAlpha(0.0f, 0.0f, EmojiPacksAlert.this.listView.getWidth(), EmojiPacksAlert.this.listView.getHeight(), (int) (EmojiPacksAlert.this.listView.getAlpha() * 255.0f), 31);
                        for (int i = 0; i < this.viewsGroupedByLines.size(); i++) {
                            ArrayList<EmojiImageView> valueAt = this.viewsGroupedByLines.valueAt(i);
                            valueAt.clear();
                            this.unusedArrays.add(valueAt);
                        }
                        this.viewsGroupedByLines.clear();
                        for (int i2 = 0; i2 < EmojiPacksAlert.this.listView.getChildCount(); i2++) {
                            View childAt = EmojiPacksAlert.this.listView.getChildAt(i2);
                            if (childAt instanceof EmojiImageView) {
                                EmojiImageView emojiImageView = (EmojiImageView) childAt;
                                emojiImageView.updatePressedProgress();
                                if (EmojiPacksAlert.this.animatedEmojiDrawables == null) {
                                    EmojiPacksAlert.this.animatedEmojiDrawables = new LongSparseArray();
                                }
                                AnimatedEmojiSpan animatedEmojiSpan = emojiImageView.span;
                                if (animatedEmojiSpan != null) {
                                    long documentId = animatedEmojiSpan.getDocumentId();
                                    AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiPacksAlert.this.animatedEmojiDrawables.get(documentId);
                                    if (animatedEmojiDrawable == null) {
                                        LongSparseArray longSparseArray = EmojiPacksAlert.this.animatedEmojiDrawables;
                                        AnimatedEmojiDrawable make = AnimatedEmojiDrawable.make(((BottomSheet) EmojiPacksAlert.this).currentAccount, 3, documentId);
                                        longSparseArray.put(documentId, make);
                                        animatedEmojiDrawable = make;
                                    }
                                    animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
                                    animatedEmojiDrawable.addView(this);
                                    ArrayList<EmojiImageView> arrayList2 = this.viewsGroupedByLines.get(childAt.getTop());
                                    if (arrayList2 == null) {
                                        if (!this.unusedArrays.isEmpty()) {
                                            ArrayList<ArrayList<EmojiImageView>> arrayList3 = this.unusedArrays;
                                            arrayList2 = arrayList3.remove(arrayList3.size() - 1);
                                        } else {
                                            arrayList2 = new ArrayList<>();
                                        }
                                        this.viewsGroupedByLines.put(childAt.getTop(), arrayList2);
                                    }
                                    arrayList2.add((EmojiImageView) childAt);
                                }
                            } else {
                                canvas.save();
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                childAt.draw(canvas);
                                canvas.restore();
                            }
                        }
                        this.lineDrawablesTmp.clear();
                        this.lineDrawablesTmp.addAll(this.lineDrawables);
                        this.lineDrawables.clear();
                        long currentTimeMillis = System.currentTimeMillis();
                        int i3 = 0;
                        while (true) {
                            DrawingInBackgroundLine drawingInBackgroundLine = null;
                            if (i3 >= this.viewsGroupedByLines.size()) {
                                break;
                            }
                            ArrayList<EmojiImageView> valueAt2 = this.viewsGroupedByLines.valueAt(i3);
                            EmojiImageView emojiImageView2 = valueAt2.get(0);
                            int childAdapterPosition = EmojiPacksAlert.this.listView.getChildAdapterPosition(emojiImageView2);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= this.lineDrawablesTmp.size()) {
                                    break;
                                } else if (this.lineDrawablesTmp.get(i4).position == childAdapterPosition) {
                                    drawingInBackgroundLine = this.lineDrawablesTmp.get(i4);
                                    this.lineDrawablesTmp.remove(i4);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (drawingInBackgroundLine == null) {
                                if (!this.unusedLineDrawables.isEmpty()) {
                                    ArrayList<DrawingInBackgroundLine> arrayList4 = this.unusedLineDrawables;
                                    drawingInBackgroundLine = arrayList4.remove(arrayList4.size() - 1);
                                } else {
                                    drawingInBackgroundLine = new DrawingInBackgroundLine();
                                    drawingInBackgroundLine.currentLayerNum = 7;
                                }
                                drawingInBackgroundLine.position = childAdapterPosition;
                                drawingInBackgroundLine.onAttachToWindow();
                            }
                            this.lineDrawables.add(drawingInBackgroundLine);
                            drawingInBackgroundLine.imageViewEmojis = valueAt2;
                            canvas.save();
                            canvas.translate(0.0f, emojiImageView2.getY() + emojiImageView2.getPaddingTop());
                            drawingInBackgroundLine.draw(canvas, currentTimeMillis, getMeasuredWidth(), emojiImageView2.getMeasuredHeight() - emojiImageView2.getPaddingBottom(), 1.0f);
                            canvas.restore();
                            i3++;
                        }
                        for (int i5 = 0; i5 < this.lineDrawablesTmp.size(); i5++) {
                            if (this.unusedLineDrawables.size() < 3) {
                                this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i5));
                                this.lineDrawablesTmp.get(i5).imageViewEmojis = null;
                                this.lineDrawablesTmp.get(i5).reset();
                            } else {
                                this.lineDrawablesTmp.get(i5).onDetachFromWindow();
                            }
                        }
                        this.lineDrawablesTmp.clear();
                        canvas.restore();
                        canvas.restore();
                        if (EmojiPacksAlert.this.listView.getAlpha() < 1.0f) {
                            int width = getWidth() / 2;
                            int height = (((int) m36dp3) + getHeight()) / 2;
                            int m36dp4 = AndroidUtilities.m36dp(16.0f);
                            EmojiPacksAlert.this.progressDrawable.setAlpha((int) ((1.0f - EmojiPacksAlert.this.listView.getAlpha()) * 255.0f));
                            EmojiPacksAlert.this.progressDrawable.setBounds(width - m36dp4, height - m36dp4, width + m36dp4, height + m36dp4);
                            EmojiPacksAlert.this.progressDrawable.draw(canvas);
                            invalidate();
                        }
                    }
                    super.dispatchDraw(canvas);
                }
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && motionEvent.getY() < EmojiPacksAlert.this.getListTop() - AndroidUtilities.m36dp(6.0f)) {
                    EmojiPacksAlert.this.dismiss();
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
                ArrayList<EmojiImageView> drawInBackgroundViews = new ArrayList<>();
                ArrayList<EmojiImageView> imageViewEmojis;
                public int position;

                DrawingInBackgroundLine() {
                }

                @Override
                public void prepareDraw(long j) {
                    AnimatedEmojiDrawable animatedEmojiDrawable;
                    this.drawInBackgroundViews.clear();
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                        if (emojiImageView.span != null && (animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiPacksAlert.this.animatedEmojiDrawables.get(emojiImageView.span.getDocumentId())) != null && animatedEmojiDrawable.getImageReceiver() != null) {
                            animatedEmojiDrawable.update(j);
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = emojiImageView.backgroundThreadDrawHolder;
                            int i2 = this.threadIndex;
                            ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = emojiImageView.backgroundThreadDrawHolder;
                            int i3 = this.threadIndex;
                            backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr2[i3], i3);
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].time = j;
                            animatedEmojiDrawable.setAlpha(255);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(emojiImageView.getLeft() + emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), emojiImageView.getRight() - emojiImageView.getPaddingRight(), emojiImageView.getMeasuredHeight() - emojiImageView.getPaddingBottom());
                            emojiImageView.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                            animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
                            emojiImageView.imageReceiver = animatedEmojiDrawable.getImageReceiver();
                            this.drawInBackgroundViews.add(emojiImageView);
                        }
                    }
                }

                @Override
                public void draw(android.graphics.Canvas r7, long r8, int r10, int r11, float r12) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiPacksAlert.C22152.DrawingInBackgroundLine.draw(android.graphics.Canvas, long, int, int, float):void");
                }

                @Override
                public void drawInBackground(Canvas canvas) {
                    for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                        EmojiImageView emojiImageView = this.drawInBackgroundViews.get(i);
                        emojiImageView.imageReceiver.draw(canvas, emojiImageView.backgroundThreadDrawHolder[this.threadIndex]);
                    }
                }

                @Override
                protected void drawInUiThread(Canvas canvas, float f) {
                    AnimatedEmojiDrawable animatedEmojiDrawable;
                    if (this.imageViewEmojis != null) {
                        for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                            EmojiImageView emojiImageView = this.imageViewEmojis.get(i);
                            if (emojiImageView.span != null && (animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiPacksAlert.this.animatedEmojiDrawables.get(emojiImageView.span.getDocumentId())) != null && animatedEmojiDrawable.getImageReceiver() != null && emojiImageView.imageReceiver != null) {
                                animatedEmojiDrawable.setAlpha((int) (255.0f * f * emojiImageView.getAlpha()));
                                float width = ((emojiImageView.getWidth() - emojiImageView.getPaddingLeft()) - emojiImageView.getPaddingRight()) / 2.0f;
                                float height = ((emojiImageView.getHeight() - emojiImageView.getPaddingTop()) - emojiImageView.getPaddingBottom()) / 2.0f;
                                float left = (emojiImageView.getLeft() + emojiImageView.getRight()) / 2.0f;
                                float paddingTop = emojiImageView.getPaddingTop() + height;
                                float f2 = emojiImageView.pressedProgress != 0.0f ? 1.0f * (((1.0f - emojiImageView.pressedProgress) * 0.2f) + 0.8f) : 1.0f;
                                animatedEmojiDrawable.setBounds((int) (left - ((emojiImageView.getScaleX() * width) * f2)), (int) (paddingTop - ((emojiImageView.getScaleY() * height) * f2)), (int) (left + (width * emojiImageView.getScaleX() * f2)), (int) (paddingTop + (height * emojiImageView.getScaleY() * f2)));
                                animatedEmojiDrawable.draw(canvas);
                            }
                        }
                    }
                }

                @Override
                public void onFrameReady() {
                    super.onFrameReady();
                    for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                        this.drawInBackgroundViews.get(i).backgroundThreadDrawHolder[this.threadIndex].release();
                    }
                    ((BottomSheet) EmojiPacksAlert.this).containerView.invalidate();
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.attached = true;
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.attached = false;
                for (int i = 0; i < this.lineDrawables.size(); i++) {
                    this.lineDrawables.get(i).onDetachFromWindow();
                }
                for (int i2 = 0; i2 < this.unusedLineDrawables.size(); i2++) {
                    this.unusedLineDrawables.get(i2).onDetachFromWindow();
                }
                this.lineDrawables.clear();
            }
        };
        this.paddingView = new View(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x;
                int i4 = point.y;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i4 * (i3 < i4 ? 0.56f : 0.3f)), 1073741824));
            }
        };
        this.listView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                return false;
            }

            @Override
            public void onMeasure(int i, int i2) {
                EmojiPacksAlert.this.gridLayoutManager.setSpanCount(Math.max(1, View.MeasureSpec.getSize(i) / AndroidUtilities.m36dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
                super.onMeasure(i, i2);
            }

            @Override
            public void onScrolled(int i, int i2) {
                super.onScrolled(i, i2);
                ((BottomSheet) EmojiPacksAlert.this).containerView.invalidate();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                AnimatedEmojiSpan.release(((BottomSheet) EmojiPacksAlert.this).containerView, EmojiPacksAlert.this.animatedEmojiDrawables);
            }
        };
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, AndroidUtilities.statusBarHeight, i, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        this.listView.setSelectorRadius(AndroidUtilities.m36dp(6.0f));
        this.listView.setSelectorDrawableColor(Theme.getColor("listSelectorSDK21", resourcesProvider));
        this.listView.setPadding(AndroidUtilities.m36dp(8.0f), 0, AndroidUtilities.m36dp(8.0f), AndroidUtilities.m36dp(68.0f));
        this.listView.setAdapter(new Adapter());
        RecyclerListView recyclerListView = this.listView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 8);
        this.gridLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.listView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (view instanceof SeparatorView) {
                    rect.left = -EmojiPacksAlert.this.listView.getPaddingLeft();
                    rect.right = -EmojiPacksAlert.this.listView.getPaddingRight();
                } else if (EmojiPacksAlert.this.listView.getChildAdapterPosition(view) == 1) {
                    rect.top = AndroidUtilities.m36dp(14.0f);
                }
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                EmojiPacksAlert.this.lambda$new$0(arrayList, baseFragment, resourcesProvider, view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$new$2;
                lambda$new$2 = EmojiPacksAlert.this.lambda$new$2(context, view, i2);
                return lambda$new$2;
            }
        });
        this.gridLayoutManager.setReverseLayout(false);
        this.gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                if (EmojiPacksAlert.this.listView.getAdapter() == null || EmojiPacksAlert.this.listView.getAdapter().getItemViewType(i2) == 1) {
                    return 1;
                }
                return EmojiPacksAlert.this.gridLayoutManager.getSpanCount();
            }
        });
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context);
        this.shadowView = view;
        view.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.containerView.addView(this.shadowView, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 80));
        this.shadowView.setTranslationY(-AndroidUtilities.m36dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonsView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor("dialogBackground"));
        this.containerView.addView(this.buttonsView, LayoutHelper.createFrame(-1, 68, 87));
        TextView textView = new TextView(context);
        this.addButtonView = textView;
        textView.setVisibility(8);
        this.addButtonView.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor("featuredStickers_addButton"), 6.0f));
        this.addButtonView.setTextColor(getThemedColor("featuredStickers_buttonText"));
        this.addButtonView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.addButtonView.setGravity(17);
        this.buttonsView.addView(this.addButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
        TextView textView2 = new TextView(context);
        this.removeButtonView = textView2;
        textView2.setVisibility(8);
        this.removeButtonView.setBackground(Theme.createRadSelectorDrawable(268435455 & getThemedColor("dialogTextRed"), 0, 0));
        this.removeButtonView.setTextColor(getThemedColor("dialogTextRed"));
        this.removeButtonView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.removeButtonView.setGravity(17);
        this.removeButtonView.setClickable(true);
        this.buttonsView.addView(this.removeButtonView, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setButton(LocaleController.getString("UnlockPremiumEmoji", C1072R.string.UnlockPremiumEmoji), new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                EmojiPacksAlert.this.lambda$new$3(view2);
            }
        });
        this.premiumButtonView.setIcon(C1072R.raw.unlock_icon);
        this.premiumButtonView.buttonLayout.setClickable(true);
        this.buttonsView.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
        updateButton();
        MediaDataController.getInstance(baseFragment == null ? UserConfig.selectedAccount : baseFragment.getCurrentAccount()).checkStickers(5);
    }

    public void lambda$new$0(ArrayList arrayList, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view, int i) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
        int i2 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
                this.popupWindow = null;
            } else if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getChatActivityEnterView().getVisibility() == 0 && (view instanceof EmojiImageView)) {
                AnimatedEmojiSpan animatedEmojiSpan = ((EmojiImageView) view).span;
                try {
                    TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
                    if (tLRPC$Document == null) {
                        tLRPC$Document = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document));
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    ((ChatActivity) baseFragment).getChatActivityEnterView().messageEditText.getText().append((CharSequence) spannableString);
                    ((ChatActivity) baseFragment).showEmojiHint();
                    onCloseByLink();
                    dismiss();
                } catch (Exception unused) {
                }
                try {
                    view.performHapticFeedback(3, 1);
                } catch (Exception unused2) {
                }
            }
        } else if (SystemClock.elapsedRealtime() - this.premiumButtonClicked < 250) {
        } else {
            int i3 = 0;
            while (true) {
                ArrayList<EmojiView.CustomEmoji>[] arrayListArr = this.customEmojiPacks.data;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i2].size();
                if (this.customEmojiPacks.data.length > 1) {
                    size = Math.min(this.gridLayoutManager.getSpanCount() * 2, size);
                }
                i3 += size + 1 + 1;
                if (i < i3) {
                    break;
                }
                i2++;
            }
            ArrayList<TLRPC$TL_messages_stickerSet> arrayList2 = this.customEmojiPacks.stickerSets;
            if (arrayList2 != null && i2 < arrayList2.size()) {
                tLRPC$TL_messages_stickerSet = this.customEmojiPacks.stickerSets.get(i2);
            }
            if (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.set == null) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
            tLRPC$TL_inputStickerSetID.f880id = tLRPC$StickerSet.f890id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            arrayList3.add(tLRPC$TL_inputStickerSetID);
            new EmojiPacksAlert(baseFragment, getContext(), resourcesProvider, arrayList3) {
                @Override
                protected void onCloseByLink() {
                    EmojiPacksAlert.this.dismiss();
                }
            }.show();
        }
    }

    public boolean lambda$new$2(Context context, View view, int i) {
        final AnimatedEmojiSpan animatedEmojiSpan;
        if (!(view instanceof EmojiImageView) || (animatedEmojiSpan = ((EmojiImageView) view).span) == null) {
            return false;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, true);
        actionBarMenuSubItem.setItemHeight(48);
        actionBarMenuSubItem.setPadding(AndroidUtilities.m36dp(26.0f), 0, AndroidUtilities.m36dp(26.0f), 0);
        actionBarMenuSubItem.setText(LocaleController.getString("Copy", C1072R.string.Copy));
        actionBarMenuSubItem.getTextView().setTextSize(1, 14.4f);
        actionBarMenuSubItem.getTextView().setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                EmojiPacksAlert.this.lambda$new$1(animatedEmojiSpan, view2);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = ContextCompat.getDrawable(getContext(), C1072R.C1073drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("actionBarDefaultSubmenuBackground"), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(actionBarMenuSubItem);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.popupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setClippingEnabled(true);
        this.popupWindow.setLayoutInScreen(true);
        this.popupWindow.setInputMethodMode(2);
        this.popupWindow.setSoftInputMode(0);
        this.popupWindow.setOutsideTouchable(true);
        this.popupWindow.setAnimationStyle(C1072R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.popupWindow.showAtLocation(view, 51, (iArr[0] - AndroidUtilities.m36dp(49.0f)) + (view.getMeasuredWidth() / 2), iArr[1] - AndroidUtilities.m36dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    public void lambda$new$1(AnimatedEmojiSpan animatedEmojiSpan, View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null) {
            return;
        }
        actionBarPopupWindow.dismiss();
        this.popupWindow = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId())));
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            BulletinFactory.m15of((FrameLayout) this.containerView, this.resourcesProvider).createCopyBulletin(LocaleController.getString("EmojiCopied", C1072R.string.EmojiCopied)).show();
        }
    }

    public void lambda$new$3(View view) {
        showPremiumAlert();
    }

    private void updateShowButton(boolean z) {
        boolean z2 = !this.shown && z;
        float m36dp = this.removeButtonView.getVisibility() == 0 ? AndroidUtilities.m36dp(19.0f) : 0;
        if (z2) {
            ViewPropertyAnimator duration = this.buttonsView.animate().translationY(z ? m36dp : AndroidUtilities.m36dp(16.0f)).alpha(z ? 1.0f : 0.0f).setDuration(250L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.shadowView.animate().translationY(z ? -(AndroidUtilities.m36dp(68.0f) - m36dp) : 0.0f).alpha(z ? 1.0f : 0.0f).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
            this.listView.animate().translationY(z ? 0.0f : AndroidUtilities.m36dp(68.0f) - m36dp).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
        } else {
            this.buttonsView.setAlpha(z ? 1.0f : 0.0f);
            this.buttonsView.setTranslationY(z ? m36dp : AndroidUtilities.m36dp(16.0f));
            this.shadowView.setAlpha(z ? 1.0f : 0.0f);
            this.shadowView.setTranslationY(z ? -(AndroidUtilities.m36dp(68.0f) - m36dp) : 0.0f);
            this.listView.setTranslationY(z ? 0.0f : AndroidUtilities.m36dp(68.0f) - m36dp);
        }
        this.shown = z;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            updateInstallment();
        }
    }

    public void showPremiumAlert() {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).lambda$runLinkRequest$71(new PremiumPreviewFragment(null));
        }
    }

    public void updateLightStatusBar(boolean z) {
        boolean z2 = AndroidUtilities.computePerceivedBrightness(getThemedColor("dialogBackground")) > 0.721f;
        boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(getThemedColor("actionBarDefault"), AndroidUtilities.DARK_STATUS_BAR_OVERLAY)) > 0.721f;
        if (!z) {
            z2 = z3;
        }
        AndroidUtilities.setLightStatusBar(getWindow(), z2);
    }

    public void updateInstallment() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof EmojiPackHeader) {
                EmojiPackHeader emojiPackHeader = (EmojiPackHeader) childAt;
                if (emojiPackHeader.set != null && emojiPackHeader.set.set != null) {
                    emojiPackHeader.toggle(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(emojiPackHeader.set.set.f890id), true);
                }
            }
        }
        updateButton();
    }

    public static void installSet(BaseFragment baseFragment, TLObject tLObject, boolean z) {
        installSet(baseFragment, tLObject, z, null, null);
    }

    public static void installSet(final org.telegram.p009ui.ActionBar.BaseFragment r11, org.telegram.tgnet.TLObject r12, final boolean r13, final org.telegram.messenger.Utilities.Callback<java.lang.Boolean> r14, final java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiPacksAlert.installSet(org.telegram.ui.ActionBar.BaseFragment, org.telegram.tgnet.TLObject, boolean, org.telegram.messenger.Utilities$Callback, java.lang.Runnable):void");
    }

    public static void lambda$installSet$6(final TLRPC$StickerSet tLRPC$StickerSet, final boolean z, final View view, final BaseFragment baseFragment, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final int i, final Utilities.Callback callback, final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                EmojiPacksAlert.lambda$installSet$5(TLRPC$StickerSet.this, tLRPC$TL_error, z, view, baseFragment, tLRPC$TL_messages_stickerSet, tLObject, i, callback, runnable);
            }
        });
    }

    public static void lambda$installSet$5(TLRPC$StickerSet tLRPC$StickerSet, TLRPC$TL_error tLRPC$TL_error, boolean z, View view, BaseFragment baseFragment, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, TLObject tLObject, int i, Utilities.Callback callback, final Runnable runnable) {
        int i2;
        if (tLRPC$StickerSet.masks) {
            i2 = 1;
        } else {
            i2 = tLRPC$StickerSet.emojis ? 5 : 0;
        }
        try {
            if (tLRPC$TL_error == null) {
                if (z && view != null) {
                    Bulletin.make(baseFragment, new StickerSetBulletinLayout(baseFragment.getFragmentView().getContext(), tLRPC$TL_messages_stickerSet == 0 ? tLRPC$StickerSet : tLRPC$TL_messages_stickerSet, 2, null, baseFragment.getResourceProvider()), 1500).show();
                }
                if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(i).processStickerSetInstallResultArchive(baseFragment, true, i2, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
                }
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (view != null) {
                Toast.makeText(baseFragment.getFragmentView().getContext(), LocaleController.getString("ErrorOccurred", C1072R.string.ErrorOccurred), 0).show();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
            } else if (callback != null) {
                callback.run(Boolean.FALSE);
            }
        } catch (Exception e) {
            FileLog.m32e(e);
        }
        MediaDataController.getInstance(i).loadStickers(i2, false, true, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiPacksAlert.lambda$installSet$4(runnable, (ArrayList) obj);
            }
        });
    }

    public static void lambda$installSet$4(Runnable runnable, ArrayList arrayList) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void uninstallSet(BaseFragment baseFragment, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z, Runnable runnable) {
        if (baseFragment == null || tLRPC$TL_messages_stickerSet == null || baseFragment.getFragmentView() == null) {
            return;
        }
        MediaDataController.getInstance(baseFragment.getCurrentAccount()).toggleStickerSet(baseFragment.getFragmentView().getContext(), tLRPC$TL_messages_stickerSet, 0, baseFragment, true, z, runnable);
    }

    public static void uninstallSet(Context context, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z, Runnable runnable) {
        if (tLRPC$TL_messages_stickerSet == null) {
            return;
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tLRPC$TL_messages_stickerSet, 0, null, true, z, runnable);
    }

    private void loadAnimation() {
        if (this.loadAnimator != null) {
            return;
        }
        this.loadAnimator = ValueAnimator.ofFloat(this.loadT, 1.0f);
        this.fromY = Float.valueOf(this.lastY + this.containerView.getY());
        this.loadAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EmojiPacksAlert.this.lambda$loadAnimation$7(valueAnimator);
            }
        });
        this.loadAnimator.setDuration(250L);
        this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.loadAnimator.start();
    }

    public void lambda$loadAnimation$7(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.loadT = floatValue;
        this.listView.setAlpha(floatValue);
        this.addButtonView.setAlpha(this.loadT);
        this.removeButtonView.setAlpha(this.loadT);
        this.containerView.invalidate();
    }

    public void updateButton() {
        TLRPC$StickerSet tLRPC$StickerSet;
        if (this.buttonsView == null) {
            return;
        }
        ArrayList arrayList = this.customEmojiPacks.stickerSets == null ? new ArrayList() : new ArrayList(this.customEmojiPacks.stickerSets);
        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) arrayList.get(i2);
            if (tLRPC$TL_messages_stickerSet != null && (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) != null) {
                if (!mediaDataController.isStickerPackInstalled(tLRPC$StickerSet.f890id)) {
                    arrayList3.add(tLRPC$TL_messages_stickerSet);
                } else {
                    arrayList2.add(tLRPC$TL_messages_stickerSet);
                }
            }
        }
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        int i3 = 0;
        while (i3 < arrayList4.size()) {
            if (MessageObject.isPremiumEmojiPack((TLRPC$TL_messages_stickerSet) arrayList4.get(i3)) && !isPremium) {
                arrayList4.remove(i3);
                i3--;
            }
            i3++;
        }
        boolean z = this.customEmojiPacks.inputStickerSets != null && arrayList.size() == this.customEmojiPacks.inputStickerSets.size();
        if (!this.loaded && z) {
            loadAnimation();
        }
        this.loaded = z;
        if (!z) {
            this.listView.setAlpha(0.0f);
        }
        if (!this.loaded) {
            this.premiumButtonView.setVisibility(8);
            this.addButtonView.setVisibility(8);
            this.removeButtonView.setVisibility(8);
            updateShowButton(false);
        } else if ((arrayList4.size() <= 0 && arrayList3.size() >= 0 && !isPremium) || !this.loaded) {
            this.premiumButtonView.setVisibility(0);
            this.addButtonView.setVisibility(8);
            this.removeButtonView.setVisibility(8);
            updateShowButton(true);
        } else {
            this.premiumButtonView.setVisibility(4);
            if (arrayList4.size() > 0) {
                this.addButtonView.setVisibility(0);
                this.removeButtonView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    this.addButtonView.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC$TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
                } else {
                    this.addButtonView.setText(LocaleController.formatPluralString("AddManyEmojiCount", arrayList4.size(), new Object[0]));
                }
                this.addButtonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.this.lambda$updateButton$9(arrayList4, view);
                    }
                });
                updateShowButton(true);
            } else if (arrayList2.size() > 0) {
                this.addButtonView.setVisibility(8);
                this.removeButtonView.setVisibility(0);
                if (arrayList2.size() == 1) {
                    this.removeButtonView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC$TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
                } else {
                    this.removeButtonView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
                }
                this.removeButtonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.this.lambda$updateButton$10(arrayList2, view);
                    }
                });
                updateShowButton(true);
            } else {
                this.addButtonView.setVisibility(8);
                this.removeButtonView.setVisibility(8);
                updateShowButton(false);
            }
        }
    }

    public void lambda$updateButton$9(final ArrayList arrayList, View view) {
        final int size = arrayList.size();
        final int[] iArr = new int[2];
        for (int i = 0; i < arrayList.size(); i++) {
            installSet(this.fragment, (TLObject) arrayList.get(i), size == 1, size > 1 ? new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiPacksAlert.this.lambda$updateButton$8(iArr, size, arrayList, (Boolean) obj);
                }
            } : null, null);
        }
        onButtonClicked(true);
        if (size <= 1) {
            dismiss();
        }
    }

    public void lambda$updateButton$8(int[] iArr, int i, ArrayList arrayList, Boolean bool) {
        iArr[0] = iArr[0] + 1;
        if (bool.booleanValue()) {
            iArr[1] = iArr[1] + 1;
        }
        if (iArr[0] != i || iArr[1] <= 0) {
            return;
        }
        dismiss();
        Bulletin.make(this.fragment, new StickerSetBulletinLayout(this.fragment.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, this.fragment.getResourceProvider()), 1500).show();
    }

    public void lambda$updateButton$10(ArrayList arrayList, View view) {
        dismiss();
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            MediaDataController.getInstance(baseFragment.getCurrentAccount()).removeMultipleStickerSets(this.fragment.getFragmentView().getContext(), this.fragment, arrayList);
        } else {
            int i = 0;
            while (i < arrayList.size()) {
                uninstallSet(getContext(), (TLRPC$TL_messages_stickerSet) arrayList.get(i), i == 0, (Runnable) null);
                i++;
            }
        }
        onButtonClicked(false);
    }

    public int getListTop() {
        if (this.containerView == null) {
            return 0;
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || recyclerListView.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = this.listView.getChildAt(0);
        View view = this.paddingView;
        if (childAt != view) {
            return this.containerView.getPaddingTop();
        }
        return view.getBottom() + this.containerView.getPaddingTop();
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 4);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        EmojiPacksLoader emojiPacksLoader = this.customEmojiPacks;
        if (emojiPacksLoader != null) {
            emojiPacksLoader.recycle();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public int getContainerViewHeight() {
        RecyclerListView recyclerListView = this.listView;
        int measuredHeight = (recyclerListView == null ? 0 : recyclerListView.getMeasuredHeight()) - getListTop();
        ViewGroup viewGroup = this.containerView;
        return measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight + AndroidUtilities.m36dp(8.0f);
    }

    class SeparatorView extends View {
        public SeparatorView(EmojiPacksAlert emojiPacksAlert, Context context) {
            super(context);
            setBackgroundColor(emojiPacksAlert.getThemedColor("chat_emojiPanelShadowLine"));
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, AndroidUtilities.getShadowHeight());
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.m36dp(14.0f);
            setLayoutParams(layoutParams);
        }
    }

    private class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = EmojiPacksAlert.this.paddingView;
            } else {
                if (i == 1) {
                    EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                    view = new EmojiImageView(emojiPacksAlert.getContext());
                } else if (i == 2) {
                    EmojiPacksAlert emojiPacksAlert2 = EmojiPacksAlert.this;
                    view = new EmojiPackHeader(emojiPacksAlert2.getContext(), EmojiPacksAlert.this.customEmojiPacks.data.length <= 1);
                } else if (i == 3) {
                    view = new TextView(EmojiPacksAlert.this.getContext());
                } else if (i == 4) {
                    EmojiPacksAlert emojiPacksAlert3 = EmojiPacksAlert.this;
                    view = new SeparatorView(emojiPacksAlert3, emojiPacksAlert3.getContext());
                } else {
                    view = null;
                }
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            EmojiView.CustomEmoji customEmoji;
            ArrayList<TLRPC$Document> arrayList;
            int i2 = i - 1;
            int itemViewType = viewHolder.getItemViewType();
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
            int i3 = 0;
            boolean z = true;
            if (itemViewType == 1) {
                if (EmojiPacksAlert.this.hasDescription) {
                    i2--;
                }
                EmojiImageView emojiImageView = (EmojiImageView) viewHolder.itemView;
                int i4 = 0;
                while (true) {
                    if (i3 >= EmojiPacksAlert.this.customEmojiPacks.data.length) {
                        customEmoji = null;
                        break;
                    }
                    int size = EmojiPacksAlert.this.customEmojiPacks.data[i3].size();
                    if (EmojiPacksAlert.this.customEmojiPacks.data.length > 1) {
                        size = Math.min(EmojiPacksAlert.this.gridLayoutManager.getSpanCount() * 2, size);
                    }
                    if (i2 > i4 && i2 <= i4 + size) {
                        customEmoji = EmojiPacksAlert.this.customEmojiPacks.data[i3].get((i2 - i4) - 1);
                        break;
                    } else {
                        i4 += size + 1 + 1;
                        i3++;
                    }
                }
                AnimatedEmojiSpan animatedEmojiSpan = emojiImageView.span;
                if ((animatedEmojiSpan != null || customEmoji == null) && ((customEmoji != null || animatedEmojiSpan == null) && (customEmoji == null || animatedEmojiSpan.documentId == customEmoji.documentId))) {
                    return;
                }
                if (customEmoji == null) {
                    emojiImageView.span = null;
                    return;
                }
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                TLRPC$StickerSet tLRPC$StickerSet = customEmoji.stickerSet.set;
                tLRPC$TL_inputStickerSetID.f880id = tLRPC$StickerSet.f890id;
                tLRPC$TL_inputStickerSetID.short_name = tLRPC$StickerSet.short_name;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                emojiImageView.span = new AnimatedEmojiSpan(customEmoji.documentId, (Paint.FontMetricsInt) null);
            } else if (itemViewType == 2) {
                if (EmojiPacksAlert.this.hasDescription && i2 > 0) {
                    i2--;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < EmojiPacksAlert.this.customEmojiPacks.data.length) {
                    int size2 = EmojiPacksAlert.this.customEmojiPacks.data[i5].size();
                    if (EmojiPacksAlert.this.customEmojiPacks.data.length > 1) {
                        size2 = Math.min(EmojiPacksAlert.this.gridLayoutManager.getSpanCount() * 2, size2);
                    }
                    if (i2 == i6) {
                        break;
                    }
                    i6 += size2 + 1 + 1;
                    i5++;
                }
                if (EmojiPacksAlert.this.customEmojiPacks.stickerSets != null && i5 < EmojiPacksAlert.this.customEmojiPacks.stickerSets.size()) {
                    tLRPC$TL_messages_stickerSet = EmojiPacksAlert.this.customEmojiPacks.stickerSets.get(i5);
                }
                if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.documents != null) {
                    for (int i7 = 0; i7 < tLRPC$TL_messages_stickerSet.documents.size(); i7++) {
                        if (!MessageObject.isFreeEmoji(tLRPC$TL_messages_stickerSet.documents.get(i7))) {
                            break;
                        }
                    }
                }
                z = false;
                if (i5 < EmojiPacksAlert.this.customEmojiPacks.data.length) {
                    EmojiPackHeader emojiPackHeader = (EmojiPackHeader) viewHolder.itemView;
                    if (tLRPC$TL_messages_stickerSet != null && (arrayList = tLRPC$TL_messages_stickerSet.documents) != null) {
                        i3 = arrayList.size();
                    }
                    emojiPackHeader.set(tLRPC$TL_messages_stickerSet, i3, z);
                }
            } else {
                if (itemViewType != 3) {
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(EmojiPacksAlert.this.getThemedColor("chat_emojiPanelTrendingDescription"));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString("PremiumPreviewEmojiPack", C1072R.string.PremiumPreviewEmojiPack)));
                textView.setPadding(AndroidUtilities.m36dp(14.0f), 0, AndroidUtilities.m36dp(30.0f), AndroidUtilities.m36dp(14.0f));
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (EmojiPacksAlert.this.hasDescription) {
                if (i2 == 1) {
                    return 3;
                }
                if (i2 > 0) {
                    i2--;
                }
            }
            int i3 = 0;
            for (int i4 = 0; i4 < EmojiPacksAlert.this.customEmojiPacks.data.length; i4++) {
                if (i2 == i3) {
                    return 2;
                }
                int size = EmojiPacksAlert.this.customEmojiPacks.data[i4].size();
                if (EmojiPacksAlert.this.customEmojiPacks.data.length > 1) {
                    size = Math.min(EmojiPacksAlert.this.gridLayoutManager.getSpanCount() * 2, size);
                }
                int i5 = i3 + size + 1;
                if (i2 == i5) {
                    return 4;
                }
                i3 = i5 + 1;
            }
            return 1;
        }

        @Override
        public int getItemCount() {
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            emojiPacksAlert.hasDescription = !UserConfig.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isPremium() && EmojiPacksAlert.this.customEmojiPacks.stickerSets != null && EmojiPacksAlert.this.customEmojiPacks.stickerSets.size() == 1 && MessageObject.isPremiumEmojiPack(EmojiPacksAlert.this.customEmojiPacks.stickerSets.get(0));
            return (EmojiPacksAlert.this.hasDescription ? 1 : 0) + 1 + EmojiPacksAlert.this.customEmojiPacks.getItemsCount() + Math.max(0, EmojiPacksAlert.this.customEmojiPacks.data.length - 1);
        }
    }

    public void onSubItemClick(int i) {
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        String str;
        EmojiPacksLoader emojiPacksLoader = this.customEmojiPacks;
        if (emojiPacksLoader == null || (arrayList = emojiPacksLoader.stickerSets) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC$StickerSet tLRPC$StickerSet = this.customEmojiPacks.stickerSets.get(0).set;
        if (tLRPC$StickerSet != null && tLRPC$StickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addemoji/" + tLRPC$TL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addstickers/" + tLRPC$TL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i != 1) {
            if (i == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    BulletinFactory.m15of((FrameLayout) this.containerView, this.resourcesProvider).createCopyLinkBulletin().show();
                    return;
                } catch (Exception e) {
                    FileLog.m32e(e);
                    return;
                }
            }
            return;
        }
        BaseFragment baseFragment = this.fragment;
        Context parentActivity = baseFragment != null ? baseFragment.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = getContext();
        }
        DialogC22218 dialogC22218 = new DialogC22218(parentActivity, null, str2, false, str2, false, this.resourcesProvider);
        BaseFragment baseFragment2 = this.fragment;
        if (baseFragment2 != null) {
            baseFragment2.showDialog(dialogC22218);
        } else {
            dialogC22218.show();
        }
    }

    public class DialogC22218 extends ShareAlert {
        DialogC22218(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
        }

        @Override
        protected void onSend(final androidx.collection.LongSparseArray<TLRPC$Dialog> longSparseArray, final int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiPacksAlert.DialogC22218.this.lambda$onSend$0(longSparseArray, i);
                }
            }, 100L);
        }

        public void lambda$onSend$0(androidx.collection.LongSparseArray longSparseArray, int i) {
            UndoView undoView = EmojiPacksAlert.this.fragment instanceof ChatActivity ? ((ChatActivity) EmojiPacksAlert.this.fragment).getUndoView() : EmojiPacksAlert.this.fragment instanceof ProfileActivity ? ((ProfileActivity) EmojiPacksAlert.this.fragment).getUndoView() : null;
            if (undoView != null) {
                if (longSparseArray.size() == 1) {
                    undoView.showWithAction(((TLRPC$Dialog) longSparseArray.valueAt(0)).f863id, 53, Integer.valueOf(i));
                } else {
                    undoView.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }
    }

    public class EmojiImageView extends View {
        ValueAnimator backAnimator;
        public ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public ImageReceiver imageReceiver;
        private float pressedProgress;
        public AnimatedEmojiSpan span;

        public EmojiImageView(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            EmojiPacksAlert.EmojiImageView.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            EmojiImageView.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((BottomSheet) EmojiPacksAlert.this).containerView.invalidate();
        }

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f + 0.16f, 1.0f, 0.0f);
                    invalidate();
                }
            }
        }
    }

    public class EmojiPackHeader extends FrameLayout {
        public TextView addButtonView;
        private ValueAnimator animator;
        public BaseFragment dummyFragment;
        public ActionBarMenuItem optionsButton;
        public TextView removeButtonView;
        private TLRPC$TL_messages_stickerSet set;
        private boolean single;
        public TextView subtitleView;
        public LinkSpanDrawable.LinksTextView titleView;
        private float toggleT;
        private boolean toggled;
        public PremiumButtonView unlockButtonView;

        public EmojiPackHeader(Context context, boolean z) {
            super(context);
            float f;
            float f2;
            this.dummyFragment = new BaseFragment() {
                @Override
                public int getCurrentAccount() {
                    return this.currentAccount;
                }

                @Override
                public View getFragmentView() {
                    return ((BottomSheet) EmojiPacksAlert.this).containerView;
                }

                @Override
                public FrameLayout getLayoutContainer() {
                    return (FrameLayout) ((BottomSheet) EmojiPacksAlert.this).containerView;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return ((BottomSheet) EmojiPacksAlert.this).resourcesProvider;
                }
            };
            this.toggled = false;
            this.toggleT = 0.0f;
            this.single = z;
            if (z) {
                f = 32.0f;
            } else {
                if (UserConfig.getInstance(((BottomSheet) EmojiPacksAlert.this).currentAccount).isPremium()) {
                    f2 = 8.0f;
                } else {
                    PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.m36dp(4.0f), false);
                    this.unlockButtonView = premiumButtonView;
                    premiumButtonView.setButton(LocaleController.getString("Unlock", C1072R.string.Unlock), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EmojiPacksAlert.EmojiPackHeader.this.lambda$new$0(view);
                        }
                    });
                    this.unlockButtonView.setIcon(C1072R.raw.unlock_icon);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.unlockButtonView.getIconView().getLayoutParams();
                    marginLayoutParams.leftMargin = AndroidUtilities.m36dp(1.0f);
                    marginLayoutParams.topMargin = AndroidUtilities.m36dp(1.0f);
                    int m36dp = AndroidUtilities.m36dp(20.0f);
                    marginLayoutParams.height = m36dp;
                    marginLayoutParams.width = m36dp;
                    ((ViewGroup.MarginLayoutParams) this.unlockButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.m36dp(3.0f);
                    this.unlockButtonView.getChildAt(0).setPadding(AndroidUtilities.m36dp(8.0f), 0, AndroidUtilities.m36dp(8.0f), 0);
                    addView(this.unlockButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                    this.unlockButtonView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(28.0f), 1073741824));
                    f2 = (this.unlockButtonView.getMeasuredWidth() + AndroidUtilities.m36dp(16.0f)) / AndroidUtilities.density;
                }
                TextView textView = new TextView(context);
                this.addButtonView = textView;
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.addButtonView.setTextColor(EmojiPacksAlert.this.getThemedColor("featuredStickers_buttonText"));
                this.addButtonView.setBackground(Theme.AdaptiveRipple.filledRect(EmojiPacksAlert.this.getThemedColor("featuredStickers_addButton"), 4.0f));
                this.addButtonView.setText(LocaleController.getString("Add", C1072R.string.Add));
                this.addButtonView.setPadding(AndroidUtilities.m36dp(18.0f), 0, AndroidUtilities.m36dp(18.0f), 0);
                this.addButtonView.setGravity(17);
                this.addButtonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader.this.lambda$new$1(view);
                    }
                });
                addView(this.addButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                this.addButtonView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(28.0f), 1073741824));
                float max = Math.max(f2, (this.addButtonView.getMeasuredWidth() + AndroidUtilities.m36dp(16.0f)) / AndroidUtilities.density);
                TextView textView2 = new TextView(context);
                this.removeButtonView = textView2;
                textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.removeButtonView.setTextColor(EmojiPacksAlert.this.getThemedColor("featuredStickers_addButton"));
                this.removeButtonView.setBackground(Theme.createRadSelectorDrawable(268435455 & EmojiPacksAlert.this.getThemedColor("featuredStickers_addButton"), 4, 4));
                this.removeButtonView.setText(LocaleController.getString("StickersRemove", C1072R.string.StickersRemove));
                this.removeButtonView.setPadding(AndroidUtilities.m36dp(12.0f), 0, AndroidUtilities.m36dp(12.0f), 0);
                this.removeButtonView.setGravity(17);
                this.removeButtonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader.this.lambda$new$3(view);
                    }
                });
                this.removeButtonView.setClickable(false);
                addView(this.removeButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                this.removeButtonView.setScaleX(0.0f);
                this.removeButtonView.setScaleY(0.0f);
                this.removeButtonView.setAlpha(0.0f);
                this.removeButtonView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(28.0f), 1073741824));
                f = Math.max(max, (this.removeButtonView.getMeasuredWidth() + AndroidUtilities.m36dp(16.0f)) / AndroidUtilities.density);
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, ((BottomSheet) EmojiPacksAlert.this).resourcesProvider);
            this.titleView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.m36dp(2.0f), 0, AndroidUtilities.m36dp(2.0f), 0);
            this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            this.titleView.setSingleLine(true);
            this.titleView.setLines(1);
            this.titleView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText", ((BottomSheet) EmojiPacksAlert.this).resourcesProvider));
            this.titleView.setTextColor(EmojiPacksAlert.this.getThemedColor("dialogTextBlack"));
            if (z) {
                this.titleView.setTextSize(1, 20.0f);
                addView(this.titleView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f, 0.0f));
            } else {
                this.titleView.setTextSize(1, 17.0f);
                addView(this.titleView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f, 0.0f));
            }
            if (!z) {
                TextView textView3 = new TextView(context);
                this.subtitleView = textView3;
                textView3.setTextSize(1, 13.0f);
                this.subtitleView.setTextColor(EmojiPacksAlert.this.getThemedColor("dialogTextGray2"));
                this.subtitleView.setEllipsize(TextUtils.TruncateAt.END);
                this.subtitleView.setSingleLine(true);
                this.subtitleView.setLines(1);
                addView(this.subtitleView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f, 0.0f));
            }
            if (z) {
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, EmojiPacksAlert.this.getThemedColor("key_sheet_other"), ((BottomSheet) EmojiPacksAlert.this).resourcesProvider);
                this.optionsButton = actionBarMenuItem;
                actionBarMenuItem.setLongClickEnabled(false);
                this.optionsButton.setSubMenuOpenSide(2);
                this.optionsButton.setIcon(C1072R.C1073drawable.ic_ab_other);
                this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(EmojiPacksAlert.this.getThemedColor("player_actionBarSelector"), 1));
                addView(this.optionsButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (((BottomSheet) EmojiPacksAlert.this).backgroundPaddingLeft / AndroidUtilities.density), 0.0f));
                this.optionsButton.addSubItem(1, C1072R.C1073drawable.msg_share, LocaleController.getString("StickersShare", C1072R.string.StickersShare));
                this.optionsButton.addSubItem(2, C1072R.C1073drawable.msg_link, LocaleController.getString("CopyLink", C1072R.string.CopyLink));
                this.optionsButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader.this.lambda$new$4(view);
                    }
                });
                this.optionsButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                    @Override
                    public final void onItemClick(int i) {
                        EmojiPacksAlert.access$5500(EmojiPacksAlert.this, i);
                    }
                });
                this.optionsButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C1072R.string.AccDescrMoreOptions));
            }
        }

        public void lambda$new$0(View view) {
            EmojiPacksAlert.this.premiumButtonClicked = SystemClock.elapsedRealtime();
            EmojiPacksAlert.this.showPremiumAlert();
        }

        public void lambda$new$1(View view) {
            EmojiPacksAlert.installSet(this.dummyFragment, this.set, true);
            toggle(true, true);
        }

        public void lambda$new$3(View view) {
            EmojiPacksAlert.uninstallSet(this.dummyFragment, this.set, true, new Runnable() {
                @Override
                public final void run() {
                    EmojiPacksAlert.EmojiPackHeader.this.lambda$new$2();
                }
            });
            toggle(false, true);
        }

        public void lambda$new$2() {
            toggle(true, true);
        }

        public void lambda$new$4(View view) {
            this.optionsButton.toggleSubMenu();
        }

        public void toggle(boolean z, boolean z2) {
            if (this.toggled == z) {
                return;
            }
            this.toggled = z;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            TextView textView = this.addButtonView;
            if (textView == null || this.removeButtonView == null) {
                return;
            }
            textView.setClickable(!z);
            this.removeButtonView.setClickable(z);
            if (z2) {
                float[] fArr = new float[2];
                fArr[0] = this.toggleT;
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        EmojiPacksAlert.EmojiPackHeader.this.lambda$toggle$6(valueAnimator2);
                    }
                });
                this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.animator.setDuration(250L);
                this.animator.start();
                return;
            }
            this.toggleT = z ? 1.0f : 0.0f;
            this.addButtonView.setScaleX(z ? 0.0f : 1.0f);
            this.addButtonView.setScaleY(z ? 0.0f : 1.0f);
            this.addButtonView.setAlpha(z ? 0.0f : 1.0f);
            this.removeButtonView.setScaleX(z ? 1.0f : 0.0f);
            this.removeButtonView.setScaleY(z ? 1.0f : 0.0f);
            this.removeButtonView.setAlpha(z ? 1.0f : 0.0f);
        }

        public void lambda$toggle$6(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.toggleT = floatValue;
            this.addButtonView.setScaleX(1.0f - floatValue);
            this.addButtonView.setScaleY(1.0f - this.toggleT);
            this.addButtonView.setAlpha(1.0f - this.toggleT);
            this.removeButtonView.setScaleX(this.toggleT);
            this.removeButtonView.setScaleY(this.toggleT);
            this.removeButtonView.setAlpha(this.toggleT);
        }

        public void set(org.telegram.tgnet.TLRPC$TL_messages_stickerSet r10, int r11, boolean r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiPacksAlert.EmojiPackHeader.set(org.telegram.tgnet.TLRPC$TL_messages_stickerSet, int, boolean):void");
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(this.single ? 42.0f : 56.0f), 1073741824));
        }
    }

    public static class LinkMovementMethodMy extends LinkMovementMethod {
        private LinkMovementMethodMy() {
        }

        @Override
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            try {
                boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    Selection.removeSelection(spannable);
                }
                return onTouchEvent;
            } catch (Exception e) {
                FileLog.m32e(e);
                return false;
            }
        }
    }

    public class EmojiPacksLoader implements NotificationCenter.NotificationCenterDelegate {
        private int currentAccount;
        public ArrayList<EmojiView.CustomEmoji>[] data;
        public ArrayList<TLRPC$InputStickerSet> inputStickerSets;
        public ArrayList<TLRPC$TL_messages_stickerSet> stickerSets;

        protected void onUpdate() {
            throw null;
        }

        public EmojiPacksLoader(int i, ArrayList<TLRPC$InputStickerSet> arrayList) {
            this.currentAccount = i;
            this.inputStickerSets = arrayList == null ? new ArrayList<>() : arrayList;
            init();
        }

        private void init() {
            TLRPC$StickerSet tLRPC$StickerSet;
            this.stickerSets = new ArrayList<>(this.inputStickerSets.size());
            this.data = new ArrayList[this.inputStickerSets.size()];
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
            final boolean[] zArr = new boolean[1];
            for (int i = 0; i < this.data.length; i++) {
                TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(this.inputStickerSets.get(i), false, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        EmojiPacksAlert.EmojiPacksLoader.this.lambda$init$1(zArr, (TLRPC$TL_messages_stickerSet) obj);
                    }
                });
                if (this.data.length == 1 && stickerSet != null && (tLRPC$StickerSet = stickerSet.set) != null && !tLRPC$StickerSet.emojis) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            EmojiPacksAlert.EmojiPacksLoader.this.lambda$init$2();
                        }
                    });
                    new StickersAlert(EmojiPacksAlert.this.getContext(), EmojiPacksAlert.this.fragment, this.inputStickerSets.get(i), null, EmojiPacksAlert.this.fragment instanceof ChatActivity ? ((ChatActivity) EmojiPacksAlert.this.fragment).getChatActivityEnterView() : null, ((BottomSheet) EmojiPacksAlert.this).resourcesProvider).show();
                    return;
                }
                this.stickerSets.add(stickerSet);
                putStickerSet(i, stickerSet);
            }
        }

        public void lambda$init$1(boolean[] zArr, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            if (tLRPC$TL_messages_stickerSet != null || zArr[0]) {
                return;
            }
            zArr[0] = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiPacksAlert.EmojiPacksLoader.this.lambda$init$0();
                }
            });
        }

        public void lambda$init$0() {
            EmojiPacksAlert.this.dismiss();
            if (EmojiPacksAlert.this.fragment == null || EmojiPacksAlert.this.fragment.getParentActivity() == null) {
                return;
            }
            BulletinFactory.m14of(EmojiPacksAlert.this.fragment).createErrorBulletin(LocaleController.getString("AddEmojiNotFound", C1072R.string.AddEmojiNotFound)).show();
        }

        public void lambda$init$2() {
            EmojiPacksAlert.this.dismiss();
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC$StickerSet tLRPC$StickerSet;
            if (i == NotificationCenter.groupStickersDidLoad) {
                for (int i3 = 0; i3 < this.stickerSets.size(); i3++) {
                    if (this.stickerSets.get(i3) == null) {
                        TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(this.inputStickerSets.get(i3), true);
                        if (this.stickerSets.size() == 1 && stickerSet != null && (tLRPC$StickerSet = stickerSet.set) != null && !tLRPC$StickerSet.emojis) {
                            EmojiPacksAlert.this.dismiss();
                            new StickersAlert(EmojiPacksAlert.this.getContext(), EmojiPacksAlert.this.fragment, this.inputStickerSets.get(i3), null, EmojiPacksAlert.this.fragment instanceof ChatActivity ? ((ChatActivity) EmojiPacksAlert.this.fragment).getChatActivityEnterView() : null, ((BottomSheet) EmojiPacksAlert.this).resourcesProvider).show();
                            return;
                        }
                        this.stickerSets.set(i3, stickerSet);
                        if (stickerSet != null) {
                            putStickerSet(i3, stickerSet);
                        }
                    }
                }
                onUpdate();
            }
        }

        private void putStickerSet(int i, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            if (i >= 0) {
                ArrayList<EmojiView.CustomEmoji>[] arrayListArr = this.data;
                if (i >= arrayListArr.length) {
                    return;
                }
                int i2 = 0;
                if (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.documents == null) {
                    arrayListArr[i] = new ArrayList<>(12);
                    while (i2 < 12) {
                        this.data[i].add(null);
                        i2++;
                    }
                    return;
                }
                arrayListArr[i] = new ArrayList<>();
                while (i2 < tLRPC$TL_messages_stickerSet.documents.size()) {
                    TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i2);
                    if (tLRPC$Document == null) {
                        this.data[i].add(null);
                    } else {
                        EmojiView.CustomEmoji customEmoji = new EmojiView.CustomEmoji();
                        findEmoticon(tLRPC$TL_messages_stickerSet, tLRPC$Document.f865id);
                        customEmoji.stickerSet = tLRPC$TL_messages_stickerSet;
                        customEmoji.documentId = tLRPC$Document.f865id;
                        this.data[i].add(customEmoji);
                    }
                    i2++;
                }
            }
        }

        public void recycle() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }

        public int getItemsCount() {
            int min;
            int i = 0;
            if (this.data == null) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                ArrayList<EmojiView.CustomEmoji>[] arrayListArr = this.data;
                if (i >= arrayListArr.length) {
                    return i2;
                }
                if (arrayListArr[i] != null) {
                    if (arrayListArr.length != 1) {
                        min = Math.min(EmojiPacksAlert.this.gridLayoutManager.getSpanCount() * 2, this.data[i].size());
                    } else {
                        min = arrayListArr[i].size();
                    }
                    i2 = i2 + min + 1;
                }
                i++;
            }
        }

        public String findEmoticon(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, long j) {
            if (tLRPC$TL_messages_stickerSet == null) {
                return null;
            }
            for (int i = 0; i < tLRPC$TL_messages_stickerSet.packs.size(); i++) {
                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i);
                ArrayList<Long> arrayList = tLRPC$TL_stickerPack.documents;
                if (arrayList != null && arrayList.contains(Long.valueOf(j))) {
                    return tLRPC$TL_stickerPack.emoticon;
                }
            }
            return null;
        }
    }
}
