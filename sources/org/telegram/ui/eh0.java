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
public final class eh0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final org.telegram.ui.Components.d11 F;
    public final hh0 G;
    public int f37948a;
    public final LinearLayout f37949b;
    public final TextView f37950c;
    public final TextView d;
    public final LinearLayout f37951e;
    public final TextView f37952f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f37953n;
    public int f37954r;
    public final Paint f37955s;
    public final Paint v;
    public final RectF f37956w;
    public final ImageView f37957x;
    public int f37958y;

    public eh0(hh0 hh0Var, Context context) {
        super(context);
        this.G = hh0Var;
        this.f37955s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f37956w = new RectF();
        this.A = 1.0f;
        this.F = new org.telegram.ui.Components.d11();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37949b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f37950c = textView;
        textView.setTextSize(1, 16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        linearLayout.addView(textView2, g7.e6.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f37957x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Uh, false));
        imageView.setOnClickListener(new q50(this, 9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 1, -1));
        addView(imageView, g7.e6.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37951e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f37952f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, g7.e6.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        j3.r0.w(i10, null, false, textView4, 5);
        linearLayout2.addView(textView4, g7.e6.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i9) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f37953n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.uj, false);
        }
        if (i9 == 3) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false);
        }
        if (i9 == 1) {
            if (f10 > 0.5f) {
                return i0.a.d(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23183na, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23199oa, false));
            }
            return i0.a.d(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23199oa, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false));
        } else if (i9 == 2) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23199oa, false);
        } else {
            if (i9 == 4) {
                return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V8, false);
            }
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i9) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        this.E = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f37953n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f37948a = -1;
            this.A = 1.0f;
        }
        this.f37953n = tL_chatInviteExported;
        this.f37954r = i9;
        if (tL_chatInviteExported == null) {
            return;
        }
        int dp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f37957x;
        LinearLayout linearLayout = this.f37951e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder X0 = gh.oa.X0(false, j3.r0.n(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f37952f;
            textView.setText(X0);
            int i15 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i15 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i15 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i15 == 60) {
                textView2.setText("each minute");
            }
            dp = AndroidUtilities.dp(28.0f) + ((int) Math.max(kh.x3.g(textView.getText(), textView.getPaint()), kh.x3.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f37949b.getLayoutParams()).rightMargin = dp;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        hh0 hh0Var = this.G;
        TextView textView3 = this.f37950c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.o2) hh0Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb2.toString());
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i16 = tL_chatInviteExported.usage;
        if (i16 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i14 = R.string.NoOneSubscribed;
            } else {
                i14 = R.string.NoOneJoined;
            }
            str = LocaleController.getString(i14);
        } else {
            int i17 = tL_chatInviteExported.usage_limit;
            if (i17 > 0 && i16 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("CanJoin", i17, new Object[0]);
            } else if (i17 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                if (i16 > 0) {
                    str = LocaleController.formatPluralString("PeopleJoined", i16, new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = ta.b.j(str, ", ");
                    }
                    StringBuilder n10 = e2.c.n(str);
                    n10.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    str = n10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs();
            qsVar.f32021b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs();
                qsVar2.f32021b = AndroidUtilities.dp(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((hh0Var.f38805j0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (currentTimeMillis / 86400000), new Object[0]));
                } else {
                    long j10 = currentTimeMillis / 1000;
                    int i18 = (int) (j10 % 60);
                    long j11 = j10 / 60;
                    int i19 = (int) (j11 / 60);
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i19))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j11 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i18)));
                    this.E = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i13 = R.string.NoOneSubscribed;
                } else {
                    i13 = R.string.NoOneJoined;
                }
                String string = LocaleController.getString(i13);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.qs qsVar3 = new org.telegram.ui.Components.qs();
            qsVar3.f32021b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (!z10 && (i12 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i12) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            } else {
                if (z10) {
                    i11 = R.string.Revoked;
                } else {
                    i11 = R.string.Expired;
                }
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(i11));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.qs qsVar4 = new org.telegram.ui.Components.qs();
            qsVar4.f32021b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
