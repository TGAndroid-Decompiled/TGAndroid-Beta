package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;

public class b4 extends FrameLayout {
    public ChatObject.Call A;
    public TLRPC.GroupCallParticipant B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public final Paint E;
    public boolean F;
    public boolean G;
    public int H;
    public AccountInstance I;
    public boolean J;
    public boolean K;
    public int L;
    public long M;
    public final v3 N;
    public final v3 O;
    public int P;
    public final v3 Q;
    public final v3 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final Drawable V;
    public AnimatorSet W;

    public final z3 f24095a;

    public float f24096a0;

    public final org.telegram.ui.Components.n9 f24097b;

    public final org.telegram.ui.ActionBar.h5 f24098c;
    public final org.telegram.ui.ActionBar.h5[] d;

    public final org.telegram.ui.ActionBar.h5 f24099e;

    public final ri0 f24100f;
    public final oi0 h;

    public final oi0 f24101n;

    public final org.telegram.ui.Components.i5 f24102r;

    public final org.telegram.ui.Components.i5 f24103s;
    public Drawable v;

    public Drawable f24104w;

    public final w3 f24105x;

    public final org.telegram.ui.Components.y8 f24106y;

    public b4(Context context) {
        super(context);
        int i10 = 5;
        this.d = new org.telegram.ui.ActionBar.h5[5];
        final int i11 = 0;
        this.N = new Runnable(this) {

            public final b4 f25800b;

            {
                this.f25800b = this;
            }

            @Override
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        b4 b4Var = this.f25800b;
                        b4Var.f24101n.P(0, null);
                        oi0 oi0Var = b4Var.h;
                        oi0Var.P(0, null);
                        b4Var.f24100f.setAnimation(oi0Var);
                        break;
                    case 1:
                        b4 b4Var2 = this.f25800b;
                        ri0 ri0Var = b4Var2.f24100f;
                        oi0 oi0Var2 = b4Var2.f24101n;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i13 = 120;
                        if (iNextInt < 32) {
                            i12 = 0;
                        } else {
                            i12 = 240;
                            if (iNextInt < 64) {
                                i13 = 240;
                                i12 = 120;
                            } else {
                                i13 = 420;
                                if (iNextInt >= 97) {
                                    i12 = 540;
                                    if (iNextInt == 98) {
                                        i13 = 540;
                                        i12 = 420;
                                    } else {
                                        i13 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i13);
                        oi0Var2.P(i13 - 1, b4Var2.N);
                        ri0Var.setAnimation(oi0Var2);
                        oi0Var2.K(i12);
                        ri0Var.d();
                        break;
                    case 2:
                        this.f25800b.a(true, true);
                        break;
                    case 3:
                        b4 b4Var3 = this.f25800b;
                        b4Var3.T = false;
                        b4Var3.a(true, true);
                        b4Var3.f24095a.c(0.0d);
                        b4Var3.S = false;
                        break;
                    default:
                        this.f25800b.a(true, true);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.O = new Runnable(this) {

            public final b4 f25800b;

            {
                this.f25800b = this;
            }

            @Override
            public final void run() {
                int i13;
                switch (i12) {
                    case 0:
                        b4 b4Var = this.f25800b;
                        b4Var.f24101n.P(0, null);
                        oi0 oi0Var = b4Var.h;
                        oi0Var.P(0, null);
                        b4Var.f24100f.setAnimation(oi0Var);
                        break;
                    case 1:
                        b4 b4Var2 = this.f25800b;
                        ri0 ri0Var = b4Var2.f24100f;
                        oi0 oi0Var2 = b4Var2.f24101n;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i14 = 120;
                        if (iNextInt < 32) {
                            i13 = 0;
                        } else {
                            i13 = 240;
                            if (iNextInt < 64) {
                                i14 = 240;
                                i13 = 120;
                            } else {
                                i14 = 420;
                                if (iNextInt >= 97) {
                                    i13 = 540;
                                    if (iNextInt == 98) {
                                        i14 = 540;
                                        i13 = 420;
                                    } else {
                                        i14 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i14);
                        oi0Var2.P(i14 - 1, b4Var2.N);
                        ri0Var.setAnimation(oi0Var2);
                        oi0Var2.K(i13);
                        ri0Var.d();
                        break;
                    case 2:
                        this.f25800b.a(true, true);
                        break;
                    case 3:
                        b4 b4Var3 = this.f25800b;
                        b4Var3.T = false;
                        b4Var3.a(true, true);
                        b4Var3.f24095a.c(0.0d);
                        b4Var3.S = false;
                        break;
                    default:
                        this.f25800b.a(true, true);
                        break;
                }
            }
        };
        this.P = org.telegram.ui.ActionBar.g6.f23311rg;
        final int i13 = 2;
        this.Q = new Runnable(this) {

            public final b4 f25800b;

            {
                this.f25800b = this;
            }

            @Override
            public final void run() {
                int i14;
                switch (i13) {
                    case 0:
                        b4 b4Var = this.f25800b;
                        b4Var.f24101n.P(0, null);
                        oi0 oi0Var = b4Var.h;
                        oi0Var.P(0, null);
                        b4Var.f24100f.setAnimation(oi0Var);
                        break;
                    case 1:
                        b4 b4Var2 = this.f25800b;
                        ri0 ri0Var = b4Var2.f24100f;
                        oi0 oi0Var2 = b4Var2.f24101n;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (iNextInt < 32) {
                            i14 = 0;
                        } else {
                            i14 = 240;
                            if (iNextInt < 64) {
                                i15 = 240;
                                i14 = 120;
                            } else {
                                i15 = 420;
                                if (iNextInt >= 97) {
                                    i14 = 540;
                                    if (iNextInt == 98) {
                                        i15 = 540;
                                        i14 = 420;
                                    } else {
                                        i15 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i15);
                        oi0Var2.P(i15 - 1, b4Var2.N);
                        ri0Var.setAnimation(oi0Var2);
                        oi0Var2.K(i14);
                        ri0Var.d();
                        break;
                    case 2:
                        this.f25800b.a(true, true);
                        break;
                    case 3:
                        b4 b4Var3 = this.f25800b;
                        b4Var3.T = false;
                        b4Var3.a(true, true);
                        b4Var3.f24095a.c(0.0d);
                        b4Var3.S = false;
                        break;
                    default:
                        this.f25800b.a(true, true);
                        break;
                }
            }
        };
        final int i14 = 3;
        this.R = new Runnable(this) {

            public final b4 f25800b;

            {
                this.f25800b = this;
            }

            @Override
            public final void run() {
                int i15;
                switch (i14) {
                    case 0:
                        b4 b4Var = this.f25800b;
                        b4Var.f24101n.P(0, null);
                        oi0 oi0Var = b4Var.h;
                        oi0Var.P(0, null);
                        b4Var.f24100f.setAnimation(oi0Var);
                        break;
                    case 1:
                        b4 b4Var2 = this.f25800b;
                        ri0 ri0Var = b4Var2.f24100f;
                        oi0 oi0Var2 = b4Var2.f24101n;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i16 = 120;
                        if (iNextInt < 32) {
                            i15 = 0;
                        } else {
                            i15 = 240;
                            if (iNextInt < 64) {
                                i16 = 240;
                                i15 = 120;
                            } else {
                                i16 = 420;
                                if (iNextInt >= 97) {
                                    i15 = 540;
                                    if (iNextInt == 98) {
                                        i16 = 540;
                                        i15 = 420;
                                    } else {
                                        i16 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i16);
                        oi0Var2.P(i16 - 1, b4Var2.N);
                        ri0Var.setAnimation(oi0Var2);
                        oi0Var2.K(i15);
                        ri0Var.d();
                        break;
                    case 2:
                        this.f25800b.a(true, true);
                        break;
                    case 3:
                        b4 b4Var3 = this.f25800b;
                        b4Var3.T = false;
                        b4Var3.a(true, true);
                        b4Var3.f24095a.c(0.0d);
                        b4Var3.S = false;
                        break;
                    default:
                        this.f25800b.a(true, true);
                        break;
                }
            }
        };
        final int i15 = 4;
        new Runnable(this) {

            public final b4 f25800b;

            {
                this.f25800b = this;
            }

            @Override
            public final void run() {
                int i16;
                switch (i15) {
                    case 0:
                        b4 b4Var = this.f25800b;
                        b4Var.f24101n.P(0, null);
                        oi0 oi0Var = b4Var.h;
                        oi0Var.P(0, null);
                        b4Var.f24100f.setAnimation(oi0Var);
                        break;
                    case 1:
                        b4 b4Var2 = this.f25800b;
                        ri0 ri0Var = b4Var2.f24100f;
                        oi0 oi0Var2 = b4Var2.f24101n;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i17 = 120;
                        if (iNextInt < 32) {
                            i16 = 0;
                        } else {
                            i16 = 240;
                            if (iNextInt < 64) {
                                i17 = 240;
                                i16 = 120;
                            } else {
                                i17 = 420;
                                if (iNextInt >= 97) {
                                    i16 = 540;
                                    if (iNextInt == 98) {
                                        i17 = 540;
                                        i16 = 420;
                                    } else {
                                        i17 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i17);
                        oi0Var2.P(i17 - 1, b4Var2.N);
                        ri0Var.setAnimation(oi0Var2);
                        oi0Var2.K(i16);
                        ri0Var.d();
                        break;
                    case 2:
                        this.f25800b.a(true, true);
                        break;
                    case 3:
                        b4 b4Var3 = this.f25800b;
                        b4Var3.T = false;
                        b4Var3.a(true, true);
                        b4Var3.f24095a.c(0.0d);
                        b4Var3.S = false;
                        break;
                    default:
                        this.f25800b.a(true, true);
                        break;
                }
            }
        };
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false));
        this.f24106y = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        setClipChildren(false);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24097b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
        w3 w3Var = new w3(this, context);
        this.f24105x = w3Var;
        w3Var.setSize(AndroidUtilities.dp(26.0f));
        w3Var.setProgressColor(-1);
        w3Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        addView(w3Var, h7.z5.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 11.0f, 6.0f, z11 ? 11.0f : 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24098c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 10.0f, z12 ? 67.0f : 54.0f, 0.0f));
        this.f24102r = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        this.f24103s = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.V = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), PorterDuff.Mode.MULTIPLY));
        int i16 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
            if (i16 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i16] = new x3(this, context, i16);
            this.d[i16].setTextSize(15);
            this.d[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i16 == 4) {
                this.d[i16].setBuildFullLayout(true);
                this.d[i16].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311rg, false));
                View view = this.d[i16];
                boolean z13 = LocaleController.isRTL;
                addView(view, h7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 54.0f : 67.0f, 32.0f, z13 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i16 == 0) {
                    this.d[i16].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false));
                    this.d[i16].k(LocaleController.getString(R.string.Listening));
                } else if (i16 == 1) {
                    this.d[i16].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false));
                    this.d[i16].k(LocaleController.getString(R.string.Speaking));
                    this.d[i16].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i16 == 2) {
                    this.d[i16].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23330sg, false));
                    this.d[i16].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i16 == 3) {
                    this.d[i16].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false));
                    this.d[i16].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                View view2 = this.d[i16];
                boolean z14 = LocaleController.isRTL;
                addView(view2, h7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 54.0f : 67.0f, 32.0f, z14 ? 67.0f : 54.0f, 0.0f));
            }
            i16++;
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24099e = h5Var2;
        h5Var2.setMaxLines(3);
        h5Var2.setTextSize(15);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311rg, false));
        h5Var2.setVisibility(8);
        addView(h5Var2, h7.z5.d(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        oi0 oi0Var = new oi0(R.raw.voice_outlined2, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = oi0Var;
        this.f24101n = new oi0(R.raw.hand_1, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        ri0 ri0Var = new ri0(context);
        this.f24100f = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setAnimation(oi0Var);
        z zVarF0 = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, this.P, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(zVarF0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        ri0Var.setBackground(zVarF0);
        ri0Var.setImportantForAccessibility(2);
        addView(ri0Var, h7.z5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        ri0Var.setOnClickListener(new a(this, i10));
        this.f24095a = new z3(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean z10, boolean z11) {
        char c10;
        int iW0;
        int i10;
        boolean z12;
        ArrayList arrayList;
        char c11;
        float f10;
        float fDp;
        z3 z3Var;
        oi0 oi0Var;
        int i11;
        boolean zN;
        AnimatorSet animatorSet;
        float f11;
        int i12;
        if (this.A == null) {
            return;
        }
        char c12 = 1;
        boolean z13 = (c() && this.B.raise_hand_rating == 0) ? false : true;
        ri0 ri0Var = this.f24100f;
        ri0Var.setEnabled(z13);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
        boolean z14 = jElapsedRealtime - groupCallParticipant.lastVoiceUpdateTime < 500 ? groupCallParticipant.hasVoiceDelayed : groupCallParticipant.hasVoice;
        if (!z11) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.B.lastSpeakTime;
            boolean z15 = jUptimeMillis < 500;
            if (!this.T || !z15 || z14) {
                this.T = z15;
                boolean z16 = this.S;
                v3 v3Var = this.R;
                if (z16) {
                    AndroidUtilities.cancelRunOnUIThread(v3Var);
                    this.S = false;
                }
                if (this.T) {
                    AndroidUtilities.runOnUIThread(v3Var, 500 - jUptimeMillis);
                    this.S = true;
                }
            }
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.A.participants.f(MessageObject.getPeerId(this.B.peer));
        if (groupCallParticipant2 != null) {
            this.B = groupCallParticipant2;
        }
        boolean z17 = this.B.muted_by_you && !c();
        boolean z18 = !c() ? (!this.B.muted || (this.T && z14)) && !z17 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.T && z14);
        if (z18) {
            boolean z19 = this.B.can_self_unmute;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.B.about);
        this.K = false;
        v3 v3Var2 = this.Q;
        AndroidUtilities.cancelRunOnUIThread(v3Var2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.B;
        int i13 = 2;
        if ((!groupCallParticipant3.muted || this.T) && !z17) {
            c10 = 4;
            if (this.T && z14) {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false);
                z12 = false;
                i10 = 1;
            } else {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.P, false);
                i10 = !zIsEmpty ? 4 : 0;
                this.K = true;
                z12 = false;
            }
        } else {
            boolean z20 = groupCallParticipant3.can_self_unmute;
            if (!z20 || z17) {
                boolean z21 = (z20 || groupCallParticipant3.raise_hand_rating == 0) ? false : true;
                if (z21) {
                    int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    c10 = 4;
                    long j10 = this.B.lastRaiseHandDate;
                    long j11 = jElapsedRealtime2 - j10;
                    if (j10 == 0 || j11 > 5000) {
                        if (z17) {
                            i12 = 2;
                        } else {
                            i12 = !zIsEmpty ? 4 : 0;
                        }
                        i10 = i12;
                    } else {
                        AndroidUtilities.runOnUIThread(v3Var2, 5000 - j11);
                        i10 = 3;
                    }
                    z12 = z21;
                    iW0 = iW1;
                } else {
                    c10 = 4;
                    int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23330sg, false);
                    if (z17) {
                        i10 = 2;
                    } else {
                        i10 = !zIsEmpty ? 4 : 0;
                    }
                    z12 = z21;
                    iW0 = iW2;
                }
            } else {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.P, false);
                this.K = true;
                i10 = !zIsEmpty ? 4 : 0;
                z12 = false;
                c10 = 4;
            }
        }
        boolean zC = c();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!zC) {
            h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
        }
        boolean zC2 = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.f24099e;
        if (zC2) {
            if (zIsEmpty && !this.U) {
                if (this.C != null) {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrBio));
                } else {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhotoOrDescription));
                }
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            } else if (zIsEmpty) {
                if (this.C != null) {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddBio));
                } else {
                    h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddDescription));
                }
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            } else if (this.U) {
                h5VarArr[c10].k(LocaleController.getString(R.string.ThisIsYou));
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false));
            } else {
                h5VarArr[c10].k(LocaleController.getString(R.string.TapToAddPhoto));
                h5VarArr[c10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.P, false));
            }
            if (zIsEmpty) {
                h5Var.l(h5VarArr[i10].getText(), false);
                h5Var.setTextColor(h5VarArr[i10].getTextColor());
            } else {
                h5Var.l(AndroidUtilities.replaceNewLines(this.B.about), false);
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311rg, false));
            }
        } else if (zIsEmpty) {
            h5VarArr[c10].k("");
            h5Var.l("", false);
        } else {
            h5VarArr[c10].k(AndroidUtilities.replaceNewLines(this.B.about));
            h5Var.l("", false);
        }
        AnimatorSet animatorSet2 = this.W;
        boolean z22 = (animatorSet2 == null || (i10 == this.L && this.H == iW0)) ? false : true;
        if ((!z10 || z22) && animatorSet2 != null) {
            animatorSet2.cancel();
            this.W = null;
        }
        if (z10 && this.H == iW0 && !z22) {
            arrayList = null;
        } else if (z10) {
            arrayList = new ArrayList();
            int i14 = this.H;
            this.H = iW0;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new lh.t4(this, i14, iW0, c12 == true ? 1 : 0));
            arrayList.add(valueAnimatorOfFloat);
        } else {
            this.H = iW0;
            ri0Var.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.g6.B1(ri0Var.getDrawable(), iW0 & 620756991, true);
            arrayList = null;
        }
        if (i10 == 1) {
            int participantVolume = ChatObject.getParticipantVolume(this.B);
            int i15 = participantVolume / 100;
            if (i15 != 100) {
                c11 = 0;
                h5VarArr[1].setLeftDrawable(this.V);
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
                int i16 = R.string.SpeakingWithVolume;
                if (participantVolume < 100) {
                    i15 = 1;
                }
                h5Var2.k(LocaleController.formatString("SpeakingWithVolume", i16, Integer.valueOf(i15)));
            } else {
                c11 = 0;
                h5VarArr[1].setLeftDrawable((Drawable) null);
                h5VarArr[1].k(LocaleController.getString(R.string.Speaking));
            }
        } else {
            c11 = 0;
        }
        if (!c()) {
            if (!z10 || i10 != this.L || z22) {
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Property property = View.ALPHA;
                    Property property2 = View.TRANSLATION_Y;
                    if (i10 == 0) {
                        int i17 = 0;
                        while (i17 < h5VarArr.length) {
                            org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i17];
                            float[] fArr = new float[1];
                            fArr[c11] = i17 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f);
                            arrayList.add(ObjectAnimator.ofFloat(h5Var3, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, fArr));
                            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i17];
                            float[] fArr2 = new float[1];
                            fArr2[c11] = i17 == i10 ? 1.0f : 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(h5Var4, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr2));
                            i17++;
                        }
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        int i18 = 0;
                        while (i18 < h5VarArr.length) {
                            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i18];
                            if (i18 == i10) {
                                fDp = 0.0f;
                            } else {
                                fDp = AndroidUtilities.dp(i18 == 0 ? 2.0f : -2.0f);
                            }
                            float[] fArr3 = new float[1];
                            fArr3[c11] = fDp;
                            arrayList.add(ObjectAnimator.ofFloat(h5Var5, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, fArr3));
                            org.telegram.ui.ActionBar.h5 h5Var6 = h5VarArr[i18];
                            float[] fArr4 = new float[1];
                            fArr4[c11] = i18 == i10 ? 1.0f : 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(h5Var6, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr4));
                            i18++;
                        }
                    }
                } else {
                    f10 = 0.0f;
                    b(i10);
                }
                this.L = i10;
            }
            z3Var = this.f24095a;
            z3Var.f26028i = i10;
            if (!z10) {
                if (i10 != 1) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                z3Var.f26029j = f11;
            }
            if (arrayList != null) {
                animatorSet = this.W;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.W = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.W = animatorSet3;
                animatorSet3.addListener(new nh.n2(this, i10, i13));
                this.W.playTogether(arrayList);
                this.W.setDuration(180L);
                this.W.start();
            }
            if (z10 || this.F != z18 || this.G != z12) {
                oi0Var = this.h;
                if (z12) {
                    zN = oi0Var.N(84);
                    if (z10) {
                        oi0Var.P(83, this.O);
                    } else {
                        oi0Var.P(0, null);
                    }
                } else {
                    ri0Var.setAnimation(oi0Var);
                    oi0Var.P(0, null);
                    if (z18 || !this.G) {
                        if (z18) {
                            i11 = 64;
                        } else {
                            i11 = 42;
                        }
                        zN = oi0Var.N(i11);
                    } else {
                        zN = oi0Var.N(21);
                    }
                }
                if (z10) {
                    if (zN) {
                        if (i10 == 3) {
                            oi0Var.K(63);
                        } else if (!z18 && this.G && !z12) {
                            oi0Var.K(0);
                        } else if (z18) {
                            oi0Var.K(43);
                        } else {
                            oi0Var.K(21);
                        }
                    }
                    ri0Var.d();
                } else {
                    oi0Var.L(oi0Var.f31314f - 1, false, true);
                    ri0Var.invalidate();
                }
                this.F = z18;
                this.G = z12;
            }
            if (!this.T) {
                z3Var.c(0.0d);
            }
            z3Var.e(this, !this.T && this.f24096a0 == f10);
        }
        b(4);
        f10 = 0.0f;
        z3Var = this.f24095a;
        z3Var.f26028i = i10;
        if (!z10) {
            if (i10 != 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            z3Var.f26029j = f11;
        }
        if (arrayList != null) {
            animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W = null;
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            this.W = animatorSet4;
            animatorSet4.addListener(new nh.n2(this, i10, i13));
            this.W.playTogether(arrayList);
            this.W.setDuration(180L);
            this.W.start();
        }
        if (z10) {
            oi0Var = this.h;
            if (z12) {
                zN = oi0Var.N(84);
                if (z10) {
                    oi0Var.P(83, this.O);
                } else {
                    oi0Var.P(0, null);
                }
            } else {
                ri0Var.setAnimation(oi0Var);
                oi0Var.P(0, null);
                if (z18) {
                    if (z18) {
                        i11 = 64;
                    } else {
                        i11 = 42;
                    }
                    zN = oi0Var.N(i11);
                } else {
                    if (z18) {
                        i11 = 64;
                    } else {
                        i11 = 42;
                    }
                    zN = oi0Var.N(i11);
                }
            }
            if (z10) {
                if (zN) {
                    if (i10 == 3) {
                        oi0Var.K(63);
                    } else if (!z18) {
                        if (z18) {
                            oi0Var.K(43);
                        } else {
                            oi0Var.K(21);
                        }
                    } else if (z18) {
                        oi0Var.K(43);
                    } else {
                        oi0Var.K(21);
                    }
                }
                ri0Var.d();
            } else {
                oi0Var.L(oi0Var.f31314f - 1, false, true);
                ri0Var.invalidate();
            }
            this.F = z18;
            this.G = z12;
        } else {
            oi0Var = this.h;
            if (z12) {
                zN = oi0Var.N(84);
                if (z10) {
                    oi0Var.P(83, this.O);
                } else {
                    oi0Var.P(0, null);
                }
            } else {
                ri0Var.setAnimation(oi0Var);
                oi0Var.P(0, null);
                if (z18) {
                    if (z18) {
                        i11 = 64;
                    } else {
                        i11 = 42;
                    }
                    zN = oi0Var.N(i11);
                } else {
                    if (z18) {
                        i11 = 64;
                    } else {
                        i11 = 42;
                    }
                    zN = oi0Var.N(i11);
                }
            }
            if (z10) {
                if (zN) {
                    if (i10 == 3) {
                        oi0Var.K(63);
                    } else if (!z18) {
                        if (z18) {
                            oi0Var.K(43);
                        } else {
                            oi0Var.K(21);
                        }
                    } else if (z18) {
                        oi0Var.K(43);
                    } else {
                        oi0Var.K(21);
                    }
                }
                ri0Var.d();
            } else {
                oi0Var.L(oi0Var.f31314f - 1, false, true);
                ri0Var.invalidate();
            }
            this.F = z18;
            this.G = z12;
        }
        if (!this.T) {
            z3Var.c(0.0d);
        }
        z3Var.e(this, !this.T && this.f24096a0 == f10);
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float fDp;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            h5VarArr = this.d;
            if (i12 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i12].setImportantForAccessibility(i12 == i10 ? 1 : 2);
            i12++;
        }
        if (i10 == 0) {
            while (i11 < h5VarArr.length) {
                h5VarArr[i11].setTranslationY(i11 == i10 ? 0.0f : AndroidUtilities.dp(-2.0f));
                h5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
                i11++;
            }
            return;
        }
        while (i11 < h5VarArr.length) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i11];
            if (i11 == i10) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(i11 == 0 ? 2.0f : -2.0f);
            }
            h5Var.setTranslationY(fDp);
            h5VarArr[i11].setAlpha(i11 == i10 ? 1.0f : 0.0f);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.M;
        if (j10 > 0) {
            TLRPC.User user = this.C;
            return user != null && user.f22527id == j10;
        }
        TLRPC.Chat chat = this.D;
        return chat != null && chat.f22380id == (-j10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.J) {
            Paint paint = this.E;
            int alpha = paint.getAlpha();
            float f10 = this.f24096a0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            float fDp = LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f);
            canvas2 = canvas;
            canvas2.drawLine(fDp, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.n9 n9Var = this.f24097b;
        int measuredWidth = (n9Var.getMeasuredWidth() / 2) + n9Var.getLeft();
        int measuredHeight = (n9Var.getMeasuredHeight() / 2) + n9Var.getTop();
        z3 z3Var = this.f24095a;
        z3Var.f();
        if (this.f24096a0 == 0.0f) {
            z3Var.a(canvas2, measuredWidth, measuredHeight, this);
        }
        n9Var.setScaleX(z3Var.b());
        n9Var.setScaleY(z3Var.b());
        float fB = z3Var.b();
        w3 w3Var = this.f24105x;
        w3Var.setScaleX(fB);
        w3Var.setScaleY(z3Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long botVerificationIcon;
        this.A = call;
        this.I = accountInstance;
        this.M = j10;
        this.B = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24098c;
        org.telegram.ui.Components.n9 n9Var = this.f24097b;
        org.telegram.ui.Components.y8 y8Var = this.f24106y;
        org.telegram.ui.Components.i5 i5Var = this.f24103s;
        if (peerId > 0) {
            this.C = this.I.getMessagesController().getUser(Long.valueOf(peerId));
            this.D = null;
            y8Var.m(this.I.getCurrentAccount(), this.C);
            h5Var.l(UserObject.getUserName(this.C), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.C);
            TLRPC.User user = this.C;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable a4Var = this.v;
                if (a4Var == null) {
                    a4Var = new a4(getContext());
                }
                this.v = a4Var;
                i5Var.g(a4Var, z10);
            } else if (user == null || DialogObject.getEmojiStatusDocumentId(user.emoji_status) == 0) {
                TLRPC.User user2 = this.C;
                if (user2 == null || !user2.premium) {
                    i5Var.g(null, z10);
                } else {
                    if (this.f24104w == null) {
                        this.f24104w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.f24104w = new y3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f24104w);
                    }
                    i5Var.g(this.f24104w, z10);
                }
            } else {
                i5Var.j(DialogObject.getEmojiStatusDocumentId(this.C.emoji_status), z10);
            }
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
            h5Var.i(i5Var);
            n9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.U = true;
                n9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", y8Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.C, 1);
                this.U = forUser != null;
                n9Var.h(forUser, "50_50", y8Var, this.C);
            }
        } else {
            j11 = 0;
            this.D = this.I.getMessagesController().getChat(Long.valueOf(-peerId));
            this.C = null;
            y8Var.k(this.I.getCurrentAccount(), this.D);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.Chat chat = this.D;
            if (chat != null) {
                h5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.D;
                if (chat2.verified) {
                    Drawable a4Var2 = this.v;
                    if (a4Var2 == null) {
                        a4Var2 = new a4(getContext());
                    }
                    this.v = a4Var2;
                    i5Var.g(a4Var2, z10);
                } else if (chat2 == null || DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) == 0) {
                    i5Var.g(null, z10);
                } else {
                    i5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z10);
                }
                n9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.U = true;
                    n9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", y8Var, null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.D, 1);
                    this.U = forChat != null;
                    n9Var.h(forChat, "50_50", y8Var, this.D);
                }
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24102r;
        if (botVerificationIcon != j11) {
            i5Var2.j(botVerificationIcon, z10);
            h5Var.setLeftDrawable(i5Var2);
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
        } else {
            i5Var2.g(null, z10);
            h5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.P != i10) {
            if (this.K) {
                this.H = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            }
            this.P = i10;
        }
        if (this.K) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            ri0 ri0Var = this.f24100f;
            ri0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.g6.B1(ri0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.n9 getAvatarImageView() {
        return this.f24097b;
    }

    public z3 getAvatarWavesDrawable() {
        return this.f24095a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24099e;
        if (TextUtils.isEmpty(h5Var.getText()) || !this.U) {
            h5Var = this.d[4];
        }
        if (h5Var.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return AndroidUtilities.dp(8.0f) + h5Var.getTop() + h5Var.getTextHeight();
    }

    public CharSequence getName() {
        return this.f24098c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.B;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return MessageObject.getPeerId(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.i5 i5Var = this.f24103s;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24102r;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
            this.S = false;
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.i5 i5Var = this.f24103s;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24102r;
        if (i5Var2 != null) {
            i5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.B;
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString((!groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? R.string.VoipMute : R.string.VoipUnmute)));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (z10) {
            h5VarArr[4].setTranslationY(0.0f);
        } else {
            h5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        z3 z3Var = this.f24095a;
        if (d <= 1.5d) {
            z3Var.c(0.0d);
            return;
        }
        boolean z10 = this.S;
        v3 v3Var = this.R;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(v3Var);
        }
        if (!this.T) {
            this.T = true;
            a(true, false);
        }
        z3Var.c(d);
        AndroidUtilities.runOnUIThread(v3Var, 500L);
        this.S = true;
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.n9 n9Var = this.f24097b;
        if (n9Var.getImageReceiver().getVisible() != z10) {
            n9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        this.f24096a0 = f10;
        this.f24098c.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
        boolean zC = c();
        org.telegram.ui.ActionBar.h5 h5Var = this.f24099e;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (!zC || f10 <= 0.0f) {
            h5Var.setVisibility(8);
            for (int i10 = 0; i10 < h5VarArr.length; i10++) {
                if (TextUtils.isEmpty(h5VarArr[4].getText()) || h5VarArr[4].getLineCount() <= 1) {
                    h5VarArr[i10].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f10);
                    h5VarArr[i10].h(0, 0);
                } else {
                    h5VarArr[i10].h(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    h5VarArr[i10].setFullAlpha(f10);
                    h5VarArr[i10].setTranslationX(0.0f);
                    h5VarArr[i10].invalidate();
                }
            }
        } else {
            float f11 = 1.0f - f10;
            h5Var.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f11);
            h5Var.setVisibility(0);
            h5Var.setAlpha(f10);
            h5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[4];
            boolean z10 = LocaleController.isRTL;
            int iDp = AndroidUtilities.dp(53.0f);
            if (!z10) {
                iDp = -iDp;
            }
            h5Var2.setTranslationX(iDp * f10);
        }
        this.f24097b.setAlpha(f10 == 0.0f ? 1.0f : 0.0f);
        this.f24095a.e(this, this.T && f10 == 0.0f);
        float f12 = 1.0f - f10;
        ri0 ri0Var = this.f24100f;
        ri0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        ri0Var.setScaleX(f13);
        ri0Var.setScaleY(f13);
        invalidate();
    }

    public void d(b4 b4Var) {
    }
}
