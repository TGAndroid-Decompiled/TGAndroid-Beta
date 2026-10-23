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
    public final qa1 Q0;
    public int R;
    public final qa1 R0;
    public int S;
    public org.telegram.ui.Components.yj0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public za1 f34198a;
    public int f34199a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.mm0 f34200b;
    public int f34201b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public wa1 f34202c;
    public int f34203c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int f34204d0;
    public final ArrayList e;
    public int f34205e0;
    public final int f34206f;
    public int f34207f0;
    public int f34208g0;
    public org.telegram.ui.ActionBar.j6 h;
    public int f34209h0;
    public int f34210i0;
    public int f34211j0;
    public int f34212k0;
    public int f34213l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.i6 f34214n;
    public int f34215n0;
    private int nightThemeRow;
    public int f34216o0;
    public int f34217p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int f34218q0;
    public org.telegram.ui.ActionBar.c2 f34219r;
    public int f34220r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.u0 f34221s;
    public int f34222s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int f34223t0;
    private int textSizeRow;
    public int f34224u0;
    public boolean v;
    public int f34225v0;
    public int f34226w;
    public int f34227w0;
    public int f34228x;
    public int f34229x0;
    public int f34230y;
    public int f34231y0;
    public int f34232z0;

    public static class InnerAccentView extends View {
        public final Paint f34233a;
        public ObjectAnimator f34234b;
        public float f34235c;
        public org.telegram.ui.ActionBar.j6 d;
        public org.telegram.ui.ActionBar.i6 e;
        public boolean f34236f;

        public InnerAccentView(Context context) {
            super(context);
            this.f34233a = new Paint(1);
        }

        public final void a(boolean z10) {
            boolean z11;
            if (this.d.Y == this.e.f20964a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f34236f = z11;
            ObjectAnimator objectAnimator = this.f34234b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f7 = 0.0f;
            if (z10) {
                if (this.f34236f) {
                    f7 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f7);
                this.f34234b = ofFloat;
                ofFloat.setDuration(200L);
                this.f34234b.start();
                return;
            }
            if (this.f34236f) {
                f7 = 1.0f;
            }
            setCheckedState(f7);
        }

        public float getCheckedState() {
            return this.f34235c;
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
            int i10 = this.e.f20966c;
            Paint paint = this.f34233a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.f34235c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.f34235c), paint);
            if (this.f34235c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.f34235c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.f34235c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.f34235c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 != 0 && this.f34235c != 1.0f) {
                paint.setColor(i11);
                canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.f34235c) * AndroidUtilities.dp(8.0f), paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f34236f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public void setCheckedState(float f7) {
            this.f34235c = f7;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.Q0 = new qa1(this);
        this.R0 = new qa1(this);
        this.f34206f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.g6 g6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (!TextUtils.isEmpty(str) && messagesController.config.needAgeVideoVerification.get()) {
            org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, context, g6Var, false);
            LinearLayout e = org.telegram.messenger.sl.e(context, 1);
            e.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            e.setClipChildren(false);
            e.setClipToPadding(false);
            j10.customView = e;
            FrameLayout frameLayout = new FrameLayout(context);
            int dp = AndroidUtilities.dp(80.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            frameLayout.setBackground(K);
            org.telegram.ui.ActionBar.r6.k(frameLayout, K, O, null, g6Var);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_verify_age);
            frameLayout.addView(imageView, w7.z5.e(50, 50, 17));
            e.addView(frameLayout, w7.z5.t(80, 80, 1, 0, 20, 0, 8));
            int i13 = org.telegram.ui.ActionBar.k6.f21289j5;
            TextView b10 = w7.d6.b(context, 20.0f, i13, true, g6Var);
            org.telegram.messenger.sl.m(R.string.AgeVerificationTitle, b10, 17);
            e.addView(b10, w7.z5.t(-1, -2, 7, 24, 8, 24, 8));
            TextView b11 = w7.d6.b(context, 14.0f, i13, false, g6Var);
            b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
            b11.setGravity(17);
            e.addView(b11, w7.z5.t(-1, -2, 7, 24, 0, 24, 0));
            final ei.d dVar = new ei.d(context, g6Var, true);
            dVar.i(LocaleController.getString(R.string.AgeVerificationButton), false, true);
            dVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final ei.d dVar2 = ei.d.this;
                    if (dVar2.Q) {
                        return;
                    }
                    dVar2.setLoading(true);
                    int i14 = R.raw.permission_request_camera;
                    int i15 = R.string.AgeVerificationNeedCameraPermission;
                    final MessagesController messagesController2 = messagesController;
                    final String str3 = str;
                    final int i16 = i10;
                    final Context context2 = context;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    final int i17 = i11;
                    final Utilities.Callback callback2 = callback;
                    final org.telegram.ui.ActionBar.h3[] h3VarArr = r9;
                    org.telegram.ui.Components.af0.c(i14, i15, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final ei.d dVar3 = ei.d.this;
                            if (!booleanValue) {
                                dVar3.setLoading(false);
                                return;
                            }
                            final MessagesController messagesController3 = messagesController2;
                            UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                            final int i18 = i16;
                            final Context context3 = context2;
                            final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                            final int i19 = i17;
                            final Utilities.Callback callback3 = callback2;
                            final org.telegram.ui.ActionBar.h3[] h3VarArr2 = h3VarArr;
                            userNameResolver.resolve(str3, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj2) {
                                    Long l4 = (Long) obj2;
                                    ei.d dVar4 = ei.d.this;
                                    if (l4 == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    TLRPC.User user = messagesController3.getUser(l4);
                                    if (user == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (U == null) {
                                        dVar4.setLoading(false);
                                        return;
                                    }
                                    gi.t4 b12 = gi.t4.b(i18, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                    final gi.d3 d3Var = new gi.d3(context3, g6Var3);
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
                                            d3Var.k(false);
                                            callback4.run(Boolean.valueOf(booleanValue2));
                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                            if (booleanValue2 && U2 != null) {
                                                org.telegram.messenger.v0.p(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.xc.a0(U2), R.raw.contact_check, 36);
                                            }
                                        }
                                    };
                                    d3Var.L0 = r62;
                                    gi.v2 v2Var = d3Var.f11188y;
                                    if (v2Var != 0) {
                                        v2Var.setOnVerifiedAge(r62);
                                    }
                                    d3Var.x(true);
                                    d3Var.B0 = false;
                                    d3Var.f11171l0 = U.getParentActivity();
                                    d3Var.t(U, b12);
                                    d3Var.show();
                                    dVar4.setLoading(false);
                                    h3VarArr2[0].dismiss();
                                }
                            });
                        }
                    });
                }
            });
            e.addView(dVar, w7.z5.t(-1, 48, 7, 2, 29, 2, 14));
            j10.show();
            final org.telegram.ui.ActionBar.h3[] h3VarArr = {j10};
            j10.fixNavigationBar();
            return;
        }
        callback.run(Boolean.TRUE);
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        za1 za1Var;
        boolean z10;
        org.telegram.ui.Components.mm0 mm0Var = themeActivity.f34200b;
        if (mm0Var != null && mm0Var.G && (za1Var = themeActivity.f34198a) != null) {
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
                za1Var.m(i10);
            } else {
                themeActivity.A0(true);
            }
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
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
            lp0 lp0Var = new lp0();
            lp0Var.H = themeActivity;
            themeActivity.presentFragment(lp0Var);
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
                for (int i13 = 0; i13 < themeActivity.f34200b.getChildCount(); i13++) {
                    View childAt = themeActivity.f34200b.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.w8) {
                        themeActivity.f34200b.getClass();
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
                    LinearLayout e = org.telegram.messenger.sl.e(context, 1);
                    CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
                    for (final int i14 = 0; i14 < 3; i14++) {
                        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                        l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        l6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21237g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence = charSequenceArr[i14];
                        if (i14 == SharedConfig.distanceSystemType) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l6Var.b(charSequence, z12);
                        int i15 = org.telegram.ui.ActionBar.k6.f21272i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                        l6Var.setBackground(g02);
                        org.telegram.ui.ActionBar.r6.k(l6Var, g02, null, O, null);
                        e.addView(l6Var);
                        l6Var.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37295b;

                            {
                                this.f37295b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37295b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i14);
                                        themeActivity2.P0 = true;
                                        s4.b1 K = themeActivity2.f34200b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f34198a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37295b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i14);
                                        themeActivity3.O0 = true;
                                        s4.b1 K2 = themeActivity3.f34200b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f34198a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference.get()).dismiss();
                                        return;
                                }
                            }
                        });
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string3 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.R = string3;
                    alertDialog$Builder.o(e);
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference.set(c2Var);
                    themeActivity.showDialog(c2Var);
                }
            } else if (i10 == themeActivity.L) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference2 = new AtomicReference();
                    LinearLayout e7 = org.telegram.messenger.sl.e(context, 1);
                    ArrayList b10 = org.telegram.ui.web.n1.b();
                    int size = b10.size();
                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                    final int i16 = 0;
                    while (i16 < size) {
                        charSequenceArr2[i16] = ((org.telegram.ui.web.n1) b10.get(i16)).f43206a;
                        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                        float f11 = f10;
                        l6Var2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f11), 0);
                        l6Var2.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21237g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                        CharSequence charSequence2 = charSequenceArr2[i16];
                        if (i16 == SharedConfig.searchEngineType) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        l6Var2.b(charSequence2, z11);
                        int i17 = org.telegram.ui.ActionBar.k6.f21272i6;
                        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
                        l6Var2.setBackground(g03);
                        org.telegram.ui.ActionBar.r6.k(l6Var2, g03, null, O2, null);
                        e7.addView(l6Var2);
                        l6Var2.setOnClickListener(new View.OnClickListener(themeActivity) {
                            public final ThemeActivity f37295b;

                            {
                                this.f37295b = themeActivity;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (r4) {
                                    case 0:
                                        ThemeActivity themeActivity2 = this.f37295b;
                                        themeActivity2.getClass();
                                        SharedConfig.setSearchEngineType(i16);
                                        themeActivity2.P0 = true;
                                        s4.b1 K = themeActivity2.f34200b.K(themeActivity2.L);
                                        if (K != null) {
                                            themeActivity2.f34198a.v(K, themeActivity2.L);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                    default:
                                        ThemeActivity themeActivity3 = this.f37295b;
                                        themeActivity3.getClass();
                                        SharedConfig.setDistanceSystemType(i16);
                                        themeActivity3.O0 = true;
                                        s4.b1 K2 = themeActivity3.f34200b.K(themeActivity3.K);
                                        if (K2 != null) {
                                            themeActivity3.f34198a.v(K2, themeActivity3.K);
                                        }
                                        ((Dialog) atomicReference2.get()).dismiss();
                                        return;
                                }
                            }
                        });
                        i16++;
                        f10 = f11;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string4 = LocaleController.getString(R.string.SearchEngine);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                    c2Var2.R = string4;
                    alertDialog$Builder2.o(e7);
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference2.set(c2Var2);
                    themeActivity.showDialog(c2Var2);
                }
            } else if (i10 == themeActivity.M) {
                if (themeActivity.getParentActivity() != null) {
                    final AtomicReference atomicReference3 = new AtomicReference();
                    LinearLayout e10 = org.telegram.messenger.sl.e(context, 1);
                    org.telegram.ui.Cells.l6 l6Var3 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                    l6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    int i18 = org.telegram.ui.ActionBar.k6.f21237g7;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                    int i19 = org.telegram.ui.ActionBar.k6.E5;
                    l6Var3.a(x02, org.telegram.ui.ActionBar.k6.x0(null, i19, false));
                    l6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
                    int i20 = org.telegram.ui.ActionBar.k6.f21272i6;
                    org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i20, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i20);
                    l6Var3.setBackground(g04);
                    org.telegram.ui.ActionBar.r6.k(l6Var3, g04, null, O3, null);
                    e10.addView(l6Var3);
                    l6Var3.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f37551b;

                        {
                            this.f37551b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f37551b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.b1 K = themeActivity2.f34200b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34198a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i21 = R.raw.permission_request_microphone;
                                    int i22 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f37551b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.af0.c(i21, i22, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.qy(24, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.b1 K2 = themeActivity3.f34200b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f34198a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l6 l6Var4 = new org.telegram.ui.Cells.l6(themeActivity.getParentActivity(), null);
                    l6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    l6Var4.a(org.telegram.ui.ActionBar.k6.x0(null, i18, false), org.telegram.ui.ActionBar.k6.x0(null, i19, false));
                    String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
                    String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
                    boolean z17 = SharedConfig.recordViaSco;
                    l6Var4.f22679a.setText(string5);
                    TextView textView = l6Var4.f22680b;
                    textView.setVisibility(0);
                    textView.setText(string6);
                    l6Var4.f22681c.a(z17, false);
                    org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i20, false), 2, -1);
                    org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i20);
                    l6Var4.setBackground(g05);
                    org.telegram.ui.ActionBar.r6.k(l6Var4, g05, null, O4, null);
                    e10.addView(l6Var4);
                    l6Var4.setOnClickListener(new View.OnClickListener(themeActivity) {
                        public final ThemeActivity f37551b;

                        {
                            this.f37551b = themeActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    ThemeActivity themeActivity2 = this.f37551b;
                                    themeActivity2.getClass();
                                    SharedConfig.recordViaSco = false;
                                    SharedConfig.saveConfig();
                                    themeActivity2.N0 = true;
                                    ((Dialog) atomicReference3.get()).dismiss();
                                    s4.b1 K = themeActivity2.f34200b.K(themeActivity2.M);
                                    if (K != null) {
                                        themeActivity2.f34198a.v(K, themeActivity2.M);
                                        return;
                                    }
                                    return;
                                default:
                                    int i21 = R.raw.permission_request_microphone;
                                    int i22 = R.string.PermissionNoBluetoothWithHint;
                                    ThemeActivity themeActivity3 = this.f37551b;
                                    AtomicReference atomicReference4 = atomicReference3;
                                    org.telegram.ui.Components.af0.c(i21, i22, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.qy(24, themeActivity3, atomicReference4));
                                    SharedConfig.recordViaSco = true;
                                    SharedConfig.saveConfig();
                                    themeActivity3.N0 = true;
                                    ((Dialog) atomicReference4.get()).dismiss();
                                    s4.b1 K2 = themeActivity3.f34200b.K(themeActivity3.M);
                                    if (K2 != null) {
                                        themeActivity3.f34198a.v(K2, themeActivity3.M);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
                    String string7 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20678a;
                    c2Var3.R = string7;
                    alertDialog$Builder3.o(e10);
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    atomicReference3.set(c2Var3);
                    themeActivity.showDialog(c2Var3);
                }
            } else if (i10 == themeActivity.f34230y) {
                SharedConfig.toggleDirectShare();
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.directShare);
                }
            } else if (i10 == themeActivity.sensitiveContentRow) {
                if (!themeActivity.getMessagesController().showSensitiveContent()) {
                    o71 o71Var = new o71(5, themeActivity, view);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
                    String string8 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f20678a;
                    c2Var4.R = string8;
                    c2Var4.T = LocaleController.getString(R.string.ConfirmSensitiveContentText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new ql0(18, themeActivity, o71Var));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    themeActivity.showDialog(c2Var4);
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
                        org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.f20678a;
                        c2Var5.R = string9;
                        alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new iy(themeActivity, i10, 2));
                        alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity.showDialog(c2Var5);
                    }
                } else if (i10 == themeActivity.f34222s0) {
                    SharedConfig.toggleChatBlur();
                    if (view instanceof org.telegram.ui.Cells.w8) {
                        ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.chatBlurEnabled());
                    }
                } else if (i10 == themeActivity.nightThemeRow) {
                    if ((LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                        if (org.telegram.ui.ActionBar.k6.f21379o == 0) {
                            org.telegram.ui.ActionBar.k6.f21379o = 2;
                            i5Var.setChecked(true);
                        } else {
                            org.telegram.ui.ActionBar.k6.f21379o = 0;
                            i5Var.setChecked(false);
                        }
                        org.telegram.ui.ActionBar.k6.t1();
                        org.telegram.ui.ActionBar.k6.E(true);
                        if (org.telegram.ui.ActionBar.k6.f21379o != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            string = org.telegram.ui.ActionBar.k6.B0();
                        } else {
                            string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z10) {
                            int i21 = org.telegram.ui.ActionBar.k6.f21379o;
                            if (i21 == 1) {
                                string2 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                            } else if (i21 == 3) {
                                string2 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                            } else {
                                string2 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                            }
                            string = a1.g.D(string2, " ", string);
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
                    themeActivity.presentFragment(new org.telegram.ui.web.y1(null));
                } else if (i10 == themeActivity.R) {
                    if (org.telegram.ui.ActionBar.k6.f21379o != 0) {
                        org.telegram.ui.ActionBar.k6.f21379o = 0;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.S) {
                    if (org.telegram.ui.ActionBar.k6.f21379o != 1) {
                        org.telegram.ui.ActionBar.k6.f21379o = 1;
                        if (org.telegram.ui.ActionBar.k6.f21397p) {
                            themeActivity.B0(null, true);
                        }
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.T) {
                    if (org.telegram.ui.ActionBar.k6.f21379o != 2) {
                        org.telegram.ui.ActionBar.k6.f21379o = 2;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.U) {
                    if (org.telegram.ui.ActionBar.k6.f21379o != 3) {
                        org.telegram.ui.ActionBar.k6.f21379o = 3;
                        themeActivity.A0(true);
                        org.telegram.ui.ActionBar.k6.E(false);
                    }
                } else if (i10 == themeActivity.X) {
                    boolean z18 = !org.telegram.ui.ActionBar.k6.f21397p;
                    org.telegram.ui.ActionBar.k6.f21397p = z18;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z18);
                    themeActivity.A0(true);
                    if (org.telegram.ui.ActionBar.k6.f21397p) {
                        themeActivity.B0(null, true);
                    }
                    org.telegram.ui.ActionBar.k6.E(false);
                } else if (i10 != themeActivity.f34199a0 && i10 != themeActivity.f34201b0) {
                    if (i10 == themeActivity.Y) {
                        themeActivity.B0(null, true);
                    } else if (i10 == themeActivity.createNewThemeRow) {
                        themeActivity.w0();
                    } else if (i10 == themeActivity.f34231y0) {
                        themeActivity.x0();
                    } else if (i10 == themeActivity.stickersRow) {
                        themeActivity.presentFragment(new StickersActivity(0, null));
                    } else if (i10 == themeActivity.liteModeRow) {
                        themeActivity.presentFragment(new wb0());
                    }
                } else if (themeActivity.getParentActivity() != null) {
                    if (i10 == themeActivity.f34199a0) {
                        i11 = org.telegram.ui.ActionBar.k6.f21433r;
                        i12 = i11 / 60;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21453s;
                        i12 = i11 / 60;
                    }
                    int i22 = i11 - (i12 * 60);
                    final org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                    themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                            int i25 = (i23 * 60) + i24;
                            int i26 = ThemeActivity.this.f34199a0;
                            int i27 = i10;
                            org.telegram.ui.Cells.ca caVar2 = caVar;
                            if (i27 == i26) {
                                org.telegram.ui.ActionBar.k6.f21433r = i25;
                                caVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                                return;
                            }
                            org.telegram.ui.ActionBar.k6.f21453s = i25;
                            caVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                        }
                    }, i12, i22, true));
                }
            }
        }
    }

    public static void X(ThemeActivity themeActivity, o71 o71Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.qy(25, themeActivity, o71Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        s4.b1 K = themeActivity.f34200b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.f46343a;
            if (view instanceof ab1) {
                ab1 ab1Var = (ab1) view;
                org.telegram.ui.Cells.t1[] cells = ab1Var.f35638a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                ab1Var.invalidate();
            }
        }
        s4.b1 K2 = themeActivity.f34200b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.f46343a;
            if (view2 instanceof pa1) {
                pa1 pa1Var = (pa1) view2;
                if (z10) {
                    pa1Var.requestLayout();
                } else {
                    pa1Var.invalidate();
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
                org.telegram.ui.ActionBar.k6.P();
                s4.b1 K = themeActivity.f34200b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.f46343a;
                    if (view instanceof ab1) {
                        org.telegram.ui.Cells.t1[] cells = ((ab1) view).f35638a.getCells();
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
        int i10 = org.telegram.ui.ActionBar.k6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.k6.f21472t;
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
        org.telegram.ui.ActionBar.j6 C0;
        boolean z13;
        TLRPC.TL_theme tL_theme;
        int i22 = this.J0;
        int i23 = this.f34218q0;
        int i24 = this.f34231y0;
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
        this.f34209h0 = -1;
        this.f34199a0 = -1;
        this.f34201b0 = -1;
        this.f34203c0 = -1;
        this.f34216o0 = -1;
        this.f34217p0 = -1;
        this.f34218q0 = -1;
        this.f34220r0 = -1;
        this.f34208g0 = -1;
        this.f34204d0 = -1;
        this.f34205e0 = -1;
        this.f34207f0 = -1;
        this.f34226w = -1;
        this.f34210i0 = -1;
        this.f34211j0 = -1;
        this.bubbleRadiusRow = -1;
        this.f34212k0 = -1;
        this.f34213l0 = -1;
        this.m0 = -1;
        this.f34215n0 = -1;
        this.f34222s0 = -1;
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
        this.f34228x = -1;
        this.f34230y = -1;
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
        this.f34223t0 = -1;
        this.f34224u0 = -1;
        this.f34225v0 = -1;
        this.f34227w0 = -1;
        this.f34229x0 = -1;
        this.f34231y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.f34232z0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        int i26 = 0;
        while (true) {
            i10 = this.f34206f;
            i11 = 3;
            if (i26 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i26);
            if (i10 == 0 || i10 == 3 || ((j6Var.f21021b != null || j6Var.q()) && ((tL_theme = j6Var.F) == null || tL_theme.document != null))) {
                if (j6Var.f21021b != null) {
                    arrayList2.add(j6Var);
                } else {
                    arrayList.add(j6Var);
                }
            }
            i26++;
        }
        Collections.sort(arrayList, new o70(8));
        if (i10 == 3) {
            int i27 = this.J0;
            this.f34227w0 = i27;
            this.f34217p0 = i27 + 1;
            this.f34215n0 = i27 + 2;
            this.f34229x0 = i27 + 3;
            this.f34210i0 = i27 + 4;
            this.J0 = i27 + 6;
            this.f34216o0 = i27 + 5;
            if (org.telegram.ui.ActionBar.k6.C0().W != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.v = z13;
            wa1 wa1Var = this.f34202c;
            if (wa1Var != null) {
                wa1Var.setDrawDivider(z13);
            }
            if (this.v) {
                int i28 = this.J0;
                this.J0 = i28 + 1;
                this.f34218q0 = i28;
            }
            int i29 = this.J0;
            this.J0 = i29 + 1;
            this.f34212k0 = i29;
            org.telegram.ui.ActionBar.j6 C02 = org.telegram.ui.ActionBar.k6.C0();
            org.telegram.ui.ActionBar.i6 k10 = C02.k(false);
            ArrayList arrayList3 = C02.f21022b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.f20964a >= 100) {
                int i30 = this.J0;
                this.J0 = i30 + 1;
                this.f34231y0 = i30;
            }
            int i31 = this.J0;
            this.createNewThemeRow = i31;
            this.J0 = i31 + 2;
            this.f34232z0 = i31 + 1;
        } else if (i10 == 0) {
            int i32 = this.J0;
            this.f34226w = i32;
            this.textSizeRow = i32 + 1;
            this.backgroundRow = i32 + 2;
            this.changeUserColor = i32 + 3;
            this.f34209h0 = i32 + 4;
            this.f34210i0 = i32 + 5;
            this.f34217p0 = i32 + 6;
            this.f34220r0 = i32 + 7;
            this.f34211j0 = i32 + 8;
            this.bubbleRadiusRow = i32 + 9;
            this.f34212k0 = i32 + 10;
            this.f34213l0 = i32 + 11;
            this.m0 = i32 + 12;
            this.f34215n0 = i32 + 13;
            this.H0 = i32 + 14;
            this.appIconSelectorRow = i32 + 15;
            this.I0 = i32 + 16;
            this.f34223t0 = i32 + 17;
            this.f34224u0 = i32 + 18;
            this.f34225v0 = i32 + 19;
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
            this.f34230y = i34 + 5;
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
            int i41 = org.telegram.ui.ActionBar.k6.f21379o;
            if (i41 == 1) {
                this.W = i40;
                int i42 = i39 + 3;
                this.J0 = i42;
                this.X = i39 + 2;
                if (org.telegram.ui.ActionBar.k6.f21397p) {
                    this.Y = i42;
                    this.J0 = i39 + 5;
                    this.Z = i39 + 4;
                } else {
                    this.f34199a0 = i42;
                    this.f34201b0 = i39 + 4;
                    this.J0 = i39 + 6;
                    this.f34203c0 = i39 + 5;
                }
            } else if (i41 == 2) {
                this.f34204d0 = i40;
                this.f34205e0 = i39 + 2;
                this.J0 = i39 + 4;
                this.f34207f0 = i39 + 3;
            }
            if (org.telegram.ui.ActionBar.k6.f21379o != 0) {
                int i43 = this.J0;
                this.f34208g0 = i43;
                this.J0 = i43 + 2;
                this.f34216o0 = i43 + 1;
                if (org.telegram.ui.ActionBar.k6.J.W != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.v = z11;
                wa1 wa1Var2 = this.f34202c;
                if (wa1Var2 != null) {
                    wa1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i44 = this.J0;
                    this.J0 = i44 + 1;
                    this.f34218q0 = i44;
                }
                int i45 = this.J0;
                this.J0 = i45 + 1;
                this.f34220r0 = i45;
            }
        }
        wa1 wa1Var3 = this.f34202c;
        if (wa1Var3 != null) {
            int width = this.f34200b.getWidth();
            int i46 = wa1Var3.f22826h3;
            org.telegram.ui.Cells.ma maVar = wa1Var3.f22822d3;
            if (i46 != maVar.h()) {
                maVar.l();
                if (wa1Var3.f22825g3 == 1) {
                    C0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    C0 = org.telegram.ui.ActionBar.k6.C0();
                }
                if (wa1Var3.f22821c3 != C0) {
                    wa1Var3.D1(width);
                }
            }
        }
        za1 za1Var = this.f34198a;
        if (za1Var != null) {
            if (i10 == 1 && (i15 = this.L0) != (i16 = org.telegram.ui.ActionBar.k6.f21379o) && i15 != -1) {
                int i47 = this.V;
                int i48 = i47 + 1;
                if (i15 != i16) {
                    for (int i49 = 0; i49 < 4; i49++) {
                        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f34200b.K(i49);
                        if (wl0Var != null) {
                            View view = wl0Var.f46343a;
                            if (view instanceof org.telegram.ui.Cells.ha) {
                                org.telegram.ui.Cells.ha haVar = (org.telegram.ui.Cells.ha) view;
                                if (i49 == org.telegram.ui.ActionBar.k6.f21379o) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                haVar.setTypeChecked(z12);
                            }
                        }
                    }
                    int i50 = org.telegram.ui.ActionBar.k6.f21379o;
                    if (i50 == 0) {
                        this.f34198a.t(i48, i22 - i48);
                    } else if (i50 == 1) {
                        int i51 = this.L0;
                        if (i51 == 0) {
                            this.f34198a.s(i48, this.J0 - i48);
                        } else if (i51 == 2) {
                            this.f34198a.t(i48, 3);
                            za1 za1Var2 = this.f34198a;
                            if (org.telegram.ui.ActionBar.k6.f21397p) {
                                i21 = 4;
                            } else {
                                i21 = 5;
                            }
                            za1Var2.s(i48, i21);
                        } else if (i51 == 3) {
                            za1 za1Var3 = this.f34198a;
                            if (org.telegram.ui.ActionBar.k6.f21397p) {
                                i20 = 4;
                            } else {
                                i20 = 5;
                            }
                            za1Var3.s(i48, i20);
                        }
                    } else if (i50 == 2) {
                        int i52 = this.L0;
                        if (i52 == 0) {
                            this.f34198a.s(i48, this.J0 - i48);
                        } else if (i52 == 1) {
                            za1 za1Var4 = this.f34198a;
                            if (org.telegram.ui.ActionBar.k6.f21397p) {
                                i19 = 4;
                            } else {
                                i19 = 5;
                            }
                            za1Var4.t(i48, i19);
                            this.f34198a.s(i48, 3);
                        } else if (i52 == 3) {
                            this.f34198a.s(i48, 3);
                        }
                    } else if (i50 == 3) {
                        int i53 = this.L0;
                        if (i53 == 0) {
                            this.f34198a.s(i48, this.J0 - i48);
                        } else if (i53 == 2) {
                            this.f34198a.t(i48, 3);
                        } else if (i53 == 1) {
                            za1 za1Var5 = this.f34198a;
                            if (org.telegram.ui.ActionBar.k6.f21397p) {
                                i18 = 4;
                            } else {
                                i18 = 5;
                            }
                            za1Var5.t(i48, i18);
                        }
                    }
                } else {
                    boolean z14 = this.M0;
                    boolean z15 = org.telegram.ui.ActionBar.k6.f21397p;
                    if (z14 != z15) {
                        int i54 = i47 + 3;
                        if (z15) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        za1Var.t(i54, i17);
                        za1 za1Var6 = this.f34198a;
                        if (org.telegram.ui.ActionBar.k6.f21397p) {
                            i11 = 2;
                        }
                        za1Var6.s(i54, i11);
                    }
                }
            } else if (!z10 && this.L0 != -1) {
                if (i23 == -1 && (i14 = this.f34218q0) != -1) {
                    za1Var.o(i14);
                } else if (i23 != -1 && this.f34218q0 == -1) {
                    za1Var.u(i23);
                    if (i24 != -1) {
                        i24--;
                    }
                } else {
                    int i55 = this.f34218q0;
                    if (i55 != -1) {
                        za1Var.m(i55);
                    }
                }
                if (i24 == -1 && (i13 = this.f34231y0) != -1) {
                    this.f34198a.o(i13);
                } else if (i24 != -1 && this.f34231y0 == -1) {
                    this.f34198a.u(i24);
                }
                if (i25 == -1 && (i12 = this.E) != -1) {
                    this.f34198a.o(i12);
                } else if (i25 != -1 && this.E == -1) {
                    this.f34198a.u(i25);
                }
            } else {
                za1Var.l();
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.k6.f21397p;
            this.L0 = org.telegram.ui.ActionBar.k6.f21379o;
        }
        z0();
    }

    public final void B0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i10 = R.raw.permission_request_location;
                        int i11 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.f20678a.T = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ia1(this, 2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(alertDialog$Builder.f20678a);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.f21546x = location.getLatitude();
        org.telegram.ui.ActionBar.k6.f21565y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.k6.f21546x, org.telegram.ui.ActionBar.k6.f21565y);
        org.telegram.ui.ActionBar.k6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.k6.f21472t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.k6.f21528w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.k6.f21492u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new ma1(this, 1));
        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f34200b.K(this.Z);
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.e9) {
                ((org.telegram.ui.Cells.e9) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.k6.f21397p && org.telegram.ui.ActionBar.k6.f21379o == 1) {
            org.telegram.ui.ActionBar.k6.E(false);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21466sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21483ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21188dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21444ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        this.U0 = !org.telegram.ui.ActionBar.k6.i1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f34206f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.S0 = yj0Var;
            if (this.U0) {
                yj0Var.M(yj0Var.e[0] - 1);
            } else {
                yj0Var.M(0);
            }
            org.telegram.ui.Components.yj0 yj0Var2 = this.S0;
            yj0Var2.h = true;
            this.f34221s = m10.d(5, yj0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.ic_ab_other);
            this.f34221s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.f34221s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.f34221s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.f34221s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.f34221s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new u3(this, 22));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new oa1(this));
        this.f34198a = new za1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f34200b = mm0Var;
        mm0Var.t1();
        this.f34200b.setSectionsRounding(true);
        this.f34200b.setLayoutManager(new s4.b0(1, false));
        this.f34200b.setVerticalScrollBarEnabled(false);
        this.f34200b.setAdapter(this.f34198a);
        ((s4.k) this.f34200b.getItemAnimator()).C = false;
        frameLayout.addView(this.f34200b, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34200b);
        this.f34200b.setOnItemClickListener(new ql0(19, this, context));
        if (i10 == 0) {
            s4.k kVar = new s4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.bs.h);
            kVar.C = false;
            kVar.f46377m = false;
            this.f34200b.setItemAnimator(kVar);
        }
        if (this.T0) {
            A0(false);
            this.T0 = false;
            this.f34200b.u0(this.f34198a.e.J0 - 1);
            AndroidUtilities.runOnUIThread(new ma1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c2 c2Var;
        TLRPC.TL_theme tL_theme;
        int i14;
        int i15;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
        } else if (i10 != NotificationCenter.didSetNewWallpapper && i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
                za1 za1Var = this.f34198a;
                if (za1Var != null && (i15 = this.browserRow) != -1) {
                    za1Var.m(i15);
                }
            } else if (i10 == NotificationCenter.themeAccentListUpdated) {
                za1 za1Var2 = this.f34198a;
                if (za1Var2 != null && (i14 = this.f34218q0) != -1) {
                    za1Var2.n(i14, new Object());
                }
            } else if (i10 == NotificationCenter.themeListUpdated) {
                A0(true);
            } else {
                if (i10 == NotificationCenter.themeUploadedToServer) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (j6Var == this.h && i6Var == this.f34214n) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/addtheme/");
                        if (i6Var != null) {
                            tL_theme = i6Var.f20978r;
                        } else {
                            tL_theme = j6Var.F;
                        }
                        sb2.append(tL_theme.slug);
                        String sb3 = sb2.toString();
                        showDialog(new org.telegram.ui.Components.ir0(getParentActivity(), null, sb3, false, sb3, false, null));
                        org.telegram.ui.ActionBar.c2 c2Var2 = this.f34219r;
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                        }
                    }
                } else if (i10 == NotificationCenter.themeUploadError) {
                    org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
                    org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
                    if (j6Var2 == this.h && i6Var2 == this.f34214n && (c2Var = this.f34219r) == null) {
                        c2Var.dismiss();
                    }
                } else if (i10 == NotificationCenter.needShareTheme) {
                    if (getParentActivity() != null && !this.isPaused) {
                        this.h = (org.telegram.ui.ActionBar.j6) objArr[0];
                        this.f34214n = (org.telegram.ui.ActionBar.i6) objArr[1];
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                        this.f34219r = c2Var3;
                        c2Var3.f20762i0 = true;
                        showDialog(c2Var3, new v5(this, 16));
                    }
                } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                    z0();
                    if (this.f34206f == 3) {
                        boolean i16 = org.telegram.ui.ActionBar.k6.i1();
                        boolean z10 = !i16;
                        if (this.U0 != z10) {
                            this.U0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = this.S0;
                            if (!i16) {
                                i13 = yj0Var.e[0] - 1;
                            } else {
                                i13 = 0;
                            }
                            yj0Var.P(i13);
                            this.f34221s.getIconView().d();
                        }
                        if (this.f34217p0 >= 0) {
                            for (int i17 = 0; i17 < this.f34200b.getChildCount(); i17++) {
                                if (this.f34200b.getChildAt(i17) instanceof uu) {
                                    ((uu) this.f34200b.getChildAt(i17)).a();
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                    int i18 = this.f34217p0;
                    if (i18 >= 0) {
                        this.f34198a.m(i18);
                    }
                } else if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                    this.f34198a.m(i12);
                }
            }
        } else {
            org.telegram.ui.Components.mm0 mm0Var = this.f34200b;
            if (mm0Var != null) {
                mm0Var.g1();
            }
            z0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.j0.class, org.telegram.ui.Cells.ha.class, ab1.class, pa1.class, va1.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.na.class, xa1.class, org.telegram.ui.Cells.r8.class, qo0.class, org.telegram.ui.Components.rz0.class, uu.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        int i10 = org.telegram.ui.ActionBar.k6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{va1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21237g7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{va1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21205ec));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21129ab));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21169cb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.db));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21131ad));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21223fb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21373nd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21465sb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21391od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{ab1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21371nb));
        int i13 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34200b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.addAll(w7.c6.a(new i6(23, this), i13, org.telegram.ui.ActionBar.k6.G6, i14));
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
        if (this.f34206f == 0) {
            org.telegram.ui.ActionBar.k6.k1(this.currentAccount, true);
            org.telegram.ui.ActionBar.k6.F(true);
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
        org.telegram.ui.ActionBar.k6.t1();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34200b.setPadding(0, 0, 0, i13);
        this.f34200b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34198a != null) {
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
        alertDialog$Builder.f20678a.R = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.f20678a.T = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ia1(this, 1));
        showDialog(alertDialog$Builder.f20678a);
    }

    public final void x0() {
        boolean z10;
        org.telegram.ui.ActionBar.j6 C0 = org.telegram.ui.ActionBar.k6.C0();
        boolean z11 = true;
        if (C0.k(false).f20964a >= 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34206f != 1) {
            z11 = false;
        }
        presentFragment(new qc1(C0, false, 1, z10, z11));
    }

    public final void z0() {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (this.f34221s == null) {
            return;
        }
        org.telegram.ui.ActionBar.j6 C0 = org.telegram.ui.ActionBar.k6.C0();
        org.telegram.ui.ActionBar.i6 k10 = C0.k(false);
        ArrayList arrayList = C0.f21022b0;
        if (arrayList != null && !arrayList.isEmpty() && k10 != null && k10.f20964a >= 100) {
            this.f34221s.K(2);
            this.f34221s.K(3);
        } else {
            this.f34221s.r(2);
            this.f34221s.r(3);
        }
        if (AndroidUtilities.isTablet()) {
            i10 = 18;
        } else {
            i10 = 16;
        }
        org.telegram.ui.ActionBar.j6 C02 = org.telegram.ui.ActionBar.k6.C0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && C02.S && C02.Y == org.telegram.ui.ActionBar.k6.f21359n && (k10 == null || (d6Var = k10.f20984y) == null || "d".equals(d6Var.f20817c))) {
            this.f34221s.r(4);
        } else {
            this.f34221s.K(4);
        }
    }
}
