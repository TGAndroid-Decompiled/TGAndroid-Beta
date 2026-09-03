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
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ThemeActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public int B;
    public int B0;
    public int C;
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
    public boolean H0;
    public int I;
    public int I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public final kb1 N0;
    public int O;
    public final kb1 O0;
    public int P;
    public org.telegram.ui.Components.gj0 P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public tb1 f32305a;
    public int f32306a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.rl0 f32307b;
    public int f32308b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public qb1 f32309c;
    public int f32310c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f32311d0;
    public final ArrayList e;
    public int f32312e0;
    public final int f32313f;
    public int f32314f0;
    public int f32315g0;
    public org.telegram.ui.ActionBar.i6 h;
    public int f32316h0;
    public int f32317i0;
    public int f32318j0;
    public int f32319k0;
    public int f32320l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.h6 f32321n;
    public int f32322n0;
    private int nightThemeRow;
    public int f32323o0;
    public int f32324p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f32325q0;
    public org.telegram.ui.ActionBar.d2 f32326r;
    public int f32327r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.w0 f32328s;
    public int f32329s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f32330t0;
    private int textSizeRow;
    public int f32331u0;
    public boolean v;
    public int f32332v0;
    public int f32333w;
    public int f32334w0;
    public int f32335x;
    public int f32336x0;
    public int f32337y;
    public int f32338y0;
    public int f32339z0;

    public static class InnerAccentView extends View {
        public final Paint f32340a;
        public ObjectAnimator f32341b;
        public float f32342c;
        public org.telegram.ui.ActionBar.i6 d;
        public org.telegram.ui.ActionBar.h6 e;
        public boolean f32343f;

        public InnerAccentView(Context context) {
            super(context);
            this.f32340a = new Paint(1);
        }

        public final void a(boolean z4) {
            boolean z10;
            if (this.d.V == this.e.f19736a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32343f = z10;
            ObjectAnimator objectAnimator = this.f32341b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z4) {
                if (this.f32343f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f32341b = ofFloat;
                ofFloat.setDuration(200L);
                this.f32341b.start();
                return;
            }
            if (this.f32343f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f32342c;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float dp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.e.f19738c;
            Paint paint = this.f32340a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f32342c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f32342c), paint);
            if (this.f32342c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f32342c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f32342c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f32342c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 != 0 && this.f32342c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f32342c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f32343f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f32342c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.N0 = new kb1(this);
        this.O0 = new kb1(this);
        this.f32313f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
            f10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            o10.customView = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, k7.b6.e(50, 50, 17));
            f10.addView(frameLayout, k7.b6.t(80, 80, 1, 0, 20, 0, 8));
            int i12 = org.telegram.ui.ActionBar.j6.f19987j5;
            TextView b10 = k7.f6.b(context, 20.0f, i12, true, f6Var);
            org.telegram.messenger.y3.r(R.string.AgeVerificationTitle, b10, 17);
            f10.addView(b10, k7.b6.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = k7.f6.b(context, 14.0f, i12, false, f6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, k7.b6.t(-1, -2, 7, 24, 0, 24, 0));
            final ph.d dVar = new ph.d(context, f6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final ph.d dVar2 = ph.d.this;
                    if (dVar2.K) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i13 = R.raw.permission_request_camera;
                    int i14 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i15 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    final int i16 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.g3[] g3VarArr = r9;
                    org.telegram.ui.Components.he0.e(i13, i14, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final ph.d dVar3 = ph.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i17 = i15;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                            final int i18 = i16;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.g3[] g3VarArr2 = g3VarArr;
                            userNameResolver.resolve(str3, new h5.d() {
                                @Override
                                public final void accept(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    ph.d dVar4 = ph.d.this;
                                    if (l10 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l10);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    rh.y3 b12 = rh.y3.b(i17, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final rh.p2 p2Var = new rh.p2(context3, f6Var3);
                                    final int i19 = i18;
                                    final Utilities.Callback callback4 = callback3;
                                    ?? r62 = new Utilities.Callback4() {
                                        @Override
                                        public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d10 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i19) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            p2Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                kf.k0.v(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.qc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    p2Var.E0 = r62;
                                    rh.h2 h2Var = p2Var.f43760x;
                                    if (h2Var != 0) {
                                        h2Var.setOnVerifiedAge(r62);
                                    }
                                    p2Var.w(true);
                                    p2Var.f43761x0 = false;
                                    p2Var.f43741h0 = U.getParentActivity();
                                    p2Var.s(U, b12);
                                    p2Var.show();
                                    dVar4.setLoading(false);
                                    g3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, k7.b6.t(-1, 48, 7, 2, 29, 2, 14));
            o10.show();
            final org.telegram.ui.ActionBar.g3[] g3VarArr = {o10};
            o10.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        tb1 tb1Var;
        boolean z4;
        org.telegram.ui.Components.rl0 rl0Var = themeActivity.f32307b;
        if (rl0Var != null && rl0Var.D && (tb1Var = themeActivity.f32305a) != null) {
            int i10 = themeActivity.sensitiveContentRow;
            boolean z10 = false;
            if (i10 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z10 = true;
            }
            if (z4 == z10) {
                tb1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f10) {
        int i11;
        int i12;
        boolean z4;
        String string;
        String string2;
        boolean z10;
        boolean z11;
        if (i10 == themeActivity.K) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z13 = !z12;
            edit.putBoolean("view_animations", z13);
            SharedConfig.setAnimationsEnabled(z13);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z13);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            np0 np0Var = new np0();
            np0Var.E = themeActivity;
            themeActivity.presentFragment(np0Var);
        } else if (i10 == themeActivity.D) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z14 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z15 = !z14;
            edit2.putBoolean("send_by_enter", z15);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            }
        } else if (i10 == themeActivity.B) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i10 == themeActivity.C) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.B != -1) {
                for (int i13 = 0; i13 < themeActivity.f32307b.getChildCount(); i13++) {
                    View childAt = themeActivity.f32307b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.f32307b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.B) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f11 = 4.0f;
            if (i10 == themeActivity.H) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        j6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19936g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6Var.b(charSequence, z11);
                        j6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 2, -1));
                        f12.addView(j6Var);
                        j6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f40434b;

                            {
                                this.f40434b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f40434b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.M0 = true;
                                        f2.l1 K = themeActivity2.f32307b.K(themeActivity2.I);
                                        if (K != null) {
                                            themeActivity2.f32305a.v(K, themeActivity2.I);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f40434b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.L0 = true;
                                        f2.l1 K2 = themeActivity3.f32307b.K(themeActivity3.H);
                                        if (K2 != null) {
                                            themeActivity3.f32305a.v(K2, themeActivity3.H);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string3;
                    alertDialog$Builder.n(f12);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(d2Var);
                    themeActivity.showDialog(d2Var);
                }
            } else if (i10 == themeActivity.I) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f13 = org.telegram.messenger.y3.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.n1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i15 = 0;
                    while (i15 < size) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.n1) b10.get(i15)).f39536a;
                        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                        j6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                        j6Var2.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19936g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == SharedConfig.searchEngineType) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var2.b(charSequence2, z10);
                        j6Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 2, -1));
                        f13.addView(j6Var2);
                        j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f40434b;

                            {
                                this.f40434b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f40434b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i15);
                                        themeActivity2.M0 = true;
                                        f2.l1 K = themeActivity2.f32307b.K(themeActivity2.I);
                                        if (K != null) {
                                            themeActivity2.f32305a.v(K, themeActivity2.I);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f40434b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i15);
                                        themeActivity3.L0 = true;
                                        f2.l1 K2 = themeActivity3.f32307b.K(themeActivity3.H);
                                        if (K2 != null) {
                                            themeActivity3.f32305a.v(K2, themeActivity3.H);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i15++;
                        f11 = 4.0f;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                    d2Var2.O = string4;
                    alertDialog$Builder2.n(f13);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(d2Var2);
                    themeActivity.showDialog(d2Var2);
                }
            } else if (i10 == themeActivity.J) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.y3.f(context, 1);
                    org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i16 = org.telegram.ui.ActionBar.j6.f19936g7;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.j6.E5;
                    j6Var3.a(w02, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    j6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i18 = org.telegram.ui.ActionBar.j6.f19971i6;
                    j6Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i18, false), 2, -1));
                    f14.addView(j6Var3);
                    j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f32545b;

                        {
                            this.f32545b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f32545b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.K0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.l1 K = themeActivity2.f32307b.K(themeActivity2.J);
                                    if (K != null) {
                                        themeActivity2.f32305a.v(K, themeActivity2.J);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f32545b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.he0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.vk(26, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.K0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.l1 K2 = themeActivity3.f32307b.K(themeActivity3.J);
                                    if (K2 != null) {
                                        themeActivity3.f32305a.v(K2, themeActivity3.J);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                    j6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    j6Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z16 = SharedConfig.recordViaSco;
                    j6Var4.f21233a.setText(string5);
                    TextView textView = j6Var4.f21234b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    j6Var4.f21235c.a(z16, false);
                    j6Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i18, false), 2, -1));
                    f14.addView(j6Var4);
                    j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f32545b;

                        {
                            this.f32545b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f32545b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.K0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.l1 K = themeActivity2.f32307b.K(themeActivity2.J);
                                    if (K != null) {
                                        themeActivity2.f32305a.v(K, themeActivity2.J);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f32545b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.he0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.vk(26, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.K0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.l1 K2 = themeActivity3.f32307b.K(themeActivity3.J);
                                    if (K2 != null) {
                                        themeActivity3.f32305a.v(K2, themeActivity3.J);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19478a;
                    d2Var3.O = string7;
                    alertDialog$Builder3.n(f14);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(d2Var3);
                    themeActivity.showDialog(d2Var3);
                }
            } else if (i10 == themeActivity.f32337y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    b11 b11Var = new b11(16, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f19478a;
                    d2Var4.O = string8;
                    d2Var4.Q = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new vl0(19, themeActivity, b11Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(d2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i10 != themeActivity.M) {
                if (i10 == themeActivity.N) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.f19478a;
                        d2Var5.O = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new uy(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(d2Var5);
                    }
                } else if (i10 == themeActivity.f32324p0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                        if (org.telegram.ui.ActionBar.j6.f20071o == 0) {
                            org.telegram.ui.ActionBar.j6.f20071o = 2;
                            i5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.j6.f20071o = 0;
                            i5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.j6.q1();
                        org.telegram.ui.ActionBar.j6.E(true);
                        if (org.telegram.ui.ActionBar.j6.f20071o != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            string = org.telegram.ui.ActionBar.j6.z0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z4) {
                            int i19 = org.telegram.ui.ActionBar.j6.f20071o;
                            if (i19 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i19 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = android.support.v4.media.a.z(string2, " ", string);
                        }
                        i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z4, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.i5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.y1(null));
                } else if (i10 == themeActivity.O) {
                    if (org.telegram.ui.ActionBar.j6.f20071o != 0) {
                        org.telegram.ui.ActionBar.j6.f20071o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.P) {
                    if (org.telegram.ui.ActionBar.j6.f20071o != 1) {
                        org.telegram.ui.ActionBar.j6.f20071o = 1;
                        if (org.telegram.ui.ActionBar.j6.f20089p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.Q) {
                    if (org.telegram.ui.ActionBar.j6.f20071o != 2) {
                        org.telegram.ui.ActionBar.j6.f20071o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.j6.f20071o != 3) {
                        org.telegram.ui.ActionBar.j6.f20071o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.U) {
                    boolean z17 = !org.telegram.ui.ActionBar.j6.f20089p;
                    org.telegram.ui.ActionBar.j6.f20089p = z17;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z17);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.j6.f20089p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.j6.E(false);
                } else if (i10 != themeActivity.X && i10 != themeActivity.Y) {
                    if (i10 == themeActivity.V) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f32332v0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new gc0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.X) {
                        i11 = org.telegram.ui.ActionBar.j6.f20125r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20143s;
                        i12 = i11 / 60;
                    }
                    int i20 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i21, int i22) {
                            int i23 = (i21 * 60) + i22;
                            int i24 = ThemeActivity.this.X;
                            int i25 = i10;
                            org.telegram.ui.Cells.z9 z9Var2 = z9Var;
                            if (i25 == i24) {
                                org.telegram.ui.ActionBar.j6.f20125r = i23;
                                z9Var2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.j6.f20143s = i23;
                            z9Var2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                        }
                    }, i12, i20, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, b11 b11Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.vk(27, themeActivity, b11Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z4) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.l1 K = themeActivity.f32307b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f5774a;
            if (view instanceof ub1) {
                ub1 ub1Var = (ub1) view;
                org.telegram.ui.Cells.s1[] cells = ub1Var.f38767a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                ub1Var.invalidate();
            }
        }
        f2.l1 K2 = themeActivity.f32307b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f5774a;
            if (view2 instanceof jb1) {
                jb1 jb1Var = (jb1) view2;
                if (z4) {
                    jb1Var.requestLayout();
                } else {
                    jb1Var.invalidate();
                }
            }
        }
        themeActivity.z0();
        return true;
    }

    public static boolean k0(ThemeActivity themeActivity, int i10) {
        if (i10 != SharedConfig.fontSize) {
            SharedConfig.fontSize = i10;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", SharedConfig.fontSize);
                edit.commit();
                org.telegram.ui.ActionBar.j6.O();
                f2.l1 K = themeActivity.f32307b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f5774a;
                    if (view instanceof ub1) {
                        org.telegram.ui.Cells.s1[] cells = ((ub1) view).f38767a.getCells();
                        for (int i11 = 0; i11 < cells.length; i11++) {
                            cells[i11].getMessageObject().resetLayout();
                            cells[i11].requestLayout();
                        }
                    }
                }
                themeActivity.z0();
                return true;
            }
        }
        return false;
    }

    public static String y0() {
        int i10 = org.telegram.ui.ActionBar.j6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.j6.f20159t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public final void A0(boolean z4) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        org.telegram.ui.ActionBar.i6 A0;
        boolean z12;
        TLRPC.TL_theme tL_theme;
        int i22 = this.G0;
        int i23 = this.f32322n0;
        int i24 = this.f32332v0;
        int i25 = this.B;
        this.G0 = 0;
        this.M = -1;
        this.N = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f32312e0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f32320l0 = -1;
        this.m0 = -1;
        this.f32322n0 = -1;
        this.f32323o0 = -1;
        this.f32311d0 = -1;
        this.f32306a0 = -1;
        this.f32308b0 = -1;
        this.f32310c0 = -1;
        this.f32333w = -1;
        this.f32314f0 = -1;
        this.f32315g0 = -1;
        this.bubbleRadiusRow = -1;
        this.f32316h0 = -1;
        this.f32317i0 = -1;
        this.f32318j0 = -1;
        this.f32319k0 = -1;
        this.f32324p0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.f32336x0 = -1;
        this.f32338y0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.f32339z0 = -1;
        this.A0 = -1;
        this.liteModeRow = -1;
        this.D0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f32335x = -1;
        this.f32337y = -1;
        this.sensitiveContentRow = -1;
        this.K = -1;
        this.B = -1;
        this.raiseToListenRow = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = -1;
        this.f32325q0 = -1;
        this.f32327r0 = -1;
        this.f32329s0 = -1;
        this.f32330t0 = -1;
        this.f32331u0 = -1;
        this.f32332v0 = -1;
        this.createNewThemeRow = -1;
        this.E0 = -1;
        this.appIconSelectorRow = -1;
        this.F0 = -1;
        this.f32334w0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.j6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f32313f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((i6Var.f19782b != null || i6Var.q()) && ((tL_theme = i6Var.C) == null || tL_theme.document != null))) {
                if (i6Var.f19782b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new eu(11));
        if (i10 == 3) {
            int i27 = this.G0;
            this.f32330t0 = i27;
            this.m0 = i27 + 1;
            this.f32319k0 = i27 + 2;
            this.f32331u0 = i27 + 3;
            this.f32314f0 = i27 + 4;
            this.G0 = i27 + 6;
            this.f32320l0 = i27 + 5;
            if (org.telegram.ui.ActionBar.j6.A0().T != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.v = z12;
            qb1 qb1Var = this.f32309c;
            if (qb1Var != null) {
                qb1Var.setDrawDivider(z12);
            }
            if (this.v) {
                int i28 = this.G0;
                this.G0 = i28 + 1;
                this.f32322n0 = i28;
            }
            int i29 = this.G0;
            this.G0 = i29 + 1;
            this.f32316h0 = i29;
            org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.h6 k10 = A02.k(false);
            ArrayList arrayList3 = A02.Y;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f19736a >= 100) {
                int i30 = this.G0;
                this.G0 = i30 + 1;
                this.f32332v0 = i30;
            }
            int i31 = this.G0;
            this.createNewThemeRow = i31;
            this.G0 = i31 + 2;
            this.f32334w0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.G0;
            this.f32333w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f32312e0 = i32 + 4;
            this.f32314f0 = i32 + 5;
            this.m0 = i32 + 6;
            this.f32323o0 = i32 + 7;
            this.f32315g0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f32316h0 = i32 + 10;
            this.f32317i0 = i32 + 11;
            this.f32318j0 = i32 + 12;
            this.f32319k0 = i32 + 13;
            this.E0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.F0 = i32 + 16;
            this.f32325q0 = i32 + 17;
            this.f32327r0 = i32 + 18;
            this.f32329s0 = i32 + 19;
            this.nightThemeRow = i32 + 20;
            this.browserRow = i32 + 21;
            this.liteModeRow = i32 + 22;
            this.stickersRow = i32 + 23;
            this.f32338y0 = i32 + 24;
            this.B0 = i32 + 25;
            this.C = i32 + 26;
            int i33 = i32 + 28;
            this.G0 = i33;
            this.raiseToListenRow = i32 + 27;
            if (SharedConfig.raiseToListen) {
                this.G0 = i32 + 29;
                this.B = i33;
            }
            int i34 = this.G0;
            this.pauseOnRecordRow = i34;
            this.pauseOnMediaRow = i34 + 1;
            this.J = i34 + 2;
            this.f32339z0 = i34 + 3;
            this.C0 = i34 + 4;
            this.G0 = i34 + 6;
            this.f32337y = i34 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i35 = this.G0;
                this.G0 = i35 + 1;
                this.sensitiveContentRow = i35;
            }
            int i36 = this.G0;
            this.D = i36;
            this.H = i36 + 1;
            this.G0 = i36 + 3;
            this.A0 = i36 + 2;
        } else {
            int i37 = this.G0;
            this.O = i37;
            this.P = i37 + 1;
            int i38 = i37 + 3;
            this.G0 = i38;
            this.Q = i37 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.G0 = i37 + 4;
                this.R = i38;
            }
            int i39 = this.G0;
            int i40 = i39 + 1;
            this.G0 = i40;
            this.S = i39;
            int i41 = org.telegram.ui.ActionBar.j6.f20071o;
            if (i41 == 1) {
                this.T = i40;
                int i42 = i39 + 3;
                this.G0 = i42;
                this.U = i39 + 2;
                if (org.telegram.ui.ActionBar.j6.f20089p) {
                    this.V = i42;
                    this.G0 = i39 + 5;
                    this.W = i39 + 4;
                } else {
                    this.X = i42;
                    this.Y = i39 + 4;
                    this.G0 = i39 + 6;
                    this.Z = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f32306a0 = i40;
                this.f32308b0 = i39 + 2;
                this.G0 = i39 + 4;
                this.f32310c0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.j6.f20071o != 0) {
                int i43 = this.G0;
                this.f32311d0 = i43;
                this.G0 = i43 + 2;
                this.f32320l0 = i43 + 1;
                if (org.telegram.ui.ActionBar.j6.J.T != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.v = z10;
                qb1 qb1Var2 = this.f32309c;
                if (qb1Var2 != null) {
                    qb1Var2.setDrawDivider(z10);
                }
                if (this.v) {
                    int i44 = this.G0;
                    this.G0 = i44 + 1;
                    this.f32322n0 = i44;
                }
                int i45 = this.G0;
                this.G0 = i45 + 1;
                this.f32323o0 = i45;
            }
        }
        qb1 qb1Var3 = this.f32309c;
        if (qb1Var3 != null) {
            int width = this.f32307b.getWidth();
            int i46 = qb1Var3.f21299d3;
            org.telegram.ui.Cells.ja jaVar = qb1Var3.Z2;
            if (i46 != jaVar.h()) {
                jaVar.l();
                if (qb1Var3.c3 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                if (qb1Var3.Y2 != A0) {
                    qb1Var3.w1(width);
                }
            }
        }
        tb1 tb1Var = this.f32305a;
        if (tb1Var != null) {
            if (i10 == 1 && (i15 = this.I0) != (i16 = org.telegram.ui.ActionBar.j6.f20071o) && i15 != -1) {
                int i47 = this.S;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) this.f32307b.K(i49);
                        if (dl0Var != null) {
                            View view = dl0Var.f5774a;
                            if (view instanceof org.telegram.ui.Cells.ea) {
                                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                                if (i49 == org.telegram.ui.ActionBar.j6.f20071o) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                eaVar.setTypeChecked(z11);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.j6.f20071o;
                    if (i50 == 0) {
                        this.f32305a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.I0;
                        if (i51 == 0) {
                            this.f32305a.s(i48, this.G0 - i48);
                        } else if (i51 == 2) {
                            this.f32305a.t(i48, 3);
                            tb1 tb1Var2 = this.f32305a;
                            if (org.telegram.ui.ActionBar.j6.f20089p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            tb1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            tb1 tb1Var3 = this.f32305a;
                            if (org.telegram.ui.ActionBar.j6.f20089p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            tb1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.I0;
                        if (i52 == 0) {
                            this.f32305a.s(i48, this.G0 - i48);
                        } else if (i52 == 1) {
                            tb1 tb1Var4 = this.f32305a;
                            if (org.telegram.ui.ActionBar.j6.f20089p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            tb1Var4.t(i48, i19);
                            this.f32305a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f32305a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.I0;
                        if (i53 == 0) {
                            this.f32305a.s(i48, this.G0 - i48);
                        } else if (i53 == 2) {
                            this.f32305a.t(i48, 3);
                        } else if (i53 == 1) {
                            tb1 tb1Var5 = this.f32305a;
                            if (org.telegram.ui.ActionBar.j6.f20089p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            tb1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z13 = this.J0;
                    boolean z14 = org.telegram.ui.ActionBar.j6.f20089p;
                    if (z13 != z14) {
                        int i54 = i47 + 3;
                        if (z14) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        tb1Var.t(i54, i17);
                        tb1 tb1Var6 = this.f32305a;
                        if (org.telegram.ui.ActionBar.j6.f20089p) {
                            i11 = 2;
                        }
                        tb1Var6.s(i54, i11);
                    }
                }
            } else if (!z4 && this.I0 != -1) {
                if (i23 == -1 && (i14 = this.f32322n0) != -1) {
                    tb1Var.o(i14);
                } else if (i23 != -1 && this.f32322n0 == -1) {
                    tb1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f32322n0;
                    if (i55 != -1) {
                        tb1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f32332v0) != -1) {
                    this.f32305a.o(i13);
                } else if (i24 != -1 && this.f32332v0 == -1) {
                    this.f32305a.u(i24);
                }
                if (i25 == -1 && (i12 = this.B) != -1) {
                    this.f32305a.o(i12);
                } else if (i25 != -1 && this.B == -1) {
                    this.f32305a.u(i25);
                }
            } else {
                tb1Var.l();
            }
        }
        if (i10 == 1) {
            this.J0 = org.telegram.ui.ActionBar.j6.f20089p;
            this.I0 = org.telegram.ui.ActionBar.j6.f20071o;
        }
        z0();
    }

    public final void B0(Location location, boolean z4) {
        Activity parentActivity;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new cb1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f19478a);
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (location == null || z4) {
            if (!this.H0) {
                this.H0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.N0);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.O0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.f20231x = location.getLatitude();
        org.telegram.ui.ActionBar.j6.f20249y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.j6.f20231x, org.telegram.ui.ActionBar.j6.f20249y);
        org.telegram.ui.ActionBar.j6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.j6.f20159t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.j6.f20212w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.j6.f20175u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new gb1(this, 1));
        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) this.f32307b.K(this.W);
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.f20089p && org.telegram.ui.ActionBar.j6.f20071o == 1) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.R0 = !org.telegram.ui.ActionBar.j6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f32313f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.P0 = gj0Var;
            if (this.R0) {
                gj0Var.K(gj0Var.e[0] - 1);
            } else {
                gj0Var.K(0);
            }
            org.telegram.ui.Components.gj0 gj0Var2 = this.P0;
            gj0Var2.h = true;
            this.f32328s = n10.d(5, gj0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f32328s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f32328s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f32328s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f32328s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f32328s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new y3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ib1(this));
        this.f32305a = new tb1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f32307b = rl0Var;
        rl0Var.o1();
        this.f32307b.setLayoutManager(new f2.i0(1, false));
        this.f32307b.setVerticalScrollBarEnabled(false);
        this.f32307b.setAdapter(this.f32305a);
        ((f2.l) this.f32307b.getItemAnimator()).C = false;
        frameLayout.addView(this.f32307b, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f32307b);
        this.f32307b.setOnItemClickListener(new vl0(20, this, context));
        if (i10 == 0) {
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.mr.h);
            lVar.C = false;
            lVar.f5807m = false;
            this.f32307b.setItemAnimator(lVar);
        }
        if (this.Q0) {
            A0(false);
            this.Q0 = false;
            this.f32307b.u0(this.f32305a.e.G0 - 1);
            AndroidUtilities.runOnUIThread(new gb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d2 d2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                tb1 tb1Var = this.f32305a;
                if (tb1Var != null && (i15 = this.browserRow) != -1) {
                    tb1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                tb1 tb1Var2 = this.f32305a;
                if (tb1Var2 != null && (i14 = this.f32322n0) != -1) {
                    tb1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (i6Var == this.h && h6Var == this.f32321n) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(getMessagesController().linkPrefix);
                        sb.append("/addtheme/");
                        if (h6Var != null) {
                            tL_theme = h6Var.f19750r;
                        } else {
                            tL_theme = i6Var.C;
                        }
                        sb.append(tL_theme.slug);
                        String sb2 = sb.toString();
                        showDialog(new org.telegram.ui.Components.lq0(getParentActivity(), null, sb2, false, sb2, false, null));
                        org.telegram.ui.ActionBar.d2 d2Var2 = this.f32326r;
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (i6Var2 == this.h && h6Var2 == this.f32321n && (d2Var = this.f32326r) == null) {
                        d2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.i6) objArr[0];
                        this.f32321n = (org.telegram.ui.ActionBar.h6) objArr[1];
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                        this.f32326r = d2Var3;
                        d2Var3.f19565d0 = true;
                        showDialog(d2Var3, new x5(this, 17));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f32313f == 3) {
                        boolean f12 = org.telegram.ui.ActionBar.j6.f1();
                        boolean z4 = !f12;
                        if (this.R0 != z4) {
                            this.R0 = z4;
                            org.telegram.ui.Components.gj0 gj0Var = this.P0;
                            if (!f12) {
                                i13 = gj0Var.e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            gj0Var.N(i13);
                            this.f32328s.getIconView().d();
                        }
                        if (this.m0 >= 0) {
                            for (int i16 = 0; i16 < this.f32307b.getChildCount(); i16++) {
                                if (this.f32307b.getChildAt(i16) instanceof ev) {
                                    ((ev) this.f32307b.getChildAt(i16)).b();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i17 = this.m0;
                    if (i17 >= 0) {
                        this.f32305a.m(i17);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f32305a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.rl0 rl0Var = this.f32307b;
            if (rl0Var != null) {
                rl0Var.e1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ea.class, ub1.class, jb1.class, pb1.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.ka.class, rb1.class, org.telegram.ui.Cells.n8.class, so0.class, org.telegram.ui.Components.wy0.class, ev.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.f20115q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f20042m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 2048, new Class[]{ub1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 2048, new Class[]{jb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{jb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{pb1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19936g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{pb1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19954h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20039m3, org.telegram.ui.ActionBar.j6.f20112q3}, null, org.telegram.ui.ActionBar.j6.f20136ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20057n3, org.telegram.ui.ActionBar.j6.f20129r3}, null, org.telegram.ui.ActionBar.j6.f19887dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20039m3.f19709y;
        int i19 = org.telegram.ui.ActionBar.j6.f20168ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, org.telegram.ui.ActionBar.j6.f20112q3.f19709y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20093p3, org.telegram.ui.ActionBar.j6.f20163t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20039m3, org.telegram.ui.ActionBar.j6.f20112q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19904ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19922fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20253y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20271z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20153sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19831ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19868cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19886db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19833ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19921fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20066nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20084od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20065nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32307b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(k7.e6.a(new jy0(6, this), i20, i11, i12));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        if (this.f32313f == 0) {
            org.telegram.ui.ActionBar.j6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.j6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.H0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.N0);
        locationManager.removeUpdates(this.O0);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        org.telegram.ui.ActionBar.j6.q1();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32307b.setPadding(0, 0, 0, i13);
        this.f32307b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f32305a != null) {
            A0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f19478a.O = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f19478a.Q = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new cb1(this, 1));
        showDialog(alertDialog$Builder.f19478a);
    }

    public final void x0() {
        boolean z4;
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        boolean z10 = true;
        if (A0.k(false).f19736a >= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f32313f != 1) {
            z10 = false;
        }
        presentFragment(new jd1(A0, false, 1, z4, z10));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (this.f32328s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
        ArrayList arrayList = A0.Y;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f19736a >= 100) {
            this.f32328s.K(2);
            this.f32328s.K(3);
        } else {
            this.f32328s.r(2);
            this.f32328s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.P && A02.V == org.telegram.ui.ActionBar.j6.f20053n && (k10 == null || (c6Var = k10.f19756y) == null || "d".equals(c6Var.f19531c))) {
            this.f32328s.r(4);
        } else {
            this.f32328s.K(4);
        }
    }
}
