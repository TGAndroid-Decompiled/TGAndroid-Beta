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
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
public class ThemeActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public final cb6 S0;
    public int T;
    public final cb6 T0;
    public int U;
    public oy8 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public d0 a;
    public int a0;
    private int appIconSelectorRow;
    public o39 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public qkb c;
    public int c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int d0;
    public final ArrayList e;
    public int e0;
    public final byte f;
    public int f0;
    public int g0;
    public akb h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public zjb n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public hd r;
    public int r0;
    private int raiseToListenRow;
    public xha s;
    public int s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int t0;
    private int textSizeRow;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public int z0;

    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public akb d;
        public zjb e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z) {
            boolean z2;
            if (this.d.Z == this.e.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            boolean z3 = this.f;
            float f = 0.0f;
            if (z) {
                if (z3) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f);
                this.b = ofFloat;
                ofFloat.setDuration(200L);
                this.b.start();
                return;
            }
            if (z3) {
                f = 1.0f;
            }
            setCheckedState(f);
        }

        public float getCheckedState() {
            return this.c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float L = gl.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i = this.e.c;
            Paint paint = this.a;
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (gl.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, gl.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (gl.L(7.0f) * this.c), measuredHeight, gl.L(2.0f), paint);
                canvas.drawCircle((gl.L(7.0f) * this.c) + measuredWidth, measuredHeight, gl.L(2.0f), paint);
            }
            int i2 = this.e.e;
            if (i2 != 0 && this.c != 1.0f) {
                paint.setColor(i2);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * gl.L(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(k96.M0(2131752003, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(62.0f), 1073741824));
        }

        public void setCheckedState(float f) {
            this.c = f;
            invalidate();
        }
    }

    public ThemeActivity(int i) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.S0 = new cb6(this, (byte) 2);
        this.T0 = new cb6(this, (byte) 2);
        this.f = i;
        E0(true);
    }

    public static void G0(final int i, final wjb wjbVar, final p8c p8cVar, final Context context) {
        final na7 q1 = na7.q1(i);
        final String str = q1.k4.P2.f;
        String str2 = q1.k4.Q2.f;
        final int f = q1.k4.F0.f();
        if (!TextUtils.isEmpty(str) && q1.k4.l.f) {
            fx0 h = de9.h(1, wjbVar, context, false);
            LinearLayout j = de9.j(context, 1);
            j.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
            j.setClipChildren(false);
            j.setClipToPadding(false);
            h.O = j;
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gl.L(80.0f);
            int i2 = bkb.Ei;
            ShapeDrawable K = bkb.K(L, bkb.v0(i2, wjbVar));
            vkb M = zkb.M(i2);
            frameLayout.setBackground(K);
            zkb.j(frameLayout, K, M, null, wjbVar);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231185);
            frameLayout.addView(imageView, nme.e(50, 50, 17));
            j.addView(frameLayout, nme.t(80, 80, 1, 0, 20, 0, 8));
            int i3 = bkb.i5;
            TextView b = hve.b(context, 20.0f, i3, true, wjbVar);
            b.setText(k96.M0(2131754304, null));
            b.setGravity(17);
            j.addView(b, nme.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b2 = hve.b(context, 14.0f, i3, false, wjbVar);
            b2.setText(gl.S2(k96.N0("AgeVerificationText" + str2)));
            b2.setGravity(17);
            j.addView(b2, nme.t(-1, -2, 7, 24, 0, 24, 0));
            final u41 u41Var = new u41(wjbVar, context, true);
            u41Var.i(k96.M0(2131754310, null), false, true);
            u41Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final u41 u41Var2 = u41.this;
                    if (u41Var2.R) {
                        return;
                    }
                    u41Var2.setLoading(true);
                    final na7 na7Var = q1;
                    final String str3 = str;
                    final int i4 = i;
                    final Context context2 = context;
                    final wjb wjbVar2 = wjbVar;
                    final int i5 = f;
                    final p8c p8cVar2 = p8cVar;
                    final fx0[] fx0VarArr = r9;
                    rqe.c(2131624117, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new p8c() {
                        @Override
                        public final void a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final u41 u41Var3 = u41.this;
                            if (!booleanValue) {
                                u41Var3.setLoading(false);
                                return;
                            }
                            final na7 na7Var2 = na7Var;
                            k7c Y1 = na7Var2.Y1();
                            final int i6 = i4;
                            final Context context3 = context2;
                            final wjb wjbVar3 = wjbVar2;
                            final int i7 = i5;
                            final p8c p8cVar3 = p8cVar2;
                            final fx0[] fx0VarArr2 = fx0VarArr;
                            Y1.a(str3, null, new p8c() {
                                @Override
                                public final void a(Object obj2) {
                                    Long l = (Long) obj2;
                                    u41 u41Var4 = u41.this;
                                    if (l == null) {
                                        u41Var4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User V1 = na7Var2.V1(l);
                                    if (V1 == null) {
                                        u41Var4.setLoading(false);
                                        return;
                                    }
                                    d S = LaunchActivity.S();
                                    if (S == null) {
                                        u41Var4.setLoading(false);
                                        return;
                                    }
                                    quc b3 = quc.b(i6, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, V1, 0, false, false);
                                    final ow0 ow0Var = new ow0(context3, wjbVar3);
                                    final int i8 = i7;
                                    final p8c p8cVar4 = p8cVar3;
                                    ?? r6 = new m8c() {
                                        @Override
                                        public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d2 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i8) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            ow0Var.m(false);
                                            p8cVar4.a(Boolean.valueOf(booleanValue2));
                                            d S2 = LaunchActivity.S();
                                            if (booleanValue2 && S2 != null) {
                                                ir2.v(null, 2131754306, u21.b0(S2), 2131623990, 36);
                                            }
                                        }
                                    };
                                    ow0Var.M0 = r6;
                                    gw0 gw0Var = ow0Var.E;
                                    if (gw0Var != 0) {
                                        gw0Var.setOnVerifiedAge(r6);
                                    }
                                    ow0Var.B(true);
                                    ow0Var.C0 = false;
                                    ow0Var.m0 = S.getParentActivity();
                                    ow0Var.x(S, b3);
                                    ow0Var.show();
                                    u41Var4.setLoading(false);
                                    fx0VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            j.addView(u41Var, nme.t(-1, 48, 7, 2, 29, 2, 14));
            h.show();
            final fx0[] fx0VarArr = {h};
            h.K();
            return;
        }
        p8cVar.a(Boolean.TRUE);
    }

    public static String w0() {
        int i = bkb.v;
        int i2 = i / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = bkb.t;
        int i4 = i3 / 60;
        return k96.a0("AutoNightUpdateLocationInfo", null, 2131753777, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), format);
    }

    public final void A0(TL_account.contentSettings contentsettings) {
        d0 d0Var;
        boolean z;
        o39 o39Var = this.b;
        if (o39Var != null && o39Var.H && (d0Var = this.a) != null) {
            int i = this.sensitiveContentRow;
            boolean z2 = false;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z2 = true;
            }
            if (z == z2) {
                d0Var.g(i);
            } else {
                E0(true);
            }
        }
    }

    public final boolean B0(int i, boolean z) {
        if (i == gba.U0) {
            return false;
        }
        gba.U0 = i;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("bubbleRadius", gba.U0);
        edit.commit();
        s49 K = this.b.K(this.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof skb) {
                skb skbVar = (skb) view;
                gb2[] cells = skbVar.a.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().S1 = false;
                    cells[i2].requestLayout();
                }
                skbVar.invalidate();
            }
        }
        s49 K2 = this.b.K(this.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof mkb) {
                mkb mkbVar = (mkb) view2;
                if (z) {
                    mkbVar.requestLayout();
                } else {
                    mkbVar.invalidate();
                }
            }
        }
        D0();
        return true;
    }

    public final boolean C0(int i) {
        if (i != gba.S0) {
            gba.S0 = i;
            gba.T0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", gba.S0);
                edit.commit();
                bkb.P();
                s49 K = this.b.K(this.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof skb) {
                        gb2[] cells = ((skb) view).a.getCells();
                        for (int i2 = 0; i2 < cells.length; i2++) {
                            cells[i2].getMessageObject().S1 = false;
                            cells[i2].requestLayout();
                        }
                    }
                }
                D0();
                return true;
            }
        }
        return false;
    }

    public final void D0() {
        int i;
        vjb vjbVar;
        if (this.s == null) {
            return;
        }
        akb B0 = bkb.B0();
        zjb i2 = B0.i(false);
        ArrayList arrayList = B0.c0;
        if (arrayList != null && !arrayList.isEmpty() && i2 != null && i2.a >= 100) {
            this.s.S(2);
            this.s.S(3);
        } else {
            this.s.u(2);
            this.s.u(3);
        }
        if (gl.O1()) {
            i = 18;
        } else {
            i = 16;
        }
        akb B02 = bkb.B0();
        if (gba.S0 == i && gba.U0 == 17 && B02.T && B02.Z == bkb.n && (i2 == null || (vjbVar = i2.y) == null || "d".equals(vjbVar.c))) {
            this.s.u(4);
        } else {
            this.s.S(4);
        }
    }

    public final void E0(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemeActivity.E0(boolean):void");
    }

    public final void F0(Location location, boolean z) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i = bkb.K5;
                        alertDialog$Builder.l(2131624120, 72, bkb.w0(null, i, false), null);
                        alertDialog$Builder.m(i, null);
                        alertDialog$Builder.a.U = k96.M0(2131749355, "GpsDisabledAlertText");
                        alertDialog$Builder.j(k96.M0(2131751794, "ConnectingToProxyEnable"), new dkb(this, (byte) 1));
                        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                        showDialog(alertDialog$Builder.a);
                        return;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
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
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        if (location == null || z) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        bkb.x = location.getLatitude();
        bkb.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(bkb.x, bkb.y);
        bkb.v = calculateSunriseSunset[0];
        bkb.t = calculateSunriseSunset[1];
        bkb.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        bkb.u = calendar.get(5);
        Utilities.e.c(new ekb(this, (byte) 0));
        y29 y29Var = (y29) this.b.K(this.a0);
        if (y29Var != null) {
            View view = y29Var.a;
            if (view instanceof mhb) {
                ((mhb) view).setText(w0());
            }
        }
        if (bkb.p && bkb.o == 1) {
            bkb.E(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Jj));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.Ci));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !bkb.i1();
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        byte b = this.f;
        if (b == 3) {
            phaVar.setTitle(k96.M0(2131752866, "BrowseThemes"));
            wha t = this.simpleActionBar.t();
            oy8 oy8Var = new oy8(2131624234, gl.L(28.0f), gl.L(28.0f), true, null);
            this.U0 = oy8Var;
            if (this.W0) {
                oy8Var.H(oy8Var.e[0] - 1);
            } else {
                oy8Var.H(0);
            }
            oy8 oy8Var2 = this.U0;
            oy8Var2.h = true;
            t.getClass();
            this.s = t.b(5, 0, null, oy8Var2, gl.L(48.0f), null);
        } else if (b == 0) {
            phaVar.setTitle(k96.M0(2131752198, "ChatSettings"));
            xha a = this.simpleActionBar.t().a(0, 2131231247);
            this.s = a;
            a.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
            this.s.e(2, 2131232368, k96.M0(2131745234, "ShareTheme"));
            this.s.e(3, 2131232121, k96.M0(2131751207, "EditThemeColors"));
            this.s.e(1, 2131232275, k96.M0(2131751697, "CreateNewThemeMenu"));
            this.s.e(4, 2131232346, k96.M0(2131743907, "ThemeResetToDefaults"));
            if (getMessagesController().a5 == null) {
                getMessagesController().P0(new ae9(this, (byte) 20));
            }
        } else {
            phaVar.setTitle(k96.M0(2131753781, null));
        }
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lkb(this));
        this.a = new d0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((gb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new kq8(this, context, (byte) 24));
        if (b == 0) {
            gb3 gb3Var = new gb3();
            gb3Var.n(350L);
            gb3Var.o(s33.h);
            gb3Var.C = false;
            gb3Var.m = false;
            this.b.setItemAnimator(gb3Var);
        }
        if (this.V0) {
            E0(false);
            this.V0 = false;
            this.b.w0(this.a.e.L0 - 1);
            gl.d3(new ekb(this, (byte) 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        hd hdVar;
        TLRPC.TL_theme tL_theme;
        int i5;
        int i6;
        if (i == kk7.x4) {
            F0(null, true);
        } else if (i != kk7.B4 && i != kk7.k4) {
            if (i == kk7.T5) {
                d0 d0Var = this.a;
                if (d0Var != null && (i6 = this.browserRow) != -1) {
                    d0Var.g(i6);
                }
            } else if (i == kk7.s4) {
                d0 d0Var2 = this.a;
                if (d0Var2 != null && (i5 = this.r0) != -1) {
                    d0Var2.h(i5, new Object());
                }
            } else if (i == kk7.q4) {
                E0(true);
            } else {
                if (i == kk7.L2) {
                    akb akbVar = (akb) objArr[0];
                    zjb zjbVar = (zjb) objArr[1];
                    if (akbVar == this.h && zjbVar == this.n) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(getMessagesController().N2);
                        sb.append("/addtheme/");
                        if (zjbVar != null) {
                            tL_theme = zjbVar.r;
                        } else {
                            tL_theme = akbVar.G;
                        }
                        sb.append(tL_theme.slug);
                        String sb2 = sb.toString();
                        showDialog(new taa(getParentActivity(), null, sb2, false, sb2, false, null));
                        hd hdVar2 = this.r;
                        if (hdVar2 != null) {
                            hdVar2.dismiss();
                        }
                    }
                } else if (i == kk7.M2) {
                    akb akbVar2 = (akb) objArr[0];
                    zjb zjbVar2 = (zjb) objArr[1];
                    if (akbVar2 == this.h && zjbVar2 == this.n && (hdVar = this.r) == null) {
                        hdVar.dismiss();
                    }
                } else if (i == kk7.u4) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (akb) objArr[0];
                        this.n = (zjb) objArr[1];
                        hd hdVar3 = new hd(3, null, getParentActivity());
                        this.r = hdVar3;
                        hdVar3.j0 = true;
                        showDialog(hdVar3, new ph8(this, (byte) 11));
                    }
                } else if (i == kk7.v4) {
                    D0();
                    if (this.f == 3) {
                        boolean i1 = bkb.i1();
                        boolean z = !i1;
                        if (this.W0 != z) {
                            this.W0 = z;
                            oy8 oy8Var = this.U0;
                            if (!i1) {
                                i4 = oy8Var.e[0] - 1;
                            } else {
                                i4 = 0;
                            }
                            oy8Var.K(i4);
                            this.s.getIconView().d();
                        }
                        if (this.q0 >= 0) {
                            for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                                if (this.b.getChildAt(i7) instanceof hc3) {
                                    ((hc3) this.b.getChildAt(i7)).a();
                                }
                            }
                        }
                    }
                } else if (i == kk7.W4) {
                    int i8 = this.q0;
                    if (i8 >= 0) {
                        this.a.g(i8);
                    }
                } else if ((i == kk7.U3 || i == kk7.R3) && (i3 = this.sensitiveContentRow) >= 0) {
                    this.a.g(i3);
                }
            }
        } else {
            o39 o39Var = this.b;
            if (o39Var != null) {
                o39Var.h1();
            }
            D0();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ahb.class, ld5.class, uy0.class, bnb.class, skb.class, mkb.class, pkb.class, vl7.class, org.telegram.ui.Cells.f.class, rkb.class, wgb.class, d08.class, pcb.class, hc3.class, or.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        int i = bkb.p6;
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.L6;
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.M6;
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.b, 0, new Class[]{pkb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.f7));
        arrayList.add(new blb(this.b, 0, new Class[]{pkb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.g7));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uc));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kd));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Od));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Tb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qd));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.de));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ic));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ee));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.dc));
        int i4 = bkb.G6;
        arrayList.add(new blb(this.b, 0, new Class[]{or.class}, (Paint) null, (Drawable[]) null, (alb) null, i4));
        int i5 = bkb.H6;
        arrayList.add(new blb(this.b, 0, new Class[]{or.class}, (Paint) null, (Drawable[]) null, (alb) null, i5));
        arrayList.addAll(hue.a(new t00(this, (byte) 21), i4, bkb.F6, i5));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.e().b(this, kk7.x4);
        kk7.e().b(this, kk7.B4);
        kk7.e().b(this, kk7.q4);
        kk7.e().b(this, kk7.s4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.u4);
        kk7.e().b(this, kk7.v4);
        kk7.e().b(this, kk7.W4);
        getNotificationCenter().b(this, kk7.R3);
        getNotificationCenter().b(this, kk7.U3);
        getNotificationCenter().b(this, kk7.L2);
        getNotificationCenter().b(this, kk7.M2);
        getNotificationCenter().b(this, kk7.T5);
        if (this.f == 0) {
            bkb.k1(this.currentAccount, true);
            bkb.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        kk7.e().n(this, kk7.x4);
        kk7.e().n(this, kk7.B4);
        kk7.e().n(this, kk7.q4);
        kk7.e().n(this, kk7.s4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.u4);
        kk7.e().n(this, kk7.v4);
        kk7.e().n(this, kk7.W4);
        getNotificationCenter().n(this, kk7.R3);
        getNotificationCenter().n(this, kk7.U3);
        getNotificationCenter().n(this, kk7.L2);
        getNotificationCenter().n(this, kk7.M2);
        getNotificationCenter().n(this, kk7.T5);
        bkb.u1();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            E0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gl.V2(getParentActivity(), this.classGuid);
            gl.g3(getParentActivity(), this.classGuid);
        }
    }

    public final void u0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131748066, "NewTheme");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131751699, "CreateNewThemeAlert");
        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
        alertDialog$Builder.j(k96.M0(2131751691, "CreateTheme"), new dkb(this, (byte) 2));
        showDialog(hdVar);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        boolean z;
        akb B0 = bkb.B0();
        boolean z2 = true;
        if (B0.i(false).a >= 100) {
            z = true;
        } else {
            z = false;
        }
        if (this.f != 1) {
            z2 = false;
        }
        presentFragment(new qmb(B0, false, 1, z, z2));
    }

    public final void x0(a5b a5bVar) {
        Activity parentActivity = getParentActivity();
        G0(this.currentAccount, getResourceProvider(), new nu9(this, a5bVar, (byte) 17), parentActivity);
    }

    public final void y0(Context context, View view, final int i, float f) {
        int i2;
        int i3;
        boolean z;
        String M0;
        String M02;
        int d;
        boolean z2;
        boolean z3;
        if (i == this.O) {
            SharedPreferences c1 = na7.c1();
            boolean z4 = c1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = c1.edit();
            boolean z5 = !z4;
            edit.putBoolean("view_animations", z5);
            gba.y1 = Boolean.valueOf(z5);
            edit.commit();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(z5);
            }
        } else if (i == this.backgroundRow) {
            presentFragment(new WallpapersListActivity(0));
        } else if (i == this.changeUserColor) {
            a18 a18Var = new a18();
            a18Var.I = this;
            presentFragment(a18Var);
        } else if (i == this.H) {
            SharedPreferences c12 = na7.c1();
            boolean z6 = c12.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = c12.edit();
            boolean z7 = !z6;
            edit2.putBoolean("send_by_enter", z7);
            edit2.commit();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(z7);
            }
        } else if (i == this.F) {
            gba.o0 = !gba.o0;
            SharedPreferences.Editor edit3 = na7.c1().edit();
            edit3.putBoolean("raise_to_speak", gba.o0);
            edit3.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.o0);
            }
        } else if (i == this.G) {
            gba.q0 = !gba.q0;
            SharedPreferences.Editor edit4 = na7.c1().edit();
            edit4.putBoolean("next_media_on_tap", gba.q0);
            edit4.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.q0);
            }
        } else if (i == this.raiseToListenRow) {
            gba.p0 = !gba.p0;
            SharedPreferences.Editor edit5 = na7.c1().edit();
            edit5.putBoolean("raise_to_listen", gba.p0);
            edit5.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.p0);
            }
            if (!gba.p0 && this.F != -1) {
                for (int i4 = 0; i4 < this.b.getChildCount(); i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof ahb) {
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == this.F) {
                            ((ahb) childAt).setChecked(false);
                        }
                    }
                }
            }
            E0(false);
        } else if (i == this.pauseOnRecordRow) {
            gba.B0 = !gba.B0;
            SharedPreferences.Editor edit6 = na7.c1().edit();
            edit6.putBoolean("pauseMusicOnRecord", gba.B0);
            edit6.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.B0);
            }
        } else if (i == this.pauseOnMediaRow) {
            gba.C0 = !gba.C0;
            SharedPreferences.Editor edit7 = na7.c1().edit();
            edit7.putBoolean("pauseMusicOnMedia", gba.C0);
            edit7.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.C0);
            }
        } else {
            float f2 = 4.0f;
            if (i == this.L) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout j = de9.j(context, 1);
                    CharSequence[] charSequenceArr = {k96.M0(2131751354, "DistanceUnitsAutomatic"), k96.M0(2131751353, "DistanceUnitsKilometers"), k96.M0(2131751352, "DistanceUnitsMiles")};
                    final int i5 = 0;
                    while (i5 < 3) {
                        wy8 wy8Var = new wy8(getParentActivity(), null);
                        float f3 = f2;
                        wy8Var.setPadding(gl.L(f2), 0, gl.L(f3), 0);
                        wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                        CharSequence charSequence = charSequenceArr[i5];
                        if (i5 == gba.o1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        wy8Var.b(charSequence, z3);
                        int i6 = bkb.h6;
                        ff0 f0 = bkb.f0(bkb.w0(null, i6, false), 2, -1);
                        vkb M = zkb.M(i6);
                        wy8Var.setBackground(f0);
                        zkb.j(wy8Var, f0, null, M, null);
                        j.addView(wy8Var);
                        wy8Var.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b = r4;
                                AtomicReference atomicReference2 = atomicReference;
                                int i7 = i5;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b) {
                                    case 0:
                                        gba.o1 = i7;
                                        SharedPreferences.Editor edit8 = na7.c1().edit();
                                        edit8.putInt("distanceSystemType", gba.o1);
                                        edit8.apply();
                                        k96.g0 = null;
                                        themeActivity.Q0 = true;
                                        s49 K = themeActivity.b.K(themeActivity.L);
                                        if (K != null) {
                                            themeActivity.a.t(K, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        gba.m0 = i7;
                                        SharedPreferences.Editor edit9 = na7.c1().edit();
                                        edit9.putInt("searchEngineType", gba.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        s49 K2 = themeActivity.b.K(themeActivity.M);
                                        if (K2 != null) {
                                            themeActivity.a.t(K2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i5++;
                        f2 = f3;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.a.S = k96.M0(2131751351, "DistanceUnitsTitle");
                    alertDialog$Builder.n(j);
                    alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                    hd hdVar = alertDialog$Builder.a;
                    atomicReference.set(hdVar);
                    showDialog(hdVar);
                }
            } else if (i == this.M) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout j2 = de9.j(context, 1);
                    ArrayList b = is9.b();
                    int size = b.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    for (final int i7 = 0; i7 < size; i7++) {
                        charSequenceArr2[i7] = ((is9) b.get(i7)).a;
                        wy8 wy8Var2 = new wy8(getParentActivity(), null);
                        wy8Var2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        wy8Var2.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                        CharSequence charSequence2 = charSequenceArr2[i7];
                        if (i7 == gba.m0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wy8Var2.b(charSequence2, z2);
                        int i8 = bkb.h6;
                        ff0 f02 = bkb.f0(bkb.w0(null, i8, false), 2, -1);
                        vkb M2 = zkb.M(i8);
                        wy8Var2.setBackground(f02);
                        zkb.j(wy8Var2, f02, null, M2, null);
                        j2.addView(wy8Var2);
                        wy8Var2.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemeActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                byte b2 = r4;
                                AtomicReference atomicReference22 = atomicReference2;
                                int i72 = i7;
                                ThemeActivity themeActivity = this.b;
                                themeActivity.getClass();
                                switch (b2) {
                                    case 0:
                                        gba.o1 = i72;
                                        SharedPreferences.Editor edit8 = na7.c1().edit();
                                        edit8.putInt("distanceSystemType", gba.o1);
                                        edit8.apply();
                                        k96.g0 = null;
                                        themeActivity.Q0 = true;
                                        s49 K = themeActivity.b.K(themeActivity.L);
                                        if (K != null) {
                                            themeActivity.a.t(K, themeActivity.L);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                    default:
                                        gba.m0 = i72;
                                        SharedPreferences.Editor edit9 = na7.c1().edit();
                                        edit9.putInt("searchEngineType", gba.m0);
                                        edit9.apply();
                                        themeActivity.R0 = true;
                                        s49 K2 = themeActivity.b.K(themeActivity.M);
                                        if (K2 != null) {
                                            themeActivity.a.t(K2, themeActivity.M);
                                        }
                                        ((Dialog) atomicReference22.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.a.S = k96.M0(2131745607, null);
                    alertDialog$Builder2.n(j2);
                    alertDialog$Builder2.g(k96.M0(2131752577, "Cancel"), null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    atomicReference2.set(hdVar2);
                    showDialog(hdVar2);
                }
            } else if (i == this.N) {
                if (getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout j3 = de9.j(context, 1);
                    wy8 wy8Var3 = new wy8(getParentActivity(), null);
                    wy8Var3.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                    int i9 = bkb.f7;
                    int w0 = bkb.w0(null, i9, false);
                    int i10 = bkb.D5;
                    wy8Var3.a(w0, bkb.w0(null, i10, false));
                    wy8Var3.b(k96.M0(2131748246, null), !gba.r0);
                    int i11 = bkb.h6;
                    ff0 f03 = bkb.f0(bkb.w0(null, i11, false), 2, -1);
                    vkb M3 = zkb.M(i11);
                    wy8Var3.setBackground(f03);
                    zkb.j(wy8Var3, f03, null, M3, null);
                    j3.addView(wy8Var3);
                    wy8Var3.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b2) {
                                case 0:
                                    gba.r0 = false;
                                    gba.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s49 K = themeActivity.b.K(themeActivity.N);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    rqe.c(2131624121, 2131747117, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new nu9(themeActivity, atomicReference4, (byte) 16));
                                    gba.r0 = true;
                                    gba.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s49 K2 = themeActivity.b.K(themeActivity.N);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    wy8 wy8Var4 = new wy8(getParentActivity(), null);
                    wy8Var4.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                    wy8Var4.a(bkb.w0(null, i9, false), bkb.w0(null, i10, false));
                    String M03 = k96.M0(2131748243, null);
                    String M04 = k96.M0(2131748244, null);
                    boolean z8 = gba.r0;
                    wy8Var4.a.setText(M03);
                    TextView textView = wy8Var4.b;
                    textView.setVisibility(0);
                    textView.setText(M04);
                    wy8Var4.c.a(z8, false);
                    ff0 f04 = bkb.f0(bkb.w0(null, i11, false), 2, -1);
                    vkb M4 = zkb.M(i11);
                    wy8Var4.setBackground(f04);
                    zkb.j(wy8Var4, f04, null, M4, null);
                    j3.addView(wy8Var4);
                    wy8Var4.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r3;
                            AtomicReference atomicReference4 = atomicReference3;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b2) {
                                case 0:
                                    gba.r0 = false;
                                    gba.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s49 K = themeActivity.b.K(themeActivity.N);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.N);
                                        return;
                                    }
                                    return;
                                default:
                                    rqe.c(2131624121, 2131747117, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new nu9(themeActivity, atomicReference4, (byte) 16));
                                    gba.r0 = true;
                                    gba.x();
                                    themeActivity.P0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s49 K2 = themeActivity.b.K(themeActivity.N);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.N);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder3.a.S = k96.M0(2131748247, null);
                    alertDialog$Builder3.n(j3);
                    alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                    hd hdVar3 = alertDialog$Builder3.a;
                    atomicReference3.set(hdVar3);
                    showDialog(hdVar3);
                }
            } else if (i == this.E) {
                gba.u0 = !gba.u0;
                SharedPreferences.Editor edit8 = na7.c1().edit();
                edit8.putBoolean("direct_share", gba.u0);
                edit8.apply();
                tga.n(org.telegram.messenger.a.b);
                hq6.d0(y6c.t0).o();
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(gba.u0);
                }
            } else if (i == this.sensitiveContentRow) {
                if (!getMessagesController().Y4()) {
                    a5b a5bVar = new a5b(this, view, (byte) 7);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, context);
                    alertDialog$Builder4.a.S = k96.M0(2131751801, null);
                    alertDialog$Builder4.a.U = k96.M0(2131751802, null);
                    alertDialog$Builder4.j(k96.M0(2131751805, null), new kq8(this, a5bVar, (byte) 23));
                    alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                    showDialog(alertDialog$Builder4.a);
                    return;
                }
                getMessagesController().K4(false);
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(getMessagesController().Y4());
                }
            } else if (i != this.Q) {
                if (i == this.R) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder5.a.S = k96.M0(2131745099, "SortBy");
                        alertDialog$Builder5.e(new CharSequence[]{k96.M0(2131751588, "Default"), k96.M0(2131745095, "SortFirstName"), k96.M0(2131745094, "SortLastName")}, new ut3(this, i, (byte) 2));
                        alertDialog$Builder5.g(k96.M0(2131752577, "Cancel"), null);
                        showDialog(alertDialog$Builder5.a);
                    }
                } else if (i == this.t0) {
                    boolean z9 = gba.a;
                    if (!e66.e(256)) {
                        d = e66.d(true) | 256;
                    } else {
                        d = e66.d(true) & (-257);
                    }
                    e66.i = d;
                    e66.k();
                    if (view instanceof ahb) {
                        ((ahb) view).setChecked(gba.f());
                    }
                } else if (i == this.nightThemeRow) {
                    if ((k96.a0 && f <= gl.L(76.0f)) || (!k96.a0 && f >= view.getMeasuredWidth() - gl.L(76.0f))) {
                        vl7 vl7Var = (vl7) view;
                        if (bkb.o == 0) {
                            bkb.o = 2;
                            vl7Var.setChecked(true);
                        } else {
                            bkb.o = 0;
                            vl7Var.setChecked(false);
                        }
                        bkb.u1();
                        bkb.E(true);
                        if (bkb.o != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            M0 = bkb.A0();
                        } else {
                            M0 = k96.M0(2131753780, "AutoNightThemeOff");
                        }
                        if (z) {
                            int i12 = bkb.o;
                            if (i12 == 1) {
                                M02 = k96.M0(2131753784, "AutoNightScheduled");
                            } else if (i12 == 3) {
                                M02 = k96.M0(2131753783, "AutoNightSystemDefault");
                            } else {
                                M02 = k96.M0(2131753793, "AutoNightAdaptive");
                            }
                            M0 = tb4.y(M02, " ", M0);
                        }
                        vl7Var.b(k96.M0(2131753781, "AutoNightTheme"), M0, 2131231847, z, 0, false, true, false);
                        return;
                    }
                    presentFragment(new ThemeActivity(1));
                } else if (i == this.browserRow) {
                    if ((k96.a0 && f <= gl.L(76.0f)) || (!k96.a0 && f >= view.getMeasuredWidth() - gl.L(76.0f))) {
                        vl7 vl7Var2 = (vl7) view;
                        na7 messagesController = getMessagesController();
                        TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.m5;
                        if (tL_webBrowserSettings != null) {
                            messagesController.A5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                        }
                        vl7Var2.setChecked(getMessagesController().M2());
                        return;
                    }
                    presentFragment(new tsc(null));
                } else if (i == this.S) {
                    if (bkb.o != 0) {
                        bkb.o = 0;
                        E0(true);
                        bkb.E(false);
                    }
                } else if (i == this.T) {
                    if (bkb.o != 1) {
                        bkb.o = 1;
                        if (bkb.p) {
                            F0(null, true);
                        }
                        E0(true);
                        bkb.E(false);
                    }
                } else if (i == this.U) {
                    if (bkb.o != 2) {
                        bkb.o = 2;
                        E0(true);
                        bkb.E(false);
                    }
                } else if (i == this.V) {
                    if (bkb.o != 3) {
                        bkb.o = 3;
                        E0(true);
                        bkb.E(false);
                    }
                } else if (i == this.Y) {
                    boolean z10 = !bkb.p;
                    bkb.p = z10;
                    ((ahb) view).setChecked(z10);
                    E0(true);
                    if (bkb.p) {
                        F0(null, true);
                    }
                    bkb.E(false);
                } else if (i != this.b0 && i != this.c0) {
                    if (i == this.Z) {
                        F0(null, true);
                    } else if (i == this.createNewThemeRow) {
                        u0();
                    } else if (i == this.z0) {
                        v0();
                    } else if (i == this.stickersRow) {
                        presentFragment(new StickersActivity(0, null));
                    } else if (i == this.B0) {
                        presentFragment(new zka());
                    } else if (i == this.liteModeRow) {
                        presentFragment(new m66());
                    }
                } else if (getParentActivity() != null) {
                    if (i == this.b0) {
                        i2 = bkb.r;
                        i3 = i2 / 60;
                    } else {
                        i2 = bkb.s;
                        i3 = i2 / 60;
                    }
                    int i13 = i2 - (i3 * 60);
                    final uib uibVar = (uib) view;
                    showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                            int i16 = (i14 * 60) + i15;
                            int i17 = ThemeActivity.this.b0;
                            int i18 = i;
                            uib uibVar2 = uibVar;
                            if (i18 == i17) {
                                bkb.r = i16;
                                uibVar2.c(k96.M0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                                return;
                            }
                            bkb.s = i16;
                            uibVar2.c(k96.M0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        }
                    }, i3, i13, true));
                }
            }
        }
    }

    public final int z0() {
        return this.sensitiveContentRow;
    }
}
