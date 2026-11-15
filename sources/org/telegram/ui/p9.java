package org.telegram.ui;

import android.animation.ValueAnimator;
import android.appwidget.AppWidgetManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class p9 extends org.telegram.ui.ActionBar.j {
    public final int f50160a;
    public final Object f50161b;

    public p9(Object obj, int i7) {
        this.f50160a = i7;
        this.f50161b = obj;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        Runnable runnable;
        int i12;
        org.telegram.ui.ActionBar.w4 w4Var;
        hw hwVar;
        int i13;
        long j3;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        int i15 = this.f50160a;
        Object obj = this.f50161b;
        switch (i15) {
            case 0:
                if (i7 == -1) {
                    ((t9) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    return;
                } else if (i7 == 1 && y9Var.f53478a.getText().length() != 0) {
                    y9.Z(y9Var);
                    y9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                la laVar = (la) obj;
                if (i7 == -1) {
                    laVar.finishFragment();
                    return;
                } else if (i7 == 1) {
                    la.d0(laVar);
                    la.e0(laVar);
                    return;
                } else {
                    return;
                }
            case 3:
                if (i7 == -1) {
                    ((lb) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                qc qcVar = (qc) obj;
                if (i7 == -1) {
                    if (qcVar.f50545b >= qcVar.Z0() && qcVar.X0()) {
                        qcVar.c1();
                        return;
                    } else {
                        qcVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    FrameLayout frameLayout = (FrameLayout) qcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    qcVar.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    qcVar.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    qcVar.M.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    bc bcVar = new bc(qcVar, qcVar.getParentActivity(), canvas, (qcVar.M.getMeasuredWidth() / 2.0f) + f10, (qcVar.M.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23606n, paint, createBitmap, paint2, f10, f11, 0);
                    qcVar.f50561n0 = bcVar;
                    bcVar.setOnTouchListener(new gi.a(2));
                    qcVar.f50562o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qcVar.f50563p0 = ofFloat;
                    ofFloat.addUpdateListener(new hi.ba(qcVar, 1));
                    qcVar.f50563p0.addListener(new org.telegram.ui.Cells.w9(qcVar, 4));
                    qcVar.f50563p0.setDuration(400L);
                    qcVar.f50563p0.setInterpolator(org.telegram.ui.Components.qs.f38757e);
                    qcVar.f50563p0.start();
                    frameLayout.addView(qcVar.f50561n0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new wb(qcVar, 0));
                    return;
                } else {
                    return;
                }
            case 5:
                ad adVar = (ad) obj;
                long j10 = adVar.f45010k0;
                rc rcVar = adVar.f45027x0;
                if (i7 == -1) {
                    if (adVar.f45021t0) {
                        ad.d0(adVar);
                        return;
                    } else {
                        adVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1) {
                    int i16 = adVar.f45009j0;
                    if (i16 == 0) {
                        if (adVar.getParentActivity() != null) {
                            if (adVar.f45021t0) {
                                ad.d0(adVar);
                                return;
                            } else if (adVar.d.f39053a.length() == 0) {
                                Vibrator vibrator = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.E3(adVar.d);
                                return;
                            } else {
                                adVar.f45021t0 = true;
                                org.telegram.messenger.g0.i3(rcVar, 200L);
                                if (!adVar.f45026x.g()) {
                                    i11 = ((org.telegram.ui.ActionBar.e2) adVar).currentAccount;
                                    adVar.f45022u0 = Integer.valueOf(org.telegram.messenger.np.s1(i11).U(adVar.d.getText().toString(), new ArrayList(), adVar.f45028y.getText().toString(), 2, false, null, null, -1, adVar));
                                    return;
                                }
                                adVar.f45020s0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i16 == 1) {
                        if (!adVar.f45000c0) {
                            if (adVar.f45028y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
                                String M0 = org.telegram.messenger.hd.M0(2131752316, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
                                adVar.showDialog(t1Var);
                                return;
                            } else if (!adVar.f44998b0) {
                                Vibrator vibrator2 = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                org.telegram.messenger.g0.E3(adVar.W);
                                return;
                            } else {
                                org.telegram.messenger.g0.i3(rcVar, 200L);
                                i10 = ((org.telegram.ui.ActionBar.e2) adVar).currentAccount;
                                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
                                long j11 = adVar.f45010k0;
                                String str = adVar.Z;
                                Runnable runnable2 = new Runnable(this) {
                                    public final p9 f52188b;

                                    {
                                        this.f52188b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f52188b.f50161b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.s10 s10Var = adVar2.f45023v0;
                                                if (s10Var != null) {
                                                    s10Var.a(adVar2, Long.valueOf(adVar2.f45010k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f52188b.f50161b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.s10 s10Var2 = adVar3.f45023v0;
                                                if (s10Var2 != null) {
                                                    s10Var2.a(adVar3, Long.valueOf(adVar3.f45010k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final p9 f52188b;

                                    {
                                        this.f52188b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f52188b.f50161b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.s10 s10Var = adVar2.f45023v0;
                                                if (s10Var != null) {
                                                    s10Var.a(adVar2, Long.valueOf(adVar2.f45010k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f52188b.f50161b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.s10 s10Var2 = adVar3.f45023v0;
                                                if (s10Var2 != null) {
                                                    s10Var2.a(adVar3, Long.valueOf(adVar3.f45010k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s12.h1(j11);
                                tL_channels_updateUsername.username = str;
                                s12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.jm(s12, j11, str, runnable2, adVar, tL_channels_updateUsername, runnable3), 64);
                            }
                        } else {
                            org.telegram.messenger.s10 s10Var = adVar.f45023v0;
                            if (s10Var != null) {
                                s10Var.a(adVar, Long.valueOf(j10));
                            }
                        }
                        if (adVar.f45023v0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j10);
                            bundle.putInt("chatType", 2);
                            adVar.presentFragment(new w40(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                qn qnVar = (qn) obj;
                if (i7 == -1) {
                    if (qnVar.j0(true)) {
                        qnVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    qnVar.o0();
                    return;
                } else {
                    return;
                }
            case 7:
                if (i7 == -1) {
                    ((to) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i7 == -1) {
                    ((ap) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                mp mpVar = (mp) obj;
                if (i7 == -1) {
                    if (mpVar.r0(true)) {
                        mpVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    mpVar.w0(true);
                    return;
                } else {
                    return;
                }
            case 10:
                qq qqVar = (qq) obj;
                if (i7 == -1) {
                    if (qqVar.l0(true)) {
                        qqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    qqVar.z0();
                    return;
                } else {
                    return;
                }
            case 11:
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) obj;
                if (i7 == -1) {
                    y7Var.dismiss();
                    return;
                } else {
                    y7Var.P0(i7);
                    return;
                }
            case 12:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.ja) obj).dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj;
                if (i7 == -1) {
                    if (!kiVar.f36497w2.k()) {
                        kiVar.dismiss();
                        return;
                    }
                    return;
                }
                kiVar.f36497w2.w(i7);
                return;
            case 14:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.u20) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) obj;
                if (i7 == -1) {
                    if (!y80Var.S.V(true)) {
                        y80Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 10) {
                    org.telegram.ui.Components.x80 x80Var = y80Var.S;
                    x80Var.r1(x80Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.ud0) obj).f40005r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.te0) obj).dismiss();
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.Components.po0) obj).onBackPressed();
                return;
            case 19:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.r41) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.voip.x0) obj).b(false, false);
                    return;
                }
                return;
            case 21:
                if (i7 == -1) {
                    ((yb1) obj).a(false, false);
                    return;
                }
                return;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    w4Var = ((org.telegram.ui.ActionBar.e2) contactsActivity).simpleActionBar;
                    if (w4Var.v()) {
                        contactsActivity.m0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i7 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.f42533a0;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    if (m10 == 1) {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131751550, null);
                        t1Var2.U = org.telegram.messenger.hd.M0(2131751551, null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        t1Var2.U = org.telegram.messenger.hd.M0(2131751549, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751598, null), new sr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.Components.rb0(21));
                    t1Var2.show();
                    t1Var2.i();
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.gz.L0 = !org.telegram.messenger.gz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.gz.L0);
                    edit.apply();
                    contactsActivity.f42552r = org.telegram.messenger.gz.L0;
                    org.telegram.ui.ActionBar.d5 d5Var = contactsActivity.f42549n;
                    if (d5Var != null) {
                        org.telegram.ui.Components.fh0 iconView = d5Var.getIconView();
                        if (contactsActivity.f42552r) {
                            i12 = 2131232103;
                        } else {
                            i12 = 2131232102;
                        }
                        org.telegram.messenger.g0.Q3(iconView, i12);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f42542f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f42532a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.er.f34420g).withEndAction(new rr(contactsActivity, 0));
                    contactsActivity.f42542f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i7 == -1) {
                    ((ts) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i7 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i7 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i7 == -1) {
                    ((nt) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i7 == -1) {
                    ((cu) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                yw ywVar = (yw) obj;
                ArrayList arrayList = ywVar.K2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (hwVar = ywVar.D0) != null) {
                    HashMap hashMap = hwVar.C0;
                    yw ywVar2 = hwVar.M0;
                    if (i7 == 202) {
                        if (ywVar2 != null && ywVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ywVar2.getParentActivity());
                            String G = org.telegram.messenger.hd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                            t1Var3.S = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.hd.M0(2131746319, null));
                            t1Var3.U = spannableStringBuilder;
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.Components.rb0(5));
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Components.f1(20, hwVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i7 == 203) {
                        if (hwVar.N()) {
                            ywVar2.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) ywVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i7 == 200) {
                        if (hashMap.size() == 1) {
                            hwVar.y((org.telegram.messenger.gj) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i7 == 201) {
                        yw ywVar3 = new yw(org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true));
                        ywVar3.E2 = new org.telegram.ui.Components.gx(hwVar, 18);
                        ywVar2.presentFragment(ywVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i7 == -1) {
                    uv uvVar = ywVar.H3;
                    if (uvVar != null && uvVar.c()) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                        if (kVar2.x()) {
                            hw hwVar2 = ywVar.D0;
                            if (hwVar2 != null && hwVar2.getVisibility() == 0) {
                                hw hwVar3 = ywVar.D0;
                                if (hwVar3.B0) {
                                    hwVar3.Q(false);
                                    return;
                                }
                            }
                            ywVar.n4(true);
                            return;
                        }
                        ywVar.H3.a();
                        hw hwVar4 = ywVar.D0;
                        if (hwVar4 != null) {
                            hwVar4.R();
                            return;
                        }
                        return;
                    }
                    ow owVar = ywVar.A0;
                    if (owVar == null || !owVar.f35785n) {
                        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                        if (kVar.x()) {
                            hw hwVar5 = ywVar.D0;
                            if (hwVar5 != null && hwVar5.getVisibility() == 0) {
                                hw hwVar6 = ywVar.D0;
                                if (hwVar6.B0) {
                                    hwVar6.Q(false);
                                    return;
                                }
                            }
                            ywVar.n4(true);
                            return;
                        } else if (ywVar.f53677n2 || ywVar.Y2 != 0 || ywVar.f53613a3 != 0) {
                            ywVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    owVar.setIsEditing(false);
                    ywVar.U4(false);
                    return;
                } else if (i7 == 1) {
                    if (ywVar.getParentActivity() != null) {
                        org.telegram.messenger.gz.f23995x = true;
                        org.telegram.messenger.gz.y();
                        int[] iArr2 = new int[2];
                        ywVar.f53643g0.getLocationInWindow(iArr2);
                        ((LaunchActivity) ywVar.getParentActivity()).K0(false, true, (ywVar.f53643g0.getMeasuredWidth() / 2) + iArr2[0], (ywVar.f53643g0.getMeasuredHeight() / 2) + iArr2[1], new bh(this, 22));
                        ywVar.getNotificationsController().Y();
                        ywVar.K3();
                        return;
                    }
                    return;
                } else if (i7 == 3) {
                    ywVar.a5(true, true, true, false);
                    ywVar.Z.b(true);
                    return;
                } else if (i7 == 11) {
                    ywVar.B4(ywVar.F1);
                    return;
                } else if (i7 == 109) {
                    org.telegram.ui.Components.jz jzVar = new org.telegram.ui.Components.jz(ywVar, arrayList);
                    jzVar.f36202u1 = new zr(this, 7);
                    ywVar.showDialog(jzVar);
                    return;
                } else if (i7 == 110) {
                    org.telegram.messenger.so soVar = (org.telegram.messenger.so) ywVar.getMessagesController().T0().get(ywVar.f53638f0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.jz.J0(ywVar, soVar, arrayList, false, false);
                    if (soVar != null) {
                        i13 = soVar.f26558i.size();
                    } else {
                        i13 = 0;
                    }
                    if (J0.size() + i13 > 100) {
                        ywVar.showDialog(org.telegram.ui.Components.t4.K(ywVar.getParentActivity(), org.telegram.messenger.hd.M0(2131750810, null), org.telegram.messenger.hd.M0(2131750811, null)).f28392a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        soVar.f26558i.addAll(J0);
                        for (int i17 = 0; i17 < J0.size(); i17++) {
                            Long l10 = (Long) J0.get(i17);
                            soVar.h.remove(l10);
                            soVar.f26559j.delete(l10.longValue());
                        }
                        if (soVar.d()) {
                            soVar.f26558i.clear();
                        }
                        hz.z0(soVar, soVar.f26557g, soVar.f26553b, soVar.f26554c, soVar.f26563n, soVar.f26562m, soVar.h, soVar.f26558i, soVar.f26559j, false, false, true, false, false, ywVar, null);
                    }
                    if (J0.size() == 1) {
                        j3 = ((Long) J0.get(0)).longValue();
                    } else {
                        j3 = 0;
                    }
                    UndoView k42 = ywVar.k4();
                    if (k42 != null) {
                        k42.k(j3, 21, Integer.valueOf(J0.size()), soVar, null, null);
                    }
                    ywVar.n4(false);
                    return;
                } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                    ywVar.D4(ywVar.K2, i7, true, false, null);
                    return;
                } else {
                    return;
                }
            default:
                gx gxVar = (gx) obj;
                int i18 = gxVar.f47535x;
                ArrayList arrayList3 = gxVar.f47529e;
                int i19 = gxVar.f47536y;
                if (i7 == -1) {
                    if (gxVar.E == null) {
                        gxVar.d0();
                        return;
                    } else {
                        gxVar.finishFragment();
                        return;
                    }
                } else if (i7 == 1 && gxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.ur.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.vr messagesStorage = gxVar.getMessagesStorage();
                    messagesStorage.f27219a.c(new org.telegram.messenger.op(messagesStorage, i19, arrayList4, 1));
                    SharedPreferences.Editor edit2 = gxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i14 = ((org.telegram.ui.ActionBar.e2) gxVar).currentAccount;
                    edit2.putInt("account" + i19, i14);
                    edit2.putInt("type" + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(gxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    cx cxVar = gxVar.E;
                    if (cxVar != null) {
                        cxVar.c();
                        return;
                    } else {
                        gxVar.d0();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
