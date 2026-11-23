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
public class ThemeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public final y51 S0;
    public int T;
    public final y51 T0;
    public int U;
    public org.telegram.ui.Components.oh0 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public g61 f43875a;
    public int f43876a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.ek0 f43877b;
    public int f43878b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public e61 f43879c;
    public int f43880c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f43881d0;
    public final ArrayList f43882e;
    public int f43883e0;
    public final int f43884f;
    public int f43885f0;
    public int f43886g0;
    public org.telegram.ui.ActionBar.l6 h;
    public int f43887h0;
    public int f43888i0;
    public int f43889j0;
    public int f43890k0;
    public int f43891l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.j6 f43892n;
    public int f43893n0;
    private int nightThemeRow;
    public int f43894o0;
    public int f43895p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f43896q0;
    public org.telegram.ui.ActionBar.t1 f43897r;
    public int f43898r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.g5 f43899s;
    public int f43900s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f43901t0;
    private int textSizeRow;
    public int f43902u0;
    public int f43903v0;
    public boolean f43904w;
    public int f43905w0;
    public int f43906x;
    public int f43907x0;
    public int f43908y;
    public int f43909y0;
    public int f43910z0;

    public static class InnerAccentView extends View {
        public final Paint f43911a;
        public ObjectAnimator f43912b;
        public float f43913c;
        public org.telegram.ui.ActionBar.l6 d;
        public org.telegram.ui.ActionBar.j6 f43914e;
        public boolean f43915f;

        public InnerAccentView(Context context) {
            super(context);
            this.f43911a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Z == this.f43914e.f29096a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43915f = z11;
            ObjectAnimator objectAnimator = this.f43912b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z10) {
                if (this.f43915f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f43912b = ofFloat;
                ofFloat.setDuration(200L);
                this.f43912b.start();
                return;
            }
            if (this.f43915f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f43913c;
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
            int i7 = this.f43914e.f29098c;
            Paint paint = this.f43911a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.f43913c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f43913c), paint);
            if (this.f43913c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f43913c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.f43913c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.f43913c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.f43914e.f29099e;
            if (i10 != 0 && this.f43913c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f43913c) * org.telegram.messenger.g0.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(2131752003, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f43915f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f43913c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f43882e = new ArrayList();
        this.S0 = new y51(this);
        this.T0 = new y51(this);
        this.f43884f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.m6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.m6.f29671t;
        int i12 = i11 / 60;
        return org.telegram.messenger.hd.a0("AutoNightUpdateLocationInfo", null, 2131753777, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.y10 y10Var, final org.telegram.ui.ActionBar.h6 h6Var) {
        final org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        final String str = u12.f26005x6;
        String str2 = u12.f26015y6;
        final int i10 = u12.f26024z6;
        if (!TextUtils.isEmpty(str) && ((org.telegram.messenger.h0) u12.A7.f26233m.f14030b).f24341c) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            g10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
            j3.O = g10;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.m6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231183);
            frameLayout.addView(imageView, c8.ma.e(50, 50, 17));
            g10.addView(frameLayout, c8.ma.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.m6.f29489j5;
            TextView b10 = c8.va.b(context, 20.0f, i12, true, h6Var);
            b10.setText(org.telegram.messenger.hd.N0(2131754304, null));
            b10.setGravity(17);
            g10.addView(b10, c8.ma.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = c8.va.b(context, 14.0f, i12, false, h6Var);
            b11.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.O0("AgeVerificationText" + str2)));
            b11.setGravity(17);
            g10.addView(b11, c8.ma.t(-1, -2, 7, 24, 0, 24, 0));
            final hi.e eVar = new hi.e(context, h6Var, true);
            eVar.i(org.telegram.messenger.hd.N0(2131754310, null), false, true);
            eVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final hi.e eVar2 = hi.e.this;
                    if (eVar2.R) {
                        return;
                    }
                    eVar2.setLoading(true);
                    final org.telegram.messenger.np npVar = u12;
                    final String str3 = str;
                    final int i13 = i7;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    final int i14 = i10;
                    final org.telegram.messenger.y10 y10Var2 = y10Var;
                    final org.telegram.ui.ActionBar.w2[] w2VarArr = r9;
                    c8.na.c(2131624117, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.y10() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final hi.e eVar3 = hi.e.this;
                            if (!booleanValue) {
                                eVar3.setLoading(false);
                                return;
                            }
                            final org.telegram.messenger.np npVar2 = npVar;
                            org.telegram.messenger.n10 f22 = npVar2.f2();
                            final int i15 = i13;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                            final int i16 = i14;
                            final org.telegram.messenger.y10 y10Var3 = y10Var2;
                            final org.telegram.ui.ActionBar.w2[] w2VarArr2 = w2VarArr;
                            f22.a(str3, null, new org.telegram.messenger.y10() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    hi.e eVar4 = hi.e.this;
                                    if (l10 == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User c22 = npVar2.c2(l10);
                                    if (c22 == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                    if (T == null) {
                                        eVar4.setLoading(false);
                                        return;
                                    }
                                    ki.e4 b12 = ki.e4.b(i15, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, c22, 0, false, false);
                                    final ki.s2 s2Var = new ki.s2(context3, h6Var3);
                                    final int i17 = i16;
                                    final org.telegram.messenger.y10 y10Var4 = y10Var3;
                                    ?? r62 = new org.telegram.messenger.v10() {
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
                                            s2Var.o(false);
                                            y10Var4.a(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                            if (booleanValue2 && T2 != null) {
                                                org.telegram.messenger.f3.n(null, 2131754306, org.telegram.ui.Components.lc.b0(T2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    s2Var.M0 = r62;
                                    ki.k2 k2Var = s2Var.E;
                                    if (k2Var != 0) {
                                        k2Var.setOnVerifiedAge(r62);
                                    }
                                    s2Var.B(true);
                                    s2Var.C0 = false;
                                    s2Var.m0 = T.getParentActivity();
                                    s2Var.x(T, b12);
                                    s2Var.show();
                                    eVar4.setLoading(false);
                                    w2VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            g10.addView(eVar, c8.ma.t(-1, 48, 7, 2, 29, 2, 14));
            j3.show();
            final org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
            j3.O();
            return;
        }
        y10Var.a(Boolean.TRUE);
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        g61 g61Var;
        boolean z10;
        org.telegram.ui.Components.ek0 ek0Var = themeActivity.f43877b;
        if (ek0Var != null && ek0Var.H && (g61Var = themeActivity.f43875a) != null) {
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
                g61Var.g(i7);
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
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            boolean z13 = g12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = g12.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            org.telegram.messenger.cz.C1 = Boolean.valueOf(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(z14);
            }
        } else if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i7 == themeActivity.changeUserColor) {
            lm0 lm0Var = new lm0();
            lm0Var.I = themeActivity;
            themeActivity.presentFragment(lm0Var);
        } else if (i7 == themeActivity.H) {
            SharedPreferences g13 = org.telegram.messenger.np.g1();
            boolean z15 = g13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = g13.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(z16);
            }
        } else if (i7 == themeActivity.F) {
            org.telegram.messenger.cz.f23437r0 = !org.telegram.messenger.cz.f23437r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.np.g1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.cz.f23437r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.f23437r0);
            }
        } else if (i7 == themeActivity.G) {
            org.telegram.messenger.cz.f23443t0 = !org.telegram.messenger.cz.f23443t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.np.g1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.cz.f23443t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.f23443t0);
            }
        } else if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.cz.f23440s0 = !org.telegram.messenger.cz.f23440s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.np.g1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.cz.f23440s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.f23440s0);
            }
            if (!org.telegram.messenger.cz.f23440s0 && themeActivity.F != -1) {
                for (int i12 = 0; i12 < themeActivity.f43877b.getChildCount(); i12++) {
                    View childAt = themeActivity.f43877b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s8) {
                        themeActivity.f43877b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.s8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
        } else if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.cz.F0 = !org.telegram.messenger.cz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.np.g1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.cz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.F0);
            }
        } else if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.cz.G0 = !org.telegram.messenger.cz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.np.g1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.cz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.s8) {
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.G0);
            }
        } else {
            float f11 = 4.0f;
            if (i7 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                    CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131751354, "DistanceUnitsAutomatic"), org.telegram.messenger.hd.N0(2131751353, "DistanceUnitsKilometers"), org.telegram.messenger.hd.N0(2131751352, "DistanceUnitsMiles")};
                    final int i13 = 0;
                    while (i13 < 3) {
                        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        float f12 = f11;
                        k6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f12), 0);
                        k6Var.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29437g7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == org.telegram.messenger.cz.f23441s1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k6Var.b(charSequence, z12);
                        int i14 = org.telegram.ui.ActionBar.m6.f29473i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i14, false), 2, -1);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                        k6Var.setBackground(h02);
                        org.telegram.ui.ActionBar.t6.j(k6Var, h02, null, M, null);
                        g10.addView(k6Var);
                        k6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f52457b;

                            {
                                this.f52457b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f52457b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.cz.f23441s1 = i13;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.np.g1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.cz.f23441s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f24450g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.f1 K = themeActivity2.f43877b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43875a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.cz.f23431p0 = i13;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.np.g1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.cz.f23431p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f52457b;
                                        themeActivity3.R0 = true;
                                        v4.f1 K2 = themeActivity3.f43877b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43875a.t(K2, themeActivity3.M);
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
                    alertDialog$Builder.f28777a.S = org.telegram.messenger.hd.N0(2131751351, "DistanceUnitsTitle");
                    alertDialog$Builder.o(g10);
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
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
                        charSequenceArr2[i15] = ((org.telegram.ui.web.e1) b10.get(i15)).f53126a;
                        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        k6Var2.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29437g7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == org.telegram.messenger.cz.f23431p0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k6Var2.b(charSequence2, z11);
                        int i16 = org.telegram.ui.ActionBar.m6.f29473i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i16, false), 2, -1);
                        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i16);
                        k6Var2.setBackground(h03);
                        org.telegram.ui.ActionBar.t6.j(k6Var2, h03, null, M2, null);
                        g11.addView(k6Var2);
                        k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f52457b;

                            {
                                this.f52457b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f52457b;
                                        themeActivity2.getClass();
                                        org.telegram.messenger.cz.f23441s1 = i15;
                                        SharedPreferences.Editor edit8 = org.telegram.messenger.np.g1().edit();
                                        edit8.putInt("distanceSystemType", org.telegram.messenger.cz.f23441s1);
                                        edit8.apply();
                                        org.telegram.messenger.hd.f24450g0 = null;
                                        themeActivity2.Q0 = true;
                                        v4.f1 K = themeActivity2.f43877b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f43875a.t(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        org.telegram.messenger.cz.f23431p0 = i15;
                                        SharedPreferences.Editor edit9 = org.telegram.messenger.np.g1().edit();
                                        edit9.putInt("searchEngineType", org.telegram.messenger.cz.f23431p0);
                                        edit9.apply();
                                        ThemeActivity themeActivity3 = this.f52457b;
                                        themeActivity3.R0 = true;
                                        v4.f1 K2 = themeActivity3.f43877b.K(themeActivity3.M);
                                        if (K2 != null) {
                                            themeActivity3.f43875a.t(K2, themeActivity3.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder2.f28777a.S = org.telegram.messenger.hd.N0(2131745603, null);
                    alertDialog$Builder2.o(g11);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    atomicReference2.set(t1Var2);
                    themeActivity.showDialog(t1Var2);
                }
            } else if (i7 == themeActivity.N) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
                    org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    int i17 = org.telegram.ui.ActionBar.m6.f29437g7;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i17, false);
                    int i18 = org.telegram.ui.ActionBar.m6.E5;
                    k6Var3.a(x02, org.telegram.ui.ActionBar.m6.x0(null, i18, false));
                    k6Var3.b(org.telegram.messenger.hd.N0(2131748245, null), !org.telegram.messenger.cz.f23446u0);
                    int i19 = org.telegram.ui.ActionBar.m6.f29473i6;
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i19);
                    k6Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.t6.j(k6Var3, h04, null, M3, null);
                    g14.addView(k6Var3);
                    k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f52734b;

                        {
                            this.f52734b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f52734b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.cz.f23446u0 = false;
                                    org.telegram.messenger.cz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K = themeActivity2.f43877b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43875a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.na.c(2131624121, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new p51(0, themeActivity2, atomicReference4));
                                    org.telegram.messenger.cz.f23446u0 = true;
                                    org.telegram.messenger.cz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K2 = themeActivity2.f43877b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43875a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    k6Var4.a(org.telegram.ui.ActionBar.m6.x0(null, i17, false), org.telegram.ui.ActionBar.m6.x0(null, i18, false));
                    String N03 = org.telegram.messenger.hd.N0(2131748242, null);
                    String N04 = org.telegram.messenger.hd.N0(2131748243, null);
                    boolean z17 = org.telegram.messenger.cz.f23446u0;
                    k6Var4.f30956a.setText(N03);
                    TextView textView = k6Var4.f30957b;
                    textView.setVisibility(0);
                    textView.setText(N04);
                    k6Var4.f30958c.a(z17, false);
                    org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 2, -1);
                    org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i19);
                    k6Var4.setBackground(h05);
                    org.telegram.ui.ActionBar.t6.j(k6Var4, h05, null, M4, null);
                    g14.addView(k6Var4);
                    k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f52734b;

                        {
                            this.f52734b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i20 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity2 = this.f52734b;
                            switch (i20) {
                                case 0:
                                    themeActivity2.getClass();
                                    org.telegram.messenger.cz.f23446u0 = false;
                                    org.telegram.messenger.cz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K = themeActivity2.f43877b.K(themeActivity2.N);
                                    if (K != null) {
                                        themeActivity2.f43875a.t(K, themeActivity2.N);
                                        return;
                                    }
                                    return;
                                default:
                                    c8.na.c(2131624121, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new p51(0, themeActivity2, atomicReference4));
                                    org.telegram.messenger.cz.f23446u0 = true;
                                    org.telegram.messenger.cz.y();
                                    themeActivity2.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    v4.f1 K2 = themeActivity2.f43877b.K(themeActivity2.N);
                                    if (K2 != null) {
                                        themeActivity2.f43875a.t(K2, themeActivity2.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder3.f28777a.S = org.telegram.messenger.hd.N0(2131748246, null);
                    alertDialog$Builder3.o(g14);
                    alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28777a;
                    atomicReference3.set(t1Var3);
                    themeActivity.showDialog(t1Var3);
                }
            } else if (i7 == themeActivity.E) {
                org.telegram.messenger.cz.f23454x0 = !org.telegram.messenger.cz.f23454x0;
                SharedPreferences.Editor edit8 = org.telegram.messenger.np.g1().edit();
                edit8.putBoolean("direct_share", org.telegram.messenger.cz.f23454x0);
                edit8.apply();
                g0.f.n(org.telegram.messenger.t0.f26931b);
                org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).o();
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.f23454x0);
                }
            } else if (i7 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().e5()) {
                    mz0 mz0Var = new mz0(6, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
                    alertDialog$Builder4.f28777a.S = org.telegram.messenger.hd.N0(2131751801, null);
                    alertDialog$Builder4.f28777a.U = org.telegram.messenger.hd.N0(2131751802, null);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751805, null), new aj0(18, themeActivity, mz0Var));
                    alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    themeActivity.showDialog(alertDialog$Builder4.f28777a);
                    return;
                }
                themeActivity.getMessagesController().Q4(false);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().e5());
                }
            } else if (i7 != themeActivity.Q) {
                if (i7 == themeActivity.R) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        alertDialog$Builder5.f28777a.S = org.telegram.messenger.hd.N0(2131745095, "SortBy");
                        alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.hd.N0(2131751588, "Default"), org.telegram.messenger.hd.N0(2131745091, "SortFirstName"), org.telegram.messenger.hd.N0(2131745090, "SortLastName")}, new fx(themeActivity, i7, 2));
                        alertDialog$Builder5.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                        themeActivity.showDialog(alertDialog$Builder5.f28777a);
                    }
                } else if (i7 == themeActivity.f43901t0) {
                    int i20 = org.telegram.messenger.cz.f23390a;
                    if (!org.telegram.messenger.qc.e(256)) {
                        d = 256 | org.telegram.messenger.qc.d(true);
                    } else {
                        d = org.telegram.messenger.qc.d(true) & (-257);
                    }
                    org.telegram.messenger.qc.f26428i = d;
                    org.telegram.messenger.qc.k();
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.f());
                    }
                } else if (i7 == themeActivity.nightThemeRow) {
                    if ((org.telegram.messenger.hd.f24444a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24444a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                        if (org.telegram.ui.ActionBar.m6.f29575o == 0) {
                            org.telegram.ui.ActionBar.m6.f29575o = 2;
                            j5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.m6.f29575o = 0;
                            j5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.m6.w1();
                        org.telegram.ui.ActionBar.m6.F(true);
                        if (org.telegram.ui.ActionBar.m6.f29575o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            N0 = org.telegram.ui.ActionBar.m6.C0();
                        } else {
                            N0 = org.telegram.messenger.hd.N0(2131753780, "AutoNightThemeOff");
                        }
                        if (z10) {
                            int i21 = org.telegram.ui.ActionBar.m6.f29575o;
                            if (i21 == 1) {
                                N02 = org.telegram.messenger.hd.N0(2131753784, "AutoNightScheduled");
                            } else if (i21 == 3) {
                                N02 = org.telegram.messenger.hd.N0(2131753783, "AutoNightSystemDefault");
                            } else {
                                N02 = org.telegram.messenger.hd.N0(2131753793, "AutoNightAdaptive");
                            }
                            N0 = a8.p0.E(N02, " ", N0);
                        }
                        j5Var.b(org.telegram.messenger.hd.N0(2131753781, "AutoNightTheme"), N0, 2131231844, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i7 == themeActivity.browserRow) {
                    if ((org.telegram.messenger.hd.f24444a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24444a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                        org.telegram.ui.Cells.j5 j5Var2 = (org.telegram.ui.Cells.j5) view;
                        org.telegram.messenger.np messagesController = themeActivity.getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
                        if (tL_webBrowserSettings != null) {
                            messagesController.G5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        j5Var2.setChecked(themeActivity.getMessagesController().S2());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.n1(null));
                } else if (i7 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.m6.f29575o != 0) {
                        org.telegram.ui.ActionBar.m6.f29575o = 0;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.m6.F(false);
                    }
                } else if (i7 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.m6.f29575o != 1) {
                        org.telegram.ui.ActionBar.m6.f29575o = 1;
                        if (org.telegram.ui.ActionBar.m6.f29594p) {
                            themeActivity.G0(null, true);
                        }
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.m6.F(false);
                    }
                } else if (i7 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.m6.f29575o != 2) {
                        org.telegram.ui.ActionBar.m6.f29575o = 2;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.m6.F(false);
                    }
                } else if (i7 == themeActivity.V) {
                    if (org.telegram.ui.ActionBar.m6.f29575o != 3) {
                        org.telegram.ui.ActionBar.m6.f29575o = 3;
                        themeActivity.F0(true);
                        org.telegram.ui.ActionBar.m6.F(false);
                    }
                } else if (i7 == themeActivity.Y) {
                    boolean z18 = !org.telegram.ui.ActionBar.m6.f29594p;
                    org.telegram.ui.ActionBar.m6.f29594p = z18;
                    ((org.telegram.ui.Cells.s8) view).setChecked(z18);
                    themeActivity.F0(true);
                    if (org.telegram.ui.ActionBar.m6.f29594p) {
                        themeActivity.G0(null, true);
                    }
                    org.telegram.ui.ActionBar.m6.F(false);
                } else if (i7 != themeActivity.f43878b0 && i7 != themeActivity.f43880c0) {
                    if (i7 == themeActivity.Z) {
                        themeActivity.G0(null, true);
                    } else if (i7 == themeActivity.createNewThemeRow) {
                        themeActivity.B0();
                    } else if (i7 == themeActivity.f43910z0) {
                        themeActivity.C0();
                    } else if (i7 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i7 == themeActivity.B0) {
                        themeActivity.presentFragment(new ai.a3());
                    } else if (i7 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new z90());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i7 == themeActivity.f43878b0) {
                        i10 = org.telegram.ui.ActionBar.m6.f29633r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f29653s;
                        i11 = i10 / 60;
                    }
                    int i22 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f43878b0;
                            int i27 = i7;
                            org.telegram.ui.Cells.x9 x9Var2 = x9Var;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.m6.f29633r = i25;
                                x9Var2.c(org.telegram.messenger.hd.N0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.m6.f29653s = i25;
                            x9Var2.c(org.telegram.messenger.hd.N0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i11, i22, true));
                }
            }
        }
    }

    public static void c0(ThemeActivity themeActivity, mz0 mz0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new p51(1, themeActivity, mz0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z10) {
        if (i7 == org.telegram.messenger.cz.Y0) {
            return false;
        }
        org.telegram.messenger.cz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.cz.Y0);
        edit.commit();
        v4.f1 K = themeActivity.f43877b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f59165a;
            if (view instanceof h61) {
                h61 h61Var = (h61) view;
                org.telegram.ui.Cells.r1[] cells = h61Var.f48248a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().S1 = false;
                    cells[i10].requestLayout();
                }
                h61Var.invalidate();
            }
        }
        v4.f1 K2 = themeActivity.f43877b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f59165a;
            if (view2 instanceof x51) {
                x51 x51Var = (x51) view2;
                if (z10) {
                    x51Var.requestLayout();
                } else {
                    x51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.cz.W0) {
            org.telegram.messenger.cz.W0 = i7;
            org.telegram.messenger.cz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.cz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.m6.Q();
                v4.f1 K = themeActivity.f43877b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f59165a;
                    if (view instanceof h61) {
                        org.telegram.ui.Cells.r1[] cells = ((h61) view).f48248a.getCells();
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
        String N0 = org.telegram.messenger.hd.N0(2131748065, "NewTheme");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131751699, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751691, "CreateTheme"), new n51(this, 2));
        showDialog(t1Var);
    }

    public final void C0() {
        boolean z10;
        org.telegram.ui.ActionBar.l6 D0 = org.telegram.ui.ActionBar.m6.D0();
        boolean z11 = true;
        if (D0.k(false).f29096a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f43884f != 1) {
            z11 = false;
        }
        presentFragment(new x71(D0, false, 1, z10, z11));
    }

    public final void E0() {
        int i7;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (this.f43899s == null) {
            return;
        }
        org.telegram.ui.ActionBar.l6 D0 = org.telegram.ui.ActionBar.m6.D0();
        org.telegram.ui.ActionBar.j6 k10 = D0.k(false);
        ArrayList arrayList = D0.f29237c0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f29096a >= 100) {
            this.f43899s.T(2);
            this.f43899s.T(3);
        } else {
            this.f43899s.u(2);
            this.f43899s.u(3);
        }
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 18;
        } else {
            i7 = 16;
        }
        org.telegram.ui.ActionBar.l6 D02 = org.telegram.ui.ActionBar.m6.D0();
        if (org.telegram.messenger.cz.W0 == i7 && org.telegram.messenger.cz.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.m6.f29557n && (k10 == null || (d6Var = k10.f29117y) == null || "d".equals(d6Var.f28885c))) {
            this.f43899s.u(4);
        } else {
            this.f43899s.T(4);
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
        org.telegram.ui.ActionBar.l6 D0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i21 = this.L0;
        int i22 = this.f43898r0;
        int i23 = this.f43910z0;
        int i24 = this.F;
        this.L0 = 0;
        this.Q = -1;
        this.R = -1;
        this.Y = -1;
        this.Z = -1;
        this.f43876a0 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f43888i0 = -1;
        this.f43878b0 = -1;
        this.f43880c0 = -1;
        this.f43881d0 = -1;
        this.f43895p0 = -1;
        this.f43896q0 = -1;
        this.f43898r0 = -1;
        this.f43900s0 = -1;
        this.f43887h0 = -1;
        this.f43883e0 = -1;
        this.f43885f0 = -1;
        this.f43886g0 = -1;
        this.f43906x = -1;
        this.f43889j0 = -1;
        this.f43890k0 = -1;
        this.bubbleRadiusRow = -1;
        this.f43891l0 = -1;
        this.m0 = -1;
        this.f43893n0 = -1;
        this.f43894o0 = -1;
        this.f43901t0 = -1;
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
        this.f43908y = -1;
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
        this.f43902u0 = -1;
        this.f43903v0 = -1;
        this.f43905w0 = -1;
        this.f43907x0 = -1;
        this.f43909y0 = -1;
        this.f43910z0 = -1;
        this.createNewThemeRow = -1;
        this.J0 = -1;
        this.appIconSelectorRow = -1;
        this.K0 = -1;
        this.A0 = -1;
        ArrayList arrayList = this.f43882e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.m6.F.size();
        int i25 = 0;
        while (true) {
            i7 = this.f43884f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) org.telegram.ui.ActionBar.m6.F.get(i25);
            if (i7 == 0 || i7 == 3 || ((l6Var.f29234b != null || l6Var.q()) && ((tL_theme = l6Var.G) == null || tL_theme.document != null))) {
                if (l6Var.f29234b != null) {
                    arrayList2.add(l6Var);
                } else {
                    arrayList.add(l6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new qw0(2));
        if (i7 == 3) {
            int i26 = this.L0;
            this.f43907x0 = i26;
            this.f43896q0 = i26 + 1;
            this.f43894o0 = i26 + 2;
            this.f43909y0 = i26 + 3;
            this.f43889j0 = i26 + 4;
            this.L0 = i26 + 6;
            this.f43895p0 = i26 + 5;
            if (org.telegram.ui.ActionBar.m6.D0().X != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f43904w = z13;
            e61 e61Var = this.f43879c;
            if (e61Var != null) {
                e61Var.setDrawDivider(z13);
            }
            if (this.f43904w) {
                int i27 = this.L0;
                this.L0 = i27 + 1;
                this.f43898r0 = i27;
            }
            int i28 = this.L0;
            this.L0 = i28 + 1;
            this.f43891l0 = i28;
            org.telegram.ui.ActionBar.l6 D02 = org.telegram.ui.ActionBar.m6.D0();
            org.telegram.ui.ActionBar.j6 k10 = D02.k(false);
            ArrayList arrayList3 = D02.f29237c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f29096a >= 100) {
                int i29 = this.L0;
                this.L0 = i29 + 1;
                this.f43910z0 = i29;
            }
            int i30 = this.L0;
            this.createNewThemeRow = i30;
            this.L0 = i30 + 2;
            this.A0 = i30 + 1;
        } else if (i7 == 0) {
            int i31 = this.L0;
            this.f43906x = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f43888i0 = i31 + 4;
            this.f43889j0 = i31 + 5;
            this.f43896q0 = i31 + 6;
            this.f43900s0 = i31 + 7;
            this.f43890k0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f43891l0 = i31 + 10;
            this.m0 = i31 + 11;
            this.f43893n0 = i31 + 12;
            this.f43894o0 = i31 + 13;
            this.J0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.K0 = i31 + 16;
            this.f43902u0 = i31 + 17;
            this.f43903v0 = i31 + 18;
            this.f43905w0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.L0 = i31 + 24;
            this.stickersRow = i31 + 23;
            if (DictationAsr.C()) {
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
            if (org.telegram.messenger.cz.f23440s0) {
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
            TL_account.contentSettings contentsettings = getMessagesController().f25961s8;
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
            int i42 = org.telegram.ui.ActionBar.m6.f29575o;
            if (i42 == 1) {
                this.X = i41;
                int i43 = i40 + 3;
                this.L0 = i43;
                this.Y = i40 + 2;
                if (org.telegram.ui.ActionBar.m6.f29594p) {
                    this.Z = i43;
                    this.L0 = i40 + 5;
                    this.f43876a0 = i40 + 4;
                } else {
                    this.f43878b0 = i43;
                    this.f43880c0 = i40 + 4;
                    this.L0 = i40 + 6;
                    this.f43881d0 = i40 + 5;
                }
            } else if (i42 == 2) {
                this.f43883e0 = i41;
                this.f43885f0 = i40 + 2;
                this.L0 = i40 + 4;
                this.f43886g0 = i40 + 3;
            }
            if (org.telegram.ui.ActionBar.m6.f29575o != 0) {
                int i44 = this.L0;
                this.f43887h0 = i44;
                this.L0 = i44 + 2;
                this.f43895p0 = i44 + 1;
                if (org.telegram.ui.ActionBar.m6.J.X != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43904w = z11;
                e61 e61Var2 = this.f43879c;
                if (e61Var2 != null) {
                    e61Var2.setDrawDivider(z11);
                }
                if (this.f43904w) {
                    int i45 = this.L0;
                    this.L0 = i45 + 1;
                    this.f43898r0 = i45;
                }
                int i46 = this.L0;
                this.L0 = i46 + 1;
                this.f43900s0 = i46;
            }
        }
        e61 e61Var3 = this.f43879c;
        if (e61Var3 != null) {
            int width = this.f43877b.getWidth();
            int i47 = e61Var3.f30878o3;
            org.telegram.ui.Cells.ha haVar = e61Var3.f30874k3;
            if (i47 != haVar.b()) {
                haVar.f();
                if (e61Var3.f30877n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.m6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.m6.D0();
                }
                if (e61Var3.j3 != D0) {
                    e61Var3.A1(width);
                }
            }
        }
        g61 g61Var = this.f43875a;
        if (g61Var != null) {
            if (i7 == 1 && (i14 = this.N0) != (i15 = org.telegram.ui.ActionBar.m6.f29575o) && i14 != -1) {
                int i48 = this.W;
                int i49 = i48 + 1;
                if (i14 != i15) {
                    for (int i50 = 0; i50 < 4; i50++) {
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43877b.K(i50);
                        if (mj0Var != null) {
                            View view = mj0Var.f59165a;
                            if (view instanceof org.telegram.ui.Cells.ca) {
                                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                                if (i50 == org.telegram.ui.ActionBar.m6.f29575o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                caVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i51 = org.telegram.ui.ActionBar.m6.f29575o;
                    if (i51 == 0) {
                        this.f43875a.p(i49, i21 - i49);
                    } else if (i51 == 1) {
                        int i52 = this.N0;
                        if (i52 == 0) {
                            this.f43875a.o(i49, this.L0 - i49);
                        } else if (i52 == 2) {
                            this.f43875a.p(i49, 3);
                            g61 g61Var2 = this.f43875a;
                            if (org.telegram.ui.ActionBar.m6.f29594p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            g61Var2.o(i49, i20);
                        } else if (i52 == 3) {
                            g61 g61Var3 = this.f43875a;
                            if (org.telegram.ui.ActionBar.m6.f29594p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            g61Var3.o(i49, i19);
                        }
                    } else if (i51 == 2) {
                        int i53 = this.N0;
                        if (i53 == 0) {
                            this.f43875a.o(i49, this.L0 - i49);
                        } else if (i53 == 1) {
                            g61 g61Var4 = this.f43875a;
                            if (org.telegram.ui.ActionBar.m6.f29594p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            g61Var4.p(i49, i18);
                            this.f43875a.o(i49, 3);
                        } else if (i53 == 3) {
                            this.f43875a.o(i49, 3);
                        }
                    } else if (i51 == 3) {
                        int i54 = this.N0;
                        if (i54 == 0) {
                            this.f43875a.o(i49, this.L0 - i49);
                        } else if (i54 == 2) {
                            this.f43875a.p(i49, 3);
                        } else if (i54 == 1) {
                            g61 g61Var5 = this.f43875a;
                            if (org.telegram.ui.ActionBar.m6.f29594p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            g61Var5.p(i49, i17);
                        }
                    }
                } else {
                    boolean z14 = this.O0;
                    boolean z15 = org.telegram.ui.ActionBar.m6.f29594p;
                    if (z14 != z15) {
                        int i55 = i48 + 3;
                        if (z15) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        g61Var.p(i55, i16);
                        g61 g61Var6 = this.f43875a;
                        if (org.telegram.ui.ActionBar.m6.f29594p) {
                            i10 = 2;
                        }
                        g61Var6.o(i55, i10);
                    }
                }
            } else if (!z10 && this.N0 != -1) {
                if (i22 == -1 && (i13 = this.f43898r0) != -1) {
                    g61Var.i(i13);
                } else if (i22 != -1 && this.f43898r0 == -1) {
                    g61Var.s(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i56 = this.f43898r0;
                    if (i56 != -1) {
                        g61Var.g(i56);
                    }
                }
                if (i23 == -1 && (i12 = this.f43910z0) != -1) {
                    this.f43875a.i(i12);
                } else if (i23 != -1 && this.f43910z0 == -1) {
                    this.f43875a.s(i23);
                }
                if (i24 == -1 && (i11 = this.F) != -1) {
                    this.f43875a.i(i11);
                } else if (i24 != -1 && this.F == -1) {
                    this.f43875a.s(i24);
                }
            } else {
                g61Var.f();
            }
        }
        if (i7 == 1) {
            this.O0 = org.telegram.ui.ActionBar.m6.f29594p;
            this.N0 = org.telegram.ui.ActionBar.m6.f29575o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i7 = org.telegram.ui.ActionBar.m6.L5;
                        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.m6.x0(null, i7, false), null);
                        alertDialog$Builder.n(i7, null);
                        alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131749354, "GpsDisabledAlertText");
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751794, "ConnectingToProxyEnable"), new n51(this, 1));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                        showDialog(alertDialog$Builder.f28777a);
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
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location");
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
        org.telegram.ui.ActionBar.m6.f29747x = location.getLatitude();
        org.telegram.ui.ActionBar.m6.f29766y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.m6.f29747x, org.telegram.ui.ActionBar.m6.f29766y);
        org.telegram.ui.ActionBar.m6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.m6.f29671t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.m6.f29728w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.m6.f29690u = calendar.get(5);
        Utilities.f22810e.c(new o51(this, 0));
        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43877b.K(this.f43876a0);
        if (mj0Var != null) {
            View view = mj0Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.a9) {
                ((org.telegram.ui.Cells.a9) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.m6.f29594p && org.telegram.ui.ActionBar.m6.f29575o == 1) {
            org.telegram.ui.ActionBar.m6.F(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29497jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29681ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29682tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29663sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29740wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29721vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29702ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29644ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !org.telegram.ui.ActionBar.m6.k1();
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f43884f;
        if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752866, "BrowseThemes"));
            org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
            org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.U0 = oh0Var;
            if (this.W0) {
                oh0Var.M(oh0Var.f38210e[0] - 1);
            } else {
                oh0Var.M(0);
            }
            org.telegram.ui.Components.oh0 oh0Var2 = this.U0;
            oh0Var2.h = true;
            t6.getClass();
            this.f43899s = t6.c(5, 0, null, oh0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752198, "ChatSettings"));
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131231244);
            this.f43899s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.N0(2131754838, "AccDescrMoreOptions"));
            this.f43899s.e(2, 2131232365, org.telegram.messenger.hd.N0(2131745230, "ShareTheme"));
            this.f43899s.e(3, 2131232118, org.telegram.messenger.hd.N0(2131751207, "EditThemeColors"));
            this.f43899s.e(1, 2131232272, org.telegram.messenger.hd.N0(2131751697, "CreateNewThemeMenu"));
            this.f43899s.e(4, 2131232343, org.telegram.messenger.hd.N0(2131743905, "ThemeResetToDefaults"));
            if (getMessagesController().f25961s8 == null) {
                getMessagesController().T0(new r3(this, 25));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131753781, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w51(this));
        this.f43875a = new g61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43877b = ek0Var;
        ek0Var.r1();
        this.f43877b.setSectionsDrawBackground(true);
        this.f43877b.setLayoutManager(new v4.c0(1, false));
        this.f43877b.setVerticalScrollBarEnabled(false);
        this.f43877b.setAdapter(this.f43875a);
        ((v4.k) this.f43877b.getItemAnimator()).C = false;
        frameLayout.addView(this.f43877b, c8.ma.c(-1.0f, -1));
        this.f43877b.setOnItemClickListener(new aj0(19, this, context));
        if (i7 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.nr.h);
            kVar.C = false;
            kVar.f59194m = false;
            this.f43877b.setItemAnimator(kVar);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.f43877b.v0(this.f43875a.f47986e.L0 - 1);
            org.telegram.messenger.g0.h3(new o51(this, 1), 200L);
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
        if (i7 == org.telegram.messenger.ls.f25423y4) {
            G0(null, true);
        } else if (i7 != org.telegram.messenger.ls.C4 && i7 != org.telegram.messenger.ls.f25342l4) {
            if (i7 == org.telegram.messenger.ls.U5) {
                g61 g61Var = this.f43875a;
                if (g61Var != null && (i14 = this.browserRow) != -1) {
                    g61Var.g(i14);
                }
            } else if (i7 == org.telegram.messenger.ls.f25389t4) {
                g61 g61Var2 = this.f43875a;
                if (g61Var2 != null && (i13 = this.f43898r0) != -1) {
                    g61Var2.h(i13, new Object());
                }
            } else if (i7 == org.telegram.messenger.ls.f25376r4) {
                F0(true);
            } else {
                if (i7 == org.telegram.messenger.ls.M2) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) objArr[0];
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[1];
                    if (l6Var == this.h && j6Var == this.f43892n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().X2);
                        sb2.append("/addtheme/");
                        if (j6Var != null) {
                            tL_theme = j6Var.f29111r;
                        } else {
                            tL_theme = l6Var.G;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.ap0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.t1 t1Var2 = this.f43897r;
                        if (t1Var2 != null) {
                            t1Var2.dismiss();
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.N2) {
                    org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) objArr[0];
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[1];
                    if (l6Var2 == this.h && j6Var2 == this.f43892n && (t1Var = this.f43897r) == null) {
                        t1Var.dismiss();
                    }
                } else if (i7 == org.telegram.messenger.ls.f25402v4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.l6) objArr[0];
                        this.f43892n = (org.telegram.ui.ActionBar.j6) objArr[1];
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                        this.f43897r = t1Var3;
                        t1Var3.f30033j0 = true;
                        showDialog(t1Var3, new q5(this, 16));
                    }
                } else if (i7 == org.telegram.messenger.ls.f25409w4) {
                    E0();
                    if (this.f43884f == 3) {
                        boolean k12 = org.telegram.ui.ActionBar.m6.k1();
                        boolean z10 = !k12;
                        if (this.W0 != z10) {
                            this.W0 = z10;
                            org.telegram.ui.Components.oh0 oh0Var = this.U0;
                            if (!k12) {
                                i12 = oh0Var.f38210e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            oh0Var.P(i12);
                            this.f43899s.getIconView().d();
                        }
                        if (this.f43896q0 >= 0) {
                            for (int i15 = 0; i15 < this.f43877b.getChildCount(); i15++) {
                                if (this.f43877b.getChildAt(i15) instanceof xt) {
                                    ((xt) this.f43877b.getChildAt(i15)).a();
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.X4) {
                    int i16 = this.f43896q0;
                    if (i16 >= 0) {
                        this.f43875a.g(i16);
                    }
                } else if ((i7 == org.telegram.messenger.ls.V3 || i7 == org.telegram.messenger.ls.S3) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f43875a.g(i11);
                }
            }
        } else {
            org.telegram.ui.Components.ek0 ek0Var = this.f43877b;
            if (ek0Var != null) {
                ek0Var.g1();
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43877b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.j0.class, org.telegram.ui.Cells.ca.class, h61.class, x51.class, d61.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Cells.ia.class, f61.class, org.telegram.ui.Cells.n8.class, rl0.class, org.telegram.ui.Components.gx0.class, xt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29661s8));
        int i7 = org.telegram.ui.ActionBar.m6.f29621q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29437g7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29407ee));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29496jc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{h61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29405ec));
        int i12 = org.telegram.ui.ActionBar.m6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        int i13 = org.telegram.ui.ActionBar.m6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43877b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
        arrayList.addAll(c8.sa.a(new f6(22, this), i12, org.telegram.ui.ActionBar.m6.G6, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25423y4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.C4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25376r4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25389t4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25402v4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25409w4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.X4);
        getNotificationCenter().c(this, org.telegram.messenger.ls.S3);
        getNotificationCenter().c(this, org.telegram.messenger.ls.V3);
        getNotificationCenter().c(this, org.telegram.messenger.ls.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ls.N2);
        getNotificationCenter().c(this, org.telegram.messenger.ls.U5);
        if (this.f43884f == 0) {
            org.telegram.ui.ActionBar.m6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.m6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25423y4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.C4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25376r4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25389t4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25402v4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25409w4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.X4);
        getNotificationCenter().n(this, org.telegram.messenger.ls.S3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.V3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ls.N2);
        getNotificationCenter().n(this, org.telegram.messenger.ls.U5);
        org.telegram.ui.ActionBar.m6.w1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f43875a != null) {
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
