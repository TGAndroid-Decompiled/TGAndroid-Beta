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
public final class o9 extends org.telegram.ui.ActionBar.j {
    public final int f48235a;
    public final Object f48236b;

    public o9(Object obj, int i3) {
        this.f48235a = i3;
        this.f48236b = obj;
    }

    @Override
    public final void b(int i3) {
        Runnable runnable;
        int i10;
        org.telegram.ui.ActionBar.y4 y4Var;
        cw cwVar;
        int i11;
        long j10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12 = this.f48235a;
        Object obj = this.f48236b;
        switch (i12) {
            case 0:
                if (i3 == -1) {
                    ((s9) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                x9 x9Var = (x9) obj;
                if (i3 == -1) {
                    x9Var.finishFragment();
                    return;
                } else if (i3 == 1 && x9Var.f51892a.getText().length() != 0) {
                    x9.Z(x9Var);
                    x9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                ka kaVar = (ka) obj;
                if (i3 == -1) {
                    kaVar.finishFragment();
                    return;
                } else if (i3 == 1) {
                    ka.d0(kaVar);
                    ka.e0(kaVar);
                    return;
                } else {
                    return;
                }
            case 3:
                if (i3 == -1) {
                    ((kb) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                pc pcVar = (pc) obj;
                if (i3 == -1) {
                    if (pcVar.f48512b >= pcVar.Z0() && pcVar.X0()) {
                        pcVar.c1();
                        return;
                    } else {
                        pcVar.finishFragment();
                        return;
                    }
                } else if (i3 == 1) {
                    FrameLayout frameLayout = (FrameLayout) pcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    pcVar.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    pcVar.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    pcVar.M.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    ac acVar = new ac(pcVar, pcVar.getParentActivity(), canvas, (pcVar.M.getMeasuredWidth() / 2.0f) + f10, (pcVar.M.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n, paint, createBitmap, paint2, f10, f11, 0);
                    pcVar.f48528n0 = acVar;
                    acVar.setOnTouchListener(new fi.a(2));
                    pcVar.f48529o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pcVar.f48530p0 = ofFloat;
                    ofFloat.addUpdateListener(new gi.ea(pcVar, 1));
                    pcVar.f48530p0.addListener(new org.telegram.ui.Cells.w9(pcVar, 4));
                    pcVar.f48530p0.setDuration(400L);
                    pcVar.f48530p0.setInterpolator(org.telegram.ui.Components.ks.f35477e);
                    pcVar.f48530p0.start();
                    frameLayout.addView(pcVar.f48528n0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new vb(pcVar, 0));
                    return;
                } else {
                    return;
                }
            case 5:
                ad adVar = (ad) obj;
                long j11 = adVar.f43740k0;
                qc qcVar = adVar.f43757x0;
                if (i3 == -1) {
                    if (adVar.f43751t0) {
                        ad.d0(adVar);
                        return;
                    } else {
                        adVar.finishFragment();
                        return;
                    }
                } else if (i3 == 1) {
                    int i13 = adVar.f43739j0;
                    if (i13 == 0) {
                        if (adVar.getParentActivity() != null) {
                            if (adVar.f43751t0) {
                                ad.d0(adVar);
                                return;
                            } else if (adVar.d.f35188a.length() == 0) {
                                Vibrator vibrator = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(adVar.d);
                                return;
                            } else {
                                adVar.f43751t0 = true;
                                org.telegram.messenger.g0.i3(qcVar, 200L);
                                if (adVar.f43756x.g()) {
                                    adVar.f43750s0 = true;
                                    return;
                                } else {
                                    adVar.f43752u0 = Integer.valueOf(org.telegram.messenger.hp.s1(ad.h0(adVar)).U(adVar.d.getText().toString(), new ArrayList(), adVar.f43758y.getText().toString(), 2, false, null, null, -1, adVar));
                                    return;
                                }
                            }
                        }
                        return;
                    } else if (i13 == 1) {
                        if (!adVar.f43730c0) {
                            if (adVar.f43758y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
                                String M0 = org.telegram.messenger.bd.M0(2131752316, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                                adVar.showDialog(s1Var);
                                return;
                            } else if (!adVar.f43728b0) {
                                Vibrator vibrator2 = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(adVar.W);
                                return;
                            } else {
                                org.telegram.messenger.g0.i3(qcVar, 200L);
                                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(ad.e0(adVar));
                                long j12 = adVar.f43740k0;
                                String str = adVar.Z;
                                Runnable runnable2 = new Runnable(this) {
                                    public final o9 f50454b;

                                    {
                                        this.f50454b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f50454b.f48236b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.n10 n10Var = adVar2.f43753v0;
                                                if (n10Var != null) {
                                                    n10Var.a(adVar2, Long.valueOf(adVar2.f43740k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f50454b.f48236b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.n10 n10Var2 = adVar3.f43753v0;
                                                if (n10Var2 != null) {
                                                    n10Var2.a(adVar3, Long.valueOf(adVar3.f43740k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) {
                                    public final o9 f50454b;

                                    {
                                        this.f50454b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ad adVar2 = (ad) this.f50454b.f48236b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.n10 n10Var = adVar2.f43753v0;
                                                if (n10Var != null) {
                                                    n10Var.a(adVar2, Long.valueOf(adVar2.f43740k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                ad adVar3 = (ad) this.f50454b.f48236b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.n10 n10Var2 = adVar3.f43753v0;
                                                if (n10Var2 != null) {
                                                    n10Var2.a(adVar3, Long.valueOf(adVar3.f43740k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s12.h1(j12);
                                tL_channels_updateUsername.username = str;
                                s12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.cm(s12, j12, str, runnable2, adVar, tL_channels_updateUsername, runnable3), 64);
                            }
                        } else {
                            org.telegram.messenger.n10 n10Var = adVar.f43753v0;
                            if (n10Var != null) {
                                n10Var.a(adVar, Long.valueOf(j11));
                            }
                        }
                        if (adVar.f43753v0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j11);
                            bundle.putInt("chatType", 2);
                            adVar.presentFragment(new r40(bundle), true);
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
                ln lnVar = (ln) obj;
                if (i3 == -1) {
                    if (lnVar.j0(true)) {
                        lnVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    lnVar.o0();
                    return;
                } else {
                    return;
                }
            case 7:
                if (i3 == -1) {
                    ((qo) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i3 == -1) {
                    ((xo) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                ip ipVar = (ip) obj;
                if (i3 == -1) {
                    if (ipVar.r0(true)) {
                        ipVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    ipVar.w0(true);
                    return;
                } else {
                    return;
                }
            case 10:
                nq nqVar = (nq) obj;
                if (i3 == -1) {
                    if (nqVar.l0(true)) {
                        nqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    nqVar.z0();
                    return;
                } else {
                    return;
                }
            case 11:
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) obj;
                if (i3 == -1) {
                    z7Var.dismiss();
                    return;
                } else {
                    z7Var.P0(i3);
                    return;
                }
            case 12:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.ma) obj).dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) obj;
                if (i3 == -1) {
                    if (!biVar.f32275t2.k()) {
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.f32275t2.w(i3);
                return;
            case 14:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.n20) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.r80 r80Var = (org.telegram.ui.Components.r80) obj;
                if (i3 == -1) {
                    if (!r80Var.S.V(true)) {
                        r80Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 10) {
                    org.telegram.ui.Components.q80 q80Var = r80Var.S;
                    q80Var.p1(q80Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i3 == -1 && (runnable = ((org.telegram.ui.Components.od0) obj).f36812r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
            case 17:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.se0) obj).dismiss();
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.Components.oo0) obj).onBackPressed();
                return;
            case 19:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.h41) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.voip.f0) obj).b(false, false);
                    return;
                }
                return;
            case 21:
                if (i3 == -1) {
                    ((sb1) obj).a(false, false);
                    return;
                }
                return;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i3 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                    if (y4Var.s()) {
                        contactsActivity.m0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i3 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.f41208a0;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    if (m10 == 1) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131751551, null);
                        s1Var2.U = org.telegram.messenger.bd.M0(2131751552, null);
                    } else {
                        s1Var2.S = org.telegram.messenger.bd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        s1Var2.U = org.telegram.messenger.bd.M0(2131751550, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, null), new or(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.Components.lf0(20));
                    s1Var2.show();
                    s1Var2.i();
                    return;
                } else if (i3 == 1) {
                    org.telegram.messenger.az.L0 = !org.telegram.messenger.az.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.az.L0);
                    edit.apply();
                    contactsActivity.f41227r = org.telegram.messenger.az.L0;
                    org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.f41224n;
                    if (f5Var != null) {
                        org.telegram.ui.Components.fh0 iconView = f5Var.getIconView();
                        if (contactsActivity.f41227r) {
                            i10 = 2131232102;
                        } else {
                            i10 = 2131232101;
                        }
                        org.telegram.messenger.g0.R3(iconView, i10);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f41217f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f41207a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.xq.f40453g).withEndAction(new nr(contactsActivity, 0));
                    contactsActivity.f41217f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i3 == -1) {
                    ((os) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i3 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i3 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i3 == -1) {
                    ((ht) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i3 == -1) {
                    ((yt) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                uw uwVar = (uw) obj;
                ArrayList arrayList = uwVar.J2;
                if ((i3 == 201 || i3 == 200 || i3 == 202 || i3 == 203) && (cwVar = uwVar.D0) != null) {
                    HashMap hashMap = cwVar.C0;
                    uw uwVar2 = cwVar.M0;
                    if (i3 == 202) {
                        if (uwVar2 != null && uwVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(uwVar2.getParentActivity());
                            String G = org.telegram.messenger.bd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                            s1Var3.S = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.bd.M0(2131746327, null));
                            s1Var3.U = spannableStringBuilder;
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.Components.lf0(2));
                            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, null), new jo(26, cwVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i3 == 203) {
                        if (cwVar.O()) {
                            uwVar2.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) uwVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i3 == 200) {
                        if (hashMap.size() == 1) {
                            cwVar.o((org.telegram.messenger.zi) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i3 == 201) {
                        uw uwVar3 = new uw(org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true));
                        uwVar3.D2 = new org.telegram.ui.Components.zw(cwVar, 18);
                        uwVar2.presentFragment(uwVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i3 == -1) {
                    pv pvVar = uwVar.G3;
                    if (pvVar != null && pvVar.c()) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        if (kVar2.v()) {
                            cw cwVar2 = uwVar.D0;
                            if (cwVar2 != null && cwVar2.getVisibility() == 0) {
                                cw cwVar3 = uwVar.D0;
                                if (cwVar3.B0) {
                                    cwVar3.R(false);
                                    return;
                                }
                            }
                            uwVar.n4(true);
                            return;
                        }
                        uwVar.G3.a();
                        cw cwVar4 = uwVar.D0;
                        if (cwVar4 != null) {
                            cwVar4.S();
                            return;
                        }
                        return;
                    }
                    jw jwVar = uwVar.A0;
                    if (jwVar == null || !jwVar.f32459n) {
                        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        if (kVar.v()) {
                            cw cwVar5 = uwVar.D0;
                            if (cwVar5 != null && cwVar5.getVisibility() == 0) {
                                cw cwVar6 = uwVar.D0;
                                if (cwVar6.B0) {
                                    cwVar6.R(false);
                                    return;
                                }
                            }
                            uwVar.n4(true);
                            return;
                        } else if (uwVar.f50263m2 || uwVar.X2 != 0 || uwVar.Z2 != 0) {
                            uwVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    jwVar.setIsEditing(false);
                    uwVar.U4(false);
                    return;
                } else if (i3 == 1) {
                    if (uwVar.getParentActivity() != null) {
                        org.telegram.messenger.az.f21675x = true;
                        org.telegram.messenger.az.y();
                        int[] iArr2 = new int[2];
                        uwVar.f50235g0.getLocationInWindow(iArr2);
                        ((LaunchActivity) uwVar.getParentActivity()).K0(false, true, (uwVar.f50235g0.getMeasuredWidth() / 2) + iArr2[0], (uwVar.f50235g0.getMeasuredHeight() / 2) + iArr2[1], new xg(this, 22));
                        uwVar.getNotificationsController().Y();
                        uwVar.K3();
                        return;
                    }
                    return;
                } else if (i3 == 3) {
                    uwVar.a5(true, true, true, false);
                    uwVar.Z.b(true);
                    return;
                } else if (i3 == 11) {
                    uwVar.B4(uwVar.E1);
                    return;
                } else if (i3 == 109) {
                    org.telegram.ui.Components.cz czVar = new org.telegram.ui.Components.cz(uwVar, arrayList);
                    czVar.f32864r1 = new ur(this, 7);
                    uwVar.showDialog(czVar);
                    return;
                } else if (i3 == 110) {
                    org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) uwVar.getMessagesController().T0().get(uwVar.f50230f0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.cz.J0(uwVar, moVar, arrayList, false, false);
                    if (moVar != null) {
                        i11 = moVar.f24243i.size();
                    } else {
                        i11 = 0;
                    }
                    if (J0.size() + i11 > 100) {
                        uwVar.showDialog(org.telegram.ui.Components.t4.M(uwVar.getParentActivity(), org.telegram.messenger.bd.M0(2131750811, null), org.telegram.messenger.bd.M0(2131750812, null)).f27343a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        moVar.f24243i.addAll(J0);
                        for (int i14 = 0; i14 < J0.size(); i14++) {
                            Long l10 = (Long) J0.get(i14);
                            moVar.h.remove(l10);
                            moVar.f24244j.delete(l10.longValue());
                        }
                        if (moVar.d()) {
                            moVar.f24243i.clear();
                        }
                        ez.z0(moVar, moVar.f24242g, moVar.f24238b, moVar.f24239c, moVar.f24248n, moVar.f24247m, moVar.h, moVar.f24243i, moVar.f24244j, false, false, true, false, false, uwVar, null);
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView k42 = uwVar.k4();
                    if (k42 != null) {
                        k42.k(j10, 21, Integer.valueOf(J0.size()), moVar, null, null);
                    }
                    uwVar.n4(false);
                    return;
                } else if (i3 == 100 || i3 == 101 || i3 == 102 || i3 == 103 || i3 == 104 || i3 == 105 || i3 == 106 || i3 == 107 || i3 == 108) {
                    uwVar.D4(uwVar.J2, i3, true, false, null);
                    return;
                } else {
                    return;
                }
            default:
                cx cxVar = (cx) obj;
                int i15 = cxVar.f44464x;
                ArrayList arrayList3 = cxVar.f44458e;
                int i16 = cxVar.f44465y;
                if (i3 == -1) {
                    if (cxVar.E == null) {
                        cxVar.d0();
                        return;
                    } else {
                        cxVar.finishFragment();
                        return;
                    }
                } else if (i3 == 1 && cxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        arrayList4.add(org.telegram.messenger.pr.a(((Long) arrayList3.get(i17)).longValue(), 0L));
                    }
                    org.telegram.messenger.qr messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f24934a.c(new org.telegram.messenger.lp(messagesStorage, i16, arrayList4, 1));
                    SharedPreferences.Editor edit2 = cxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    edit2.putInt("account" + i16, cx.a0(cxVar));
                    edit2.putInt("type" + i16, i15);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(cxVar.getParentActivity());
                    if (i15 == 0) {
                        ChatsWidgetProvider.a(cxVar.getParentActivity(), appWidgetManager, i16);
                    } else {
                        ContactsWidgetProvider.a(cxVar.getParentActivity(), appWidgetManager, i16);
                    }
                    yw ywVar = cxVar.E;
                    if (ywVar != null) {
                        ywVar.n();
                        return;
                    } else {
                        cxVar.d0();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
