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
public final class cf0 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final org.telegram.ui.Components.n01 K;
    public final ff0 L;
    public int f46551a;
    public final LinearLayout f46552b;
    public final TextView f46553c;
    public final TextView d;
    public final LinearLayout f46554e;
    public final TextView f46555f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported f46556n;
    public int f46557r;
    public final Paint f46558s;
    public final Paint f46559w;
    public final RectF f46560x;
    public final ImageView f46561y;

    public cf0(ff0 ff0Var, Context context) {
        super(context);
        this.L = ff0Var;
        this.f46558s = new Paint(1);
        Paint paint = new Paint(1);
        this.f46559w = paint;
        this.f46560x = new RectF();
        this.F = 1.0f;
        this.K = new org.telegram.ui.Components.n01();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46552b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f46553c = textView;
        textView.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i7, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f29773y6;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, null);
        linearLayout.addView(textView2, c8.ma.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f46561y = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231244));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Li, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new j40(this, 10));
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        addView(imageView, c8.ma.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46554e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f46555f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView3, i7, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, c8.ma.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView4, i10, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, c8.ma.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i7) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f46556n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lk, false);
        }
        if (i7 == 3) {
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29514ka, false);
        }
        if (i7 == 1) {
            if (f10 > 0.5f) {
                return i0.a.f(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29567na, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29585oa, false));
            }
            return i0.a.f(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29585oa, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29514ka, false));
        } else if (i7 == 2) {
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29585oa, false);
        } else {
            if (i7 == 4) {
                return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.V8, false);
            }
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        this.J = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f46556n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f46551a = -1;
            this.F = 1.0f;
        }
        this.f46556n = tL_chatInviteExported;
        this.f46557r = i7;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f46561y;
        LinearLayout linearLayout = this.f46554e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder b12 = di.pb.b1(false, i5.c.l(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f46555f;
            textView.setText(b12);
            int i14 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i14 == 2592000) {
                textView2.setText(org.telegram.messenger.hd.N0(2131744813, null));
            } else if (i14 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i14 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.g0.L(28.0f) + ((int) Math.max(hi.l3.h(textView.getText(), textView.getPaint()), hi.l3.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f46552b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        ff0 ff0Var = this.L;
        TextView textView3 = this.f46553c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.g2) ff0Var).currentAccount;
            sb2.append(org.telegram.messenger.np.u1(i10).X2);
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
        int i15 = tL_chatInviteExported.usage;
        int i16 = 2131747994;
        if (i15 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i13 = 2131747992;
            } else {
                i13 = 2131747994;
            }
            str = org.telegram.messenger.hd.N0(i13, null);
        } else {
            int i17 = tL_chatInviteExported.usage_limit;
            if (i17 > 0 && i15 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.hd.G(i17, "CanJoin", new Object[0]);
            } else if (i17 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = org.telegram.messenger.hd.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.hd.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                if (i15 > 0) {
                    str = org.telegram.messenger.hd.G(i15, "PeopleJoined", new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = p5.c.v(str, ", ");
                    }
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                    m10.append(org.telegram.messenger.hd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    str = m10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us();
            usVar.f40571b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(usVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131747127, null));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                org.telegram.ui.Components.us usVar2 = new org.telegram.ui.Components.us();
                usVar2.f40571b = org.telegram.messenger.g0.L(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(usVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((ff0Var.f47708o0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
                } else {
                    long j3 = currentTimeMillis / 1000;
                    int i18 = (int) (j3 % 60);
                    long j10 = j3 / 60;
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i18)));
                    this.J = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i16 = 2131747992;
                }
                String N0 = org.telegram.messenger.hd.N0(i16, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) N0);
            }
            org.telegram.ui.Components.us usVar3 = new org.telegram.ui.Components.us();
            usVar3.f40571b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(usVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (!z10 && (i12 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i12) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131748707, null));
            } else {
                if (z10) {
                    i11 = 2131745819;
                } else {
                    i11 = 2131750864;
                }
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(i11, null));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.us usVar4 = new org.telegram.ui.Components.us();
            usVar4.f40571b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(usVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131754206, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        this.f46559w.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
