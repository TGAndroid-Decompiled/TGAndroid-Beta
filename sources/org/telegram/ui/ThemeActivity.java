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
public class ThemeActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int A0;
    public int B0;
    public int C0;
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
    public int K0;
    public int L;
    public boolean L0;
    public int M;
    public int M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public final n51 R0;
    public int S;
    public final n51 S0;
    public int T;
    public org.telegram.ui.Components.ch0 T0;
    public int U;
    public boolean U0;
    public int V;
    public boolean V0;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public v51 f42041a;
    public int f42042a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.tj0 f42043b;
    public int f42044b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public t51 f42045c;
    public int f42046c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f42047d0;
    public final ArrayList f42048e;
    public int f42049e0;
    public final int f42050f;
    public int f42051f0;
    public int f42052g0;
    public org.telegram.ui.ActionBar.j6 h;
    public int f42053h0;
    public int f42054i0;
    public int f42055j0;
    public int f42056k0;
    public int f42057l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.g6 f42058n;
    public int f42059n0;
    private int nightThemeRow;
    public int f42060o0;
    public int f42061p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f42062q0;
    public org.telegram.ui.ActionBar.s1 f42063r;
    public int f42064r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.f5 f42065s;
    public int f42066s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f42067t0;
    private int textSizeRow;
    public int f42068u0;
    public int f42069v0;
    public boolean f42070w;
    public int f42071w0;
    public int f42072x;
    public int f42073x0;
    public int f42074y;
    public int f42075y0;
    public int f42076z0;

    public static class InnerAccentView extends View {
        public final Paint f42077a;
        public ObjectAnimator f42078b;
        public float f42079c;
        public org.telegram.ui.ActionBar.j6 d;
        public org.telegram.ui.ActionBar.g6 f42080e;
        public boolean f42081f;

        public InnerAccentView(Context context) {
            super(context);
            this.f42077a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Z == this.f42080e.f27525a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42081f = z11;
            ObjectAnimator objectAnimator = this.f42078b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z10) {
                if (this.f42081f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f42078b = ofFloat;
                ofFloat.setDuration(200L);
                this.f42078b.start();
                return;
            }
            if (this.f42081f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f42079c;
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
            int i3 = this.f42080e.f27527c;
            Paint paint = this.f42077a;
            paint.setColor(i3);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f42079c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f42079c), paint);
            if (this.f42079c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f42079c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f42079c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f42079c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f42080e.f27528e;
            if (i10 != 0 && this.f42079c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f42079c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f42081f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i3, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f42079c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i3) {
        super(null);
        this.d = new ArrayList();
        this.f42048e = new ArrayList();
        this.R0 = new n51(this);
        this.S0 = new n51(this);
        this.f42050f = i3;
        F0(true);
    }

    public static String D0() {
        int i3 = org.telegram.ui.ActionBar.k6.v;
        int i10 = i3 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i3 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.k6.f28170t;
        int i12 = i11 / 60;
        return org.telegram.messenger.bd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i3, final Context context, final org.telegram.messenger.u10 u10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        final org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        final String str = s12.f23137u6;
        String str2 = s12.f23146v6;
        final int i10 = s12.f23156w6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) s12.f23167x7.f24667m.f13688b).f22814c) {
            org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            l10.O = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, e6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, b8.mf.e(50, 50, 17));
            f10.addView(frameLayout, b8.mf.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
            TextView b10 = b8.rf.b(context, 20.0f, i12, true, e6Var);
            b10.setText(org.telegram.messenger.bd.M0(2131754307, null));
            b10.setGravity(17);
            f10.addView(b10, b8.mf.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = b8.rf.b(context, 14.0f, i12, false, e6Var);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.N0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, b8.mf.t(-1, -2, 7, 24, 0, 24, 0));
            final gi.d dVar = new gi.d(context, e6Var, true);
            dVar.i(org.telegram.messenger.bd.M0(2131754313, null), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final gi.d dVar2 = gi.d.this;
                    if (dVar2.R) {
                        return;
                    }
                    dVar2.setLoading(true);
                    final org.telegram.messenger.hp hpVar = s12;
                    final String str3 = str;
                    final int i13 = i3;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.u10 u10Var2 = u10Var;
                    final org.telegram.ui.ActionBar.t2[] t2VarArr = r9;
                    b8.nf.c(2131624116, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.u10() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final gi.d dVar3 = gi.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.hp hpVar2 = hpVar;
                            org.telegram.messenger.k10 d22 = hpVar2.d2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.u10 u10Var3 = u10Var2;
                            final org.telegram.ui.ActionBar.t2[] t2VarArr2 = t2VarArr;
                            d22.a(str3, null, new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l11 = (Long) obj2;
                                    gi.d dVar4 = gi.d.this;
                                    if (l11 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User a22 = hpVar2.a2(l11);
                                    if (a22 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                    if (T == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    ii.q4 b12 = ii.q4.b(i15, l11.longValue(), l11.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                    final ii.a3 a3Var = new ii.a3(context3, e6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.u10 u10Var4 = u10Var3;
                                    ?? r62 = new org.telegram.messenger.r10() {
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
                                            u10Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.k5.o(null, 2131754309, org.telegram.ui.Components.fc.a0(T2), 2131623989, 36);
                                            }
                                        }
                                    };
                                    a3Var.M0 = r62;
                                    ii.s2 s2Var = a3Var.E;
                                    if (s2Var != 0) {
                                        s2Var.setOnVerifiedAge(r62);
                                    }
                                    a3Var.B(true);
                                    a3Var.C0 = false;
                                    a3Var.m0 = T.getParentActivity();
                                    a3Var.x(T, b12);
                                    a3Var.show();
                                    dVar4.setLoading(false);
                                    t2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, b8.mf.t(-1, 48, 7, 2, 29, 2, 14));
            l10.show();
            final org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
            l10.N();
            return;
        }
        u10Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        v51 v51Var;
        boolean z10;
        org.telegram.ui.Components.tj0 tj0Var = themeActivity.f42043b;
        if (tj0Var != null && tj0Var.H && (v51Var = themeActivity.f42041a) != null) {
            int i3 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                v51Var.g(i3);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i3, float f10) {
        int i10;
        int i11;
        boolean z10;
        String M0;
        String M02;
        int d;
        boolean z11;
        boolean z12;
        if (i3 == themeActivity.O) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z13 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            org.telegram.messenger.az.C1 = Boolean.valueOf(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z14);
            }
        } else if (i3 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i3 == themeActivity.changeUserColor) {
            cm0 cm0Var = new cm0();
            cm0Var.I = themeActivity;
            themeActivity.presentFragment(cm0Var);
        } else if (i3 == themeActivity.H) {
            SharedPreferences e13 = org.telegram.messenger.hp.e1();
            boolean z15 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            }
        } else if (i3 == themeActivity.F) {
            org.telegram.messenger.az.f21659r0 = !org.telegram.messenger.az.f21659r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.hp.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.az.f21659r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.f21659r0);
            }
        } else if (i3 == themeActivity.G) {
            org.telegram.messenger.az.f21665t0 = !org.telegram.messenger.az.f21665t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.hp.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.az.f21665t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.f21665t0);
            }
        } else if (i3 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.az.f21662s0 = !org.telegram.messenger.az.f21662s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.hp.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.az.f21662s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.f21662s0);
            }
            if (!org.telegram.messenger.az.f21662s0 && themeActivity.F != -1) {
                for (int i12 = 0; i12 < themeActivity.f42043b.getChildCount(); i12++) {
                    View childAt = themeActivity.f42043b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q8) {
                        themeActivity.f42043b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.q8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i3 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.az.F0 = !org.telegram.messenger.az.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.hp.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.az.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.F0);
            }
        } else if (i3 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.az.G0 = !org.telegram.messenger.az.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.hp.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.az.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i3 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131751367, "DistanceUnitsAutomatic"), org.telegram.messenger.bd.M0(2131751366, "DistanceUnitsKilometers"), org.telegram.messenger.bd.M0(2131751365, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        float f13 = f11;
                        i6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                        i6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.az.f21663s1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i6Var.b(charSequence, z12);
                        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                        i6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(i6Var, h02, null, N, null);
                        f12.addView(i6Var);
                        i6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f46506b;

                            {
                                this.f46506b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f46506b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.az.f21663s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.az.f21663s1);
                                        edit8.apply();
                                        org.telegram.messenger.bd.f21790g0 = null;
                                        themeActivity2.P0 = true;
                                        u4.d1 K = themeActivity2.f42043b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f42041a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.az.f21653p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.hp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.az.f21653p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f46506b;
                                        themeActivity3.Q0 = true;
                                        u4.d1 K2 = themeActivity3.f42043b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f42041a.t(K2, themeActivity3.M);
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
                    alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131751364, "DistanceUnitsTitle");
                    alertDialog$Builder.o(f12);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    atomicReference.set(s1Var);
                    themeActivity.showDialog(s1Var);
                }
            } else if (i3 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.d1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i15 = 0; i15 < size; i15++) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.d1) b10.get(i15)).f50829a;
                        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                        i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        i6Var2.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.az.f21653p0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i6Var2.b(charSequence2, z11);
                        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                        i6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.r6.k(i6Var2, h03, null, N2, null);
                        f14.addView(i6Var2);
                        i6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f46506b;

                            {
                                this.f46506b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f46506b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.az.f21663s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.az.f21663s1);
                                        edit8.apply();
                                        org.telegram.messenger.bd.f21790g0 = null;
                                        themeActivity2.P0 = true;
                                        u4.d1 K = themeActivity2.f42043b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f42041a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.az.f21653p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.hp.e1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.az.f21653p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f46506b;
                                        themeActivity3.Q0 = true;
                                        u4.d1 K2 = themeActivity3.f42043b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f42041a.t(K2, themeActivity3.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f27343a.S = org.telegram.messenger.bd.M0(2131745809, null);
                    alertDialog$Builder2.o(f14);
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    atomicReference2.set(s1Var2);
                    themeActivity.showDialog(s1Var2);
                }
            } else if (i3 == themeActivity.N) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
                    org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.k6.g7;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.k6.E5;
                    i6Var3.a(x02, org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                    i6Var3.b(org.telegram.messenger.bd.M0(2131748446, null), !org.telegram.messenger.az.f21668u0);
                    int i19 = org.telegram.ui.ActionBar.k6.f27972i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i19);
                    i6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.r6.k(i6Var3, h04, null, N3, null);
                    f15.addView(i6Var3);
                    i6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f46778b;

                        {
                            this.f46778b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f46778b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.az.f21668u0 = false;
                                    org.telegram.messenger.az.y();
                                    themeActivity2.O0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u4.d1 K = themeActivity2.f42043b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f42041a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    b8.nf.c(2131624120, 2131747318, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ei(29, themeActivity2, atomicReference4));
                                    org.telegram.messenger.az.f21668u0 = true;
                                    org.telegram.messenger.az.y();
                                    themeActivity2.O0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u4.d1 K2 = themeActivity2.f42043b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f42041a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.i6 i6Var4 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                    i6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    i6Var4.a(org.telegram.ui.ActionBar.k6.x0(null, i17, false), org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                    String M03 = org.telegram.messenger.bd.M0(2131748443, null);
                    String M04 = org.telegram.messenger.bd.M0(2131748444, null);
                    boolean z17 = org.telegram.messenger.az.f21668u0;
                    i6Var4.f29376a.setText(M03);
                    TextView textView = i6Var4.f29377b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    i6Var4.f29378c.a(z17, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i19);
                    i6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.r6.k(i6Var4, h05, null, N4, null);
                    f15.addView(i6Var4);
                    i6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f46778b;

                        {
                            this.f46778b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f46778b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.az.f21668u0 = false;
                                    org.telegram.messenger.az.y();
                                    themeActivity2.O0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u4.d1 K = themeActivity2.f42043b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f42041a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    b8.nf.c(2131624120, 2131747318, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ei(29, themeActivity2, atomicReference4));
                                    org.telegram.messenger.az.f21668u0 = true;
                                    org.telegram.messenger.az.y();
                                    themeActivity2.O0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    u4.d1 K2 = themeActivity2.f42043b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f42041a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f27343a.S = org.telegram.messenger.bd.M0(2131748447, null);
                    alertDialog$Builder3.o(f15);
                    alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                    atomicReference3.set(s1Var3);
                    themeActivity.showDialog(s1Var3);
                }
            } else if (i3 == themeActivity.E) {
                org.telegram.messenger.az.f21676x0 = !org.telegram.messenger.az.f21676x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.hp.e1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.az.f21676x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.t0.f25457b);
                org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).m();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.f21676x0);
                }
            } else if (i3 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().S4()) {
                    qv0 qv0Var = new qv0(17, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f27343a.S = org.telegram.messenger.bd.M0(2131751813, null);
                    alertDialog$Builder4.f27343a.U = org.telegram.messenger.bd.M0(2131751814, null);
                    alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751817, null), new rb0(23, themeActivity, qv0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f27343a);
                    return;
                }
                themeActivity.getMessagesController().F4(false);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().S4());
                }
            } else if (i3 != themeActivity.Q) {
                if (i3 == themeActivity.R) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f27343a.S = org.telegram.messenger.bd.M0(2131745301, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131751601, "Default"), org.telegram.messenger.bd.M0(2131745297, "SortFirstName"), org.telegram.messenger.bd.M0(2131745296, "SortLastName")}, new xw(themeActivity, i3, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f27343a);
                    }
                } else if (i3 == themeActivity.f42067t0) {
                    int i20 = org.telegram.messenger.az.f21612a;
                    if (!org.telegram.messenger.lc.e(256)) {
                        d = 256 | org.telegram.messenger.lc.d(true);
                    } else {
                        d = org.telegram.messenger.lc.d(true) & (-257);
                    }
                    org.telegram.messenger.lc.f23968i = d;
                    org.telegram.messenger.lc.k();
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.f());
                    }
                } else if (i3 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.bd.f21784a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.bd.f21784a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                        if (org.telegram.ui.ActionBar.k6.f28074o == 0) {
                            org.telegram.ui.ActionBar.k6.f28074o = 2;
                            h5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.k6.f28074o = 0;
                            h5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.k6.w1();
                        org.telegram.ui.ActionBar.k6.F(true);
                        if (org.telegram.ui.ActionBar.k6.f28074o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            M0 = org.telegram.ui.ActionBar.k6.C0();
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131753783, "AutoNightThemeOff");
                        }
                        if (z10) {
                            int i21 = org.telegram.ui.ActionBar.k6.f28074o;
                            if (i21 == 1) {
                                M02 = org.telegram.messenger.bd.M0(2131753787, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                M02 = org.telegram.messenger.bd.M0(2131753786, "AutoNightSystemDefault");
                            } else {
                                M02 = org.telegram.messenger.bd.M0(2131753796, "AutoNightAdaptive");
                            }
                            M0 = a1.g.C(M02, " ", M0);
                        }
                        h5Var.b(org.telegram.messenger.bd.M0(2131753784, "AutoNightTheme"), M0, 2131231843, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i3 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.bd.f21784a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.bd.f21784a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
                        org.telegram.messenger.hp messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f23178y8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.u5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        h5Var2.setChecked(themeActivity.getMessagesController().M2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.m1(null));
                } else if (i3 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.k6.f28074o != 0) {
                        org.telegram.ui.ActionBar.k6.f28074o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i3 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.k6.f28074o != 1) {
                        org.telegram.ui.ActionBar.k6.f28074o = 1;
                        if (org.telegram.ui.ActionBar.k6.f28094p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i3 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.k6.f28074o != 2) {
                        org.telegram.ui.ActionBar.k6.f28074o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i3 == themeActivity.V) {
                    if (org.telegram.ui.ActionBar.k6.f28074o != 3) {
                        org.telegram.ui.ActionBar.k6.f28074o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.k6.F(false);
                    }
                } else if (i3 == themeActivity.Y) {
                    boolean z18 = !org.telegram.ui.ActionBar.k6.f28094p;
                    org.telegram.ui.ActionBar.k6.f28094p = z18;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z18);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.k6.f28094p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.k6.F(false);
                } else if (i3 != themeActivity.f42044b0 && i3 != themeActivity.f42046c0) {
                    if (i3 == themeActivity.Z) {
                        themeActivity.G0(null, true);
                    } else if (i3 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i3 == themeActivity.f42076z0) {
                        themeActivity.C0();
                    } else if (i3 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i3 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new t90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i3 == themeActivity.f42044b0) {
                        i10 = org.telegram.ui.ActionBar.k6.f28134r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f28152s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f42044b0;
                            int i27 = i3;
                            org.telegram.ui.Cells.v9 v9Var2 = v9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.k6.f28134r = i25;
                                v9Var2.c(org.telegram.messenger.bd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.k6.f28152s = i25;
                            v9Var2.c(org.telegram.messenger.bd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, qv0 qv0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new e51(0, themeActivity, qv0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i3, boolean z10) {
        if (i3 == org.telegram.messenger.az.Y0) {
            return false;
        }
        org.telegram.messenger.az.Y0 = i3;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.az.Y0);
        edit.commit();
        u4.d1 K = themeActivity.f42043b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f55540a;
            if (view instanceof w51) {
                w51 w51Var = (w51) view;
                org.telegram.ui.Cells.q1[] cells = w51Var.f50713a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().Q1 = false;
                    cells[i10].requestLayout();
                }
                w51Var.invalidate();
            }
        }
        u4.d1 K2 = themeActivity.f42043b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f55540a;
            if (view2 instanceof m51) {
                m51 m51Var = (m51) view2;
                if (z10) {
                    m51Var.requestLayout();
                } else {
                    m51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i3) {
        if (i3 != org.telegram.messenger.az.W0) {
            org.telegram.messenger.az.W0 = i3;
            org.telegram.messenger.az.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.az.W0);
                edit.commit();
                org.telegram.ui.ActionBar.k6.Q();
                u4.d1 K = themeActivity.f42043b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f55540a;
                    if (view instanceof w51) {
                        org.telegram.ui.Cells.q1[] cells = ((w51) view).f50713a.getCells();
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
        String M0 = org.telegram.messenger.bd.M0(2131748266, "NewTheme");
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131751712, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751704, "CreateTheme"), new c51(this, 2));
        showDialog(s1Var);
    }

    public final void C0() {
        boolean z10;
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        boolean z11 = true;
        if (D0.k(false).f27525a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42050f != 1) {
            z11 = false;
        }
        presentFragment(new l71(D0, false, 1, z10, z11));
    }

    public final void E0() {
        int i3;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (this.f42065s == null) {
            return;
        }
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        org.telegram.ui.ActionBar.g6 k10 = D0.k(false);
        ArrayList arrayList = D0.f27680c0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f27525a >= 100) {
            this.f42065s.S(2);
            this.f42065s.S(3);
        } else {
            this.f42065s.t(2);
            this.f42065s.t(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i3 = 18;
        } else {
            i3 = 16;
        }
        org.telegram.ui.ActionBar.j6 D02 = org.telegram.ui.ActionBar.k6.D0();
        if (org.telegram.messenger.az.W0 == i3 && org.telegram.messenger.az.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.k6.f28056n && (k10 == null || (b6Var = k10.f27546y) == null || "d".equals(b6Var.f27424c))) {
            this.f42065s.t(4);
        } else {
            this.f42065s.S(4);
        }
    }

    public final void F0(boolean z10) {
        int i3;
        int i10;
        boolean z11;
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
        boolean z12;
        org.telegram.ui.ActionBar.j6 D0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i21 = this.K0;
        int i22 = this.f42064r0;
        int i23 = this.f42076z0;
        int i24 = this.F;
        this.K0 = 0;
        this.Q = -1;
        this.R = -1;
        this.Y = -1;
        this.Z = -1;
        this.f42042a0 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f42054i0 = -1;
        this.f42044b0 = -1;
        this.f42046c0 = -1;
        this.f42047d0 = -1;
        this.f42061p0 = -1;
        this.f42062q0 = -1;
        this.f42064r0 = -1;
        this.f42066s0 = -1;
        this.f42053h0 = -1;
        this.f42049e0 = -1;
        this.f42051f0 = -1;
        this.f42052g0 = -1;
        this.f42072x = -1;
        this.f42055j0 = -1;
        this.f42056k0 = -1;
        this.bubbleRadiusRow = -1;
        this.f42057l0 = -1;
        this.m0 = -1;
        this.f42059n0 = -1;
        this.f42060o0 = -1;
        this.f42067t0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.liteModeRow = -1;
        this.H0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f42074y = -1;
        this.E = -1;
        this.sensitiveContentRow = -1;
        this.O = -1;
        this.F = -1;
        this.raiseToListenRow = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.f42068u0 = -1;
        this.f42069v0 = -1;
        this.f42071w0 = -1;
        this.f42073x0 = -1;
        this.f42075y0 = -1;
        this.f42076z0 = -1;
        this.createNewThemeRow = -1;
        this.I0 = -1;
        this.appIconSelectorRow = -1;
        this.J0 = -1;
        this.A0 = -1;
        ArrayList arrayList = this.f42048e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        int i25 = 0;
        while (true) {
            i3 = this.f42050f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i25);
            if (i3 == 0 || i3 == 3 || ((j6Var.f27677b != null || j6Var.q()) && ((tL_theme = j6Var.G) == null || tL_theme.document != null))) {
                if (j6Var.f27677b != null) {
                    arrayList2.add(j6Var);
                } else {
                    arrayList.add(j6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(21));
        if (i3 == 3) {
            int i26 = this.K0;
            this.f42073x0 = i26;
            this.f42062q0 = i26 + 1;
            this.f42060o0 = i26 + 2;
            this.f42075y0 = i26 + 3;
            this.f42055j0 = i26 + 4;
            this.K0 = i26 + 6;
            this.f42061p0 = i26 + 5;
            if (org.telegram.ui.ActionBar.k6.D0().X != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f42070w = z13;
            t51 t51Var = this.f42045c;
            if (t51Var != null) {
                t51Var.setDrawDivider(z13);
            }
            if (this.f42070w) {
                int i27 = this.K0;
                this.K0 = i27 + 1;
                this.f42064r0 = i27;
            }
            int i28 = this.K0;
            this.K0 = i28 + 1;
            this.f42057l0 = i28;
            org.telegram.ui.ActionBar.j6 D02 = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.g6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f27680c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f27525a >= 100) {
                int i29 = this.K0;
                this.K0 = i29 + 1;
                this.f42076z0 = i29;
            }
            int i30 = this.K0;
            this.createNewThemeRow = i30;
            this.K0 = i30 + 2;
            this.A0 = i30 + 1;
        } else if (i3 == 0) {
            int i31 = this.K0;
            this.f42072x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f42054i0 = i31 + 4;
            this.f42055j0 = i31 + 5;
            this.f42062q0 = i31 + 6;
            this.f42066s0 = i31 + 7;
            this.f42056k0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f42057l0 = i31 + 10;
            this.m0 = i31 + 11;
            this.f42059n0 = i31 + 12;
            this.f42060o0 = i31 + 13;
            this.I0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.J0 = i31 + 16;
            this.f42068u0 = i31 + 17;
            this.f42069v0 = i31 + 18;
            this.f42071w0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.stickersRow = i31 + 23;
            this.C0 = i31 + 24;
            this.F0 = i31 + 25;
            this.G = i31 + 26;
            int i32 = i31 + 28;
            this.K0 = i32;
            this.raiseToListenRow = i31 + 27;
            if (org.telegram.messenger.az.f21662s0) {
                this.K0 = i31 + 29;
                this.F = i32;
            }
            int i33 = this.K0;
            this.pauseOnRecordRow = i33;
            this.pauseOnMediaRow = i33 + 1;
            this.N = i33 + 2;
            this.D0 = i33 + 3;
            this.G0 = i33 + 4;
            this.K0 = i33 + 6;
            this.E = i33 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f23067m8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i34 = this.K0;
                this.K0 = i34 + 1;
                this.sensitiveContentRow = i34;
            }
            int i35 = this.K0;
            this.H = i35;
            this.L = i35 + 1;
            this.K0 = i35 + 3;
            this.E0 = i35 + 2;
        } else {
            int i36 = this.K0;
            this.S = i36;
            this.T = i36 + 1;
            int i37 = i36 + 3;
            this.K0 = i37;
            this.U = i36 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.K0 = i36 + 4;
                this.V = i37;
            }
            int i38 = this.K0;
            int i39 = i38 + 1;
            this.K0 = i39;
            this.W = i38;
            int i40 = org.telegram.ui.ActionBar.k6.f28074o;
            if (i40 == 1) {
                this.X = i39;
                int i41 = i38 + 3;
                this.K0 = i41;
                this.Y = i38 + 2;
                if (org.telegram.ui.ActionBar.k6.f28094p) {
                    this.Z = i41;
                    this.K0 = i38 + 5;
                    this.f42042a0 = i38 + 4;
                } else {
                    this.f42044b0 = i41;
                    this.f42046c0 = i38 + 4;
                    this.K0 = i38 + 6;
                    this.f42047d0 = i38 + 5;
                }
            } else if (i40 == 2) {
                this.f42049e0 = i39;
                this.f42051f0 = i38 + 2;
                this.K0 = i38 + 4;
                this.f42052g0 = i38 + 3;
            }
            if (org.telegram.ui.ActionBar.k6.f28074o != 0) {
                int i42 = this.K0;
                this.f42053h0 = i42;
                this.K0 = i42 + 2;
                this.f42061p0 = i42 + 1;
                if (org.telegram.ui.ActionBar.k6.J.X != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f42070w = z11;
                t51 t51Var2 = this.f42045c;
                if (t51Var2 != null) {
                    t51Var2.setDrawDivider(z11);
                }
                if (this.f42070w) {
                    int i43 = this.K0;
                    this.K0 = i43 + 1;
                    this.f42064r0 = i43;
                }
                int i44 = this.K0;
                this.K0 = i44 + 1;
                this.f42066s0 = i44;
            }
        }
        t51 t51Var3 = this.f42045c;
        if (t51Var3 != null) {
            int width = this.f42043b.getWidth();
            int i45 = t51Var3.f29286o3;
            org.telegram.ui.Cells.fa faVar = t51Var3.f29282k3;
            if (i45 != faVar.b()) {
                faVar.f();
                if (t51Var3.f29285n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.k6.D0();
                }
                if (t51Var3.f29281j3 != D0) {
                    t51Var3.A1(width);
                }
            }
        }
        v51 v51Var = this.f42041a;
        if (v51Var != null) {
            if (i3 == 1 && (i14 = this.M0) != (i15 = org.telegram.ui.ActionBar.k6.f28074o) && i14 != -1) {
                int i46 = this.W;
                int i47 = i46 + 1;
                if (i14 != i15) {
                    for (int i48 = 0; i48 < 4; i48++) {
                        org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.f42043b.K(i48);
                        if (bj0Var != null) {
                            View view = bj0Var.f55540a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                                if (i48 == org.telegram.ui.ActionBar.k6.f28074o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                aaVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i49 = org.telegram.ui.ActionBar.k6.f28074o;
                    if (i49 == 0) {
                        this.f42041a.p(i47, i21 - i47);
                    } else if (i49 == 1) {
                        int i50 = this.M0;
                        if (i50 == 0) {
                            this.f42041a.o(i47, this.K0 - i47);
                        } else if (i50 == 2) {
                            this.f42041a.p(i47, 3);
                            v51 v51Var2 = this.f42041a;
                            if (org.telegram.ui.ActionBar.k6.f28094p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            v51Var2.o(i47, i20);
                        } else if (i50 == 3) {
                            v51 v51Var3 = this.f42041a;
                            if (org.telegram.ui.ActionBar.k6.f28094p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            v51Var3.o(i47, i19);
                        }
                    } else if (i49 == 2) {
                        int i51 = this.M0;
                        if (i51 == 0) {
                            this.f42041a.o(i47, this.K0 - i47);
                        } else if (i51 == 1) {
                            v51 v51Var4 = this.f42041a;
                            if (org.telegram.ui.ActionBar.k6.f28094p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            v51Var4.p(i47, i18);
                            this.f42041a.o(i47, 3);
                        } else if (i51 == 3) {
                            this.f42041a.o(i47, 3);
                        }
                    } else if (i49 == 3) {
                        int i52 = this.M0;
                        if (i52 == 0) {
                            this.f42041a.o(i47, this.K0 - i47);
                        } else if (i52 == 2) {
                            this.f42041a.p(i47, 3);
                        } else if (i52 == 1) {
                            v51 v51Var5 = this.f42041a;
                            if (org.telegram.ui.ActionBar.k6.f28094p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            v51Var5.p(i47, i17);
                        }
                    }
                } else {
                    boolean z14 = this.N0;
                    boolean z15 = org.telegram.ui.ActionBar.k6.f28094p;
                    if (z14 != z15) {
                        int i53 = i46 + 3;
                        if (z15) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        v51Var.p(i53, i16);
                        v51 v51Var6 = this.f42041a;
                        if (org.telegram.ui.ActionBar.k6.f28094p) {
                            i10 = 2;
                        }
                        v51Var6.o(i53, i10);
                    }
                }
            } else if (!z10 && this.M0 != -1) {
                if (i22 == -1 && (i13 = this.f42064r0) != -1) {
                    v51Var.i(i13);
                } else if (i22 != -1 && this.f42064r0 == -1) {
                    v51Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i54 = this.f42064r0;
                    if (i54 != -1) {
                        v51Var.g(i54);
                    }
                }
                if (i23 == -1 && (i12 = this.f42076z0) != -1) {
                    this.f42041a.i(i12);
                } else if (i23 != -1 && this.f42076z0 == -1) {
                    this.f42041a.s(i23);
                }
                if (i24 == -1 && (i11 = this.F) != -1) {
                    this.f42041a.i(i11);
                } else if (i24 != -1 && this.F == -1) {
                    this.f42041a.s(i24);
                }
            } else {
                v51Var.f();
            }
        }
        if (i3 == 1) {
            this.N0 = org.telegram.ui.ActionBar.k6.f28094p;
            this.M0 = org.telegram.ui.ActionBar.k6.f28074o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i3 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                        alertDialog$Builder.n(i3, null);
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131749538, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751806, "ConnectingToProxyEnable"), new c51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        showDialog(alertDialog$Builder.f27343a);
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
        if (location == null || z10) {
            if (!this.L0) {
                this.L0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.R0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.S0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.f28247x = location.getLatitude();
        org.telegram.ui.ActionBar.k6.f28266y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.k6.f28247x, org.telegram.ui.ActionBar.k6.f28266y);
        org.telegram.ui.ActionBar.k6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.k6.f28170t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.k6.f28227w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.k6.f28189u = calendar.get(5);
        Utilities.f21387e.c(new d51(this, 0));
        org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.f42043b.K(this.f42042a0);
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.y8) {
                ((org.telegram.ui.Cells.y8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.k6.f28094p && org.telegram.ui.ActionBar.k6.f28074o == 1) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28295zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28277yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28181ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28126qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28182tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28163sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28144rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28086ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28143ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.V0 = !org.telegram.ui.ActionBar.k6.k1();
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = this.f42050f;
        if (i3 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.T0 = ch0Var;
            if (this.V0) {
                ch0Var.M(ch0Var.f32725e[0] - 1);
            } else {
                ch0Var.M(0);
            }
            org.telegram.ui.Components.ch0 ch0Var2 = this.T0;
            ch0Var2.h = true;
            o10.getClass();
            this.f42065s = o10.c(5, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131231244);
            this.f42065s = b10;
            b10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, "AccDescrMoreOptions"));
            this.f42065s.e(2, 2131232363, org.telegram.messenger.bd.M0(2131745436, "ShareTheme"));
            this.f42065s.e(3, 2131232116, org.telegram.messenger.bd.M0(2131751220, "EditThemeColors"));
            this.f42065s.e(1, 2131232270, org.telegram.messenger.bd.M0(2131751710, "CreateNewThemeMenu"));
            this.f42065s.e(4, 2131232341, org.telegram.messenger.bd.M0(2131744158, "ThemeResetToDefaults"));
            if (getMessagesController().f23067m8 == null) {
                getMessagesController().R0(new s3(this, 23));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new l51(this));
        this.f42041a = new v51(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f42043b = tj0Var;
        tj0Var.r1();
        this.f42043b.setSectionsDrawBackground(true);
        this.f42043b.setLayoutManager(new u4.b0(1, false));
        this.f42043b.setVerticalScrollBarEnabled(false);
        this.f42043b.setAdapter(this.f42041a);
        ((u4.k) this.f42043b.getItemAnimator()).C = false;
        frameLayout.addView(this.f42043b, b8.mf.c(-1.0f, -1));
        this.f42043b.setOnItemClickListener(new rb0(24, this, context));
        if (i3 == 0) {
            u4.k kVar = new u4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.xq.h);
            kVar.C = false;
            kVar.f55567m = false;
            this.f42043b.setItemAnimator(kVar);
        }
        if (this.U0) {
            F0(false);
            this.U0 = false;
            this.f42043b.v0(this.f42041a.f50398e.K0 - 1);
            org.telegram.messenger.g0.i3(new d51(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.s1 s1Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i3 == org.telegram.messenger.hs.f23323v4) {
            G0(null, true);
        } else if (i3 != org.telegram.messenger.hs.f23351z4 && i3 != org.telegram.messenger.hs.f23246i4) {
            if (i3 == org.telegram.messenger.hs.R5) {
                v51 v51Var = this.f42041a;
                if (v51Var != null && (i14 = this.browserRow) != -1) {
                    v51Var.g(i14);
                }
            } else if (i3 == org.telegram.messenger.hs.f23290q4) {
                v51 v51Var2 = this.f42041a;
                if (v51Var2 != null && (i13 = this.f42064r0) != -1) {
                    v51Var2.h(i13, new Object());
                }
            } else if (i3 == org.telegram.messenger.hs.f23278o4) {
                F0(true);
            } else {
                if (i3 == org.telegram.messenger.hs.M2) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) objArr[1];
                    if (j6Var == this.h && g6Var == this.f42058n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().V2);
                        sb2.append("/addtheme/");
                        if (g6Var != null) {
                            tL_theme = g6Var.f27540r;
                        } else {
                            tL_theme = j6Var.G;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.oo0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.s1 s1Var2 = this.f42063r;
                        if (s1Var2 != null) {
                            s1Var2.dismiss();
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.N2) {
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
                    if (j6Var2 == this.h && g6Var2 == this.f42058n && (s1Var = this.f42063r) == null) {
                        s1Var.dismiss();
                    }
                } else if (i3 == org.telegram.messenger.hs.f23303s4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.j6) objArr[0];
                        this.f42058n = (org.telegram.ui.ActionBar.g6) objArr[1];
                        org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                        this.f42063r = s1Var3;
                        s1Var3.f28546j0 = true;
                        showDialog(s1Var3, new s5(this, 16));
                    }
                } else if (i3 == org.telegram.messenger.hs.f23310t4) {
                    E0();
                    if (this.f42050f == 3) {
                        boolean k1 = org.telegram.ui.ActionBar.k6.k1();
                        boolean z10 = !k1;
                        if (this.V0 != z10) {
                            this.V0 = z10;
                            org.telegram.ui.Components.ch0 ch0Var = this.T0;
                            if (!k1) {
                                i12 = ch0Var.f32725e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            ch0Var.P(i12);
                            this.f42065s.getIconView().d();
                        }
                        if (this.f42062q0 >= 0) {
                            for (int i15 = 0; i15 < this.f42043b.getChildCount(); i15++) {
                                if (this.f42043b.getChildAt(i15) instanceof rt) {
                                    ((rt) this.f42043b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.U4) {
                    int i16 = this.f42062q0;
                    if (i16 >= 0) {
                        this.f42041a.g(i16);
                    }
                } else if ((i3 == org.telegram.messenger.hs.S3 || i3 == org.telegram.messenger.hs.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f42041a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.tj0 tj0Var = this.f42043b;
            if (tj0Var != null) {
                tj0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f42043b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, w51.class, m51.class, s51.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, u51.class, org.telegram.ui.Cells.l8.class, il0.class, org.telegram.ui.Components.uw0.class, rt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        int i3 = org.telegram.ui.ActionBar.k6.f28121q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{s51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{s51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27850be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27942gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{w51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848bc));
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42043b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.addAll(b8.qf.a(new h6(22, this), i12, org.telegram.ui.ActionBar.k6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23351z4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23278o4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23290q4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23303s4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23310t4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.U4);
        getNotificationCenter().c(this, org.telegram.messenger.hs.P3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.S3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.N2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.R5);
        if (this.f42050f == 0) {
            org.telegram.ui.ActionBar.k6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.k6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.L0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
        locationManager.removeUpdates(this.R0);
        locationManager.removeUpdates(this.S0);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23351z4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23278o4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23290q4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23303s4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23310t4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.U4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.P3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.S3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.N2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.R5);
        org.telegram.ui.ActionBar.k6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f42041a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
