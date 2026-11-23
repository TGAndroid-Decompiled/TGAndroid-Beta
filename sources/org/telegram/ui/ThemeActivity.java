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
import org.telegram.ui.Dictation.DictationAsr;
public class ThemeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public final w51 S0;
    public int T;
    public final w51 T0;
    public int U;
    public org.telegram.ui.Components.nh0 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public e61 f43956a;
    public int f43957a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.ek0 f43958b;
    public int f43959b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public c61 f43960c;
    public int f43961c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f43962d0;
    public final ArrayList f43963e;
    public int f43964e0;
    public final int f43965f;
    public int f43966f0;
    public int f43967g0;
    public org.telegram.ui.ActionBar.m6 h;
    public int f43968h0;
    public int f43969i0;
    public int f43970j0;
    public int f43971k0;
    public int f43972l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.k6 f43973n;
    public int f43974n0;
    private int nightThemeRow;
    public int f43975o0;
    public int f43976p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f43977q0;
    public org.telegram.ui.ActionBar.t1 f43978r;
    public int f43979r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.g5 f43980s;
    public int f43981s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f43982t0;
    private int textSizeRow;
    public int f43983u0;
    public int f43984v0;
    public boolean f43985w;
    public int f43986w0;
    public int f43987x;
    public int f43988x0;
    public int f43989y;
    public int f43990y0;
    public int f43991z0;

    public static class InnerAccentView extends View {
        public final Paint f43992a;
        public ObjectAnimator f43993b;
        public float f43994c;
        public org.telegram.ui.ActionBar.m6 d;
        public org.telegram.ui.ActionBar.k6 f43995e;
        public boolean f43996f;

        public InnerAccentView(Context context) {
            super(context);
            this.f43992a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Z == this.f43995e.f29224a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43996f = z11;
            ObjectAnimator objectAnimator = this.f43993b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z10) {
                if (this.f43996f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f43993b = ofFloat;
                ofFloat.setDuration(200L);
                this.f43993b.start();
                return;
            }
            if (this.f43996f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f43994c;
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
            int i7 = this.f43995e.f29226c;
            Paint paint = this.f43992a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f43994c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f43994c), paint);
            if (this.f43994c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f43994c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f43994c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f43994c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f43995e.f29227e;
            if (i10 != 0 && this.f43994c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f43994c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131752003, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f43996f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f43994c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f43963e = new ArrayList();
        this.S0 = new w51(this);
        this.T0 = new w51(this);
        this.f43965f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.n6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.n6.f29741t;
        int i12 = i11 / 60;
        return org.telegram.messenger.gd.a0("AutoNightUpdateLocationInfo", null, 2131753777, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.w10 w10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        final org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        final String str = u12.f25901x6;
        String str2 = u12.f25911y6;
        final int i10 = u12.f25920z6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) u12.A7.f26248m.f17372b).f24439c) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            g10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
            j3.O = g10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.u6.j(frameLayout, L2, M, null, i6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231185);
            frameLayout.addView(imageView, c8.na.e(50, 50, 17));
            g10.addView(frameLayout, c8.na.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
            TextView b10 = c8.wa.b(context, 20.0f, i12, true, i6Var);
            b10.setText(org.telegram.messenger.gd.N0(2131754304, null));
            b10.setGravity(17);
            g10.addView(b10, c8.na.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = c8.wa.b(context, 14.0f, i12, false, i6Var);
            b11.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.O0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            g10.addView(b11, c8.na.t(-1, -2, 7, 24, 0, 24, 0));
            final hi.e eVar = new hi.e(context, i6Var, true);
            eVar.i(org.telegram.messenger.gd.N0(2131754310, null), false, true);
            eVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final hi.e eVar2 = hi.e.this;
                    if (eVar2.R) {
                        return;
                    }
                    eVar2.setLoading(true);
                    final org.telegram.messenger.mp mpVar = u12;
                    final String str3 = str;
                    final int i13 = i7;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.w10 w10Var2 = w10Var;
                    final org.telegram.ui.ActionBar.w2[] w2VarArr = r9;
                    c8.oa.c(2131624117, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.w10() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final hi.e eVar3 = hi.e.this;
                            if (!booleanValue) {
                                eVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.mp mpVar2 = mpVar;
                            org.telegram.messenger.l10 f22 = mpVar2.f2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.w10 w10Var3 = w10Var2;
                            final org.telegram.ui.ActionBar.w2[] w2VarArr2 = w2VarArr;
                            f22.a(str3, null, new org.telegram.messenger.w10() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    hi.e eVar4 = hi.e.this;
                                    if (l10 == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User c22 = mpVar2.c2(l10);
                                    if (c22 == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                    if (T == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    ki.f4 b12 = ki.f4.b(i15, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, c22, 0, false, false);
                                    final ki.t2 t2Var = new ki.t2(context3, i6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.w10 w10Var4 = w10Var3;
                                    ?? r62 = new org.telegram.messenger.t10() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d2 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i17) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            t2Var.o(false);
                                            w10Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.f3.n(null, 2131754306, org.telegram.ui.Components.kc.b0(T2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    t2Var.M0 = r62;
                                    ki.k2 k2Var = t2Var.E;
                                    if (k2Var != 0) {
                                        k2Var.setOnVerifiedAge(r62);
                                    }
                                    t2Var.B(true);
                                    t2Var.C0 = false;
                                    t2Var.m0 = T.getParentActivity();
                                    t2Var.x(T, b12);
                                    t2Var.show();
                                    eVar4.setLoading(false);
                                    w2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            g10.addView(eVar, c8.na.t(-1, 48, 7, 2, 29, 2, 14));
            j3.show();
            final org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
            j3.O();
            return;
        }
        w10Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        e61 e61Var;
        boolean z10;
        org.telegram.ui.Components.ek0 ek0Var = themeActivity.f43958b;
        if (ek0Var != null && ek0Var.H && (e61Var = themeActivity.f43956a) != null) {
            int i7 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i7 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                e61Var.g(i7);
            } else {
                themeActivity.F0(true);
            }
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        boolean z10;
        String N0;
        String N02;
        int d;
        boolean z11;
        boolean z12;
        if (i7 == themeActivity.O) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z13 = g12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = g12.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            org.telegram.messenger.bz.C1 = Boolean.valueOf(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z14);
            }
        } else if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i7 == themeActivity.changeUserColor) {
            jm0 jm0Var = new jm0();
            jm0Var.I = themeActivity;
            themeActivity.presentFragment(jm0Var);
        } else if (i7 == themeActivity.H) {
            SharedPreferences g13 = org.telegram.messenger.mp.g1();
            boolean z15 = g13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = g13.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z16);
            }
        } else if (i7 == themeActivity.F) {
            org.telegram.messenger.bz.f23317r0 = !org.telegram.messenger.bz.f23317r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.mp.g1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.bz.f23317r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f23317r0);
            }
        } else if (i7 == themeActivity.G) {
            org.telegram.messenger.bz.f23323t0 = !org.telegram.messenger.bz.f23323t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.mp.g1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.bz.f23323t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f23323t0);
            }
        } else if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.bz.f23320s0 = !org.telegram.messenger.bz.f23320s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.mp.g1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.bz.f23320s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f23320s0);
            }
            if (!org.telegram.messenger.bz.f23320s0 && themeActivity.F != -1) {
                for (int i12 = 0; i12 < themeActivity.f43958b.getChildCount(); i12++) {
                    View childAt = themeActivity.f43958b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.f43958b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.bz.F0 = !org.telegram.messenger.bz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.mp.g1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.bz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.F0);
            }
        } else if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.bz.G0 = !org.telegram.messenger.bz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.mp.g1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.bz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i7 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131751354, "DistanceUnitsAutomatic"), org.telegram.messenger.gd.N0(2131751353, "DistanceUnitsKilometers"), org.telegram.messenger.gd.N0(2131751352, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        float f12 = f11;
                        j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f12), 0);
                        j6Var.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29507g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.bz.f23321s1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j6Var.b(charSequence, z12);
                        int i14 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                        j6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(j6Var, h02, null, M, null);
                        g10.addView(j6Var);
                        j6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f51978b;

                            {
                                this.f51978b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f51978b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.bz.f23321s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.bz.f23321s1);
                                        edit8.apply();
                                        org.telegram.messenger.gd.f24320g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.f1 K = themeActivity2.f43958b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43956a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.bz.f23311p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.mp.g1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.bz.f23311p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f51978b;
                                        themeActivity3.R0 = true;
                                        v4.f1 K2 = themeActivity3.f43958b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43956a.t(K2, themeActivity3.M);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i13++;
                        f11 = f12;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131751351, "DistanceUnitsTitle");
                    alertDialog$Builder.o(g10);
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    atomicReference.set(t1Var);
                    themeActivity.showDialog(t1Var);
                }
            } else if (i7 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
                    ArrayList b10 = org.telegram.ui.web.e1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i15 = 0; i15 < size; i15++) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.e1) b10.get(i15)).f53361a;
                        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        j6Var2.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29507g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.bz.f23311p0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6Var2.b(charSequence2, z11);
                        int i16 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i16);
                        j6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.u6.j(j6Var2, h03, null, M2, null);
                        g11.addView(j6Var2);
                        j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f51978b;

                            {
                                this.f51978b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f51978b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.bz.f23321s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.bz.f23321s1);
                                        edit8.apply();
                                        org.telegram.messenger.gd.f24320g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.f1 K = themeActivity2.f43958b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43956a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.bz.f23311p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.mp.g1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.bz.f23311p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f51978b;
                                        themeActivity3.R0 = true;
                                        v4.f1 K2 = themeActivity3.f43958b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43956a.t(K2, themeActivity3.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f28835a.S = org.telegram.messenger.gd.N0(2131745603, null);
                    alertDialog$Builder2.o(g11);
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    atomicReference2.set(t1Var2);
                    themeActivity.showDialog(t1Var2);
                }
            } else if (i7 == themeActivity.N) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
                    org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.n6.f29507g7;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.n6.E5;
                    j6Var3.a(x02, org.telegram.ui.ActionBar.n6.x0(null, i18, false));
                    j6Var3.b(org.telegram.messenger.gd.N0(2131748245, null), !org.telegram.messenger.bz.f23326u0);
                    int i19 = org.telegram.ui.ActionBar.n6.f29543i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i19);
                    j6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.u6.j(j6Var3, h04, null, M3, null);
                    g14.addView(j6Var3);
                    j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f52261b;

                        {
                            this.f52261b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f52261b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.bz.f23326u0 = false;
                                    org.telegram.messenger.bz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K = themeActivity2.f43958b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43956a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.oa.c(2131624121, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new a31(1, themeActivity2, atomicReference4));
                                    org.telegram.messenger.bz.f23326u0 = true;
                                    org.telegram.messenger.bz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K2 = themeActivity2.f43958b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43956a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    j6Var4.a(org.telegram.ui.ActionBar.n6.x0(null, i17, false), org.telegram.ui.ActionBar.n6.x0(null, i18, false));
                    String N03 = org.telegram.messenger.gd.N0(2131748242, null);
                    String N04 = org.telegram.messenger.gd.N0(2131748243, null);
                    boolean z17 = org.telegram.messenger.bz.f23326u0;
                    j6Var4.f30963a.setText(N03);
                    TextView textView = j6Var4.f30964b;
                    textView.setVisibility(0);
                    textView.setText(N04);
                    j6Var4.f30965c.a(z17, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i19);
                    j6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.u6.j(j6Var4, h05, null, M4, null);
                    g14.addView(j6Var4);
                    j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f52261b;

                        {
                            this.f52261b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f52261b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.bz.f23326u0 = false;
                                    org.telegram.messenger.bz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K = themeActivity2.f43958b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43956a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.oa.c(2131624121, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new a31(1, themeActivity2, atomicReference4));
                                    org.telegram.messenger.bz.f23326u0 = true;
                                    org.telegram.messenger.bz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K2 = themeActivity2.f43958b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43956a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f28835a.S = org.telegram.messenger.gd.N0(2131748246, null);
                    alertDialog$Builder3.o(g14);
                    alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28835a;
                    atomicReference3.set(t1Var3);
                    themeActivity.showDialog(t1Var3);
                }
            } else if (i7 == themeActivity.E) {
                org.telegram.messenger.bz.f23334x0 = !org.telegram.messenger.bz.f23334x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.bz.f23334x0);
                edit8.apply();
                g0.g.n(org.telegram.messenger.t0.f27013b);
                org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).o();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f23334x0);
                }
            } else if (i7 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().e5()) {
                    iy0 iy0Var = new iy0(10, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f28835a.S = org.telegram.messenger.gd.N0(2131751801, null);
                    alertDialog$Builder4.f28835a.U = org.telegram.messenger.gd.N0(2131751802, null);
                    alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751805, null), new yi0(18, themeActivity, iy0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f28835a);
                    return;
                }
                themeActivity.getMessagesController().Q4(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().e5());
                }
            } else if (i7 != themeActivity.Q) {
                if (i7 == themeActivity.R) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f28835a.S = org.telegram.messenger.gd.N0(2131745095, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131751588, "Default"), org.telegram.messenger.gd.N0(2131745091, "SortFirstName"), org.telegram.messenger.gd.N0(2131745090, "SortLastName")}, new ex(themeActivity, i7, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f28835a);
                    }
                } else if (i7 == themeActivity.f43982t0) {
                    int i20 = org.telegram.messenger.bz.f23270a;
                    if (!org.telegram.messenger.pc.e(256)) {
                        d = 256 | org.telegram.messenger.pc.d(true);
                    } else {
                        d = org.telegram.messenger.pc.d(true) & (-257);
                    }
                    org.telegram.messenger.pc.f26313i = d;
                    org.telegram.messenger.pc.k();
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f());
                    }
                } else if (i7 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.gd.f24314a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.gd.f24314a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                        if (org.telegram.ui.ActionBar.n6.f29645o == 0) {
                            org.telegram.ui.ActionBar.n6.f29645o = 2;
                            i5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.n6.f29645o = 0;
                            i5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.n6.w1();
                        org.telegram.ui.ActionBar.n6.F(true);
                        if (org.telegram.ui.ActionBar.n6.f29645o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            N0 = org.telegram.ui.ActionBar.n6.C0();
                        } else {
                            N0 = org.telegram.messenger.gd.N0(2131753780, "AutoNightThemeOff");
                        }
                        if (z10) {
                            int i21 = org.telegram.ui.ActionBar.n6.f29645o;
                            if (i21 == 1) {
                                N02 = org.telegram.messenger.gd.N0(2131753784, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                N02 = org.telegram.messenger.gd.N0(2131753783, "AutoNightSystemDefault");
                            } else {
                                N02 = org.telegram.messenger.gd.N0(2131753793, "AutoNightAdaptive");
                            }
                            N0 = a8.p0.E(N02, " ", N0);
                        }
                        i5Var.b(org.telegram.messenger.gd.N0(2131753781, "AutoNightTheme"), N0, 2131231847, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i7 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.gd.f24314a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.gd.f24314a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.i5 i5Var2 = (org.telegram.ui.Cells.i5) view;
                        org.telegram.messenger.mp messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.G5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        i5Var2.setChecked(themeActivity.getMessagesController().S2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.n1(null));
                } else if (i7 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.n6.f29645o != 0) {
                        org.telegram.ui.ActionBar.n6.f29645o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.n6.F(false);
                    }
                } else if (i7 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.n6.f29645o != 1) {
                        org.telegram.ui.ActionBar.n6.f29645o = 1;
                        if (org.telegram.ui.ActionBar.n6.f29664p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.n6.F(false);
                    }
                } else if (i7 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.n6.f29645o != 2) {
                        org.telegram.ui.ActionBar.n6.f29645o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.n6.F(false);
                    }
                } else if (i7 == themeActivity.V) {
                    if (org.telegram.ui.ActionBar.n6.f29645o != 3) {
                        org.telegram.ui.ActionBar.n6.f29645o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.n6.F(false);
                    }
                } else if (i7 == themeActivity.Y) {
                    boolean z18 = !org.telegram.ui.ActionBar.n6.f29664p;
                    org.telegram.ui.ActionBar.n6.f29664p = z18;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z18);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.n6.f29664p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.n6.F(false);
                } else if (i7 != themeActivity.f43959b0 && i7 != themeActivity.f43961c0) {
                    if (i7 == themeActivity.Z) {
                        themeActivity.G0(null, true);
                    } else if (i7 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i7 == themeActivity.f43991z0) {
                        themeActivity.C0();
                    } else if (i7 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i7 == themeActivity.B0) {
                        themeActivity.presentFragment(new ai.r2());
                    } else if (i7 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new y90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i7 == themeActivity.f43959b0) {
                        i10 = org.telegram.ui.ActionBar.n6.f29703r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29723s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f43959b0;
                            int i27 = i7;
                            org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.n6.f29703r = i25;
                                w9Var2.c(org.telegram.messenger.gd.N0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.n6.f29723s = i25;
                            w9Var2.c(org.telegram.messenger.gd.N0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, iy0 iy0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new a31(2, themeActivity, iy0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z10) {
        if (i7 == org.telegram.messenger.bz.Y0) {
            return false;
        }
        org.telegram.messenger.bz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.bz.Y0);
        edit.commit();
        v4.f1 K = themeActivity.f43958b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f59245a;
            if (view instanceof f61) {
                f61 f61Var = (f61) view;
                org.telegram.ui.Cells.r1[] cells = f61Var.f47702a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().S1 = false;
                    cells[i10].requestLayout();
                }
                f61Var.invalidate();
            }
        }
        v4.f1 K2 = themeActivity.f43958b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f59245a;
            if (view2 instanceof v51) {
                v51 v51Var = (v51) view2;
                if (z10) {
                    v51Var.requestLayout();
                } else {
                    v51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.bz.W0) {
            org.telegram.messenger.bz.W0 = i7;
            org.telegram.messenger.bz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.bz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.n6.Q();
                v4.f1 K = themeActivity.f43958b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f59245a;
                    if (view instanceof f61) {
                        org.telegram.ui.Cells.r1[] cells = ((f61) view).f47702a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().S1 = false;
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
        String N0 = org.telegram.messenger.gd.N0(2131748065, "NewTheme");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131751699, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751691, "CreateTheme"), new m51(this, 2));
        showDialog(t1Var);
    }

    public final void C0() {
        boolean z10;
        org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
        boolean z11 = true;
        if (D0.k(false).f29224a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43965f != 1) {
            z11 = false;
        }
        presentFragment(new v71(D0, false, 1, z10, z11));
    }

    public final void E0() {
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        if (this.f43980s == null) {
            return;
        }
        org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
        org.telegram.ui.ActionBar.k6 k10 = D0.k(false);
        ArrayList arrayList = D0.f29325c0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f29224a >= 100) {
            this.f43980s.T(2);
            this.f43980s.T(3);
        } else {
            this.f43980s.u(2);
            this.f43980s.u(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 18;
        } else {
            i7 = 16;
        }
        org.telegram.ui.ActionBar.m6 D02 = org.telegram.ui.ActionBar.n6.D0();
        if (org.telegram.messenger.bz.W0 == i7 && org.telegram.messenger.bz.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.n6.f29627n && (k10 == null || (e6Var = k10.f29245y) == null || "d".equals(e6Var.f28982c))) {
            this.f43980s.u(4);
        } else {
            this.f43980s.T(4);
        }
    }

    public final void F0(boolean z10) {
        int i7;
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
        org.telegram.ui.ActionBar.m6 D0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i21 = this.L0;
        int i22 = this.f43979r0;
        int i23 = this.f43991z0;
        int i24 = this.F;
        this.L0 = 0;
        this.Q = -1;
        this.R = -1;
        this.Y = -1;
        this.Z = -1;
        this.f43957a0 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f43969i0 = -1;
        this.f43959b0 = -1;
        this.f43961c0 = -1;
        this.f43962d0 = -1;
        this.f43976p0 = -1;
        this.f43977q0 = -1;
        this.f43979r0 = -1;
        this.f43981s0 = -1;
        this.f43968h0 = -1;
        this.f43964e0 = -1;
        this.f43966f0 = -1;
        this.f43967g0 = -1;
        this.f43987x = -1;
        this.f43970j0 = -1;
        this.f43971k0 = -1;
        this.bubbleRadiusRow = -1;
        this.f43972l0 = -1;
        this.m0 = -1;
        this.f43974n0 = -1;
        this.f43975o0 = -1;
        this.f43982t0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.liteModeRow = -1;
        this.I0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f43989y = -1;
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
        this.f43983u0 = -1;
        this.f43984v0 = -1;
        this.f43986w0 = -1;
        this.f43988x0 = -1;
        this.f43990y0 = -1;
        this.f43991z0 = -1;
        this.createNewThemeRow = -1;
        this.J0 = -1;
        this.appIconSelectorRow = -1;
        this.K0 = -1;
        this.A0 = -1;
        ArrayList arrayList = this.f43963e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.n6.F.size();
        int i25 = 0;
        while (true) {
            i7 = this.f43965f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) org.telegram.ui.ActionBar.n6.F.get(i25);
            if (i7 == 0 || i7 == 3 || ((m6Var.f29322b != null || m6Var.q()) && ((tL_theme = m6Var.G) == null || tL_theme.document != null))) {
                if (m6Var.f29322b != null) {
                    arrayList2.add(m6Var);
                } else {
                    arrayList.add(m6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new ow0(2));
        if (i7 == 3) {
            int i26 = this.L0;
            this.f43988x0 = i26;
            this.f43977q0 = i26 + 1;
            this.f43975o0 = i26 + 2;
            this.f43990y0 = i26 + 3;
            this.f43970j0 = i26 + 4;
            this.L0 = i26 + 6;
            this.f43976p0 = i26 + 5;
            if (org.telegram.ui.ActionBar.n6.D0().X != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f43985w = z13;
            c61 c61Var = this.f43960c;
            if (c61Var != null) {
                c61Var.setDrawDivider(z13);
            }
            if (this.f43985w) {
                int i27 = this.L0;
                this.L0 = i27 + 1;
                this.f43979r0 = i27;
            }
            int i28 = this.L0;
            this.L0 = i28 + 1;
            this.f43972l0 = i28;
            org.telegram.ui.ActionBar.m6 D02 = org.telegram.ui.ActionBar.n6.D0();
            org.telegram.ui.ActionBar.k6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f29325c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f29224a >= 100) {
                int i29 = this.L0;
                this.L0 = i29 + 1;
                this.f43991z0 = i29;
            }
            int i30 = this.L0;
            this.createNewThemeRow = i30;
            this.L0 = i30 + 2;
            this.A0 = i30 + 1;
        } else if (i7 == 0) {
            int i31 = this.L0;
            this.f43987x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f43969i0 = i31 + 4;
            this.f43970j0 = i31 + 5;
            this.f43977q0 = i31 + 6;
            this.f43981s0 = i31 + 7;
            this.f43971k0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f43972l0 = i31 + 10;
            this.m0 = i31 + 11;
            this.f43974n0 = i31 + 12;
            this.f43975o0 = i31 + 13;
            this.J0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.K0 = i31 + 16;
            this.f43983u0 = i31 + 17;
            this.f43984v0 = i31 + 18;
            this.f43986w0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.L0 = i31 + 24;
            this.stickersRow = i31 + 23;
            if (DictationAsr.F()) {
                int i32 = this.L0;
                this.L0 = i32 + 1;
                this.B0 = i32;
            }
            int i33 = this.L0;
            this.D0 = i33;
            this.G0 = i33 + 1;
            this.G = i33 + 2;
            int i34 = i33 + 4;
            this.L0 = i34;
            this.raiseToListenRow = i33 + 3;
            if (org.telegram.messenger.bz.f23320s0) {
                this.L0 = i33 + 5;
                this.F = i34;
            }
            int i35 = this.L0;
            this.pauseOnRecordRow = i35;
            this.pauseOnMediaRow = i35 + 1;
            this.N = i35 + 2;
            this.E0 = i35 + 3;
            this.H0 = i35 + 4;
            this.L0 = i35 + 6;
            this.E = i35 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().f25857s8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i36 = this.L0;
                this.L0 = i36 + 1;
                this.sensitiveContentRow = i36;
            }
            int i37 = this.L0;
            this.H = i37;
            this.L = i37 + 1;
            this.L0 = i37 + 3;
            this.F0 = i37 + 2;
        } else {
            int i38 = this.L0;
            this.S = i38;
            this.T = i38 + 1;
            int i39 = i38 + 3;
            this.L0 = i39;
            this.U = i38 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.L0 = i38 + 4;
                this.V = i39;
            }
            int i40 = this.L0;
            int i41 = i40 + 1;
            this.L0 = i41;
            this.W = i40;
            int i42 = org.telegram.ui.ActionBar.n6.f29645o;
            if (i42 == 1) {
                this.X = i41;
                int i43 = i40 + 3;
                this.L0 = i43;
                this.Y = i40 + 2;
                if (org.telegram.ui.ActionBar.n6.f29664p) {
                    this.Z = i43;
                    this.L0 = i40 + 5;
                    this.f43957a0 = i40 + 4;
                } else {
                    this.f43959b0 = i43;
                    this.f43961c0 = i40 + 4;
                    this.L0 = i40 + 6;
                    this.f43962d0 = i40 + 5;
                }
            } else if (i42 == 2) {
                this.f43964e0 = i41;
                this.f43966f0 = i40 + 2;
                this.L0 = i40 + 4;
                this.f43967g0 = i40 + 3;
            }
            if (org.telegram.ui.ActionBar.n6.f29645o != 0) {
                int i44 = this.L0;
                this.f43968h0 = i44;
                this.L0 = i44 + 2;
                this.f43976p0 = i44 + 1;
                if (org.telegram.ui.ActionBar.n6.J.X != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43985w = z11;
                c61 c61Var2 = this.f43960c;
                if (c61Var2 != null) {
                    c61Var2.setDrawDivider(z11);
                }
                if (this.f43985w) {
                    int i45 = this.L0;
                    this.L0 = i45 + 1;
                    this.f43979r0 = i45;
                }
                int i46 = this.L0;
                this.L0 = i46 + 1;
                this.f43981s0 = i46;
            }
        }
        c61 c61Var3 = this.f43960c;
        if (c61Var3 != null) {
            int width = this.f43958b.getWidth();
            int i47 = c61Var3.f30991o3;
            org.telegram.ui.Cells.ia iaVar = c61Var3.f30987k3;
            if (i47 != iaVar.b()) {
                iaVar.f();
                if (c61Var3.f30990n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.n6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.n6.D0();
                }
                if (c61Var3.j3 != D0) {
                    c61Var3.A1(width);
                }
            }
        }
        e61 e61Var = this.f43956a;
        if (e61Var != null) {
            if (i7 == 1 && (i14 = this.N0) != (i15 = org.telegram.ui.ActionBar.n6.f29645o) && i14 != -1) {
                int i48 = this.W;
                int i49 = i48 + 1;
                if (i14 != i15) {
                    for (int i50 = 0; i50 < 4; i50++) {
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43958b.K(i50);
                        if (mj0Var != null) {
                            View view = mj0Var.f59245a;
                            if (view instanceof org.telegram.ui.Cells.ca) {
                                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                                if (i50 == org.telegram.ui.ActionBar.n6.f29645o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                caVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i51 = org.telegram.ui.ActionBar.n6.f29645o;
                    if (i51 == 0) {
                        this.f43956a.p(i49, i21 - i49);
                    } else if (i51 == 1) {
                        int i52 = this.N0;
                        if (i52 == 0) {
                            this.f43956a.o(i49, this.L0 - i49);
                        } else if (i52 == 2) {
                            this.f43956a.p(i49, 3);
                            e61 e61Var2 = this.f43956a;
                            if (org.telegram.ui.ActionBar.n6.f29664p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            e61Var2.o(i49, i20);
                        } else if (i52 == 3) {
                            e61 e61Var3 = this.f43956a;
                            if (org.telegram.ui.ActionBar.n6.f29664p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            e61Var3.o(i49, i19);
                        }
                    } else if (i51 == 2) {
                        int i53 = this.N0;
                        if (i53 == 0) {
                            this.f43956a.o(i49, this.L0 - i49);
                        } else if (i53 == 1) {
                            e61 e61Var4 = this.f43956a;
                            if (org.telegram.ui.ActionBar.n6.f29664p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            e61Var4.p(i49, i18);
                            this.f43956a.o(i49, 3);
                        } else if (i53 == 3) {
                            this.f43956a.o(i49, 3);
                        }
                    } else if (i51 == 3) {
                        int i54 = this.N0;
                        if (i54 == 0) {
                            this.f43956a.o(i49, this.L0 - i49);
                        } else if (i54 == 2) {
                            this.f43956a.p(i49, 3);
                        } else if (i54 == 1) {
                            e61 e61Var5 = this.f43956a;
                            if (org.telegram.ui.ActionBar.n6.f29664p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            e61Var5.p(i49, i17);
                        }
                    }
                } else {
                    boolean z14 = this.O0;
                    boolean z15 = org.telegram.ui.ActionBar.n6.f29664p;
                    if (z14 != z15) {
                        int i55 = i48 + 3;
                        if (z15) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        e61Var.p(i55, i16);
                        e61 e61Var6 = this.f43956a;
                        if (org.telegram.ui.ActionBar.n6.f29664p) {
                            i10 = 2;
                        }
                        e61Var6.o(i55, i10);
                    }
                }
            } else if (!z10 && this.N0 != -1) {
                if (i22 == -1 && (i13 = this.f43979r0) != -1) {
                    e61Var.i(i13);
                } else if (i22 != -1 && this.f43979r0 == -1) {
                    e61Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i56 = this.f43979r0;
                    if (i56 != -1) {
                        e61Var.g(i56);
                    }
                }
                if (i23 == -1 && (i12 = this.f43991z0) != -1) {
                    this.f43956a.i(i12);
                } else if (i23 != -1 && this.f43991z0 == -1) {
                    this.f43956a.s(i23);
                }
                if (i24 == -1 && (i11 = this.F) != -1) {
                    this.f43956a.i(i11);
                } else if (i24 != -1 && this.F == -1) {
                    this.f43956a.s(i24);
                }
            } else {
                e61Var.f();
            }
        }
        if (i7 == 1) {
            this.O0 = org.telegram.ui.ActionBar.n6.f29664p;
            this.N0 = org.telegram.ui.ActionBar.n6.f29645o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i7 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.n6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(2131749354, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751794, "ConnectingToProxyEnable"), new m51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                        showDialog(alertDialog$Builder.f28835a);
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
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.n6.f29817x = location.getLatitude();
        org.telegram.ui.ActionBar.n6.f29836y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.n6.f29817x, org.telegram.ui.ActionBar.n6.f29836y);
        org.telegram.ui.ActionBar.n6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.n6.f29741t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.n6.f29798w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.n6.f29760u = calendar.get(5);
        Utilities.f22877e.c(new n51(this, 0));
        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43958b.K(this.f43957a0);
        if (mj0Var != null) {
            View view = mj0Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.n6.f29664p && org.telegram.ui.ActionBar.n6.f29645o == 1) {
            org.telegram.ui.ActionBar.n6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29567jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29751ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29752tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29810wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29791vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29772ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29715rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29714ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !org.telegram.ui.ActionBar.n6.k1();
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i7 = this.f43965f;
        if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752866, "BrowseThemes"));
            org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
            org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.U0 = nh0Var;
            if (this.W0) {
                nh0Var.M(nh0Var.f37805e[0] - 1);
            } else {
                nh0Var.M(0);
            }
            org.telegram.ui.Components.nh0 nh0Var2 = this.U0;
            nh0Var2.h = true;
            t6.getClass();
            this.f43980s = t6.c(5, 0, null, nh0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752198, "ChatSettings"));
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131231247);
            this.f43980s = b10;
            b10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, "AccDescrMoreOptions"));
            this.f43980s.e(2, 2131232368, org.telegram.messenger.gd.N0(2131745230, "ShareTheme"));
            this.f43980s.e(3, 2131232121, org.telegram.messenger.gd.N0(2131751207, "EditThemeColors"));
            this.f43980s.e(1, 2131232275, org.telegram.messenger.gd.N0(2131751697, "CreateNewThemeMenu"));
            this.f43980s.e(4, 2131232346, org.telegram.messenger.gd.N0(2131743903, "ThemeResetToDefaults"));
            if (getMessagesController().f25857s8 == null) {
                getMessagesController().T0(new r3(this, 25));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753781, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new u51(this));
        this.f43956a = new e61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43958b = ek0Var;
        ek0Var.r1();
        this.f43958b.setSectionsDrawBackground(true);
        this.f43958b.setLayoutManager(new v4.c0(1, false));
        this.f43958b.setVerticalScrollBarEnabled(false);
        this.f43958b.setAdapter(this.f43956a);
        ((v4.l) this.f43958b.getItemAnimator()).C = false;
        frameLayout.addView(this.f43958b, c8.na.c(-1.0f, -1));
        this.f43958b.setOnItemClickListener(new yi0(19, this, context));
        if (i7 == 0) {
            v4.l lVar = new v4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.kr.h);
            lVar.C = false;
            lVar.f59274m = false;
            this.f43958b.setItemAnimator(lVar);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.f43958b.v0(this.f43956a.f47460e.L0 - 1);
            org.telegram.messenger.g0.h3(new n51(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.t1 t1Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i7 == org.telegram.messenger.ks.f25328y4) {
            G0(null, true);
        } else if (i7 != org.telegram.messenger.ks.C4 && i7 != org.telegram.messenger.ks.f25247l4) {
            if (i7 == org.telegram.messenger.ks.U5) {
                e61 e61Var = this.f43956a;
                if (e61Var != null && (i14 = this.browserRow) != -1) {
                    e61Var.g(i14);
                }
            } else if (i7 == org.telegram.messenger.ks.f25294t4) {
                e61 e61Var2 = this.f43956a;
                if (e61Var2 != null && (i13 = this.f43979r0) != -1) {
                    e61Var2.h(i13, new Object());
                }
            } else if (i7 == org.telegram.messenger.ks.f25281r4) {
                F0(true);
            } else {
                if (i7 == org.telegram.messenger.ks.M2) {
                    org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) objArr[0];
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) objArr[1];
                    if (m6Var == this.h && k6Var == this.f43973n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().X2);
                        sb2.append("/addtheme/");
                        if (k6Var != null) {
                            tL_theme = k6Var.f29239r;
                        } else {
                            tL_theme = m6Var.G;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.zo0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.t1 t1Var2 = this.f43978r;
                        if (t1Var2 != null) {
                            t1Var2.dismiss();
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.N2) {
                    org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) objArr[0];
                    org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[1];
                    if (m6Var2 == this.h && k6Var2 == this.f43973n && (t1Var = this.f43978r) == null) {
                        t1Var.dismiss();
                    }
                } else if (i7 == org.telegram.messenger.ks.f25307v4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.m6) objArr[0];
                        this.f43973n = (org.telegram.ui.ActionBar.k6) objArr[1];
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                        this.f43978r = t1Var3;
                        t1Var3.f30091j0 = true;
                        showDialog(t1Var3, new q5(this, 16));
                    }
                } else if (i7 == org.telegram.messenger.ks.f25314w4) {
                    E0();
                    if (this.f43965f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.n6.k1();
                        boolean z10 = !k12;
                        if (this.W0 != z10) {
                            this.W0 = z10;
                            org.telegram.ui.Components.nh0 nh0Var = this.U0;
                            if (!k12) {
                                i12 = nh0Var.f37805e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            nh0Var.P(i12);
                            this.f43980s.getIconView().d();
                        }
                        if (this.f43977q0 >= 0) {
                            for (int i15 = 0; i15 < this.f43958b.getChildCount(); i15++) {
                                if (this.f43958b.getChildAt(i15) instanceof wt) {
                                    ((wt) this.f43958b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.X4) {
                    int i16 = this.f43977q0;
                    if (i16 >= 0) {
                        this.f43956a.g(i16);
                    }
                } else if ((i7 == org.telegram.messenger.ks.V3 || i7 == org.telegram.messenger.ks.S3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f43956a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.ek0 ek0Var = this.f43958b;
            if (ek0Var != null) {
                ek0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43958b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.j0.class, org.telegram.ui.Cells.ca.class, f61.class, v51.class, b61.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.ja.class, d61.class, org.telegram.ui.Cells.m8.class, pl0.class, org.telegram.ui.Components.fx0.class, wt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29731s8));
        int i7 = org.telegram.ui.ActionBar.n6.f29691q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{b61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29507g7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{b61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29477ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29566jc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29475ec));
        int i12 = org.telegram.ui.ActionBar.n6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        int i13 = org.telegram.ui.ActionBar.n6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43958b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.addAll(c8.ta.a(new g6(22, this), i12, org.telegram.ui.ActionBar.n6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25328y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25281r4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25294t4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25307v4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25314w4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.V3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.N2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.U5);
        if (this.f43965f == 0) {
            org.telegram.ui.ActionBar.n6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.n6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25328y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25281r4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25294t4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25307v4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25314w4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.V3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.N2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.U5);
        org.telegram.ui.ActionBar.n6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f43956a != null) {
            F0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.k3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
