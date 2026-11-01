package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fg0 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.i11 J;
    public final ig0 K;
    public int f37137a;
    public final LinearLayout f37138b;
    public final TextView f37139c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f37140f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f37141n;
    public int f37142r;
    public final Paint f37143s;
    public final Paint f37144w;
    public final RectF f37145x;
    public final ImageView f37146y;

    public fg0(ig0 ig0Var, Context context) {
        super(context);
        this.K = ig0Var;
        this.f37143s = new Paint(1);
        Paint paint = new Paint(1);
        this.f37144w = paint;
        this.f37145x = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.i11();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37138b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f37139c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f37146y = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231245));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ii, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new e50(this, 10));
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        addView(imageView, w7.b6.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f37140f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, i10, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, w7.b6.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, w7.b6.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f7, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f37141n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ik, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21063ka, false);
        }
        if (i10 == 1) {
            if (f7 > 0.5f) {
                return i0.b.f(1.0f - ((f7 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21120na, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21139oa, false));
            }
            return i0.b.f(1.0f - (f7 / 0.5f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21139oa, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21063ka, false));
        } else if (i10 == 2) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21139oa, false);
        } else {
            if (i10 == 4) {
                return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V8, false);
            }
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f37141n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f37137a = -1;
            this.E = 1.0f;
        }
        this.f37141n = tL_chatInviteExported;
        this.f37142r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f37146y;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder a12 = rh.h8.a1(false, i0.a.k(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f37140f;
            textView.setText(a12);
            int i15 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i15 == 2592000) {
                textView2.setText(org.telegram.messenger.dd.L0(2131745074, null));
            } else if (i15 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i15 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.i0.L(28.0f) + ((int) Math.max(vh.p2.g(textView.getText(), textView.getPaint()), vh.p2.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f37138b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        ig0 ig0Var = this.K;
        TextView textView3 = this.f37139c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.k6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i11 = ((org.telegram.ui.ActionBar.k2) ig0Var).currentAccount;
            sb2.append(org.telegram.messenger.wp.r1(i11).U2);
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
        int i17 = 2131748204;
        if (i16 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i14 = 2131748202;
            } else {
                i14 = 2131748204;
            }
            str = org.telegram.messenger.dd.L0(i14, null);
        } else {
            int i18 = tL_chatInviteExported.usage_limit;
            if (i18 > 0 && i16 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.dd.G(i18, "CanJoin", new Object[0]);
            } else if (i18 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.dd.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.dd.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                if (i16 > 0) {
                    str = org.telegram.messenger.dd.G(i16, "PeopleJoined", new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = sc.e.A(str, ", ");
                    }
                    StringBuilder t10 = a1.g.t(str);
                    t10.append(org.telegram.messenger.dd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    str = t10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs();
            qsVar.f29781b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131747337, null));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs();
                qsVar2.f29781b = org.telegram.messenger.i0.L(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((ig0Var.f38043n0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
                } else {
                    long j10 = currentTimeMillis / 1000;
                    int i19 = (int) (j10 % 60);
                    long j11 = j10 / 60;
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j11 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j11 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i19)));
                    this.I = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i17 = 2131748202;
                }
                String L0 = org.telegram.messenger.dd.L0(i17, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) L0);
            }
            org.telegram.ui.Components.qs qsVar3 = new org.telegram.ui.Components.qs();
            qsVar3.f29781b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (!z10 && (i13 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i13) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131748910, null));
            } else {
                if (z10) {
                    i12 = 2131746032;
                } else {
                    i12 = 2131750877;
                }
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(i12, null));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.qs qsVar4 = new org.telegram.ui.Components.qs();
            qsVar4.f29781b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131754209, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
        this.f37144w.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }
}
