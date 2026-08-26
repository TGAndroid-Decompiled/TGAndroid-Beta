package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;

public class SponsoredMessageInfoView extends FrameLayout {
    LinearLayout linearLayout;

    public SponsoredMessageInfoView(final Context context, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        final int i = 1;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        final int i3 = 0;
        linksTextView.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final SponsoredMessageInfoView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$0(runnable, clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(runnable, clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(runnable, clickableSpan);
                        break;
                }
            }
        });
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), resourcesProvider));
        linksTextView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView2.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final SponsoredMessageInfoView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0(runnable, clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(runnable, clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(runnable, clickableSpan);
                        break;
                }
            }
        });
        LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), resourcesProvider));
        linksTextView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView3.setTextSize(1, 14.0f);
        linksTextView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        final int i4 = 2;
        linksTextView3.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final SponsoredMessageInfoView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$0(runnable, clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(runnable, clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(runnable, clickableSpan);
                        break;
                }
            }
        });
        final Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        int i5 = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i5, resourcesProvider));
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        TextView textView2 = new TextView(context) {
            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        };
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                Browser.openUrl(context, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
            }
        });
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
        textView2.setTextColor(Theme.getColor(i5, resourcesProvider));
        int color = Theme.getColor(Theme.key_dialogBackground, resourcesProvider);
        textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{4.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(16);
        LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), resourcesProvider));
        linksTextView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView4.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView4.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayoutM.addView(textView);
        linksTextView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0, 0, 18, 0, 0));
        linksTextView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayoutM.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
        linksTextView3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayoutM.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, 34, 1, 22, 14, 22, 0));
        linksTextView4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayoutM.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 0, 0, 14, 0, 0));
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayoutM);
        addView(scrollView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
    }

    public void lambda$new$0(Runnable runnable, ClickableSpan clickableSpan) {
        if (runnable != null) {
            runnable.run();
        }
        clickableSpan.onClick(this);
    }

    public void lambda$new$1(Runnable runnable, ClickableSpan clickableSpan) {
        if (runnable != null) {
            runnable.run();
        }
        clickableSpan.onClick(this);
    }

    public void lambda$new$2(Runnable runnable, ClickableSpan clickableSpan) {
        if (runnable != null) {
            runnable.run();
        }
        clickableSpan.onClick(this);
    }
}
