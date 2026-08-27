package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
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

public final class hh0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final org.telegram.ui.Components.e11 F;
    public final kh0 G;

    public int f38825a;

    public final LinearLayout f38826b;

    public final TextView f38827c;
    public final TextView d;

    public final LinearLayout f38828e;

    public final TextView f38829f;
    public final TextView h;

    public TLRPC.TL_chatInviteExported f38830n;

    public int f38831r;

    public final Paint f38832s;
    public final Paint v;

    public final RectF f38833w;

    public final ImageView f38834x;

    public int f38835y;

    public hh0(kh0 kh0Var, Context context) {
        super(context);
        this.G = kh0Var;
        this.f38832s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f38833w = new RectF();
        this.A = 1.0f;
        this.F = new org.telegram.ui.Components.e11();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38826b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f38827c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        linearLayout.addView(textView2, h7.z5.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.f38834x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false));
        imageView.setOnClickListener(new u50(this, 9));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
        addView(imageView, h7.z5.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f38828e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f38829f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, h7.z5.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.Cells.pa.s(i11, null, false, textView4, 5);
        linearLayout2.addView(textView4, h7.z5.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38830n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23185ka, false);
        }
        if (i10 == 1) {
            if (f10 > 0.5f) {
                return i0.b.d(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23238na, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23255oa, false));
            }
            return i0.b.d(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23255oa, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23185ka, false));
        }
        if (i10 == 2) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23255oa, false);
        }
        return i10 == 4 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V8, false) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        String pluralString;
        int i11;
        this.E = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f38830n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.f38825a = -1;
            this.A = 1.0f;
        }
        this.f38830n = tL_chatInviteExported;
        this.f38831r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.f38834x;
        LinearLayout linearLayout = this.f38828e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder spannableStringBuilderX0 = hh.oa.X0(false, i0.a.m(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f38829f;
            textView.setText(spannableStringBuilderX0);
            int i12 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i12 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i12 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i12 == 60) {
                textView2.setText("each minute");
            }
            iDp = AndroidUtilities.dp(28.0f) + ((int) Math.max(lh.w3.g(textView.getText(), textView.getPaint()), lh.w3.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.f38826b.getLayoutParams()).rightMargin = iDp;
        boolean zIsEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        kh0 kh0Var = this.G;
        TextView textView3 = this.f38827c;
        if (!zIsEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            textView3.setText(MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) kh0Var).currentAccount).linkPrefix + "/" + tL_chatInviteExported.link.substring(14));
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i13 = tL_chatInviteExported.usage;
        if (i13 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            pluralString = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
        } else {
            int i14 = tL_chatInviteExported.usage_limit;
            if (i14 > 0 && i13 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                pluralString = LocaleController.formatPluralString("CanJoin", i14, new Object[0]);
            } else if (i14 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                pluralString = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                pluralString = i13 > 0 ? LocaleController.formatPluralString("PeopleJoined", i13, new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        pluralString = s3.c.l(pluralString, ", ");
                    }
                    StringBuilder sbO = com.google.android.recaptcha.internal.a.o(pluralString);
                    sbO.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    pluralString = sbO.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.ps psVar = new org.telegram.ui.Components.ps();
            psVar.f31657b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(psVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String string = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.ps psVar2 = new org.telegram.ui.Components.ps();
            psVar2.f31657b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(psVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (z10 || (i11 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i11) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(z10 ? R.string.Revoked : R.string.Expired));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.ps psVar3 = new org.telegram.ui.Components.ps();
            psVar3.f31657b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(psVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long jCurrentTimeMillis = (((long) tL_chatInviteExported.expire_date) * 1000) - ((kh0Var.f39750j0 * 1000) + System.currentTimeMillis());
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            if (jCurrentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (jCurrentTimeMillis / 86400000), new Object[0]));
            } else {
                long j10 = jCurrentTimeMillis / 1000;
                int i15 = (int) (j10 % 60);
                long j11 = j10 / 60;
                int i16 = (int) (j11 % 60);
                int i17 = (int) (j11 / 60);
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i17))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i16))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i15)));
                this.E = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.ps psVar4 = new org.telegram.ui.Components.ps();
            psVar4.f31657b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(psVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        float f11;
        float fMin;
        float f12;
        Paint paint;
        RectF rectF;
        int i11;
        Canvas canvas2 = canvas;
        if (this.f38830n == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38830n;
        boolean z10 = tL_chatInviteExported.expired;
        kh0 kh0Var = this.G;
        if (z10 || tL_chatInviteExported.revoked) {
            f10 = 32.0f;
            i10 = tL_chatInviteExported.revoked ? 4 : 3;
            f11 = 1.0f;
            fMin = 0.0f;
        } else {
            int i12 = tL_chatInviteExported.expire_date;
            if (i12 > 0 || tL_chatInviteExported.usage_limit > 0) {
                if (i12 > 0) {
                    long jCurrentTimeMillis = (kh0Var.f39750j0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f38830n;
                    f10 = 32.0f;
                    long j10 = ((long) tL_chatInviteExported2.expire_date) * 1000;
                    int i13 = tL_chatInviteExported2.start_date;
                    if (i13 <= 0) {
                        i13 = tL_chatInviteExported2.date;
                    }
                    long j11 = ((long) i13) * 1000;
                    f11 = 1.0f - ((jCurrentTimeMillis - j11) / (j10 - j11));
                } else {
                    f10 = 32.0f;
                    f11 = 1.0f;
                }
                TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.f38830n;
                int i14 = tL_chatInviteExported3.usage_limit;
                fMin = Math.min(f11, i14 > 0 ? (i14 - tL_chatInviteExported3.usage) / i14 : 1.0f);
                if (fMin <= 0.0f) {
                    this.f38830n.expired = true;
                    AndroidUtilities.updateVisibleRows(kh0Var.f39738b);
                    i10 = 3;
                } else {
                    i10 = 1;
                }
            } else {
                f11 = 1.0f;
                fMin = 0.0f;
                i10 = 0;
                f10 = 32.0f;
            }
        }
        int i15 = this.f38825a;
        if (i10 != i15 && i15 >= 0) {
            this.f38835y = i15;
            this.A = 0.0f;
            if ((i15 != 2 && i15 != 1) || i10 == 2 || i10 == 1) {
                this.C = false;
            } else {
                this.C = true;
            }
        }
        this.f38825a = i10;
        float f13 = this.A;
        if (f13 != 1.0f) {
            float f14 = f13 + 0.064f;
            this.A = f14;
            if (f14 >= 1.0f) {
                this.A = 1.0f;
                this.C = false;
            } else {
                invalidate();
            }
        }
        int iD = this.A != 1.0f ? i0.b.d(this.A, a(fMin, this.f38835y), a(fMin, i10)) : a(fMin, i10);
        Paint paint2 = this.f38832s;
        paint2.setColor(iD);
        canvas2.drawCircle(iDp, measuredHeight, AndroidUtilities.dp(f10) / 2.0f, paint2);
        boolean z11 = this.C;
        if (z11) {
            if (z11) {
                f11 = this.B;
            }
            f12 = f11;
            paint = this.v;
            paint.setColor(iD);
            float fDp = iDp - AndroidUtilities.dp(20.0f);
            float fDp2 = measuredHeight - AndroidUtilities.dp(20.0f);
            float fDp3 = AndroidUtilities.dp(20.0f) + iDp;
            float fDp4 = AndroidUtilities.dp(20.0f) + measuredHeight;
            rectF = this.f38833w;
            rectF.set(fDp, fDp2, fDp3, fDp4);
            if (this.A != 1.0f) {
                float f15 = (-f12) * 360.0f;
                canvas.drawArc(rectF, -90.0f, f15, false, paint);
                this.F.a(f15, 1.0f, canvas, paint, rectF);
                canvas2 = canvas;
            } else {
                float f16 = (-f12) * 360.0f;
                canvas.drawArc(rectF, -90.0f, f16, false, paint);
                this.F.a(f16, 1.0f, canvas, paint, rectF);
                canvas2 = canvas;
            }
            if (!((org.telegram.ui.ActionBar.n2) kh0Var).isPaused) {
                invalidate();
            }
            this.B = f12;
        } else {
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.f38830n;
            if (!tL_chatInviteExported4.expired && tL_chatInviteExported4.expire_date > 0 && !tL_chatInviteExported4.revoked) {
                if (z11) {
                    f11 = this.B;
                }
                f12 = f11;
                paint = this.v;
                paint.setColor(iD);
                float fDp5 = iDp - AndroidUtilities.dp(20.0f);
                float fDp6 = measuredHeight - AndroidUtilities.dp(20.0f);
                float fDp7 = AndroidUtilities.dp(20.0f) + iDp;
                float fDp8 = AndroidUtilities.dp(20.0f) + measuredHeight;
                rectF = this.f38833w;
                rectF.set(fDp5, fDp6, fDp7, fDp8);
                if (this.A != 1.0f || (((i11 = this.f38835y) == 2 || i11 == 1) && !this.C)) {
                    float f17 = (-f12) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f17, false, paint);
                    this.F.a(f17, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    canvas2.save();
                    float f18 = this.C ? 1.0f - this.A : this.A;
                    float f19 = (float) (((double) (0.3f * f18)) + 0.7d);
                    canvas2.scale(f19, f19, rectF.centerX(), rectF.centerY());
                    float f20 = (-f12) * 360.0f;
                    canvas2.drawArc(rectF, -90.0f, f20, false, paint);
                    this.F.a(f20, f18, canvas, paint, rectF);
                    canvas.restore();
                    canvas2 = canvas;
                }
                if (!((org.telegram.ui.ActionBar.n2) kh0Var).isPaused) {
                    invalidate();
                }
                this.B = f12;
            }
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported5 = this.f38830n;
        if (tL_chatInviteExported5.subscription_pricing != null) {
            kh0Var.W.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
            kh0Var.W.draw(canvas2);
        } else if (tL_chatInviteExported5.revoked) {
            kh0Var.V.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
            kh0Var.V.draw(canvas2);
        } else {
            kh0Var.U.setBounds(iDp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + iDp, AndroidUtilities.dp(12.0f) + measuredHeight);
            kh0Var.U.draw(canvas2);
        }
        if (this.D) {
            canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
