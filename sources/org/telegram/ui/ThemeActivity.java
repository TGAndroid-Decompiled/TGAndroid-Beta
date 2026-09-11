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
public class ThemeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final xb1 Q0;
    public int R;
    public final xb1 R0;
    public int S;
    public org.telegram.ui.Components.xi0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public gc1 f34174a;
    public int f34175a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.ll0 f34176b;
    public int f34177b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public dc1 f34178c;
    public int f34179c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f34180d0;
    public final ArrayList f34181e;
    public int f34182e0;
    public final int f34183f;
    public int f34184f0;
    public int f34185g0;
    public org.telegram.ui.ActionBar.i6 h;
    public int f34186h0;
    public int f34187i0;
    public int f34188j0;
    public int f34189k0;
    public int f34190l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.h6 f34191n;
    public int f34192n0;
    private int nightThemeRow;
    public int f34193o0;
    public int f34194p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f34195q0;
    public org.telegram.ui.ActionBar.b2 f34196r;
    public int f34197r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.v0 f34198s;
    public int f34199s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f34200t0;
    private int textSizeRow;
    public int f34201u0;
    public boolean v;
    public int f34202v0;
    public int f34203w;
    public int f34204w0;
    public int f34205x;
    public int f34206x0;
    public int f34207y;
    public int f34208y0;
    public int f34209z0;

    public static class InnerAccentView extends View {
        public final Paint f34210a;
        public ObjectAnimator f34211b;
        public float f34212c;
        public org.telegram.ui.ActionBar.i6 d;
        public org.telegram.ui.ActionBar.h6 f34213e;
        public boolean f34214f;

        public InnerAccentView(Context context) {
            super(context);
            this.f34210a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Y == this.f34213e.f20490a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f34214f = z11;
            ObjectAnimator objectAnimator = this.f34211b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f7 = 0.0f;
            if (z10) {
                if (this.f34214f) {
                    f7 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f7);
                this.f34211b = ofFloat;
                ofFloat.setDuration(200L);
                this.f34211b.start();
                return;
            }
            if (this.f34214f) {
                f7 = 1.0f;
            }
            setCheckedState(f7);
        }

        public float getCheckedState() {
            return this.f34212c;
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
            int i10 = this.f34213e.f20492c;
            Paint paint = this.f34210a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f34212c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f34212c), paint);
            if (this.f34212c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f34212c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f34212c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f34212c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.f34213e.f20493e;
            if (i11 != 0 && this.f34212c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f34212c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f34214f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f7) {
            this.f34212c = f7;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.f34181e = new ArrayList();
        this.Q0 = new xb1(this);
        this.R0 = new xb1(this);
        this.f34183f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.vl.i(1, context, f6Var, false);
            LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
            f7.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            i12.customView = f7;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, w7.x5.e(50, 50, 17));
            f7.addView(frameLayout, w7.x5.t(80, 80, 1, 0, 20, 0, 8));
            int i13 = org.telegram.ui.ActionBar.j6.f20770j5;
            TextView b10 = w7.b6.b(context, 20.0f, i13, true, f6Var);
            org.telegram.messenger.vl.k(R.string.AgeVerificationTitle, b10, 17);
            f7.addView(b10, w7.x5.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = w7.b6.b(context, 14.0f, i13, false, f6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f7.addView(b11, w7.x5.t(-1, -2, 7, 24, 0, 24, 0));
            final di.d dVar = new di.d(context, f6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final di.d dVar2 = di.d.this;
                    if (dVar2.N) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i14 = R.raw.permission_request_camera;
                    int i15 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i16 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    final int i17 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.f3[] f3VarArr = r9;
                    org.telegram.ui.Components.de0.e(i14, i15, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final di.d dVar3 = di.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i18 = i16;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                            final int i19 = i17;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.f3[] f3VarArr2 = f3VarArr;
                            userNameResolver.resolve(str3, new e2.h() {
                                @Override
                                public final void accept(Object obj2) {
                                    Long l4 = (Long) obj2;
                                    di.d dVar4 = di.d.this;
                                    if (l4 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l4);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    fi.f5 b12 = fi.f5.b(i18, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final fi.k3 k3Var = new fi.k3(context3, f6Var3);
                                    final int i20 = i19;
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
                                                if (d.doubleValue() >= i20) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            k3Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                org.telegram.messenger.w1.o(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.yc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    k3Var.H0 = r62;
                                    fi.b3 b3Var = k3Var.f9789x;
                                    if (b3Var != 0) {
                                        b3Var.setOnVerifiedAge(r62);
                                    }
                                    k3Var.w(true);
                                    k3Var.A0 = false;
                                    k3Var.f9773k0 = U.getParentActivity();
                                    k3Var.s(U, b12);
                                    k3Var.show();
                                    dVar4.setLoading(false);
                                    f3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f7.addView(dVar, w7.x5.t(-1, 48, 7, 2, 29, 2, 14));
            i12.show();
            final org.telegram.ui.ActionBar.f3[] f3VarArr = {i12};
            i12.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        gc1 gc1Var;
        boolean z10;
        org.telegram.ui.Components.ll0 ll0Var = themeActivity.f34176b;
        if (ll0Var != null && ll0Var.G && (gc1Var = themeActivity.f34174a) != null) {
            int i10 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                gc1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
        int i11;
        int i12;
        boolean z10;
        String string;
        String string2;
        boolean z11;
        boolean z12;
        if (i10 == themeActivity.N) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z13 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            SharedConfig.setAnimationsEnabled(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z14);
            }
        } else if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i10 == themeActivity.changeUserColor) {
            bq0 bq0Var = new bq0();
            bq0Var.H = themeActivity;
            themeActivity.presentFragment(bq0Var);
        } else if (i10 == themeActivity.G) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z15 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z16);
            }
        } else if (i10 == themeActivity.E) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i10 == themeActivity.F) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.E != -1) {
                for (int i13 = 0; i13 < themeActivity.f34176b.getChildCount(); i13++) {
                    View childAt = themeActivity.f34176b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.w8) {
                        themeActivity.f34176b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.w8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
        } else if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f10 = 4.0f;
            if (i10 == themeActivity.K) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f11 = org.telegram.messenger.vl.f(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20719g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k6Var.b(charSequence, z12);
                        k6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 2, -1));
                        f11.addView(k6Var);
                        k6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f38609b;

                            {
                                this.f38609b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f38609b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.P0 = true;
                                        s4.c1 K = themeActivity2.f34176b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f34174a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f38609b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.O0 = true;
                                        s4.c1 K2 = themeActivity3.f34176b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f34174a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.R = string3;
                    alertDialog$Builder.n(f11);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(b2Var);
                    themeActivity.showDialog(b2Var);
                }
            } else if (i10 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.vl.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.p1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i15 = 0;
                    while (i15 < size) {
                        charSequenceArr2[i15] = ((org.telegram.ui.web.p1) b10.get(i15)).f42208a;
                        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var2.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20719g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i15];
                        if (i15 == SharedConfig.searchEngineType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k6Var2.b(charSequence2, z11);
                        k6Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 2, -1));
                        f12.addView(k6Var2);
                        k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f38609b;

                            {
                                this.f38609b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f38609b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i15);
                                        themeActivity2.P0 = true;
                                        s4.c1 K = themeActivity2.f34176b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f34174a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f38609b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i15);
                                        themeActivity3.O0 = true;
                                        s4.c1 K2 = themeActivity3.f34176b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f34174a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i15++;
                        f10 = 4.0f;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                    b2Var2.R = string4;
                    alertDialog$Builder2.n(f12);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(b2Var2);
                    themeActivity.showDialog(b2Var2);
                }
            } else if (i10 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f13 = org.telegram.messenger.vl.f(context, 1);
                    org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i16 = org.telegram.ui.ActionBar.j6.f20719g7;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.j6.E5;
                    k6Var3.a(w02, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    k6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i18 = org.telegram.ui.ActionBar.j6.f20753i6;
                    k6Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i18, false), 2, -1));
                    f13.addView(k6Var3);
                    k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38912b;

                        {
                            this.f38912b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f38912b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.c1 K = themeActivity2.f34176b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34174a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f38912b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.de0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new oj0(9, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K2 = themeActivity3.f34176b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f34174a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z17 = SharedConfig.recordViaSco;
                    k6Var4.f22217a.setText(string5);
                    TextView textView = k6Var4.f22218b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    k6Var4.f22219c.a(z17, false);
                    k6Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i18, false), 2, -1));
                    f13.addView(k6Var4);
                    k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f38912b;

                        {
                            this.f38912b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f38912b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.c1 K = themeActivity2.f34176b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34174a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i19 = R.raw.permission_request_microphone;
                                    int i20 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f38912b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.de0.e(i19, i20, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new oj0(9, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.c1 K2 = themeActivity3.f34176b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f34174a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20198a;
                    b2Var3.R = string7;
                    alertDialog$Builder3.n(f13);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(b2Var3);
                    themeActivity.showDialog(b2Var3);
                }
            } else if (i10 == themeActivity.f34207y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    w81 w81Var = new w81(5, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20198a;
                    b2Var4.R = string8;
                    b2Var4.T = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new qv0(11, themeActivity, w81Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(b2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i10 != themeActivity.P) {
                if (i10 == themeActivity.Q) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.f20198a;
                        b2Var5.R = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new yy(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(b2Var5);
                    }
                } else if (i10 == themeActivity.f34199s0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.w8) {
                        ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                        if (org.telegram.ui.ActionBar.j6.f20855o == 0) {
                            org.telegram.ui.ActionBar.j6.f20855o = 2;
                            i5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.j6.f20855o = 0;
                            i5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.j6.q1();
                        org.telegram.ui.ActionBar.j6.E(true);
                        if (org.telegram.ui.ActionBar.j6.f20855o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            string = org.telegram.ui.ActionBar.j6.z0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z10) {
                            int i19 = org.telegram.ui.ActionBar.j6.f20855o;
                            if (i19 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i19 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = a4.a.C(string2, " ", string);
                        }
                        i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i10 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.i5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.a2(null));
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.j6.f20855o != 0) {
                        org.telegram.ui.ActionBar.j6.f20855o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.j6.f20855o != 1) {
                        org.telegram.ui.ActionBar.j6.f20855o = 1;
                        if (org.telegram.ui.ActionBar.j6.f20873p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.j6.f20855o != 2) {
                        org.telegram.ui.ActionBar.j6.f20855o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.j6.f20855o != 3) {
                        org.telegram.ui.ActionBar.j6.f20855o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.j6.E(false);
                    }
                } else if (i10 == themeActivity.X) {
                    boolean z18 = !org.telegram.ui.ActionBar.j6.f20873p;
                    org.telegram.ui.ActionBar.j6.f20873p = z18;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z18);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.j6.f20873p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.j6.E(false);
                } else if (i10 != themeActivity.f34175a0 && i10 != themeActivity.f34177b0) {
                    if (i10 == themeActivity.Y) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f34208y0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new nc0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.f34175a0) {
                        i11 = org.telegram.ui.ActionBar.j6.f20909r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20928s;
                        i12 = i11 / 60;
                    }
                    int i20 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i21, int i22) {
                            int i23 = (i21 * 60) + i22;
                            int i24 = ThemeActivity.this.f34175a0;
                            int i25 = i10;
                            org.telegram.ui.Cells.ea eaVar2 = eaVar;
                            if (i25 == i24) {
                                org.telegram.ui.ActionBar.j6.f20909r = i23;
                                eaVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.j6.f20928s = i23;
                            eaVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i21), Integer.valueOf(i22)), false, true);
                        }
                    }, i12, i20, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, w81 w81Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new oj0(10, themeActivity, w81Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        s4.c1 K = themeActivity.f34176b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f45738a;
            if (view instanceof hc1) {
                hc1 hc1Var = (hc1) view;
                org.telegram.ui.Cells.t1[] cells = hc1Var.f36952a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                hc1Var.invalidate();
            }
        }
        s4.c1 K2 = themeActivity.f34176b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f45738a;
            if (view2 instanceof wb1) {
                wb1 wb1Var = (wb1) view2;
                if (z10) {
                    wb1Var.requestLayout();
                } else {
                    wb1Var.invalidate();
                }
            }
        }
        themeActivity.z0();
        return true;
    }

    public static org.telegram.ui.ActionBar.d5 c0(ThemeActivity themeActivity) {
        return themeActivity.parentLayout;
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
                s4.c1 K = themeActivity.f34176b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f45738a;
                    if (view instanceof hc1) {
                        org.telegram.ui.Cells.t1[] cells = ((hc1) view).f36952a.getCells();
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
        int i12 = org.telegram.ui.ActionBar.j6.f20947t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
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
        boolean z12;
        org.telegram.ui.ActionBar.i6 A0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i22 = this.J0;
        int i23 = this.f34195q0;
        int i24 = this.f34208y0;
        int i25 = this.E;
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
        this.f34186h0 = -1;
        this.f34175a0 = -1;
        this.f34177b0 = -1;
        this.f34179c0 = -1;
        this.f34193o0 = -1;
        this.f34194p0 = -1;
        this.f34195q0 = -1;
        this.f34197r0 = -1;
        this.f34185g0 = -1;
        this.f34180d0 = -1;
        this.f34182e0 = -1;
        this.f34184f0 = -1;
        this.f34203w = -1;
        this.f34187i0 = -1;
        this.f34188j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f34189k0 = -1;
        this.f34190l0 = -1;
        this.m0 = -1;
        this.f34192n0 = -1;
        this.f34199s0 = -1;
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
        this.f34205x = -1;
        this.f34207y = -1;
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
        this.f34200t0 = -1;
        this.f34201u0 = -1;
        this.f34202v0 = -1;
        this.f34204w0 = -1;
        this.f34206x0 = -1;
        this.f34208y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f34209z0 = -1;
        ArrayList arrayList = this.f34181e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.j6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f34183f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((i6Var.f20542b != null || i6Var.q()) && ((tL_theme = i6Var.F) == null || tL_theme.document != null))) {
                if (i6Var.f20542b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new f11(2));
        if (i10 == 3) {
            int i27 = this.J0;
            this.f34204w0 = i27;
            this.f34194p0 = i27 + 1;
            this.f34192n0 = i27 + 2;
            this.f34206x0 = i27 + 3;
            this.f34187i0 = i27 + 4;
            this.J0 = i27 + 6;
            this.f34193o0 = i27 + 5;
            if (org.telegram.ui.ActionBar.j6.A0().W != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.v = z13;
            dc1 dc1Var = this.f34178c;
            if (dc1Var != null) {
                dc1Var.setDrawDivider(z13);
            }
            if (this.v) {
                int i28 = this.J0;
                this.J0 = i28 + 1;
                this.f34195q0 = i28;
            }
            int i29 = this.J0;
            this.J0 = i29 + 1;
            this.f34189k0 = i29;
            org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.h6 k10 = A02.k(false);
            ArrayList arrayList3 = A02.f20543b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f20490a >= 100) {
                int i30 = this.J0;
                this.J0 = i30 + 1;
                this.f34208y0 = i30;
            }
            int i31 = this.J0;
            this.createNewThemeRow = i31;
            this.J0 = i31 + 2;
            this.f34209z0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.J0;
            this.f34203w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f34186h0 = i32 + 4;
            this.f34187i0 = i32 + 5;
            this.f34194p0 = i32 + 6;
            this.f34197r0 = i32 + 7;
            this.f34188j0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f34189k0 = i32 + 10;
            this.f34190l0 = i32 + 11;
            this.m0 = i32 + 12;
            this.f34192n0 = i32 + 13;
            this.H0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.I0 = i32 + 16;
            this.f34200t0 = i32 + 17;
            this.f34201u0 = i32 + 18;
            this.f34202v0 = i32 + 19;
            this.nightThemeRow = i32 + 20;
            this.browserRow = i32 + 21;
            this.liteModeRow = i32 + 22;
            this.stickersRow = i32 + 23;
            this.B0 = i32 + 24;
            this.E0 = i32 + 25;
            this.F = i32 + 26;
            int i33 = i32 + 28;
            this.J0 = i33;
            this.raiseToListenRow = i32 + 27;
            if (SharedConfig.raiseToListen) {
                this.J0 = i32 + 29;
                this.E = i33;
            }
            int i34 = this.J0;
            this.pauseOnRecordRow = i34;
            this.pauseOnMediaRow = i34 + 1;
            this.M = i34 + 2;
            this.C0 = i34 + 3;
            this.F0 = i34 + 4;
            this.J0 = i34 + 6;
            this.f34207y = i34 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i35 = this.J0;
                this.J0 = i35 + 1;
                this.sensitiveContentRow = i35;
            }
            int i36 = this.J0;
            this.G = i36;
            this.K = i36 + 1;
            this.J0 = i36 + 3;
            this.D0 = i36 + 2;
        } else {
            int i37 = this.J0;
            this.R = i37;
            this.S = i37 + 1;
            int i38 = i37 + 3;
            this.J0 = i38;
            this.T = i37 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i37 + 4;
                this.U = i38;
            }
            int i39 = this.J0;
            int i40 = i39 + 1;
            this.J0 = i40;
            this.V = i39;
            int i41 = org.telegram.ui.ActionBar.j6.f20855o;
            if (i41 == 1) {
                this.W = i40;
                int i42 = i39 + 3;
                this.J0 = i42;
                this.X = i39 + 2;
                if (org.telegram.ui.ActionBar.j6.f20873p) {
                    this.Y = i42;
                    this.J0 = i39 + 5;
                    this.Z = i39 + 4;
                } else {
                    this.f34175a0 = i42;
                    this.f34177b0 = i39 + 4;
                    this.J0 = i39 + 6;
                    this.f34179c0 = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f34180d0 = i40;
                this.f34182e0 = i39 + 2;
                this.J0 = i39 + 4;
                this.f34184f0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.j6.f20855o != 0) {
                int i43 = this.J0;
                this.f34185g0 = i43;
                this.J0 = i43 + 2;
                this.f34193o0 = i43 + 1;
                if (org.telegram.ui.ActionBar.j6.J.W != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.v = z11;
                dc1 dc1Var2 = this.f34178c;
                if (dc1Var2 != null) {
                    dc1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i44 = this.J0;
                    this.J0 = i44 + 1;
                    this.f34195q0 = i44;
                }
                int i45 = this.J0;
                this.J0 = i45 + 1;
                this.f34197r0 = i45;
            }
        }
        dc1 dc1Var3 = this.f34178c;
        if (dc1Var3 != null) {
            int width = this.f34176b.getWidth();
            int i46 = dc1Var3.f22473g3;
            org.telegram.ui.Cells.oa oaVar = dc1Var3.f22469c3;
            if (i46 != oaVar.h()) {
                oaVar.l();
                if (dc1Var3.f22472f3 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                if (dc1Var3.f22468b3 != A0) {
                    dc1Var3.w1(width);
                }
            }
        }
        gc1 gc1Var = this.f34174a;
        if (gc1Var != null) {
            if (i10 == 1 && (i15 = this.L0) != (i16 = org.telegram.ui.ActionBar.j6.f20855o) && i15 != -1) {
                int i47 = this.V;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f34176b.K(i49);
                        if (vk0Var != null) {
                            View view = vk0Var.f45738a;
                            if (view instanceof org.telegram.ui.Cells.ja) {
                                org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
                                if (i49 == org.telegram.ui.ActionBar.j6.f20855o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                jaVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.j6.f20855o;
                    if (i50 == 0) {
                        this.f34174a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f34174a.s(i48, this.J0 - i48);
                        } else if (i51 == 2) {
                            this.f34174a.t(i48, 3);
                            gc1 gc1Var2 = this.f34174a;
                            if (org.telegram.ui.ActionBar.j6.f20873p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            gc1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            gc1 gc1Var3 = this.f34174a;
                            if (org.telegram.ui.ActionBar.j6.f20873p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            gc1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f34174a.s(i48, this.J0 - i48);
                        } else if (i52 == 1) {
                            gc1 gc1Var4 = this.f34174a;
                            if (org.telegram.ui.ActionBar.j6.f20873p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            gc1Var4.t(i48, i19);
                            this.f34174a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f34174a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.L0;
                        if (i53 == 0) {
                            this.f34174a.s(i48, this.J0 - i48);
                        } else if (i53 == 2) {
                            this.f34174a.t(i48, 3);
                        } else if (i53 == 1) {
                            gc1 gc1Var5 = this.f34174a;
                            if (org.telegram.ui.ActionBar.j6.f20873p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            gc1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z14 = this.M0;
                    boolean z15 = org.telegram.ui.ActionBar.j6.f20873p;
                    if (z14 != z15) {
                        int i54 = i47 + 3;
                        if (z15) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        gc1Var.t(i54, i17);
                        gc1 gc1Var6 = this.f34174a;
                        if (org.telegram.ui.ActionBar.j6.f20873p) {
                            i11 = 2;
                        }
                        gc1Var6.s(i54, i11);
                    }
                }
            } else if (!z10 && this.L0 != -1) {
                if (i23 == -1 && (i14 = this.f34195q0) != -1) {
                    gc1Var.o(i14);
                } else if (i23 != -1 && this.f34195q0 == -1) {
                    gc1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f34195q0;
                    if (i55 != -1) {
                        gc1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f34208y0) != -1) {
                    this.f34174a.o(i13);
                } else if (i24 != -1 && this.f34208y0 == -1) {
                    this.f34174a.u(i24);
                }
                if (i25 == -1 && (i12 = this.E) != -1) {
                    this.f34174a.o(i12);
                } else if (i25 != -1 && this.E == -1) {
                    this.f34174a.u(i25);
                }
            } else {
                gc1Var.l();
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.j6.f20873p;
            this.L0 = org.telegram.ui.ActionBar.j6.f20855o;
        }
        z0();
    }

    public final void B0(Location location, boolean z10) {
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
                        alertDialog$Builder.f20198a.T = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new pb1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f20198a);
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.f21018x = location.getLatitude();
        org.telegram.ui.ActionBar.j6.f21036y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.j6.f21018x, org.telegram.ui.ActionBar.j6.f21036y);
        org.telegram.ui.ActionBar.j6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.j6.f20947t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.j6.f21001w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.j6.f20965u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new tb1(this, 1));
        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f34176b.K(this.Z);
        if (vk0Var != null) {
            View view = vk0Var.f45738a;
            if (view instanceof org.telegram.ui.Cells.e9) {
                ((org.telegram.ui.Cells.e9) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.f20873p && org.telegram.ui.ActionBar.j6.f20855o == 1) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.U0 = !org.telegram.ui.ActionBar.j6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f34183f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.S0 = xi0Var;
            if (this.U0) {
                xi0Var.K(xi0Var.f32557e[0] - 1);
            } else {
                xi0Var.K(0);
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.S0;
            xi0Var2.h = true;
            this.f34198s = n10.d(5, xi0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f34198s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f34198s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f34198s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f34198s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f34198s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new t3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new vb1(this));
        this.f34174a = new gc1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f34176b = ll0Var;
        ll0Var.o1();
        this.f34176b.setLayoutManager(new s4.c0(1, false));
        this.f34176b.setVerticalScrollBarEnabled(false);
        this.f34176b.setAdapter(this.f34174a);
        ((s4.j) this.f34176b.getItemAnimator()).C = false;
        frameLayout.addView(this.f34176b, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34176b);
        this.f34176b.setOnItemClickListener(new qv0(12, this, context));
        if (i10 == 0) {
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.pr.h);
            jVar.C = false;
            jVar.f45777m = false;
            this.f34176b.setItemAnimator(jVar);
        }
        if (this.T0) {
            A0(false);
            this.T0 = false;
            this.f34176b.u0(this.f34174a.f36626e.J0 - 1);
            AndroidUtilities.runOnUIThread(new tb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.b2 b2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                gc1 gc1Var = this.f34174a;
                if (gc1Var != null && (i15 = this.browserRow) != -1) {
                    gc1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                gc1 gc1Var2 = this.f34174a;
                if (gc1Var2 != null && (i14 = this.f34195q0) != -1) {
                    gc1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (i6Var == this.h && h6Var == this.f34191n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/addtheme/");
                        if (h6Var != null) {
                            tL_theme = h6Var.f20505r;
                        } else {
                            tL_theme = i6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.hq0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.b2 b2Var2 = this.f34196r;
                        if (b2Var2 != null) {
                            b2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
                    org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
                    if (i6Var2 == this.h && h6Var2 == this.f34191n && (b2Var = this.f34196r) == null) {
                        b2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.i6) objArr[0];
                        this.f34191n = (org.telegram.ui.ActionBar.h6) objArr[1];
                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                        this.f34196r = b2Var3;
                        b2Var3.f20237g0 = true;
                        showDialog(b2Var3, new r5(this, 17));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f34183f == 3) {
                        boolean f12 = org.telegram.ui.ActionBar.j6.f1();
                        boolean z10 = !f12;
                        if (this.U0 != z10) {
                            this.U0 = z10;
                            org.telegram.ui.Components.xi0 xi0Var = this.S0;
                            if (!f12) {
                                i13 = xi0Var.f32557e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            xi0Var.N(i13);
                            this.f34198s.getIconView().d();
                        }
                        if (this.f34194p0 >= 0) {
                            for (int i16 = 0; i16 < this.f34176b.getChildCount(); i16++) {
                                if (this.f34176b.getChildAt(i16) instanceof gv) {
                                    ((gv) this.f34176b.getChildAt(i16)).b();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i17 = this.f34194p0;
                    if (i17 >= 0) {
                        this.f34174a.m(i17);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f34174a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.ll0 ll0Var = this.f34176b;
            if (ll0Var != null) {
                ll0Var.e1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ja.class, hc1.class, wb1.class, cc1.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.pa.class, ec1.class, org.telegram.ui.Cells.r8.class, gp0.class, org.telegram.ui.Components.sy0.class, gv.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.f20827m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 2048, new Class[]{hc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 2048, new Class[]{wb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{wb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{cc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20719g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{cc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20736h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20824m3, org.telegram.ui.ActionBar.j6.f20895q3}, null, org.telegram.ui.ActionBar.j6.f20920ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20843n3, org.telegram.ui.ActionBar.j6.f20913r3}, null, org.telegram.ui.ActionBar.j6.f20669dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20824m3.f20445y;
        int i19 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, org.telegram.ui.ActionBar.j6.f20895q3.f20445y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20859o3, org.telegram.ui.ActionBar.j6.f20932s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20859o3, org.telegram.ui.ActionBar.j6.f20932s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20859o3, org.telegram.ui.ActionBar.j6.f20932s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20859o3, org.telegram.ui.ActionBar.j6.f20932s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20877p3, org.telegram.ui.ActionBar.j6.f20951t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20859o3, org.telegram.ui.ActionBar.j6.f20932s3}, null, org.telegram.ui.ActionBar.j6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20824m3, org.telegram.ui.ActionBar.j6.f20895q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20705fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f21058z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20941sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20611ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20668db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20613ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20704fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20851nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20940sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20868od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34176b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(w7.a6.a(new xy0(6, this), i20, i11, i12));
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
        if (this.f34183f == 0) {
            org.telegram.ui.ActionBar.j6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.j6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
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
        this.f34176b.setPadding(0, 0, 0, i13);
        this.f34176b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34174a != null) {
            A0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20198a.R = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f20198a.T = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new pb1(this, 1));
        showDialog(alertDialog$Builder.f20198a);
    }

    public final void x0() {
        boolean z10;
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        boolean z11 = true;
        if (A0.k(false).f20490a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34183f != 1) {
            z11 = false;
        }
        presentFragment(new wd1(A0, false, 1, z10, z11));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (this.f34198s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
        ArrayList arrayList = A0.f20543b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f20490a >= 100) {
            this.f34198s.K(2);
            this.f34198s.K(3);
        } else {
            this.f34198s.r(2);
            this.f34198s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.S && A02.Y == org.telegram.ui.ActionBar.j6.f20839n && (k10 == null || (b6Var = k10.f20511y) == null || "d".equals(b6Var.f20276c))) {
            this.f34198s.r(4);
        } else {
            this.f34198s.K(4);
        }
    }
}
