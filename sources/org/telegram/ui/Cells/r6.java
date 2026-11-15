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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ls;
public final class r6 extends FrameLayout {
    public int f31346a;
    public TextView f31347b;
    public TextView f31348c;
    public TextView d;
    public TextView f31349e;
    public org.telegram.ui.Components.i9 f31350f;
    public org.telegram.ui.Components.i9 h;
    public org.telegram.ui.Components.t8 f31351n;
    public boolean f31352r;
    public org.telegram.ui.Components.u5 f31353s;
    public LinearLayout f31354w;
    public int f31355x;

    public static fq a(int i7, String str) {
        TLRPC.TL_authorization tL_authorization = new TLRPC.TL_authorization();
        tL_authorization.device_model = str;
        tL_authorization.platform = str;
        tL_authorization.app_name = str;
        return b(i7, tL_authorization);
    }

    public static fq b(int i7, TLRPC.TL_authorization tL_authorization) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int x02;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i10 = org.telegram.ui.ActionBar.j6.U7;
            i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            i12 = 2131231045;
        } else if (lowerCase2.contains("edge")) {
            i10 = org.telegram.ui.ActionBar.j6.U7;
            i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            i12 = 2131231041;
        } else if (lowerCase2.contains("chrome")) {
            i10 = org.telegram.ui.ActionBar.j6.U7;
            i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            i12 = 2131231040;
        } else if (lowerCase2.contains("opera")) {
            i10 = org.telegram.ui.ActionBar.j6.U7;
            i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            i12 = 2131231043;
        } else if (lowerCase2.contains("firefox")) {
            i10 = org.telegram.ui.ActionBar.j6.U7;
            i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            i12 = 2131231042;
        } else {
            if (lowerCase2.contains("vivaldi")) {
                i10 = org.telegram.ui.ActionBar.j6.U7;
                i11 = org.telegram.ui.ActionBar.j6.f28814b8;
            } else if (lowerCase.contains("ios")) {
                if (lowerCase2.contains("ipad")) {
                    i14 = 2131231039;
                } else {
                    i14 = 2131231037;
                }
                i12 = i14;
                i10 = org.telegram.ui.ActionBar.j6.T7;
                i11 = org.telegram.ui.ActionBar.j6.f28793a8;
            } else if (lowerCase.contains("windows")) {
                i10 = org.telegram.ui.ActionBar.j6.S7;
                i11 = org.telegram.ui.ActionBar.j6.Z7;
                i12 = 2131231035;
            } else if (lowerCase.contains("macos")) {
                i10 = org.telegram.ui.ActionBar.j6.S7;
                i11 = org.telegram.ui.ActionBar.j6.Z7;
                i12 = 2131231033;
            } else if (lowerCase.contains("android")) {
                if (lowerCase2.contains("tab")) {
                    i13 = 2131231038;
                } else {
                    i13 = 2131231036;
                }
                i12 = i13;
                i10 = org.telegram.ui.ActionBar.j6.R7;
                i11 = org.telegram.ui.ActionBar.j6.Y7;
            } else {
                if (lowerCase.contains("fragment")) {
                    i12 = 2131231209;
                } else if (lowerCase.equalsIgnoreCase("search")) {
                    i10 = org.telegram.ui.ActionBar.j6.T7;
                    i11 = org.telegram.ui.ActionBar.j6.f28793a8;
                    i12 = 2131232355;
                } else if (lowerCase.contains("anonymous")) {
                    i10 = org.telegram.ui.ActionBar.j6.T7;
                    i11 = org.telegram.ui.ActionBar.j6.f28793a8;
                    i12 = 2131231608;
                } else if (lowerCase.contains("premiumbot")) {
                    i10 = org.telegram.ui.ActionBar.j6.pk;
                    i11 = org.telegram.ui.ActionBar.j6.ok;
                    i12 = 2131231172;
                } else if (lowerCase.contains("ads")) {
                    i10 = org.telegram.ui.ActionBar.j6.U7;
                    i11 = org.telegram.ui.ActionBar.j6.f28814b8;
                    i12 = 2131232089;
                } else if (lowerCase.contains("api")) {
                    i10 = org.telegram.ui.ActionBar.j6.R7;
                    i11 = org.telegram.ui.ActionBar.j6.Y7;
                    i12 = 2131231134;
                } else if (lowerCase.equals("?")) {
                    i12 = 2131232125;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i10 = org.telegram.ui.ActionBar.j6.S7;
                    i11 = org.telegram.ui.ActionBar.j6.Z7;
                    i12 = 2131231034;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.U7;
                    i11 = org.telegram.ui.ActionBar.j6.f28814b8;
                }
                i10 = -1;
                i11 = -1;
            }
            i12 = 2131231044;
        }
        Drawable mutate = org.telegram.messenger.t0.f26609b.getDrawable(i12).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J7, false), PorterDuff.Mode.SRC_IN));
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        int i15 = -16777216;
        if (i10 == -1) {
            x02 = -16777216;
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        }
        if (i11 != -1) {
            i15 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        }
        q6 q6Var = new q6(0);
        q6Var.f31294b = L;
        Paint paint = new Paint(1);
        q6Var.f31295c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{x02, i15}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        fq fqVar = new fq(q6Var, mutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            fqVar.f34676e = (int) ((mutate.getIntrinsicWidth() / 44.0f) * f10);
            fqVar.f34677f = (int) ((mutate.getIntrinsicHeight() / 44.0f) * f10);
        }
        return fqVar;
    }

    private void setContentAlpha(float f10) {
        TextView textView = this.f31349e;
        if (textView != null) {
            textView.setAlpha(f10);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setAlpha(f10);
        }
        TextView textView3 = this.f31347b;
        if (textView3 != null) {
            textView3.setAlpha(f10);
        }
        TextView textView4 = this.f31348c;
        if (textView4 != null) {
            textView4.setAlpha(f10);
        }
        org.telegram.ui.Components.i9 i9Var = this.h;
        if (i9Var != null) {
            i9Var.setAlpha(f10);
        }
        org.telegram.ui.Components.i9 i9Var2 = this.f31350f;
        if (i9Var2 != null) {
            i9Var2.setAlpha(1.0f - f10);
        }
        LinearLayout linearLayout = this.f31354w;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void c(TLObject tLObject, boolean z10) {
        String str;
        String e12;
        TextView textView = this.f31348c;
        TextView textView2 = this.f31349e;
        TextView textView3 = this.d;
        TextView textView4 = this.f31347b;
        int i7 = this.f31355x;
        org.telegram.ui.Components.t8 t8Var = this.f31351n;
        this.f31352r = z10;
        org.telegram.ui.Components.i9 i9Var = this.h;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
        if (tLObject instanceof TL_account.TL_connectedBot) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(tL_connectedBot.bot_id));
            t8Var.r(a22);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            i9Var.f(a22, t8Var);
            textView4.setText(q10.p(a22));
            textView3.setText(hd.M0(2131745560, null));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView2.setText(hd.a0(null, null, 2131745558, hd.x(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            i9Var.setImageDrawable(b(42, tL_authorization));
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
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
                e12 = hd.M0(2131747826, null);
            } else {
                setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
                e12 = hd.e1(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                ls lsVar = new ls();
                lsVar.f36896b = org.telegram.messenger.g0.L(1.5f);
                lsVar.f36897c = 7.0f;
                lsVar.d = 2.0f;
                spannableStringBuilder.append((CharSequence) " . ").setSpan(lsVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) e12);
            textView2.setText(spannableStringBuilder);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            textView3.setText(sb3);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User a23 = np.s1(i7).a2(Long.valueOf(tL_webAuthorization.bot_id));
            textView4.setText(tL_webAuthorization.domain);
            if (a23 != null) {
                t8Var.r(a23);
                str = q10.j(a23, true);
                i9Var.f(a23, t8Var);
            } else {
                str = "";
            }
            int i10 = org.telegram.ui.ActionBar.j6.A6;
            setTag(Integer.valueOf(i10));
            textView.setText(hd.e1(tL_webAuthorization.date_active));
            org.telegram.ui.ActionBar.q6.U(textView, i10, null);
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
        int i7;
        int i10 = 0;
        float f10 = 0.0f;
        setContentAlpha(1.0f - this.f31353s.e(false, 0.0f));
        if (this.f31352r) {
            if (this.f31346a == 1) {
                i7 = 49;
            } else {
                i7 = 72;
            }
            if (!hd.f24104a0) {
                f10 = org.telegram.messenger.g0.L(i7);
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i10 = org.telegram.messenger.g0.L(i7);
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f31346a == 0) {
            f10 = 70.0f;
        } else {
            f10 = 90.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f31352r ? 1 : 0), 1073741824));
    }
}
