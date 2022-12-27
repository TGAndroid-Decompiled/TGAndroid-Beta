package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.TLRPC$Document;

public class SuggestEmojiView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private Integer arrowToEnd;
    private Emoji.EmojiSpan arrowToSpan;
    private Integer arrowToStart;
    private float arrowX;
    private AnimatedFloat arrowXAnimated;
    private Paint backgroundPaint;
    private Path circlePath;
    private boolean clear;
    private final FrameLayout containerView;
    private final int currentAccount;
    private final ChatActivityEnterView enterView;
    private boolean forceClose;
    private ArrayList<MediaDataController.KeywordResult> keywordResults;
    private String[] lastLang;
    private String lastQuery;
    private int lastQueryId;
    private int lastQueryType;
    private float lastSpanY;
    private final LinearLayoutManager layout;
    private AnimatedFloat leftGradientAlpha;
    private final RecyclerListView listView;
    private AnimatedFloat listViewCenterAnimated;
    private AnimatedFloat listViewWidthAnimated;
    private Path path;
    private final Theme.ResourcesProvider resourcesProvider;
    private AnimatedFloat rightGradientAlpha;
    private Runnable searchRunnable;
    private boolean show;
    private AnimatedFloat showFloat1;
    private AnimatedFloat showFloat2;
    private Runnable updateRunnable;

    public SuggestEmojiView(Context context, int i, final ChatActivityEnterView chatActivityEnterView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                SuggestEmojiView.this.drawContainerBegin(canvas);
                super.dispatchDraw(canvas);
                SuggestEmojiView.this.drawContainerEnd(canvas);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                setPadding(AndroidUtilities.m36dp(10.0f), AndroidUtilities.m36dp(8.0f), AndroidUtilities.m36dp(10.0f), AndroidUtilities.m36dp(6.66f));
                super.onMeasure(i2, i3);
            }

            @Override
            public void setVisibility(int i2) {
                boolean z = getVisibility() == i2;
                super.setVisibility(i2);
                if (z) {
                    return;
                }
                boolean z2 = i2 == 0;
                for (int i3 = 0; i3 < SuggestEmojiView.this.listView.getChildCount(); i3++) {
                    if (z2) {
                        ((Adapter.EmojiImageView) SuggestEmojiView.this.listView.getChildAt(i3)).attach();
                    } else {
                        ((Adapter.EmojiImageView) SuggestEmojiView.this.listView.getChildAt(i3)).detach();
                    }
                }
            }
        };
        this.containerView = frameLayout;
        this.keywordResults = new ArrayList<>();
        this.path = new Path();
        this.circlePath = new Path();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.showFloat1 = new AnimatedFloat(frameLayout, 120L, 350L, cubicBezierInterpolator);
        this.showFloat2 = new AnimatedFloat(frameLayout, 150L, 600L, cubicBezierInterpolator);
        new OvershootInterpolator(0.4f);
        this.leftGradientAlpha = new AnimatedFloat(frameLayout, 300L, cubicBezierInterpolator);
        this.rightGradientAlpha = new AnimatedFloat(frameLayout, 300L, cubicBezierInterpolator);
        this.arrowXAnimated = new AnimatedFloat(frameLayout, 200L, cubicBezierInterpolator);
        this.listViewCenterAnimated = new AnimatedFloat(frameLayout, 350L, cubicBezierInterpolator);
        this.listViewWidthAnimated = new AnimatedFloat(frameLayout, 350L, cubicBezierInterpolator);
        this.currentAccount = i;
        this.enterView = chatActivityEnterView;
        this.resourcesProvider = resourcesProvider;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            private boolean left;
            private boolean right;

            @Override
            public void onScrolled(int i2, int i3) {
                super.onScrolled(i2, i3);
                boolean canScrollHorizontally = canScrollHorizontally(-1);
                boolean canScrollHorizontally2 = canScrollHorizontally(1);
                if (this.left == canScrollHorizontally && this.right == canScrollHorizontally2) {
                    return;
                }
                SuggestEmojiView.this.containerView.invalidate();
                this.left = canScrollHorizontally;
                this.right = canScrollHorizontally2;
            }
        };
        this.listView = recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layout = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        recyclerListView.setLayoutManager(linearLayoutManager);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(45L);
        defaultItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        recyclerListView.setItemAnimator(defaultItemAnimator);
        recyclerListView.setSelectorDrawableColor(Theme.getColor("listSelectorSDK21", resourcesProvider));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                SuggestEmojiView.this.lambda$new$0(view, i2);
            }
        });
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 52.0f));
        addView(frameLayout, LayoutHelper.createFrame(-1.0f, 66.66f, 80));
        chatActivityEnterView.getEditField().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (chatActivityEnterView.getVisibility() == 0) {
                    SuggestEmojiView.this.fireUpdate();
                }
            }
        });
        MediaDataController.getInstance(i).checkStickers(5);
    }

    public void lambda$new$0(View view, int i) {
        onClick(((Adapter.EmojiImageView) view).emoji);
    }

    public void onTextSelectionChanged(int i, int i2) {
        fireUpdate();
    }

    @Override
    public boolean isShown() {
        return this.show;
    }

    public void updateColors() {
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            paint.setColor(Theme.getColor("chat_stickersHintPanel", this.resourcesProvider));
        }
        Theme.chat_gradientLeftDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_stickersHintPanel", this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        Theme.chat_gradientRightDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_stickersHintPanel", this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
    }

    public void forceClose() {
        Runnable runnable = this.updateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRunnable = null;
        }
        this.show = false;
        this.forceClose = true;
        this.containerView.invalidate();
    }

    public void fireUpdate() {
        Runnable runnable = this.updateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRunnable = null;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                SuggestEmojiView.this.update();
            }
        };
        this.updateRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 16L);
    }

    public void update() {
        this.updateRunnable = null;
        ChatActivityEnterView chatActivityEnterView = this.enterView;
        if (chatActivityEnterView == null || chatActivityEnterView.getEditField() == null || this.enterView.getFieldText() == null) {
            this.show = false;
            this.forceClose = true;
            this.containerView.invalidate();
            return;
        }
        int selectionStart = this.enterView.getEditField().getSelectionStart();
        int selectionEnd = this.enterView.getEditField().getSelectionEnd();
        if (selectionStart != selectionEnd) {
            this.show = false;
            this.containerView.invalidate();
            return;
        }
        CharSequence fieldText = this.enterView.getFieldText();
        boolean z = fieldText instanceof Spanned;
        Emoji.EmojiSpan[] emojiSpanArr = z ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
        if (emojiSpanArr != null && emojiSpanArr.length > 0 && SharedConfig.suggestAnimatedEmoji) {
            Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
            if (emojiSpan != null) {
                Spanned spanned = (Spanned) fieldText;
                int spanStart = spanned.getSpanStart(emojiSpan);
                int spanEnd = spanned.getSpanEnd(emojiSpan);
                if (selectionStart == spanEnd) {
                    String substring = fieldText.toString().substring(spanStart, spanEnd);
                    this.show = true;
                    this.arrowToSpan = emojiSpan;
                    this.arrowToEnd = null;
                    this.arrowToStart = null;
                    searchAnimated(substring);
                    this.containerView.invalidate();
                    return;
                }
            }
        } else {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = z ? (AnimatedEmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, AnimatedEmojiSpan.class) : null;
            if ((animatedEmojiSpanArr == null || animatedEmojiSpanArr.length == 0) && selectionEnd < 52) {
                this.show = true;
                this.arrowToSpan = null;
                searchKeywords(fieldText.toString().substring(0, selectionEnd));
                this.containerView.invalidate();
                return;
            }
        }
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable = null;
        }
        this.show = false;
        this.containerView.invalidate();
    }

    private void searchKeywords(final String str) {
        if (str == null) {
            return;
        }
        String str2 = this.lastQuery;
        if (str2 != null && this.lastQueryType == 1 && str2.equals(str) && !this.clear && !this.keywordResults.isEmpty()) {
            this.forceClose = false;
            this.containerView.setVisibility(0);
            this.lastSpanY = AndroidUtilities.m36dp(10.0f);
            this.containerView.invalidate();
            return;
        }
        final int i = this.lastQueryId + 1;
        this.lastQueryId = i;
        final String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        String[] strArr = this.lastLang;
        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
            MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
        }
        this.lastLang = currentKeyboardLanguage;
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable = null;
        }
        this.searchRunnable = new Runnable() {
            @Override
            public final void run() {
                SuggestEmojiView.this.lambda$searchKeywords$2(currentKeyboardLanguage, str, i);
            }
        };
        if (this.keywordResults.isEmpty()) {
            AndroidUtilities.runOnUIThread(this.searchRunnable, 600L);
        } else {
            this.searchRunnable.run();
        }
    }

    public void lambda$searchKeywords$2(String[] strArr, final String str, final int i) {
        MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(strArr, str, true, new MediaDataController.KeywordResultCallback() {
            @Override
            public final void run(ArrayList arrayList, String str2) {
                SuggestEmojiView.this.lambda$searchKeywords$1(i, str, arrayList, str2);
            }
        }, true);
    }

    public void lambda$searchKeywords$1(int i, String str, ArrayList arrayList, String str2) {
        if (i == this.lastQueryId) {
            this.lastQueryType = 1;
            this.lastQuery = str;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.clear = false;
                this.forceClose = false;
                this.containerView.setVisibility(0);
                this.lastSpanY = AndroidUtilities.m36dp(10.0f);
                this.keywordResults = arrayList;
                this.arrowToStart = 0;
                this.arrowToEnd = Integer.valueOf(str.length());
                this.containerView.invalidate();
                this.adapter.notifyDataSetChanged();
                return;
            }
            this.clear = true;
            forceClose();
        }
    }

    private void searchAnimated(final String str) {
        if (str == null) {
            return;
        }
        String str2 = this.lastQuery;
        if (str2 != null && this.lastQueryType == 2 && str2.equals(str) && !this.clear && !this.keywordResults.isEmpty()) {
            this.forceClose = false;
            this.containerView.setVisibility(0);
            this.containerView.invalidate();
            return;
        }
        final int i = this.lastQueryId + 1;
        this.lastQueryId = i;
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable = null;
        }
        this.searchRunnable = new Runnable() {
            @Override
            public final void run() {
                SuggestEmojiView.this.lambda$searchAnimated$4(str, i);
            }
        };
        if (this.keywordResults.isEmpty()) {
            AndroidUtilities.runOnUIThread(this.searchRunnable, 600L);
        } else {
            this.searchRunnable.run();
        }
    }

    public void lambda$searchAnimated$4(final String str, final int i) {
        final ArrayList<MediaDataController.KeywordResult> arrayList = new ArrayList<>(1);
        arrayList.add(new MediaDataController.KeywordResult(str, null));
        MediaDataController.getInstance(this.currentAccount).fillWithAnimatedEmoji(arrayList, 15, false, new Runnable() {
            @Override
            public final void run() {
                SuggestEmojiView.this.lambda$searchAnimated$3(i, str, arrayList);
            }
        });
    }

    public void lambda$searchAnimated$3(int i, String str, ArrayList arrayList) {
        if (i == this.lastQueryId) {
            this.lastQuery = str;
            this.lastQueryType = 2;
            arrayList.remove(arrayList.size() - 1);
            if (!arrayList.isEmpty()) {
                this.clear = false;
                this.forceClose = false;
                this.containerView.setVisibility(0);
                this.keywordResults = arrayList;
                this.adapter.notifyDataSetChanged();
                this.containerView.invalidate();
                return;
            }
            this.clear = true;
            forceClose();
        }
    }

    private CharSequence makeEmoji(String str) {
        AnimatedEmojiSpan animatedEmojiSpan;
        Paint.FontMetricsInt fontMetricsInt = this.enterView.getEditField().getPaint().getFontMetricsInt();
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                TLRPC$Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, parseLong);
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(findDocument));
                if (findDocument == null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(parseLong, fontMetricsInt);
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(findDocument, fontMetricsInt);
                }
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                return spannableString;
            } catch (Exception unused) {
                return null;
            }
        }
        return Emoji.replaceEmoji(str, fontMetricsInt, AndroidUtilities.m36dp(20.0f), true);
    }

    private void onClick(String str) {
        ChatActivityEnterView chatActivityEnterView;
        int intValue;
        int intValue2;
        CharSequence makeEmoji;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        if (this.show && (chatActivityEnterView = this.enterView) != null && (chatActivityEnterView.getFieldText() instanceof Spanned)) {
            if (this.arrowToSpan != null) {
                intValue = ((Spanned) this.enterView.getFieldText()).getSpanStart(this.arrowToSpan);
                intValue2 = ((Spanned) this.enterView.getFieldText()).getSpanEnd(this.arrowToSpan);
            } else {
                Integer num = this.arrowToStart;
                if (num == null || this.arrowToEnd == null) {
                    return;
                }
                intValue = num.intValue();
                intValue2 = this.arrowToEnd.intValue();
                this.arrowToEnd = null;
                this.arrowToStart = null;
            }
            Editable text = this.enterView.getEditField().getText();
            if (text == null || intValue < 0 || intValue2 < 0 || intValue > text.length() || intValue2 > text.length()) {
                return;
            }
            if (this.arrowToSpan != null) {
                if (this.enterView.getFieldText() instanceof Spannable) {
                    ((Spannable) this.enterView.getFieldText()).removeSpan(this.arrowToSpan);
                }
                this.arrowToSpan = null;
            }
            String obj = text.toString();
            String substring = obj.substring(intValue, intValue2);
            int length = substring.length();
            while (true) {
                intValue2 -= length;
                if (intValue2 < 0) {
                    break;
                }
                int i = intValue2 + length;
                if (!obj.substring(intValue2, i).equals(substring) || (makeEmoji = makeEmoji(str)) == null || ((animatedEmojiSpanArr = (AnimatedEmojiSpan[]) text.getSpans(intValue2, i, AnimatedEmojiSpan.class)) != null && animatedEmojiSpanArr.length > 0)) {
                    break;
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(intValue2, i, Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        text.removeSpan(emojiSpan);
                    }
                }
                text.replace(intValue2, i, makeEmoji);
            }
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            Emoji.addRecentEmoji(str);
            this.show = false;
            this.forceClose = true;
            this.lastQueryType = 0;
            this.containerView.invalidate();
        }
    }

    public void drawContainerBegin(Canvas canvas) {
        Canvas canvas2 = canvas;
        ChatActivityEnterView chatActivityEnterView = this.enterView;
        if (chatActivityEnterView != null && chatActivityEnterView.getEditField() != null) {
            Emoji.EmojiSpan emojiSpan = this.arrowToSpan;
            if (emojiSpan != null && emojiSpan.drawn) {
                float x = this.enterView.getEditField().getX() + this.enterView.getEditField().getPaddingLeft();
                Emoji.EmojiSpan emojiSpan2 = this.arrowToSpan;
                this.arrowX = x + emojiSpan2.lastDrawX;
                this.lastSpanY = emojiSpan2.lastDrawY;
            } else if (this.arrowToStart != null && this.arrowToEnd != null) {
                this.arrowX = this.enterView.getEditField().getX() + this.enterView.getEditField().getPaddingLeft() + AndroidUtilities.m36dp(12.0f);
            }
        }
        boolean z = (!this.show || this.forceClose || this.keywordResults.isEmpty() || this.clear) ? false : true;
        float f = this.showFloat1.set(z ? 1.0f : 0.0f);
        float f2 = this.showFloat2.set(z ? 1.0f : 0.0f);
        float f3 = this.arrowXAnimated.set(this.arrowX);
        if (f <= 0.0f && f2 <= 0.0f && !z) {
            this.containerView.setVisibility(8);
        }
        this.path.rewind();
        float left = this.listView.getLeft();
        float left2 = this.listView.getLeft() + (this.keywordResults.size() * AndroidUtilities.m36dp(44.0f));
        boolean z2 = this.listViewWidthAnimated.get() <= 0.0f;
        float f4 = left2 - left;
        float f5 = f4 <= 0.0f ? this.listViewWidthAnimated.get() : this.listViewWidthAnimated.set(f4, z2);
        float f6 = this.listViewCenterAnimated.set((left + left2) / 2.0f, z2);
        ChatActivityEnterView chatActivityEnterView2 = this.enterView;
        if (chatActivityEnterView2 != null && chatActivityEnterView2.getEditField() != null) {
            this.containerView.setTranslationY(((-this.enterView.getEditField().getHeight()) - this.enterView.getEditField().getScrollY()) + this.lastSpanY + AndroidUtilities.m36dp(5.0f));
        }
        float f7 = f5 / 4.0f;
        float f8 = f5 / 2.0f;
        int max = (int) Math.max((this.arrowX - Math.max(f7, Math.min(f8, AndroidUtilities.m36dp(66.0f)))) - this.listView.getLeft(), 0.0f);
        if (this.listView.getPaddingLeft() != max) {
            this.listView.setPadding(max, 0, 0, 0);
            this.listView.scrollBy(this.listView.getPaddingLeft() - max, 0);
        }
        this.listView.setTranslationX(((int) Math.max((f3 - Math.max(f7, Math.min(f8, AndroidUtilities.m36dp(66.0f)))) - this.listView.getLeft(), 0.0f)) - max);
        float paddingLeft = (f6 - f8) + this.listView.getPaddingLeft() + this.listView.getTranslationX();
        float top = this.listView.getTop() + this.listView.getTranslationY() + this.listView.getPaddingTop();
        float min = Math.min(f6 + f8 + this.listView.getPaddingLeft() + this.listView.getTranslationX(), getWidth() - this.containerView.getPaddingRight());
        float bottom = (this.listView.getBottom() + this.listView.getTranslationY()) - AndroidUtilities.m36dp(6.66f);
        float min2 = Math.min(AndroidUtilities.m36dp(9.0f), f8) * 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f9 = bottom - min2;
        float f10 = paddingLeft + min2;
        rectF.set(paddingLeft, f9, f10, bottom);
        this.path.arcTo(rectF, 90.0f, 90.0f);
        float f11 = top + min2;
        rectF.set(paddingLeft, top, f10, f11);
        this.path.arcTo(rectF, -180.0f, 90.0f);
        float f12 = min - min2;
        rectF.set(f12, top, min, f11);
        this.path.arcTo(rectF, -90.0f, 90.0f);
        rectF.set(f12, f9, min, bottom);
        this.path.arcTo(rectF, 0.0f, 90.0f);
        this.path.lineTo(AndroidUtilities.m36dp(8.66f) + f3, bottom);
        this.path.lineTo(f3, AndroidUtilities.m36dp(6.66f) + bottom);
        this.path.lineTo(f3 - AndroidUtilities.m36dp(8.66f), bottom);
        this.path.close();
        if (this.backgroundPaint == null) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.m36dp(2.0f)));
            this.backgroundPaint.setShadowLayer(AndroidUtilities.m36dp(4.33f), 0.0f, AndroidUtilities.m36dp(0.33333334f), AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
            this.backgroundPaint.setColor(Theme.getColor("chat_stickersHintPanel", this.resourcesProvider));
        }
        if (f < 1.0f) {
            this.circlePath.rewind();
            float m36dp = AndroidUtilities.m36dp(6.66f) + bottom;
            double d = f3 - paddingLeft;
            double d2 = m36dp - top;
            double d3 = f3 - min;
            double d4 = m36dp - bottom;
            this.circlePath.addCircle(f3, m36dp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d, 2.0d) + Math.pow(d2, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d, 2.0d) + Math.pow(d4, 2.0d), Math.pow(d3, 2.0d) + Math.pow(d4, 2.0d))))) * f, Path.Direction.CW);
            canvas.save();
            canvas2 = canvas;
            canvas2.clipPath(this.circlePath);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
        }
        canvas2.drawPath(this.path, this.backgroundPaint);
        canvas.save();
        canvas2.clipPath(this.path);
    }

    public void drawContainerEnd(Canvas canvas) {
        float f = this.listViewWidthAnimated.get();
        float f2 = this.listViewCenterAnimated.get();
        float f3 = f / 2.0f;
        float paddingLeft = (f2 - f3) + this.listView.getPaddingLeft() + this.listView.getTranslationX();
        float top = this.listView.getTop() + this.listView.getPaddingTop();
        float min = Math.min(f2 + f3 + this.listView.getPaddingLeft() + this.listView.getTranslationX(), getWidth() - this.containerView.getPaddingRight());
        float bottom = this.listView.getBottom();
        float f4 = this.leftGradientAlpha.set(this.listView.canScrollHorizontally(-1) ? 1.0f : 0.0f);
        if (f4 > 0.0f) {
            int i = (int) paddingLeft;
            Theme.chat_gradientRightDrawable.setBounds(i, (int) top, AndroidUtilities.m36dp(32.0f) + i, (int) bottom);
            Theme.chat_gradientRightDrawable.setAlpha((int) (f4 * 255.0f));
            Theme.chat_gradientRightDrawable.draw(canvas);
        }
        float f5 = this.rightGradientAlpha.set(this.listView.canScrollHorizontally(1) ? 1.0f : 0.0f);
        if (f5 > 0.0f) {
            int i2 = (int) min;
            Theme.chat_gradientLeftDrawable.setBounds(i2 - AndroidUtilities.m36dp(32.0f), (int) top, i2, (int) bottom);
            Theme.chat_gradientLeftDrawable.setAlpha((int) (f5 * 255.0f));
            Theme.chat_gradientLeftDrawable.draw(canvas);
        }
        canvas.restore();
        if (this.showFloat1.get() < 1.0f) {
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f = this.listViewWidthAnimated.get();
        float f2 = this.listViewCenterAnimated.get();
        RectF rectF = AndroidUtilities.rectTmp;
        float f3 = f / 2.0f;
        rectF.set((f2 - f3) + this.listView.getPaddingLeft() + this.listView.getTranslationX(), this.listView.getTop() + this.listView.getPaddingTop(), Math.min(f2 + f3 + this.listView.getPaddingLeft() + this.listView.getTranslationX(), getWidth() - this.containerView.getPaddingRight()), this.listView.getBottom());
        rectF.offset(this.containerView.getX(), this.containerView.getY());
        if (this.show && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newEmojiSuggestionsAvailable) {
            if (this.keywordResults.isEmpty()) {
                return;
            }
            fireUpdate();
        } else if (i == NotificationCenter.emojiLoaded) {
            for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                this.listView.getChildAt(i3).invalidate();
            }
        }
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public class EmojiImageView extends View {
            private boolean attached;
            private Drawable drawable;
            private String emoji;
            private AnimatedFloat pressed;

            public EmojiImageView(Context context) {
                super(context);
                this.pressed = new AnimatedFloat(this, 350L, new OvershootInterpolator(5.0f));
            }

            @Override
            protected void onMeasure(int i, int i2) {
                setPadding(AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(9.66f));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(52.0f), 1073741824));
            }

            public void setEmoji(String str) {
                this.emoji = str;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        long parseLong = Long.parseLong(str.substring(9));
                        Drawable drawable = this.drawable;
                        if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).getDocumentId() == parseLong) {
                            return;
                        }
                        setImageDrawable(AnimatedEmojiDrawable.make(SuggestEmojiView.this.currentAccount, 2, parseLong));
                        return;
                    } catch (Exception unused) {
                        setImageDrawable(null);
                        return;
                    }
                }
                setImageDrawable(Emoji.getEmojiBigDrawable(str));
            }

            public void setImageDrawable(Drawable drawable) {
                Drawable drawable2 = this.drawable;
                if (drawable2 instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(this);
                }
                this.drawable = drawable;
                if ((drawable instanceof AnimatedEmojiDrawable) && this.attached) {
                    ((AnimatedEmojiDrawable) drawable).addView(this);
                }
            }

            @Override
            public void setPressed(boolean z) {
                super.setPressed(z);
                invalidate();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f = ((1.0f - this.pressed.set(isPressed() ? 1.0f : 0.0f)) * 0.2f) + 0.8f;
                if (this.drawable != null) {
                    this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    canvas.scale(f, f, getWidth() / 2, ((getHeight() - getPaddingBottom()) + getPaddingTop()) / 2);
                    Drawable drawable = this.drawable;
                    if (drawable instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawable).setTime(System.currentTimeMillis());
                    }
                    this.drawable.draw(canvas);
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                attach();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                detach();
            }

            public void detach() {
                Drawable drawable = this.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this);
                }
                this.attached = false;
            }

            public void attach() {
                Drawable drawable = this.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).addView(this);
                }
                this.attached = true;
            }
        }

        public Adapter() {
        }

        @Override
        public long getItemId(int i) {
            return ((MediaDataController.KeywordResult) SuggestEmojiView.this.keywordResults.get(i)).emoji.hashCode();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new EmojiImageView(SuggestEmojiView.this.getContext()));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ((EmojiImageView) viewHolder.itemView).setEmoji(((MediaDataController.KeywordResult) SuggestEmojiView.this.keywordResults.get(i)).emoji);
        }

        @Override
        public int getItemCount() {
            return SuggestEmojiView.this.keywordResults.size();
        }
    }
}
