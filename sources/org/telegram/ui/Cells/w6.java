package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.qs;
public final class w6 extends FrameLayout {
    public int f23398a;
    public TextView f23399b;
    public TextView f23400c;
    public TextView d;
    public TextView e;
    public org.telegram.ui.Components.g9 f23401f;
    public org.telegram.ui.Components.g9 h;
    public org.telegram.ui.Components.r8 f23402n;
    public boolean f23403r;
    public org.telegram.ui.Components.t5 f23404s;
    public LinearLayout f23405w;
    public int f23406x;

    public static eq a(int i10, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i10, tL_authorization);
    }

    public static eq b(int i10, TLRPC.TL_authorization tL_authorization) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int x02;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i11 = org.telegram.ui.ActionBar.t6.U7;
            i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            i13 = 2131231045;
        } else if (lowerCase2.contains("edge")) {
            i11 = org.telegram.ui.ActionBar.t6.U7;
            i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            i13 = 2131231041;
        } else if (lowerCase2.contains("chrome")) {
            i11 = org.telegram.ui.ActionBar.t6.U7;
            i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            i13 = 2131231040;
        } else if (lowerCase2.contains("opera")) {
            i11 = org.telegram.ui.ActionBar.t6.U7;
            i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            i13 = 2131231043;
        } else if (lowerCase2.contains("firefox")) {
            i11 = org.telegram.ui.ActionBar.t6.U7;
            i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            i13 = 2131231042;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i11 = org.telegram.ui.ActionBar.t6.U7;
                i12 = org.telegram.ui.ActionBar.t6.f20894b8;
            } else if (lowerCase.contains("ios")) {
                if (lowerCase2.contains("ipad")) {
                    i15 = 2131231039;
                } else {
                    i15 = 2131231037;
                }
                i13 = i15;
                i11 = org.telegram.ui.ActionBar.t6.T7;
                i12 = org.telegram.ui.ActionBar.t6.f20874a8;
            } else if (lowerCase.contains("windows")) {
                i11 = org.telegram.ui.ActionBar.t6.S7;
                i12 = org.telegram.ui.ActionBar.t6.Z7;
                i13 = 2131231035;
            } else if (lowerCase.contains("macos")) {
                i11 = org.telegram.ui.ActionBar.t6.S7;
                i12 = org.telegram.ui.ActionBar.t6.Z7;
                i13 = 2131231033;
            } else if (lowerCase.contains("android")) {
                if (lowerCase2.contains("tab")) {
                    i14 = 2131231038;
                } else {
                    i14 = 2131231036;
                }
                i13 = i14;
                i11 = org.telegram.ui.ActionBar.t6.R7;
                i12 = org.telegram.ui.ActionBar.t6.Y7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i13 = 2131231210;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i11 = org.telegram.ui.ActionBar.t6.T7;
                    i12 = org.telegram.ui.ActionBar.t6.f20874a8;
                    i13 = 2131232353;
                } else if (lowerCase.contains("anonymous")) {
                    i11 = org.telegram.ui.ActionBar.t6.T7;
                    i12 = org.telegram.ui.ActionBar.t6.f20874a8;
                    i13 = 2131231609;
                } else if (lowerCase.contains("premiumbot")) {
                    i11 = org.telegram.ui.ActionBar.t6.mk;
                    i12 = org.telegram.ui.ActionBar.t6.lk;
                    i13 = 2131231172;
                } else if (lowerCase.contains("ads")) {
                    i11 = org.telegram.ui.ActionBar.t6.U7;
                    i12 = org.telegram.ui.ActionBar.t6.f20894b8;
                    i13 = 2131232087;
                } else if (lowerCase.contains("api")) {
                    i11 = org.telegram.ui.ActionBar.t6.R7;
                    i12 = org.telegram.ui.ActionBar.t6.Y7;
                    i13 = 2131231134;
                } else if (lowerCase.equals("?")) {
                    i13 = 2131232123;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i11 = org.telegram.ui.ActionBar.t6.S7;
                    i12 = org.telegram.ui.ActionBar.t6.Z7;
                    i13 = 2131231034;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.U7;
                    i12 = org.telegram.ui.ActionBar.t6.f20894b8;
                }
                i11 = -1;
                i12 = -1;
            }
            i13 = 2131231044;
        }
        Drawable mutate = org.telegram.messenger.w0.f18945b.getDrawable(i13).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J7, false), PorterDuff.Mode.SRC_IN));
        float f7 = i10;
        int L = org.telegram.messenger.i0.L(f7);
        int i16 = -16777216;
        if (i11 == -1) {
            x02 = -16777216;
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        }
        if (i12 != -1) {
            i16 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        }
        v6 v6Var = new v6(0);
        v6Var.f23319b = L;
        Paint paint = new Paint(1);
        v6Var.f23320c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{x02, i16}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        eq eqVar = new eq(v6Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            eqVar.e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f7);
            eqVar.f25904f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f7);
        }
        return eqVar;
    }

    private void setContentAlpha(float f7) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setAlpha(f7);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f7);
        }
        TextView textView3 = this.f23399b;
        if (textView3 != null) {
            textView3.setAlpha(f7);
        }
        TextView textView4 = this.f23400c;
        if (textView4 != null) {
            textView4.setAlpha(f7);
        }
        org.telegram.ui.Components.g9 g9Var = this.h;
        if (g9Var != null) {
            g9Var.setAlpha(f7);
        }
        org.telegram.ui.Components.g9 g9Var2 = this.f23401f;
        if (g9Var2 != null) {
            g9Var2.setAlpha(1.0f - f7);
        }
        LinearLayout linearLayout = this.f23405w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f7);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String a12;
        TextView textView = this.f23400c;
        TextView textView2 = this.e;
        TextView textView3 = this.d;
        TextView textView4 = this.f23399b;
        int i10 = this.f23406x;
        org.telegram.ui.Components.r8 r8Var = this.f23402n;
        this.f23403r = z10;
        org.telegram.ui.Components.g9 g9Var = this.h;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(tL_connectedBot.bot_id));
            r8Var.r(Z1);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
            g9Var.e(Z1, r8Var);
            textView4.setText(i20.p(Z1));
            textView3.setText(dd.L0(2131745577, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(dd.a0(null, null, 2131745575, dd.x(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            g9Var.setImageDrawable(b(42, tL_authorization));
            StringBuilder sb2 = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb2.append(tL_authorization.device_model);
            }
            if (sb2.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb2.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb2.append(" ");
                    }
                    sb2.append(tL_authorization.system_version);
                }
            }
            textView4.setText(sb2);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
                a12 = dd.L0(2131747842, null);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
                a12 = dd.a1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                qs qsVar = new qs();
                qsVar.f29781b = org.telegram.messenger.i0.L(1.5f);
                qsVar.f29782c = 7.0f;
                qsVar.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(qsVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) a12);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            textView3.setText(sb3);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User Z12 = wp.r1(i10).Z1(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (Z12 != null) {
                r8Var.r(Z12);
                str = i20.j(Z12, true);
                g9Var.e(Z12, r8Var);
            } else {
                str = "";
            }
            int i11 = org.telegram.ui.ActionBar.t6.A6;
            setTag(Integer.valueOf(i11));
            textView.setText(dd.a1(tL_webAuthorization.date_active));
            org.telegram.ui.ActionBar.a7.V(textView, i11, null);
            StringBuilder sb4 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb4.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(" ");
                }
                sb4.append("— ");
                sb4.append(tL_webAuthorization.region);
            }
            textView2.setText(sb4);
            StringBuilder sb5 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb5.append(str);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb5.length() != 0) {
                    sb5.append(", ");
                }
                sb5.append(tL_webAuthorization.platform);
            }
            textView3.setText(sb5);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11 = 0;
        float f7 = 0.0f;
        setContentAlpha(1.0f - this.f23404s.e(false, 0.0f));
        if (this.f23403r) {
            if (this.f23398a == 1) {
                i10 = 49;
            } else {
                i10 = 72;
            }
            if (!dd.X) {
                f7 = org.telegram.messenger.i0.L(i10);
            }
            float f10 = f7;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i11 = org.telegram.messenger.i0.L(i10);
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23398a == 0) {
            f7 = 70.0f;
        } else {
            f7 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) + (this.f23403r ? 1 : 0), 1073741824));
    }
}
