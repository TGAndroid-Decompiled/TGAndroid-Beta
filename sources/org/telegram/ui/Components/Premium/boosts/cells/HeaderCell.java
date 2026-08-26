package org.telegram.ui.Components.Premium.boosts.cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class HeaderCell extends FrameLayout {
    public ValueAnimator goldenAnimator;
    public final StarsReactionsSheet.AnonymousClass6 iconTextureView;
    public final LinkSpanDrawable.LinkCollector links;
    public final Paint[] paints;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass2 starParticlesView;
    public final LinkSpanDrawable.LinksTextView subtitleView;
    public final TextView titleView;

    public final class AnonymousClass3 extends ViewOutlineProvider {
        @Override
        public final void getOutline(View view, Outline outline) {
            float fDp = AndroidUtilities.dp(12.0f);
            outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + fDp), fDp);
        }
    }

    public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        StarsReactionsSheet.AnonymousClass6 anonymousClass6 = new StarsReactionsSheet.AnonymousClass6(context, 1, 0, 3);
        this.iconTextureView = anonymousClass6;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i = Theme.key_premiumGradient2;
        canvas.drawColor(ColorUtils.blendARGB(0.5f, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
        anonymousClass6.setBackgroundBitmap(bitmapCreateBitmap);
        GLIconRenderer gLIconRenderer = anonymousClass6.mRenderer;
        gLIconRenderer.colorKey1 = i;
        gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
        gLIconRenderer.updateColors();
        linearLayoutM.addView(anonymousClass6, LayoutHelper.createLinear(160, 160, 1));
        ?? r7 = new StarParticlesView(context) {
            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                setPaused(false);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                setPaused(true);
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
            }
        };
        this.starParticlesView = r7;
        this.paints = new Paint[20];
        updatePaints(0.0f);
        StarParticlesView.Drawable drawable = r7.drawable;
        drawable.useGradient = false;
        drawable.useBlur = false;
        drawable.forceMaxAlpha = true;
        drawable.checkBounds = true;
        drawable.getPaint = new WebActionBar$$ExternalSyntheticLambda9(this, 4);
        drawable.init();
        anonymousClass6.setStarParticlesView(r7);
        TextView textView = new TextView(context);
        this.titleView = textView;
        zzkh.m(22.0f, textView);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setGravity(1);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 24, -8, 24, 0));
        LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = linkCollector;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, linkCollector, resourcesProvider);
        this.subtitleView = linksTextView;
        linksTextView.setTextSize(1, 15.0f);
        linksTextView.setGravity(17);
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        linksTextView.setImportantForAccessibility(2);
        linearLayoutM.addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView((View) r7, LayoutHelper.createFrame(-1, 234, 48));
        addView(linearLayoutM);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            canvas.save();
            LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
            canvas.translate(linksTextView.getLeft(), linksTextView.getTop());
            if (linkCollector.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        StarsReactionsSheet.AnonymousClass6 anonymousClass6 = this.iconTextureView;
        float measuredHeight = (anonymousClass6.getMeasuredHeight() / 2.0f) + anonymousClass6.getTop();
        AnonymousClass2 anonymousClass2 = this.starParticlesView;
        anonymousClass2.setTranslationY(measuredHeight - (anonymousClass2.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new AnonymousClass3());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i = Theme.key_windowBackgroundGray;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        setBackgroundColor(Theme.getColor(i, resourcesProvider));
        this.titleView.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
        linksTextView.setText(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]));
        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider));
    }

    public void setPaused(boolean z) {
        this.iconTextureView.setPaused(z);
        setPaused(z);
    }

    public void setStars(final boolean z) {
        ValueAnimator valueAnimator = this.goldenAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        StarsReactionsSheet.AnonymousClass6 anonymousClass6 = this.iconTextureView;
        final float f = anonymousClass6.mRenderer.golden;
        final float f2 = z ? 1.0f : 0.0f;
        this.goldenAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(anonymousClass6.idleAnimation);
        anonymousClass6.cancelAnimatons();
        anonymousClass6.startBackAnimation();
        this.goldenAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                HeaderCell headerCell = this.f$0;
                headerCell.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f3 = fFloatValue - fArr2[0];
                fArr2[0] = fFloatValue;
                StarsReactionsSheet.AnonymousClass6 anonymousClass7 = headerCell.iconTextureView;
                anonymousClass7.mRenderer.golden = AndroidUtilities.lerp(f, f2, fFloatValue);
                GLIconRenderer gLIconRenderer = anonymousClass7.mRenderer;
                gLIconRenderer.angleX3 = (f3 * 360.0f * (z ? 1 : -1)) + gLIconRenderer.angleX3;
                gLIconRenderer.updateColors();
                headerCell.updatePaints(anonymousClass7.mRenderer.golden);
            }
        });
        this.goldenAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                float[] fArr2 = fArr;
                float f3 = 1.0f - fArr2[0];
                fArr2[0] = 1.0f;
                HeaderCell headerCell = HeaderCell.this;
                headerCell.iconTextureView.mRenderer.golden = AndroidUtilities.lerp(f, f2, 1.0f);
                GLIconRenderer gLIconRenderer = headerCell.iconTextureView.mRenderer;
                gLIconRenderer.angleX3 = (f3 * 360.0f * (z ? 1 : -1)) + gLIconRenderer.angleX3;
                gLIconRenderer.updateColors();
                headerCell.updatePaints(headerCell.iconTextureView.mRenderer.golden);
                headerCell.iconTextureView.scheduleIdleAnimation(750L);
            }
        });
        this.goldenAnimator.setDuration(680L);
        this.goldenAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.goldenAnimator.start();
    }

    public final void updatePaints(float f) {
        int i = Theme.key_premiumGradient1;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_premiumGradient2, resourcesProvider);
        int iBlendARGB = ColorUtils.blendARGB(f, color, -371690);
        int iBlendARGB2 = ColorUtils.blendARGB(f, color2, -14281);
        int i2 = 0;
        while (true) {
            Paint[] paintArr = this.paints;
            if (i2 >= paintArr.length) {
                return;
            }
            paintArr[i2] = new Paint(1);
            paintArr[i2].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(i2 / (paintArr.length - 1), iBlendARGB, iBlendARGB2), PorterDuff.Mode.SRC_IN));
            i2++;
        }
    }
}
