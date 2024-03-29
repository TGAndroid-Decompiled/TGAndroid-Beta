package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
@SuppressLint({"ViewConstructor"})
public class HeaderCell extends FrameLayout {
    private final GLIconTextureView iconTextureView;
    private final LinearLayout linearLayout;
    private LinkSpanDrawable.LinkCollector links;
    private final Theme.ResourcesProvider resourcesProvider;
    private final StarParticlesView starParticlesView;
    private final LinkSpanDrawable.LinksTextView subtitleView;
    private final TextView titleView;

    public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(this, context, 1) {
            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                setPaused(false);
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                setPaused(true);
            }
        };
        this.iconTextureView = gLIconTextureView;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = Theme.key_premiumGradient2;
        canvas.drawColor(ColorUtils.blendARGB(Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_dialogBackground, resourcesProvider), 0.5f));
        gLIconTextureView.setBackgroundBitmap(createBitmap);
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = i;
        gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
        gLIconRenderer.updateColors();
        linearLayout.addView(gLIconTextureView, LayoutHelper.createLinear(160, 160, 1));
        StarParticlesView starParticlesView = new StarParticlesView(context) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                HeaderCell.this.starParticlesView.setPaused(false);
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                HeaderCell.this.starParticlesView.setPaused(true);
            }
        };
        this.starParticlesView = starParticlesView;
        StarParticlesView.Drawable drawable = starParticlesView.drawable;
        drawable.useGradient = true;
        drawable.useBlur = false;
        drawable.forceMaxAlpha = true;
        drawable.checkBounds = true;
        drawable.init();
        gLIconTextureView.setStarParticlesView(starParticlesView);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setTextSize(1, 22.0f);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 24, -8, 24, 0));
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
        linearLayout.addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(starParticlesView, LayoutHelper.createFrame(-1, 234, 48));
        addView(linearLayout);
        setWillNotDraw(false);
    }

    public void setBoostViaGifsText(TLRPC$Chat tLRPC$Chat) {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                public void getOutline(View view, Outline outline) {
                    float dp = AndroidUtilities.dp(12.0f);
                    outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + dp), dp);
                }
            });
            setClipToOutline(true);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        this.titleView.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        this.subtitleView.setText(LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat) ? R.string.BoostingGetMoreBoost : R.string.BoostingGetMoreBoostGroup, new Object[0]));
        this.subtitleView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
    }

    public void setUsedGiftLinkText() {
        this.titleView.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
        this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
    }

    public void setGiftLinkText() {
        this.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
        this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
    }

    public void setUnclaimedText() {
        this.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
        this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
    }

    public void setGiftLinkToUserText(long j, final Utilities.Callback<TLObject> callback) {
        this.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingLinkAllowsToUser", R.string.BoostingLinkAllowsToUser));
        final TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
        this.subtitleView.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", Theme.key_chat_messageLinkIn, 2, new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback.this.run(user);
            }
        }, this.resourcesProvider)));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float top = this.iconTextureView.getTop() + (this.iconTextureView.getMeasuredHeight() / 2.0f);
        StarParticlesView starParticlesView = this.starParticlesView;
        starParticlesView.setTranslationY(top - (starParticlesView.getMeasuredHeight() / 2.0f));
    }

    public void setPaused(boolean z) {
        this.iconTextureView.setPaused(z);
        this.starParticlesView.setPaused(z);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.links != null) {
            canvas.save();
            canvas.translate(this.subtitleView.getLeft(), this.subtitleView.getTop());
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }
}
