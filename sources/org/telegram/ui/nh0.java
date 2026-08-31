package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nh0 extends FrameLayout {
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.Components.a21 G;
    public final qh0 H;
    public int f39448a;
    public final LinearLayout f39449b;
    public final TextView f39450c;
    public final TextView d;
    public final LinearLayout f39451e;
    public final TextView f39452f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f39453n;
    public int f39454r;
    public final Paint f39455s;
    public final Paint v;
    public final RectF f39456w;
    public final ImageView f39457x;
    public int f39458y;

    public nh0(qh0 qh0Var, Context context) {
        super(context);
        this.H = qh0Var;
        this.f39455s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f39456w = new RectF();
        this.B = 1.0f;
        this.G = new org.telegram.ui.Components.a21();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39449b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39450c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f22036y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        linearLayout.addView(textView2, k7.c6.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f39457x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Uh, false));
        imageView.setOnClickListener(new f60(this, 9));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 1, -1));
        addView(imageView, k7.c6.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39451e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f39452f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, k7.c6.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        yh.t(i11, null, false, textView4, 5);
        linearLayout2.addView(textView4, k7.c6.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39453n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.uj, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21789ka, false);
        }
        if (i10 == 1) {
            if (f10 > 0.5f) {
                return i0.a.d(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21843na, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.oa, false));
            }
            return i0.a.d(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.oa, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21789ka, false));
        } else if (i10 == 2) {
            return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.oa, false);
        } else {
            if (i10 == 4) {
                return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.V8, false);
            }
            return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        this.F = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f39453n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f39448a = -1;
            this.B = 1.0f;
        }
        this.f39453n = tL_chatInviteExported;
        this.f39454r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int dp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f39457x;
        LinearLayout linearLayout = this.f39451e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder X0 = mh.ja.X0(false, l.d.l(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f39452f;
            textView.setText(X0);
            int i16 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i16 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i16 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i16 == 60) {
                textView2.setText("each minute");
            }
            dp = AndroidUtilities.dp(28.0f) + ((int) Math.max(qh.f3.g(textView.getText(), textView.getPaint()), qh.f3.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f39449b.getLayoutParams()).rightMargin = dp;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        qh0 qh0Var = this.H;
        TextView textView3 = this.f39450c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb = new StringBuilder();
            i11 = ((org.telegram.ui.ActionBar.p2) qh0Var).currentAccount;
            sb.append(MessagesController.getInstance(i11).linkPrefix);
            sb.append("/");
            sb.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb.toString());
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i17 = tL_chatInviteExported.usage;
        if (i17 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i15 = R.string.NoOneSubscribed;
            } else {
                i15 = R.string.NoOneJoined;
            }
            str = LocaleController.getString(i15);
        } else {
            int i18 = tL_chatInviteExported.usage_limit;
            if (i18 > 0 && i17 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("CanJoin", i18, new Object[0]);
            } else if (i18 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                if (i17 > 0) {
                    str = LocaleController.formatPluralString("PeopleJoined", i17, new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = w.c.e(str, ", ");
                    }
                    StringBuilder l10 = e2.c.l(str);
                    l10.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    str = l10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.bt btVar = new org.telegram.ui.Components.bt();
            btVar.f25714b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.bt btVar2 = new org.telegram.ui.Components.bt();
                btVar2.f25714b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((qh0Var.f40515k0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (currentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j10 = currentTimeMillis / 1000;
                    int i19 = (int) (j10 % 60);
                    long j11 = j10 / 60;
                    int i20 = (int) (j11 / 60);
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i20))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j11 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i19)));
                    this.F = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i14 = R.string.NoOneSubscribed;
                } else {
                    i14 = R.string.NoOneJoined;
                }
                String string = LocaleController.getString(i14);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.bt btVar3 = new org.telegram.ui.Components.bt();
            btVar3.f25714b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z4 = tL_chatInviteExported.revoked;
            if (!z4 && (i13 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i13) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            } else {
                if (z4) {
                    i12 = R.string.Revoked;
                } else {
                    i12 = R.string.Expired;
                }
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(i12));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.bt btVar4 = new org.telegram.ui.Components.bt();
            btVar4.f25714b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(btVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
