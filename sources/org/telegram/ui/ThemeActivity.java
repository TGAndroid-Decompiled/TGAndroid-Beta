package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ThemeActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public int B0;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public boolean K0;
    public int L;
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public final x51 Q0;
    public int R;
    public final x51 R0;
    public int S;
    public org.telegram.ui.Components.zg0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public f61 f42007a;
    public int f42008a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.pj0 f42009b;
    public int f42010b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public d61 f42011c;
    public int f42012c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f42013d0;
    public final ArrayList f42014e;
    public int f42015e0;
    public final int f42016f;
    public int f42017f0;
    public int f42018g0;
    public org.telegram.ui.ActionBar.j6 h;
    public int f42019h0;
    public int f42020i0;
    public int f42021j0;
    public int f42022k0;
    public int f42023l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.h6 f42024n;
    public int f42025n0;
    private int nightThemeRow;
    public int f42026o0;
    public int f42027p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f42028q0;
    public org.telegram.ui.ActionBar.u1 f42029r;
    public int f42030r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.f5 f42031s;
    public int f42032s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f42033t0;
    private int textSizeRow;
    public int f42034u0;
    public int f42035v0;
    public boolean f42036w;
    public int f42037w0;
    public int f42038x;
    public int f42039x0;
    public int f42040y;
    public int f42041y0;
    public int f42042z0;

    public static class InnerAccentView extends View {
        public final Paint f42043a;
        public ObjectAnimator f42044b;
        public float f42045c;
        public org.telegram.ui.ActionBar.j6 d;
        public org.telegram.ui.ActionBar.h6 f42046e;
        public boolean f42047f;

        public InnerAccentView(Context context) {
            super(context);
            this.f42043a = new Paint(1);
        }

        public final void a(boolean z9) {
            boolean z10;
            if (this.d.Y == this.f42046e.f27516a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42047f = z10;
            ObjectAnimator objectAnimator = this.f42044b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z9) {
                if (this.f42047f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f42044b = ofFloat;
                ofFloat.setDuration(200L);
                this.f42044b.start();
                return;
            }
            if (this.f42047f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f42045c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float L = org.telegram.messenger.g0.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i7 = this.f42046e.f27518c;
            Paint paint = this.f42043a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f42045c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f42045c), paint);
            if (this.f42045c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f42045c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f42045c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f42045c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f42046e.f27519e;
            if (i10 != 0 && this.f42045c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f42045c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f42047f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f42045c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f42014e = new ArrayList();
        this.Q0 = new x51(this);
        this.R0 = new x51(this);
        this.f42016f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.k6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.k6.f28139t;
        int i12 = i11 / 60;
        return org.telegram.messenger.hd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.c20 c20Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        final org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        final String str = s12.f24905u6;
        String str2 = s12.f24914v6;
        final int i10 = s12.f24924w6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) s12.f24935x7.f24447m.f13889b).f22774c) {
            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            l10.N = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, f6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, c8.ha.e(50, 50, 17));
            f10.addView(frameLayout, c8.ha.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.k6.f27957j5;
            TextView b10 = c8.qa.b(context, 20.0f, i12, true, f6Var);
            b10.setText(org.telegram.messenger.hd.M0(2131754307, null));
            b10.setGravity(17);
            f10.addView(b10, c8.ha.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = c8.qa.b(context, 14.0f, i12, false, f6Var);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.N0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, c8.ha.t(-1, -2, 7, 24, 0, 24, 0));
            final fi.d dVar = new fi.d(context, f6Var, true);
            dVar.i(org.telegram.messenger.hd.M0(2131754313, null), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final fi.d dVar2 = fi.d.this;
                    if (dVar2.Q) {
                        return;
                    }
                    dVar2.setLoading(true);
                    final org.telegram.messenger.qp qpVar = s12;
                    final String str3 = str;
                    final int i13 = i7;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.c20 c20Var2 = c20Var;
                    final org.telegram.ui.ActionBar.v2[] v2VarArr = r9;
                    c8.ia.c(2131624116, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final fi.d dVar3 = fi.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.qp qpVar2 = qpVar;
                            org.telegram.messenger.s10 d2 = qpVar2.d2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.c20 c20Var3 = c20Var2;
                            final org.telegram.ui.ActionBar.v2[] v2VarArr2 = v2VarArr;
                            d2.a(str3, null, new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l11 = (Long) obj2;
                                    fi.d dVar4 = fi.d.this;
                                    if (l11 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User a22 = qpVar2.a2(l11);
                                    if (a22 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                    if (T == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    hi.q4 b12 = hi.q4.b(i15, l11.longValue(), l11.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                    final hi.a3 a3Var = new hi.a3(context3, f6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.c20 c20Var4 = c20Var3;
                                    ?? r62 = new org.telegram.messenger.z10() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i17) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            a3Var.o(false);
                                            c20Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.k5.o(null, 2131754309, org.telegram.ui.Components.hc.a0(T2), 2131623989, 36);
                                            }
                                        }
                                    };
                                    a3Var.L0 = r62;
                                    hi.s2 s2Var = a3Var.D;
                                    if (s2Var != 0) {
                                        s2Var.setOnVerifiedAge(r62);
                                    }
                                    a3Var.B(true);
                                    a3Var.B0 = false;
                                    a3Var.f14526l0 = T.getParentActivity();
                                    a3Var.x(T, b12);
                                    a3Var.show();
                                    dVar4.setLoading(false);
                                    v2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, c8.ha.t(-1, 48, 7, 2, 29, 2, 14));
            l10.show();
            final org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
            l10.N();
            return;
        }
        c20Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        f61 f61Var;
        boolean z9;
        org.telegram.ui.Components.pj0 pj0Var = themeActivity.f42009b;
        if (pj0Var != null && pj0Var.G && (f61Var = themeActivity.f42007a) != null) {
            int i7 = themeActivity.sensitiveContentRow;
            boolean z10 = false;
            if (i7 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z10 = true;
            }
            if (z9 == z10) {
                f61Var.g(i7);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        boolean z9;
        String M0;
        String M02;
        int d;
        boolean z10;
        boolean z11;
        if (i7 == themeActivity.N) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z12 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z13 = !z12;
            edit.putBoolean("view_animations", z13);
            org.telegram.messenger.iz.C1 = Boolean.valueOf(z13);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z13);
            }
        } else if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i7 == themeActivity.changeUserColor) {
            hm0 hm0Var = new hm0();
            hm0Var.H = themeActivity;
            themeActivity.presentFragment(hm0Var);
        } else if (i7 == themeActivity.G) {
            SharedPreferences e13 = org.telegram.messenger.qp.e1();
            boolean z14 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z15 = !z14;
            edit2.putBoolean("send_by_enter", z15);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            }
        } else if (i7 == themeActivity.E) {
            org.telegram.messenger.iz.f23411r0 = !org.telegram.messenger.iz.f23411r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.iz.f23411r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23411r0);
            }
        } else if (i7 == themeActivity.F) {
            org.telegram.messenger.iz.f23417t0 = !org.telegram.messenger.iz.f23417t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.iz.f23417t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23417t0);
            }
        } else if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.iz.f23414s0 = !org.telegram.messenger.iz.f23414s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.iz.f23414s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23414s0);
            }
            if (!org.telegram.messenger.iz.f23414s0 && themeActivity.E != -1) {
                for (int i12 = 0; i12 < themeActivity.f42009b.getChildCount(); i12++) {
                    View childAt = themeActivity.f42009b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.f42009b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.iz.F0 = !org.telegram.messenger.iz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.qp.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.iz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.F0);
            }
        } else if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.iz.G0 = !org.telegram.messenger.iz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.qp.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.iz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i7 == themeActivity.K) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751367, "DistanceUnitsAutomatic"), org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsKilometers"), org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        float f13 = f11;
                        j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                        j6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27905g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.iz.f23415s1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6Var.b(charSequence, z11);
                        int i14 = org.telegram.ui.ActionBar.k6.f27941i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                        j6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(j6Var, h02, null, N, null);
                        f12.addView(j6Var);
                        j6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f49950b;

                            {
                                this.f49950b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f49950b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.iz.f23415s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.iz.f23415s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f22884g0 = null;
                                        themeActivity2.O0 = true;
                                        v4.d1 K = themeActivity2.f42009b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f42007a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.iz.f23405p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.iz.f23405p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f49950b;
                                        themeActivity3.P0 = true;
                                        v4.d1 K2 = themeActivity3.f42009b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f42007a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i13++;
                        f11 = f13;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsTitle");
                    alertDialog$Builder.o(f12);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    atomicReference.set(u1Var);
                    themeActivity.showDialog(u1Var);
                }
            } else if (i7 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.f1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i15 = 0; i15 < size; i15++) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.f1) b10.get(i15)).f51122a;
                        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        j6Var2.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27905g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.iz.f23405p0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var2.b(charSequence2, z10);
                        int i16 = org.telegram.ui.ActionBar.k6.f27941i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                        j6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.r6.k(j6Var2, h03, null, N2, null);
                        f14.addView(j6Var2);
                        j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f49950b;

                            {
                                this.f49950b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f49950b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.iz.f23415s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.iz.f23415s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f22884g0 = null;
                                        themeActivity2.O0 = true;
                                        v4.d1 K = themeActivity2.f42009b.K(themeActivity2.K);
                                        if (K != null) {
                                            themeActivity2.f42007a.t(K, themeActivity2.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.iz.f23405p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.iz.f23405p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f49950b;
                                        themeActivity3.P0 = true;
                                        v4.d1 K2 = themeActivity3.f42009b.K(themeActivity3.L);
                                        if (K2 != null) {
                                            themeActivity3.f42007a.t(K2, themeActivity3.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f27293a.R = org.telegram.messenger.hd.M0(2131745800, null);
                    alertDialog$Builder2.o(f14);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                    atomicReference2.set(u1Var2);
                    themeActivity.showDialog(u1Var2);
                }
            } else if (i7 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
                    org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.k6.f27905g7;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.k6.E5;
                    j6Var3.a(x02, org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                    j6Var3.b(org.telegram.messenger.hd.M0(2131748437, null), !org.telegram.messenger.iz.f23420u0);
                    int i19 = org.telegram.ui.ActionBar.k6.f27941i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i19);
                    j6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.r6.k(j6Var3, h04, null, N3, null);
                    f15.addView(j6Var3);
                    j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50239b;

                        {
                            this.f50239b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50239b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.iz.f23420u0 = false;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K = themeActivity2.f42009b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f42007a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ia.c(2131624120, 2131747309, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ex(26, themeActivity2, atomicReference4));
                                    org.telegram.messenger.iz.f23420u0 = true;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K2 = themeActivity2.f42009b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f42007a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    j6Var4.a(org.telegram.ui.ActionBar.k6.x0(null, i17, false), org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                    String M03 = org.telegram.messenger.hd.M0(2131748434, null);
                    String M04 = org.telegram.messenger.hd.M0(2131748435, null);
                    boolean z16 = org.telegram.messenger.iz.f23420u0;
                    j6Var4.f29362a.setText(M03);
                    TextView textView = j6Var4.f29363b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    j6Var4.f29364c.a(z16, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i19);
                    j6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.r6.k(j6Var4, h05, null, N4, null);
                    f15.addView(j6Var4);
                    j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f50239b;

                        {
                            this.f50239b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f50239b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.iz.f23420u0 = false;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K = themeActivity2.f42009b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f42007a.t(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.ia.c(2131624120, 2131747309, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ex(26, themeActivity2, atomicReference4));
                                    org.telegram.messenger.iz.f23420u0 = true;
                                    org.telegram.messenger.iz.y();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.d1 K2 = themeActivity2.f42009b.K(themeActivity2.M);
                                    if (K2 != null) {
                                        themeActivity2.f42007a.t(K2, themeActivity2.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f27293a.R = org.telegram.messenger.hd.M0(2131748438, null);
                    alertDialog$Builder3.o(f15);
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27293a;
                    atomicReference3.set(u1Var3);
                    themeActivity.showDialog(u1Var3);
                }
            } else if (i7 == themeActivity.D) {
                org.telegram.messenger.iz.f23428x0 = !org.telegram.messenger.iz.f23428x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.iz.f23428x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.t0.f25563b);
                org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24467s0).m();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f23428x0);
                }
            } else if (i7 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().S4()) {
                    by0 by0Var = new by0(12, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f27293a.R = org.telegram.messenger.hd.M0(2131751813, null);
                    alertDialog$Builder4.f27293a.T = org.telegram.messenger.hd.M0(2131751814, null);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751817, null), new lk0(15, themeActivity, by0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f27293a);
                    return;
                }
                themeActivity.getMessagesController().F4(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                }
            } else if (i7 != themeActivity.P) {
                if (i7 == themeActivity.Q) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f27293a.R = org.telegram.messenger.hd.M0(2131745292, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751601, "Default"), org.telegram.messenger.hd.M0(2131745288, "SortFirstName"), org.telegram.messenger.hd.M0(2131745287, "SortLastName")}, new zw(themeActivity, i7, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f27293a);
                    }
                } else if (i7 == themeActivity.f42032s0) {
                    int i20 = org.telegram.messenger.iz.f23364a;
                    if (!org.telegram.messenger.rc.e(256)) {
                        d = 256 | org.telegram.messenger.rc.d(true);
                    } else {
                        d = org.telegram.messenger.rc.d(true) & (-257);
                    }
                    org.telegram.messenger.rc.f25267i = d;
                    org.telegram.messenger.rc.k();
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f());
                    }
                } else if (i7 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.hd.f22878a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f22878a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                        if (org.telegram.ui.ActionBar.k6.f28043o == 0) {
                            org.telegram.ui.ActionBar.k6.f28043o = 2;
                            h5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.k6.f28043o = 0;
                            h5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.k6.w1();
                        org.telegram.ui.ActionBar.k6.F(true);
                        if (org.telegram.ui.ActionBar.k6.f28043o != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            M0 = org.telegram.ui.ActionBar.k6.C0();
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
                        }
                        if (z9) {
                            int i21 = org.telegram.ui.ActionBar.k6.f28043o;
                            if (i21 == 1) {
                                M02 = org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                M02 = org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault");
                            } else {
                                M02 = org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive");
                            }
                            M0 = a8.p0.D(M02, " ", M0);
                        }
                        h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), M0, 2131231843, z9, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i7 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.hd.f22878a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f22878a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
                        org.telegram.messenger.qp messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f24946y8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.u5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        h5Var2.setChecked(themeActivity.getMessagesController().M2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.o1(null));
                } else if (i7 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.k6.f28043o != 0) {
                        org.telegram.ui.ActionBar.k6.f28043o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i7 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.k6.f28043o != 1) {
                        org.telegram.ui.ActionBar.k6.f28043o = 1;
                        if (org.telegram.ui.ActionBar.k6.f28062p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i7 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.k6.f28043o != 2) {
                        org.telegram.ui.ActionBar.k6.f28043o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i7 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.k6.f28043o != 3) {
                        org.telegram.ui.ActionBar.k6.f28043o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i7 == themeActivity.X) {
                    boolean z17 = !org.telegram.ui.ActionBar.k6.f28062p;
                    org.telegram.ui.ActionBar.k6.f28062p = z17;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z17);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.k6.f28062p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.k6.F(false);
                } else if (i7 != themeActivity.f42008a0 && i7 != themeActivity.f42010b0) {
                    if (i7 == themeActivity.Y) {
                        themeActivity.G0(null, true);
                    } else if (i7 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i7 == themeActivity.f42041y0) {
                        themeActivity.C0();
                    } else if (i7 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i7 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new w90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i7 == themeActivity.f42008a0) {
                        i10 = org.telegram.ui.ActionBar.k6.f28101r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f28121s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f42008a0;
                            int i27 = i7;
                            org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.k6.f28101r = i25;
                                w9Var2.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.k6.f28121s = i25;
                            w9Var2.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, by0 by0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.ex(27, themeActivity, by0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z9) {
        if (i7 == org.telegram.messenger.iz.Y0) {
            return false;
        }
        org.telegram.messenger.iz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.iz.Y0);
        edit.commit();
        v4.d1 K = themeActivity.f42009b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f56951a;
            if (view instanceof g61) {
                g61 g61Var = (g61) view;
                org.telegram.ui.Cells.q1[] cells = g61Var.f45872a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().Q1 = false;
                    cells[i10].requestLayout();
                }
                g61Var.invalidate();
            }
        }
        v4.d1 K2 = themeActivity.f42009b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f56951a;
            if (view2 instanceof w51) {
                w51 w51Var = (w51) view2;
                if (z9) {
                    w51Var.requestLayout();
                } else {
                    w51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.iz.W0) {
            org.telegram.messenger.iz.W0 = i7;
            org.telegram.messenger.iz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25563b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.iz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.k6.Q();
                v4.d1 K = themeActivity.f42009b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f56951a;
                    if (view instanceof g61) {
                        org.telegram.ui.Cells.q1[] cells = ((g61) view).f45872a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().Q1 = false;
                            cells[i10].requestLayout();
                        }
                    }
                }
                themeActivity.E0();
                return true;
            }
        }
        return false;
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131748257, "NewTheme");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131751712, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751704, "CreateTheme"), new n51(this, 2));
        showDialog(u1Var);
    }

    public final void C0() {
        boolean z9;
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        boolean z10 = true;
        if (D0.k(false).f27516a >= 100) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f42016f != 1) {
            z10 = false;
        }
        presentFragment(new u71(D0, false, 1, z9, z10));
    }

    public final void E0() {
        int i7;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (this.f42031s == null) {
            return;
        }
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        org.telegram.ui.ActionBar.h6 k10 = D0.k(false);
        ArrayList arrayList = D0.f27629b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f27516a >= 100) {
            this.f42031s.S(2);
            this.f42031s.S(3);
        } else {
            this.f42031s.t(2);
            this.f42031s.t(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 18;
        } else {
            i7 = 16;
        }
        org.telegram.ui.ActionBar.j6 D02 = org.telegram.ui.ActionBar.k6.D0();
        if (org.telegram.messenger.iz.W0 == i7 && org.telegram.messenger.iz.Y0 == 17 && D02.S && D02.Y == org.telegram.ui.ActionBar.k6.f28025n && (k10 == null || (c6Var = k10.f27537y) == null || "d".equals(c6Var.f27401c))) {
            this.f42031s.t(4);
        } else {
            this.f42031s.S(4);
        }
    }

    public final void F0(boolean z9) {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        org.telegram.ui.ActionBar.j6 D0;
        boolean z12;
        TLRPC.TL_theme tL_theme;
        int i21 = this.J0;
        int i22 = this.f42028q0;
        int i23 = this.f42041y0;
        int i24 = this.E;
        this.J0 = 0;
        this.P = -1;
        this.Q = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f42019h0 = -1;
        this.f42008a0 = -1;
        this.f42010b0 = -1;
        this.f42012c0 = -1;
        this.f42026o0 = -1;
        this.f42027p0 = -1;
        this.f42028q0 = -1;
        this.f42030r0 = -1;
        this.f42018g0 = -1;
        this.f42013d0 = -1;
        this.f42015e0 = -1;
        this.f42017f0 = -1;
        this.f42038x = -1;
        this.f42020i0 = -1;
        this.f42021j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f42022k0 = -1;
        this.f42023l0 = -1;
        this.m0 = -1;
        this.f42025n0 = -1;
        this.f42032s0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.liteModeRow = -1;
        this.G0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f42040y = -1;
        this.D = -1;
        this.sensitiveContentRow = -1;
        this.N = -1;
        this.E = -1;
        this.raiseToListenRow = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.f42033t0 = -1;
        this.f42034u0 = -1;
        this.f42035v0 = -1;
        this.f42037w0 = -1;
        this.f42039x0 = -1;
        this.f42041y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f42042z0 = -1;
        ArrayList arrayList = this.f42014e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        int i25 = 0;
        while (true) {
            i7 = this.f42016f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i25);
            if (i7 == 0 || i7 == 3 || ((j6Var.f27628b != null || j6Var.q()) && ((tL_theme = j6Var.F) == null || tL_theme.document != null))) {
                if (j6Var.f27628b != null) {
                    arrayList2.add(j6Var);
                } else {
                    arrayList.add(j6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new un0(4));
        if (i7 == 3) {
            int i26 = this.J0;
            this.f42037w0 = i26;
            this.f42027p0 = i26 + 1;
            this.f42025n0 = i26 + 2;
            this.f42039x0 = i26 + 3;
            this.f42020i0 = i26 + 4;
            this.J0 = i26 + 6;
            this.f42026o0 = i26 + 5;
            if (org.telegram.ui.ActionBar.k6.D0().W != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f42036w = z12;
            d61 d61Var = this.f42011c;
            if (d61Var != null) {
                d61Var.setDrawDivider(z12);
            }
            if (this.f42036w) {
                int i27 = this.J0;
                this.J0 = i27 + 1;
                this.f42028q0 = i27;
            }
            int i28 = this.J0;
            this.J0 = i28 + 1;
            this.f42022k0 = i28;
            org.telegram.ui.ActionBar.j6 D02 = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.h6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f27629b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f27516a >= 100) {
                int i29 = this.J0;
                this.J0 = i29 + 1;
                this.f42041y0 = i29;
            }
            int i30 = this.J0;
            this.createNewThemeRow = i30;
            this.J0 = i30 + 2;
            this.f42042z0 = i30 + 1;
        } else if (i7 == 0) {
            int i31 = this.J0;
            this.f42038x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f42019h0 = i31 + 4;
            this.f42020i0 = i31 + 5;
            this.f42027p0 = i31 + 6;
            this.f42030r0 = i31 + 7;
            this.f42021j0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f42022k0 = i31 + 10;
            this.f42023l0 = i31 + 11;
            this.m0 = i31 + 12;
            this.f42025n0 = i31 + 13;
            this.H0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.I0 = i31 + 16;
            this.f42033t0 = i31 + 17;
            this.f42034u0 = i31 + 18;
            this.f42035v0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.stickersRow = i31 + 23;
            this.B0 = i31 + 24;
            this.E0 = i31 + 25;
            this.F = i31 + 26;
            int i32 = i31 + 28;
            this.J0 = i32;
            this.raiseToListenRow = i31 + 27;
            if (org.telegram.messenger.iz.f23414s0) {
                this.J0 = i31 + 29;
                this.E = i32;
            }
            int i33 = this.J0;
            this.pauseOnRecordRow = i33;
            this.pauseOnMediaRow = i33 + 1;
            this.M = i33 + 2;
            this.C0 = i33 + 3;
            this.F0 = i33 + 4;
            this.J0 = i33 + 6;
            this.D = i33 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f24836m8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i34 = this.J0;
                this.J0 = i34 + 1;
                this.sensitiveContentRow = i34;
            }
            int i35 = this.J0;
            this.G = i35;
            this.K = i35 + 1;
            this.J0 = i35 + 3;
            this.D0 = i35 + 2;
        } else {
            int i36 = this.J0;
            this.R = i36;
            this.S = i36 + 1;
            int i37 = i36 + 3;
            this.J0 = i37;
            this.T = i36 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i36 + 4;
                this.U = i37;
            }
            int i38 = this.J0;
            int i39 = i38 + 1;
            this.J0 = i39;
            this.V = i38;
            int i40 = org.telegram.ui.ActionBar.k6.f28043o;
            if (i40 == 1) {
                this.W = i39;
                int i41 = i38 + 3;
                this.J0 = i41;
                this.X = i38 + 2;
                if (org.telegram.ui.ActionBar.k6.f28062p) {
                    this.Y = i41;
                    this.J0 = i38 + 5;
                    this.Z = i38 + 4;
                } else {
                    this.f42008a0 = i41;
                    this.f42010b0 = i38 + 4;
                    this.J0 = i38 + 6;
                    this.f42012c0 = i38 + 5;
                }
            } else if (i40 == 2) {
                this.f42013d0 = i39;
                this.f42015e0 = i38 + 2;
                this.J0 = i38 + 4;
                this.f42017f0 = i38 + 3;
            }
            if (org.telegram.ui.ActionBar.k6.f28043o != 0) {
                int i42 = this.J0;
                this.f42018g0 = i42;
                this.J0 = i42 + 2;
                this.f42026o0 = i42 + 1;
                if (org.telegram.ui.ActionBar.k6.J.W != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42036w = z10;
                d61 d61Var2 = this.f42011c;
                if (d61Var2 != null) {
                    d61Var2.setDrawDivider(z10);
                }
                if (this.f42036w) {
                    int i43 = this.J0;
                    this.J0 = i43 + 1;
                    this.f42028q0 = i43;
                }
                int i44 = this.J0;
                this.J0 = i44 + 1;
                this.f42030r0 = i44;
            }
        }
        d61 d61Var3 = this.f42011c;
        if (d61Var3 != null) {
            int width = this.f42009b.getWidth();
            int i45 = d61Var3.f29221n3;
            org.telegram.ui.Cells.fa faVar = d61Var3.j3;
            if (i45 != faVar.b()) {
                faVar.f();
                if (d61Var3.f29220m3 == 1) {
                    D0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.k6.D0();
                }
                if (d61Var3.f29217i3 != D0) {
                    d61Var3.A1(width);
                }
            }
        }
        f61 f61Var = this.f42007a;
        if (f61Var != null) {
            if (i7 == 1 && (i14 = this.L0) != (i15 = org.telegram.ui.ActionBar.k6.f28043o) && i14 != -1) {
                int i46 = this.V;
                int i47 = i46 + 1;
                if (i14 != i15) {
                    for (int i48 = 0; i48 < 4; i48++) {
                        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.f42009b.K(i48);
                        if (xi0Var != null) {
                            View view = xi0Var.f56951a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                                if (i48 == org.telegram.ui.ActionBar.k6.f28043o) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                aaVar.setTypeChecked(z11);
                            }
                        }
                    }
                    int i49 = org.telegram.ui.ActionBar.k6.f28043o;
                    if (i49 == 0) {
                        this.f42007a.p(i47, i21 - i47);
                    } else if (i49 == 1) {
                        int i50 = this.L0;
                        if (i50 == 0) {
                            this.f42007a.o(i47, this.J0 - i47);
                        } else if (i50 == 2) {
                            this.f42007a.p(i47, 3);
                            f61 f61Var2 = this.f42007a;
                            if (org.telegram.ui.ActionBar.k6.f28062p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            f61Var2.o(i47, i20);
                        } else if (i50 == 3) {
                            f61 f61Var3 = this.f42007a;
                            if (org.telegram.ui.ActionBar.k6.f28062p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            f61Var3.o(i47, i19);
                        }
                    } else if (i49 == 2) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f42007a.o(i47, this.J0 - i47);
                        } else if (i51 == 1) {
                            f61 f61Var4 = this.f42007a;
                            if (org.telegram.ui.ActionBar.k6.f28062p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            f61Var4.p(i47, i18);
                            this.f42007a.o(i47, 3);
                        } else if (i51 == 3) {
                            this.f42007a.o(i47, 3);
                        }
                    } else if (i49 == 3) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f42007a.o(i47, this.J0 - i47);
                        } else if (i52 == 2) {
                            this.f42007a.p(i47, 3);
                        } else if (i52 == 1) {
                            f61 f61Var5 = this.f42007a;
                            if (org.telegram.ui.ActionBar.k6.f28062p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            f61Var5.p(i47, i17);
                        }
                    }
                } else {
                    boolean z13 = this.M0;
                    boolean z14 = org.telegram.ui.ActionBar.k6.f28062p;
                    if (z13 != z14) {
                        int i53 = i46 + 3;
                        if (z14) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        f61Var.p(i53, i16);
                        f61 f61Var6 = this.f42007a;
                        if (org.telegram.ui.ActionBar.k6.f28062p) {
                            i10 = 2;
                        }
                        f61Var6.o(i53, i10);
                    }
                }
            } else if (!z9 && this.L0 != -1) {
                if (i22 == -1 && (i13 = this.f42028q0) != -1) {
                    f61Var.i(i13);
                } else if (i22 != -1 && this.f42028q0 == -1) {
                    f61Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i54 = this.f42028q0;
                    if (i54 != -1) {
                        f61Var.g(i54);
                    }
                }
                if (i23 == -1 && (i12 = this.f42041y0) != -1) {
                    this.f42007a.i(i12);
                } else if (i23 != -1 && this.f42041y0 == -1) {
                    this.f42007a.s(i23);
                }
                if (i24 == -1 && (i11 = this.E) != -1) {
                    this.f42007a.i(i11);
                } else if (i24 != -1 && this.E == -1) {
                    this.f42007a.s(i24);
                }
            } else {
                f61Var.f();
            }
        }
        if (i7 == 1) {
            this.M0 = org.telegram.ui.ActionBar.k6.f28062p;
            this.L0 = org.telegram.ui.ActionBar.k6.f28043o;
        }
        E0();
    }

    public final void G0(Location location, boolean z9) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i7 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131749529, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, "ConnectingToProxyEnable"), new n51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        showDialog(alertDialog$Builder.f27293a);
                        return;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                return;
            }
        }
        try {
            location = locationManager.getLastKnownLocation("gps");
            if (location == null) {
                location = locationManager.getLastKnownLocation("network");
            }
            if (location == null) {
                location = locationManager.getLastKnownLocation("passive");
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (location == null || z9) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.f28215x = location.getLatitude();
        org.telegram.ui.ActionBar.k6.f28234y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.k6.f28215x, org.telegram.ui.ActionBar.k6.f28234y);
        org.telegram.ui.ActionBar.k6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.k6.f28139t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.k6.f28196w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.k6.f28158u = calendar.get(5);
        Utilities.f21333e.c(new o51(this, 0));
        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.f42009b.K(this.Z);
        if (xi0Var != null) {
            View view = xi0Var.f56951a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.k6.f28062p && org.telegram.ui.ActionBar.k6.f28043o == 1) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28263zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28245yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28227xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28094qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28074pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28054ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.U0 = !org.telegram.ui.ActionBar.k6.k1();
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f42016f;
        if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
            org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.S0 = zg0Var;
            if (this.U0) {
                zg0Var.M(zg0Var.f40976e[0] - 1);
            } else {
                zg0Var.M(0);
            }
            org.telegram.ui.Components.zg0 zg0Var2 = this.S0;
            zg0Var2.h = true;
            o4.getClass();
            this.f42031s = o4.c(5, 0, null, zg0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131231244);
            this.f42031s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
            this.f42031s.e(2, 2131232363, org.telegram.messenger.hd.M0(2131745427, "ShareTheme"));
            this.f42031s.e(3, 2131232116, org.telegram.messenger.hd.M0(2131751220, "EditThemeColors"));
            this.f42031s.e(1, 2131232270, org.telegram.messenger.hd.M0(2131751710, "CreateNewThemeMenu"));
            this.f42031s.e(4, 2131232341, org.telegram.messenger.hd.M0(2131744149, "ThemeResetToDefaults"));
            if (getMessagesController().f24836m8 == null) {
                getMessagesController().R0(new r3(this, 24));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new v51(this));
        this.f42007a = new f61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f42009b = pj0Var;
        pj0Var.r1();
        this.f42009b.setSectionsDrawBackground(true);
        this.f42009b.setLayoutManager(new v4.b0(1, false));
        this.f42009b.setVerticalScrollBarEnabled(false);
        this.f42009b.setAdapter(this.f42007a);
        ((v4.k) this.f42009b.getItemAnimator()).C = false;
        frameLayout.addView(this.f42009b, c8.ha.c(-1.0f, -1));
        this.f42009b.setOnItemClickListener(new lk0(16, this, context));
        if (i7 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.xq.h);
            kVar.C = false;
            kVar.f56978m = false;
            this.f42009b.setItemAnimator(kVar);
        }
        if (this.T0) {
            F0(false);
            this.T0 = false;
            this.f42009b.v0(this.f42007a.f45507e.J0 - 1);
            org.telegram.messenger.g0.i3(new o51(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u1 u1Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i7 == org.telegram.messenger.qs.f25085v4) {
            G0(null, true);
        } else if (i7 != org.telegram.messenger.qs.f25113z4 && i7 != org.telegram.messenger.qs.f25009i4) {
            if (i7 == org.telegram.messenger.qs.R5) {
                f61 f61Var = this.f42007a;
                if (f61Var != null && (i14 = this.browserRow) != -1) {
                    f61Var.g(i14);
                }
            } else if (i7 == org.telegram.messenger.qs.f25052q4) {
                f61 f61Var2 = this.f42007a;
                if (f61Var2 != null && (i13 = this.f42028q0) != -1) {
                    f61Var2.h(i13, new Object());
                }
            } else if (i7 == org.telegram.messenger.qs.o4) {
                F0(true);
            } else {
                if (i7 == org.telegram.messenger.qs.M2) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (j6Var == this.h && h6Var == this.f42024n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().U2);
                        sb2.append("/addtheme/");
                        if (h6Var != null) {
                            tL_theme = h6Var.f27531r;
                        } else {
                            tL_theme = j6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.mo0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.u1 u1Var2 = this.f42029r;
                        if (u1Var2 != null) {
                            u1Var2.dismiss();
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.N2) {
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (j6Var2 == this.h && h6Var2 == this.f42024n && (u1Var = this.f42029r) == null) {
                        u1Var.dismiss();
                    }
                } else if (i7 == org.telegram.messenger.qs.f25066s4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.j6) objArr[0];
                        this.f42024n = (org.telegram.ui.ActionBar.h6) objArr[1];
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                        this.f42029r = u1Var3;
                        u1Var3.f28569i0 = true;
                        showDialog(u1Var3, new q5(this, 16));
                    }
                } else if (i7 == org.telegram.messenger.qs.f25072t4) {
                    E0();
                    if (this.f42016f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.k6.k1();
                        boolean z9 = !k12;
                        if (this.U0 != z9) {
                            this.U0 = z9;
                            org.telegram.ui.Components.zg0 zg0Var = this.S0;
                            if (!k12) {
                                i12 = zg0Var.f40976e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            zg0Var.P(i12);
                            this.f42031s.getIconView().d();
                        }
                        if (this.f42027p0 >= 0) {
                            for (int i15 = 0; i15 < this.f42009b.getChildCount(); i15++) {
                                if (this.f42009b.getChildAt(i15) instanceof tt) {
                                    ((tt) this.f42009b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.U4) {
                    int i16 = this.f42027p0;
                    if (i16 >= 0) {
                        this.f42007a.g(i16);
                    }
                } else if ((i7 == org.telegram.messenger.qs.S3 || i7 == org.telegram.messenger.qs.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f42007a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.pj0 pj0Var = this.f42009b;
            if (pj0Var != null) {
                pj0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f42009b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, g61.class, w51.class, c61.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, e61.class, org.telegram.ui.Cells.m8.class, nl0.class, org.telegram.ui.Components.uw0.class, tt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28129s8));
        int i7 = org.telegram.ui.ActionBar.k6.f28089q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{c61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27905g7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{c61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27819be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27910gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27839ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27818bc));
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42009b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.addAll(c8.ma.a(new f6(22, this), i12, org.telegram.ui.ActionBar.k6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25085v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25113z4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25052q4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25066s4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25072t4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R5);
        if (this.f42016f == 0) {
            org.telegram.ui.ActionBar.k6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.k6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25085v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25113z4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25052q4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25066s4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25072t4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R5);
        org.telegram.ui.ActionBar.k6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f42007a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
