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
public class ThemeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
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
    public boolean G0;
    public int H;
    public int H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public final oa1 M0;
    public int N;
    public final oa1 N0;
    public int O;
    public org.telegram.ui.Components.mi0 O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public xa1 f36225a;
    public int f36226a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.wk0 f36227b;
    public int f36228b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public ua1 f36229c;
    public int f36230c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f36231d0;
    public final ArrayList f36232e;
    public int f36233e0;
    public final int f36234f;
    public int f36235f0;
    public int f36236g0;
    public org.telegram.ui.ActionBar.e6 h;
    public int f36237h0;
    public int f36238i0;
    public int f36239j0;
    public int f36240k0;
    public int f36241l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.d6 f36242n;
    public int f36243n0;
    private int nightThemeRow;
    public int f36244o0;
    public int f36245p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f36246q0;
    public org.telegram.ui.ActionBar.c2 f36247r;
    public int f36248r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.w0 f36249s;
    public int f36250s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f36251t0;
    private int textSizeRow;
    public int f36252u0;
    public boolean v;
    public int f36253v0;
    public int f36254w;
    public int f36255w0;
    public int f36256x;
    public int f36257x0;
    public int f36258y;
    public int f36259y0;
    public int f36260z0;

    public static class InnerAccentView extends View {
        public final Paint f36261a;
        public ObjectAnimator f36262b;
        public float f36263c;
        public org.telegram.ui.ActionBar.e6 d;
        public org.telegram.ui.ActionBar.d6 f36264e;
        public boolean f36265f;

        public InnerAccentView(Context context) {
            super(context);
            this.f36261a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.U == this.f36264e.f22866a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f36265f = z11;
            ObjectAnimator objectAnimator = this.f36262b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f10 = 0.0f;
            if (z10) {
                if (this.f36265f) {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
                this.f36262b = ofFloat;
                ofFloat.setDuration(200L);
                this.f36262b.start();
                return;
            }
            if (this.f36265f) {
                f10 = 1.0f;
            }
            setCheckedState(f10);
        }

        public float getCheckedState() {
            return this.f36263c;
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
            int i9 = this.f36264e.f22868c;
            Paint paint = this.f36261a;
            paint.setColor(i9);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f36263c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f36263c), paint);
            if (this.f36263c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f36263c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f36263c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f36263c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i10 = this.f36264e.f22869e;
            if (i10 != 0 && this.f36263c != 1.0f) {
                paint.setColor(i10);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f36263c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f36265f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i9, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f10) {
            this.f36263c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i9) {
        super(null);
        this.d = new ArrayList();
        this.f36232e = new ArrayList();
        this.M0 = new oa1(this);
        this.N0 = new oa1(this);
        this.f36234f = i9;
        z0(true);
    }

    public static void B0(final int i9, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.b6 b6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i9);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i10 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
            f10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            j10.customView = f10;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, g7.e6.e(50, 50, 17));
            f10.addView(frameLayout, g7.e6.t(80, 80, 1, 0, 20, 0, 8));
            int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
            TextView b10 = g7.i6.b(context, 20.0f, i11, true, b6Var);
            org.telegram.messenger.ll.l(R.string.AgeVerificationTitle, b10, 17);
            f10.addView(b10, g7.e6.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = g7.i6.b(context, 14.0f, i11, false, b6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            f10.addView(b11, g7.e6.t(-1, -2, 7, 24, 0, 24, 0));
            final kh.d dVar = new kh.d(context, b6Var, true);
            dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final kh.d dVar2 = kh.d.this;
                    if (dVar2.J) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i12 = R.raw.permission_request_camera;
                    int i13 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i14 = i9;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                    final int i15 = i10;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.f3[] f3VarArr = r9;
                    org.telegram.ui.Components.kd0.e(i12, i13, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final kh.d dVar3 = kh.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i16 = i14;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.b6 b6Var3 = b6Var2;
                            final int i17 = i15;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.f3[] f3VarArr2 = f3VarArr;
                            userNameResolver.resolve(str3, new d5.d() {
                                @Override
                                public final void accept(Object obj2) {
                                    Long l10 = (Long) obj2;
                                    kh.d dVar4 = kh.d.this;
                                    if (l10 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l10);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    mh.s4 b12 = mh.s4.b(i16, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final mh.c3 c3Var = new mh.c3(context3, b6Var3);
                                    final int i18 = i17;
                                    final Utilities.Callback callback4 = callback3;
                                    ?? r62 = new Utilities.Callback4() {
                                        @Override
                                        public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                            boolean booleanValue2;
                                            Boolean bool = (Boolean) obj3;
                                            Double d = (Double) obj4;
                                            String str4 = (String) obj5;
                                            Double d9 = (Double) obj6;
                                            if (d != null) {
                                                if (d.doubleValue() >= i18) {
                                                    booleanValue2 = true;
                                                } else {
                                                    booleanValue2 = false;
                                                }
                                            } else {
                                                booleanValue2 = bool.booleanValue();
                                            }
                                            c3Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                org.telegram.messenger.l0.p(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.oc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    c3Var.D0 = r62;
                                    mh.u2 u2Var = c3Var.f17778x;
                                    if (u2Var != 0) {
                                        u2Var.setOnVerifiedAge(r62);
                                    }
                                    c3Var.w(true);
                                    c3Var.f17777w0 = false;
                                    c3Var.f17758g0 = U.getParentActivity();
                                    c3Var.s(U, b12);
                                    c3Var.show();
                                    dVar4.setLoading(false);
                                    f3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            f10.addView(dVar, g7.e6.t(-1, 48, 7, 2, 29, 2, 14));
            j10.show();
            final org.telegram.ui.ActionBar.f3[] f3VarArr = {j10};
            j10.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void T(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        xa1 xa1Var;
        boolean z10;
        org.telegram.ui.Components.wk0 wk0Var = themeActivity.f36227b;
        if (wk0Var != null && wk0Var.C && (xa1Var = themeActivity.f36225a) != null) {
            int i9 = themeActivity.sensitiveContentRow;
            boolean z11 = false;
            if (i9 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                z11 = true;
            }
            if (z10 == z11) {
                xa1Var.m(i9);
            } else {
                themeActivity.z0(true);
            }
        }
    }

    public static void V(final ThemeActivity themeActivity, Context context, View view, final int i9, float f10) {
        int i10;
        int i11;
        boolean z10;
        String string;
        String string2;
        boolean z11;
        boolean z12;
        if (i9 == themeActivity.J) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z13 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z14 = !z13;
            edit.putBoolean("view_animations", z14);
            SharedConfig.setAnimationsEnabled(z14);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z14);
            }
        } else if (i9 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
        } else if (i9 == themeActivity.changeUserColor) {
            zo0 zo0Var = new zo0();
            zo0Var.f45201x = themeActivity;
            themeActivity.presentFragment(zo0Var);
        } else if (i9 == themeActivity.C) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z15 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z16 = !z15;
            edit2.putBoolean("send_by_enter", z16);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z16);
            }
        } else if (i9 == themeActivity.A) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.raiseToSpeak);
            }
        } else if (i9 == themeActivity.B) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.nextMediaTap);
            }
        } else if (i9 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.A != -1) {
                for (int i12 = 0; i12 < themeActivity.f36227b.getChildCount(); i12++) {
                    View childAt = themeActivity.f36227b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t8) {
                        themeActivity.f36227b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.A) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.z0(false);
        } else if (i9 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.pauseMusicOnRecord);
            }
        } else if (i9 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.pauseMusicOnMedia);
            }
        } else {
            float f11 = 4.0f;
            if (i9 == themeActivity.G) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference = new AtomicReference();
                    LinearLayout f12 = org.telegram.messenger.ll.f(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i13 = 0; i13 < 3; i13++) {
                        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                        CharSequence charSequence = charSequenceArr[i13];
                        if (i13 == SharedConfig.distanceSystemType) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k6Var.b(charSequence, z12);
                        k6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                        f12.addView(k6Var);
                        k6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37489b;

                            {
                                this.f37489b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37489b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i13);
                                        themeActivity2.L0 = true;
                                        f2.q1 K = themeActivity2.f36227b.K(themeActivity2.H);
                                        if (K != null) {
                                            themeActivity2.f36225a.v(K, themeActivity2.H);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37489b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i13);
                                        themeActivity3.K0 = true;
                                        f2.q1 K2 = themeActivity3.f36227b.K(themeActivity3.G);
                                        if (K2 != null) {
                                            themeActivity3.f36225a.v(K2, themeActivity3.G);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string3;
                    alertDialog$Builder.n(f12);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(c2Var);
                    themeActivity.showDialog(c2Var);
                }
            } else if (i9 == themeActivity.H) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout f13 = org.telegram.messenger.ll.f(context, 1);
                    ArrayList b10 = org.telegram.ui.web.j1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i14 = 0;
                    while (i14 < size) {
                        charSequenceArr2[i14] = ((org.telegram.ui.web.j1) b10.get(i14)).f43902a;
                        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                        k6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                        k6Var2.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i14];
                        if (i14 == SharedConfig.searchEngineType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k6Var2.b(charSequence2, z11);
                        k6Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                        f13.addView(k6Var2);
                        k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37489b;

                            {
                                this.f37489b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37489b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.L0 = true;
                                        f2.q1 K = themeActivity2.f36227b.K(themeActivity2.H);
                                        if (K != null) {
                                            themeActivity2.f36225a.v(K, themeActivity2.H);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37489b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.K0 = true;
                                        f2.q1 K2 = themeActivity3.f36227b.K(themeActivity3.G);
                                        if (K2 != null) {
                                            themeActivity3.f36225a.v(K2, themeActivity3.G);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i14++;
                        f11 = 4.0f;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = string4;
                    alertDialog$Builder2.n(f13);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(c2Var2);
                    themeActivity.showDialog(c2Var2);
                }
            } else if (i9 == themeActivity.I) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout f14 = org.telegram.messenger.ll.f(context, 1);
                    org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i15 = org.telegram.ui.ActionBar.f6.f23056g7;
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
                    int i16 = org.telegram.ui.ActionBar.f6.E5;
                    k6Var3.a(w02, org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    k6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i17 = org.telegram.ui.ActionBar.f6.f23092i6;
                    k6Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i17, false), 2, -1));
                    f14.addView(k6Var3);
                    k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f37889b;

                        {
                            this.f37889b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f37889b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.J0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.q1 K = themeActivity2.f36227b.K(themeActivity2.I);
                                    if (K != null) {
                                        themeActivity2.f36225a.v(K, themeActivity2.I);
                                        return;
                                    }
                                    return;
                                default:
                                    int i18 = R.raw.permission_request_microphone;
                                    int i19 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f37889b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.kd0.e(i18, i19, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new eb0(12, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.J0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.q1 K2 = themeActivity3.f36227b.K(themeActivity3.I);
                                    if (K2 != null) {
                                        themeActivity3.f36225a.v(K2, themeActivity3.I);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                    k6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var4.a(org.telegram.ui.ActionBar.f6.w0(null, i15, false), org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z17 = SharedConfig.recordViaSco;
                    k6Var4.f24613a.setText(string5);
                    TextView textView = k6Var4.f24614b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    k6Var4.f24615c.a(z17, false);
                    k6Var4.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i17, false), 2, -1));
                    f14.addView(k6Var4);
                    k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f37889b;

                        {
                            this.f37889b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f37889b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.J0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    f2.q1 K = themeActivity2.f36227b.K(themeActivity2.I);
                                    if (K != null) {
                                        themeActivity2.f36225a.v(K, themeActivity2.I);
                                        return;
                                    }
                                    return;
                                default:
                                    int i18 = R.raw.permission_request_microphone;
                                    int i19 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f37889b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.kd0.e(i18, i19, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new eb0(12, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.J0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    f2.q1 K2 = themeActivity3.f36227b.K(themeActivity3.I);
                                    if (K2 != null) {
                                        themeActivity3.f36225a.v(K2, themeActivity3.I);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                    c2Var3.N = string7;
                    alertDialog$Builder3.n(f14);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(c2Var3);
                    themeActivity.showDialog(c2Var3);
                }
            } else if (i9 == themeActivity.f36258y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i9 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    n21 n21Var = new n21(11, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22702a;
                    c2Var4.N = string8;
                    c2Var4.P = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new nl0(20, themeActivity, n21Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(c2Var4);
                    return;
                }
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
            } else if (i9 != themeActivity.L) {
                if (i9 == themeActivity.M) {
                    if (themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String string9 = LocaleController.getString("SortBy", R.string.SortBy);
                        org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f22702a;
                        c2Var5.N = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new hy(themeActivity, i9, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(c2Var5);
                    }
                } else if (i9 == themeActivity.f36244o0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.t8) {
                        ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i9 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                        if (org.telegram.ui.ActionBar.f6.f23190o == 0) {
                            org.telegram.ui.ActionBar.f6.f23190o = 2;
                            j5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.f6.f23190o = 0;
                            j5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.f6.q1();
                        org.telegram.ui.ActionBar.f6.E(true);
                        if (org.telegram.ui.ActionBar.f6.f23190o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            string = org.telegram.ui.ActionBar.f6.z0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z10) {
                            int i18 = org.telegram.ui.ActionBar.f6.f23190o;
                            if (i18 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i18 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = aa.d.z(string2, " ", string);
                        }
                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                        return;
                    }
                    themeActivity.presentFragment(new ThemeActivity(1));
                } else if (i9 == themeActivity.browserRow) {
                    if ((LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                        ((org.telegram.ui.Cells.j5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                        return;
                    }
                    themeActivity.presentFragment(new org.telegram.ui.web.u1(null));
                } else if (i9 == themeActivity.N) {
                    if (org.telegram.ui.ActionBar.f6.f23190o != 0) {
                        org.telegram.ui.ActionBar.f6.f23190o = 0;
                        themeActivity.z0(true);
                        org.telegram.ui.ActionBar.f6.E(false);
                    }
                } else if (i9 == themeActivity.O) {
                    if (org.telegram.ui.ActionBar.f6.f23190o != 1) {
                        org.telegram.ui.ActionBar.f6.f23190o = 1;
                        if (org.telegram.ui.ActionBar.f6.f23205p) {
                            themeActivity.A0(null, true);
                        }
                        themeActivity.z0(true);
                        org.telegram.ui.ActionBar.f6.E(false);
                    }
                } else if (i9 == themeActivity.P) {
                    if (org.telegram.ui.ActionBar.f6.f23190o != 2) {
                        org.telegram.ui.ActionBar.f6.f23190o = 2;
                        themeActivity.z0(true);
                        org.telegram.ui.ActionBar.f6.E(false);
                    }
                } else if (i9 == themeActivity.Q) {
                    if (org.telegram.ui.ActionBar.f6.f23190o != 3) {
                        org.telegram.ui.ActionBar.f6.f23190o = 3;
                        themeActivity.z0(true);
                        org.telegram.ui.ActionBar.f6.E(false);
                    }
                } else if (i9 == themeActivity.T) {
                    boolean z18 = !org.telegram.ui.ActionBar.f6.f23205p;
                    org.telegram.ui.ActionBar.f6.f23205p = z18;
                    ((org.telegram.ui.Cells.t8) view).setChecked(z18);
                    themeActivity.z0(true);
                    if (org.telegram.ui.ActionBar.f6.f23205p) {
                        themeActivity.A0(null, true);
                    }
                    org.telegram.ui.ActionBar.f6.E(false);
                } else if (i9 != themeActivity.W && i9 != themeActivity.X) {
                    if (i9 == themeActivity.U) {
                        themeActivity.A0(null, true);
                    } else if (i9 == themeActivity.createNewThemeRow) {
                        themeActivity.v0();
                    } else if (i9 == themeActivity.f36252u0) {
                        themeActivity.w0();
                    } else if (i9 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i9 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new sb0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i9 == themeActivity.W) {
                        i10 = org.telegram.ui.ActionBar.f6.f23241r;
                        i11 = i10 / 60;
                    } else {
                        i10 = org.telegram.ui.ActionBar.f6.f23260s;
                        i11 = i10 / 60;
                    }
                    int i19 = i10 - (i11 * 60);
                    final org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i20, int i21) {
                            int i22 = (i20 * 60) + i21;
                            int i23 = ThemeActivity.this.W;
                            int i24 = i9;
                            org.telegram.ui.Cells.ba baVar2 = baVar;
                            if (i24 == i23) {
                                org.telegram.ui.ActionBar.f6.f23241r = i22;
                                baVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i20), Integer.valueOf(i21)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.f6.f23260s = i22;
                            baVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i20), Integer.valueOf(i21)), false, true);
                        }
                    }, i11, i19, true));
                }
            }
        }
    }

    public static void W(ThemeActivity themeActivity, n21 n21Var) {
        B0(themeActivity.currentAccount, themeActivity.getParentActivity(), new eb0(13, themeActivity, n21Var), themeActivity.getResourceProvider());
    }

    public static boolean X(ThemeActivity themeActivity, int i9, boolean z10) {
        if (i9 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.q1 K = themeActivity.f36227b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f5501a;
            if (view instanceof ya1) {
                ya1 ya1Var = (ya1) view;
                org.telegram.ui.Cells.t1[] cells = ya1Var.f44804a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().resetLayout();
                    cells[i10].requestLayout();
                }
                ya1Var.invalidate();
            }
        }
        f2.q1 K2 = themeActivity.f36227b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f5501a;
            if (view2 instanceof na1) {
                na1 na1Var = (na1) view2;
                if (z10) {
                    na1Var.requestLayout();
                } else {
                    na1Var.invalidate();
                }
            }
        }
        themeActivity.y0();
        return true;
    }

    public static boolean j0(ThemeActivity themeActivity, int i9) {
        if (i9 != SharedConfig.fontSize) {
            SharedConfig.fontSize = i9;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", SharedConfig.fontSize);
                edit.commit();
                org.telegram.ui.ActionBar.f6.O();
                f2.q1 K = themeActivity.f36227b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f5501a;
                    if (view instanceof ya1) {
                        org.telegram.ui.Cells.t1[] cells = ((ya1) view).f44804a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().resetLayout();
                            cells[i10].requestLayout();
                        }
                    }
                }
                themeActivity.y0();
                return true;
            }
        }
        return false;
    }

    public static String x0() {
        int i9 = org.telegram.ui.ActionBar.f6.v;
        int i10 = i9 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i9 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.f6.f23278t;
        int i12 = i11 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public final void A0(Location location, boolean z10) {
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
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        alertDialog$Builder.f22702a.P = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ga1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f22702a);
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            FileLog.e(e11);
        }
        if (location == null || z10) {
            if (!this.G0) {
                this.G0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.M0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.N0);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.f6.f23344x = location.getLatitude();
        org.telegram.ui.ActionBar.f6.f23362y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.f6.f23344x, org.telegram.ui.ActionBar.f6.f23362y);
        org.telegram.ui.ActionBar.f6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.f6.f23278t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.f6.f23327w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.f6.f23296u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new ka1(this, 1));
        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.f36227b.K(this.V);
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.b9) {
                ((org.telegram.ui.Cells.b9) view).setText(x0());
            }
        }
        if (org.telegram.ui.ActionBar.f6.f23205p && org.telegram.ui.ActionBar.f6.f23190o == 1) {
            org.telegram.ui.ActionBar.f6.E(false);
        }
    }

    @Override
    public final View createView(Context context) {
        this.Q0 = !org.telegram.ui.ActionBar.f6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i9 = this.f36234f;
        if (i9 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            int i10 = R.raw.sun;
            org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i10, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.O0 = mi0Var;
            if (this.Q0) {
                mi0Var.K(mi0Var.f30847e[0] - 1);
            } else {
                mi0Var.K(0);
            }
            org.telegram.ui.Components.mi0 mi0Var2 = this.O0;
            mi0Var2.h = true;
            this.f36249s = n10.d(5, mi0Var2);
        } else if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.f36249s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f36249s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f36249s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f36249s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f36249s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new w3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ma1(this));
        this.f36225a = new xa1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f36227b = wk0Var;
        wk0Var.p1();
        this.f36227b.setLayoutManager(new f2.m0(1, false));
        this.f36227b.setVerticalScrollBarEnabled(false);
        this.f36227b.setAdapter(this.f36225a);
        ((f2.n) this.f36227b.getItemAnimator()).C = false;
        frameLayout.addView(this.f36227b, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f36227b);
        this.f36227b.setOnItemClickListener(new nl0(21, this, context));
        if (i9 == 0) {
            f2.n nVar = new f2.n();
            nVar.n(350L);
            nVar.o(org.telegram.ui.Components.gr.h);
            nVar.C = false;
            nVar.f5532m = false;
            this.f36227b.setItemAnimator(nVar);
        }
        if (this.P0) {
            z0(false);
            this.P0 = false;
            this.f36227b.u0(this.f36225a.f44444e.F0 - 1);
            AndroidUtilities.runOnUIThread(new ka1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c2 c2Var;
        TLRPC.TL_theme tL_theme;
        int i13;
        int i14;
        if (i9 == NotificationCenter.locationPermissionGranted) {
            A0(null, true);
        } else if (i9 != NotificationCenter.didSetNewWallpapper && i9 != NotificationCenter.emojiLoaded) {
            if (i9 == NotificationCenter.webBrowserSettingsUpdate) {
                xa1 xa1Var = this.f36225a;
                if (xa1Var != null && (i14 = this.browserRow) != -1) {
                    xa1Var.m(i14);
                }
            } else if (i9 == NotificationCenter.themeAccentListUpdated) {
                xa1 xa1Var2 = this.f36225a;
                if (xa1Var2 != null && (i13 = this.m0) != -1) {
                    xa1Var2.n(i13, new Object());
                }
            } else if (i9 == NotificationCenter.themeListUpdated) {
                z0(true);
            } else {
                if (i9 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) objArr[0];
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) objArr[1];
                    if (e6Var == this.h && d6Var == this.f36242n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/addtheme/");
                        if (d6Var != null) {
                            tL_theme = d6Var.f22881r;
                        } else {
                            tL_theme = e6Var.B;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.rp0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.c2 c2Var2 = this.f36247r;
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                        }
                    }
                } else if (i9 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[0];
                    org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) objArr[1];
                    if (e6Var2 == this.h && d6Var2 == this.f36242n && (c2Var = this.f36247r) == null) {
                        c2Var.dismiss();
                    }
                } else if (i9 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.e6) objArr[0];
                        this.f36242n = (org.telegram.ui.ActionBar.d6) objArr[1];
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                        this.f36247r = c2Var3;
                        c2Var3.f22766c0 = true;
                        showDialog(c2Var3, new r5(this, 17));
                    }
                } else if (i9 == NotificationCenter.needSetDayNightTheme) {
                    y0();
                    if (this.f36234f == 3) {
                        boolean f12 = org.telegram.ui.ActionBar.f6.f1();
                        boolean z10 = !f12;
                        if (this.Q0 != z10) {
                            this.Q0 = z10;
                            org.telegram.ui.Components.mi0 mi0Var = this.O0;
                            if (!f12) {
                                i12 = mi0Var.f30847e[0] - 1;
                            } else {
                                i12 = 0;
                            }
                            mi0Var.N(i12);
                            this.f36249s.getIconView().d();
                        }
                        if (this.f36241l0 >= 0) {
                            for (int i15 = 0; i15 < this.f36227b.getChildCount(); i15++) {
                                if (this.f36227b.getChildAt(i15) instanceof tu) {
                                    ((tu) this.f36227b.getChildAt(i15)).b();
                                }
                            }
                        }
                    }
                } else if (i9 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i16 = this.f36241l0;
                    if (i16 >= 0) {
                        this.f36225a.m(i16);
                    }
                } else if ((i9 == NotificationCenter.contentSettingsLoaded || i9 == NotificationCenter.appConfigUpdated) && (i11 = this.sensitiveContentRow) >= 0) {
                    this.f36225a.m(i11);
                }
            }
        } else {
            org.telegram.ui.Components.wk0 wk0Var = this.f36227b;
            if (wk0Var != null) {
                wk0Var.f1();
            }
            y0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ga.class, ya1.class, na1.class, ta1.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Cells.ma.class, va1.class, org.telegram.ui.Cells.p8.class, ho0.class, org.telegram.ui.Components.ay0.class, tu.class, org.telegram.ui.Cells.t.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i12 = org.telegram.ui.ActionBar.f6.f23229q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.f23162m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.f6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 2048, new Class[]{ya1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, new String[]{"sizeBar"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 2048, new Class[]{na1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{na1.class}, new String[]{"sizeBar"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ta1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23056g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ta1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23074h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, org.telegram.ui.ActionBar.f6.f23252ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23176n3, org.telegram.ui.ActionBar.f6.f23245r3}, null, org.telegram.ui.ActionBar.f6.f23006dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.f23159m3.f22864y;
        int i18 = org.telegram.ui.ActionBar.f6.f23289ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, drawableArr, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, org.telegram.ui.ActionBar.f6.f23226q3.f22864y, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23209p3, org.telegram.ui.ActionBar.f6.f23282t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23366y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23383z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22951ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        int i19 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36227b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        arrayList.addAll(g7.h6.a(new sx0(6, this), i19, i10, i11));
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
        if (this.f36234f == 0) {
            org.telegram.ui.ActionBar.f6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.f6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.G0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.M0);
        locationManager.removeUpdates(this.N0);
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
        org.telegram.ui.ActionBar.f6.q1();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f36227b.setPadding(0, 0, 0, i12);
        this.f36227b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36225a != null) {
            z0(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void v0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f22702a.P = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ga1(this, 1));
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void w0() {
        boolean z10;
        org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
        boolean z11 = true;
        if (A0.k(false).f22866a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36234f != 1) {
            z11 = false;
        }
        presentFragment(new oc1(A0, false, 1, z10, z11));
    }

    public final void y0() {
        int i9;
        org.telegram.ui.ActionBar.y5 y5Var;
        if (this.f36249s == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
        org.telegram.ui.ActionBar.d6 k10 = A0.k(false);
        ArrayList arrayList = A0.X;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f22866a >= 100) {
            this.f36249s.K(2);
            this.f36249s.K(3);
        } else {
            this.f36249s.r(2);
            this.f36249s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i9 = 18;
        } else {
            i9 = 16;
        }
        org.telegram.ui.ActionBar.e6 A02 = org.telegram.ui.ActionBar.f6.A0();
        if (SharedConfig.fontSize == i9 && SharedConfig.bubbleRadius == 17 && A02.O && A02.U == org.telegram.ui.ActionBar.f6.f23172n && (k10 == null || (y5Var = k10.f22887y) == null || "d".equals(y5Var.f23982c))) {
            this.f36249s.r(4);
        } else {
            this.f36249s.K(4);
        }
    }

    public final void z0(boolean z10) {
        int i9;
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
        org.telegram.ui.ActionBar.e6 A0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i21 = this.F0;
        int i22 = this.m0;
        int i23 = this.f36252u0;
        int i24 = this.A;
        this.F0 = 0;
        this.L = -1;
        this.M = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.f36231d0 = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f36240k0 = -1;
        this.f36241l0 = -1;
        this.m0 = -1;
        this.f36243n0 = -1;
        this.f36230c0 = -1;
        this.Z = -1;
        this.f36226a0 = -1;
        this.f36228b0 = -1;
        this.f36254w = -1;
        this.f36233e0 = -1;
        this.f36235f0 = -1;
        this.bubbleRadiusRow = -1;
        this.f36236g0 = -1;
        this.f36237h0 = -1;
        this.f36238i0 = -1;
        this.f36239j0 = -1;
        this.f36244o0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.f36255w0 = -1;
        this.f36257x0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.f36259y0 = -1;
        this.f36260z0 = -1;
        this.liteModeRow = -1;
        this.C0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.f36256x = -1;
        this.f36258y = -1;
        this.sensitiveContentRow = -1;
        this.J = -1;
        this.A = -1;
        this.raiseToListenRow = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
        this.f36245p0 = -1;
        this.f36246q0 = -1;
        this.f36248r0 = -1;
        this.f36250s0 = -1;
        this.f36251t0 = -1;
        this.f36252u0 = -1;
        this.createNewThemeRow = -1;
        this.D0 = -1;
        this.appIconSelectorRow = -1;
        this.E0 = -1;
        this.f36253v0 = -1;
        ArrayList arrayList = this.f36232e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.f6.F.size();
        int i25 = 0;
        while (true) {
            i9 = this.f36234f;
            i10 = 3;
            if (i25 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) org.telegram.ui.ActionBar.f6.F.get(i25);
            if (i9 == 0 || i9 == 3 || ((e6Var.f22908b != null || e6Var.q()) && ((tL_theme = e6Var.B) == null || tL_theme.document != null))) {
                if (e6Var.f22908b != null) {
                    arrayList2.add(e6Var);
                } else {
                    arrayList.add(e6Var);
                }
            }
            i25++;
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(16));
        if (i9 == 3) {
            int i26 = this.F0;
            this.f36250s0 = i26;
            this.f36241l0 = i26 + 1;
            this.f36239j0 = i26 + 2;
            this.f36251t0 = i26 + 3;
            this.f36233e0 = i26 + 4;
            this.F0 = i26 + 6;
            this.f36240k0 = i26 + 5;
            if (org.telegram.ui.ActionBar.f6.A0().S != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.v = z13;
            ua1 ua1Var = this.f36229c;
            if (ua1Var != null) {
                ua1Var.setDrawDivider(z13);
            }
            if (this.v) {
                int i27 = this.F0;
                this.F0 = i27 + 1;
                this.m0 = i27;
            }
            int i28 = this.F0;
            this.F0 = i28 + 1;
            this.f36236g0 = i28;
            org.telegram.ui.ActionBar.e6 A02 = org.telegram.ui.ActionBar.f6.A0();
            org.telegram.ui.ActionBar.d6 k10 = A02.k(false);
            ArrayList arrayList3 = A02.X;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f22866a >= 100) {
                int i29 = this.F0;
                this.F0 = i29 + 1;
                this.f36252u0 = i29;
            }
            int i30 = this.F0;
            this.createNewThemeRow = i30;
            this.F0 = i30 + 2;
            this.f36253v0 = i30 + 1;
        } else if (i9 == 0) {
            int i31 = this.F0;
            this.f36254w = i31;
            this.textSizeRow = i31 + 1;
            this.backgroundRow = i31 + 2;
            this.changeUserColor = i31 + 3;
            this.f36231d0 = i31 + 4;
            this.f36233e0 = i31 + 5;
            this.f36241l0 = i31 + 6;
            this.f36243n0 = i31 + 7;
            this.f36235f0 = i31 + 8;
            this.bubbleRadiusRow = i31 + 9;
            this.f36236g0 = i31 + 10;
            this.f36237h0 = i31 + 11;
            this.f36238i0 = i31 + 12;
            this.f36239j0 = i31 + 13;
            this.D0 = i31 + 14;
            this.appIconSelectorRow = i31 + 15;
            this.E0 = i31 + 16;
            this.f36245p0 = i31 + 17;
            this.f36246q0 = i31 + 18;
            this.f36248r0 = i31 + 19;
            this.nightThemeRow = i31 + 20;
            this.browserRow = i31 + 21;
            this.liteModeRow = i31 + 22;
            this.stickersRow = i31 + 23;
            this.f36257x0 = i31 + 24;
            this.A0 = i31 + 25;
            this.B = i31 + 26;
            int i32 = i31 + 28;
            this.F0 = i32;
            this.raiseToListenRow = i31 + 27;
            if (SharedConfig.raiseToListen) {
                this.F0 = i31 + 29;
                this.A = i32;
            }
            int i33 = this.F0;
            this.pauseOnRecordRow = i33;
            this.pauseOnMediaRow = i33 + 1;
            this.I = i33 + 2;
            this.f36259y0 = i33 + 3;
            this.B0 = i33 + 4;
            this.F0 = i33 + 6;
            this.f36258y = i33 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i34 = this.F0;
                this.F0 = i34 + 1;
                this.sensitiveContentRow = i34;
            }
            int i35 = this.F0;
            this.C = i35;
            this.G = i35 + 1;
            this.F0 = i35 + 3;
            this.f36260z0 = i35 + 2;
        } else {
            int i36 = this.F0;
            this.N = i36;
            this.O = i36 + 1;
            int i37 = i36 + 3;
            this.F0 = i37;
            this.P = i36 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.F0 = i36 + 4;
                this.Q = i37;
            }
            int i38 = this.F0;
            int i39 = i38 + 1;
            this.F0 = i39;
            this.R = i38;
            int i40 = org.telegram.ui.ActionBar.f6.f23190o;
            if (i40 == 1) {
                this.S = i39;
                int i41 = i38 + 3;
                this.F0 = i41;
                this.T = i38 + 2;
                if (org.telegram.ui.ActionBar.f6.f23205p) {
                    this.U = i41;
                    this.F0 = i38 + 5;
                    this.V = i38 + 4;
                } else {
                    this.W = i41;
                    this.X = i38 + 4;
                    this.F0 = i38 + 6;
                    this.Y = i38 + 5;
                }
            } else if (i40 == 2) {
                this.Z = i39;
                this.f36226a0 = i38 + 2;
                this.F0 = i38 + 4;
                this.f36228b0 = i38 + 3;
            }
            if (org.telegram.ui.ActionBar.f6.f23190o != 0) {
                int i42 = this.F0;
                this.f36230c0 = i42;
                this.F0 = i42 + 2;
                this.f36240k0 = i42 + 1;
                if (org.telegram.ui.ActionBar.f6.J.S != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.v = z11;
                ua1 ua1Var2 = this.f36229c;
                if (ua1Var2 != null) {
                    ua1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i43 = this.F0;
                    this.F0 = i43 + 1;
                    this.m0 = i43;
                }
                int i44 = this.F0;
                this.F0 = i44 + 1;
                this.f36243n0 = i44;
            }
        }
        ua1 ua1Var3 = this.f36229c;
        if (ua1Var3 != null) {
            int width = this.f36227b.getWidth();
            int i45 = ua1Var3.f24721c3;
            org.telegram.ui.Cells.la laVar = ua1Var3.Y2;
            if (i45 != laVar.h()) {
                laVar.l();
                if (ua1Var3.f24720b3 == 1) {
                    A0 = org.telegram.ui.ActionBar.f6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.f6.A0();
                }
                if (ua1Var3.X2 != A0) {
                    ua1Var3.x1(width);
                }
            }
        }
        xa1 xa1Var = this.f36225a;
        if (xa1Var != null) {
            if (i9 == 1 && (i14 = this.H0) != (i15 = org.telegram.ui.ActionBar.f6.f23190o) && i14 != -1) {
                int i46 = this.R;
                int i47 = i46 + 1;
                if (i14 != i15) {
                    for (int i48 = 0; i48 < 4; i48++) {
                        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.f36227b.K(i48);
                        if (ik0Var != null) {
                            View view = ik0Var.f5501a;
                            if (view instanceof org.telegram.ui.Cells.ga) {
                                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                                if (i48 == org.telegram.ui.ActionBar.f6.f23190o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                gaVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i49 = org.telegram.ui.ActionBar.f6.f23190o;
                    if (i49 == 0) {
                        this.f36225a.t(i47, i21 - i47);
                    } else if (i49 == 1) {
                        int i50 = this.H0;
                        if (i50 == 0) {
                            this.f36225a.s(i47, this.F0 - i47);
                        } else if (i50 == 2) {
                            this.f36225a.t(i47, 3);
                            xa1 xa1Var2 = this.f36225a;
                            if (org.telegram.ui.ActionBar.f6.f23205p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            xa1Var2.s(i47, i20);
                        } else if (i50 == 3) {
                            xa1 xa1Var3 = this.f36225a;
                            if (org.telegram.ui.ActionBar.f6.f23205p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            xa1Var3.s(i47, i19);
                        }
                    } else if (i49 == 2) {
                        int i51 = this.H0;
                        if (i51 == 0) {
                            this.f36225a.s(i47, this.F0 - i47);
                        } else if (i51 == 1) {
                            xa1 xa1Var4 = this.f36225a;
                            if (org.telegram.ui.ActionBar.f6.f23205p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            xa1Var4.t(i47, i18);
                            this.f36225a.s(i47, 3);
                        } else if (i51 == 3) {
                            this.f36225a.s(i47, 3);
                        }
                    } else if (i49 == 3) {
                        int i52 = this.H0;
                        if (i52 == 0) {
                            this.f36225a.s(i47, this.F0 - i47);
                        } else if (i52 == 2) {
                            this.f36225a.t(i47, 3);
                        } else if (i52 == 1) {
                            xa1 xa1Var5 = this.f36225a;
                            if (org.telegram.ui.ActionBar.f6.f23205p) {
                                i17 = 4;
                            } else {
                                i17 = 5;
                            }
                            xa1Var5.t(i47, i17);
                        }
                    }
                } else {
                    boolean z14 = this.I0;
                    boolean z15 = org.telegram.ui.ActionBar.f6.f23205p;
                    if (z14 != z15) {
                        int i53 = i46 + 3;
                        if (z15) {
                            i16 = 3;
                        } else {
                            i16 = 2;
                        }
                        xa1Var.t(i53, i16);
                        xa1 xa1Var6 = this.f36225a;
                        if (org.telegram.ui.ActionBar.f6.f23205p) {
                            i10 = 2;
                        }
                        xa1Var6.s(i53, i10);
                    }
                }
            } else if (!z10 && this.H0 != -1) {
                if (i22 == -1 && (i13 = this.m0) != -1) {
                    xa1Var.o(i13);
                } else if (i22 != -1 && this.m0 == -1) {
                    xa1Var.u(i22);
                    if (i23 != -1) {
                        i23--;
                    }
                } else {
                    int i54 = this.m0;
                    if (i54 != -1) {
                        xa1Var.m(i54);
                    }
                }
                if (i23 == -1 && (i12 = this.f36252u0) != -1) {
                    this.f36225a.o(i12);
                } else if (i23 != -1 && this.f36252u0 == -1) {
                    this.f36225a.u(i23);
                }
                if (i24 == -1 && (i11 = this.A) != -1) {
                    this.f36225a.o(i11);
                } else if (i24 != -1 && this.A == -1) {
                    this.f36225a.u(i24);
                }
            } else {
                xa1Var.l();
            }
        }
        if (i9 == 1) {
            this.I0 = org.telegram.ui.ActionBar.f6.f23205p;
            this.H0 = org.telegram.ui.ActionBar.f6.f23190o;
        }
        y0();
    }
}
