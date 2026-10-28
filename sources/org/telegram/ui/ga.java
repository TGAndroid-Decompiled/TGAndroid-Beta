package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ga extends org.telegram.ui.ActionBar.j {
    public final int f39546a;
    public final Object f39547b;

    public ga(Object obj, int i10) {
        this.f39546a = i10;
        this.f39547b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11;
        org.telegram.ui.ActionBar.r5 r5Var;
        int i12 = this.f39546a;
        Object obj = this.f39547b;
        switch (i12) {
            case 0:
                ta taVar = (ta) obj;
                if (i10 == -1) {
                    taVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ta.Z(taVar);
                    ta.a0(taVar);
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((wb) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.f37979b >= bdVar.V0() && bdVar.T0()) {
                        bdVar.Y0();
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    bdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    bdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    bdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    mc mcVar = new mc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = mcVar;
                    mcVar.setOnTouchListener(new ei.d(2));
                    bdVar.f37994n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f37995o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.bb(bdVar, 1));
                    bdVar.f37995o0.addListener(new kg.e(bdVar, 24));
                    bdVar.f37995o0.setDuration(400L);
                    bdVar.f37995o0.setInterpolator(org.telegram.ui.Components.ut.e);
                    bdVar.f37995o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(bdVar, 0));
                    return;
                } else {
                    return;
                }
            case 3:
                oo ooVar = (oo) obj;
                if (i10 == -1) {
                    if (ooVar.f0(true)) {
                        ooVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    ooVar.k0();
                    return;
                } else {
                    return;
                }
            case 4:
                cp cpVar = (cp) obj;
                if (i10 == -1) {
                    cpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.ActionBar.u5 u5Var = cpVar.f38422r;
                    if (u5Var == null || !u5Var.f23140x.f19326f) {
                        cpVar.a0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((pp) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                iq iqVar = (iq) obj;
                if (i10 == -1) {
                    if (iqVar.n0(true)) {
                        iqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    iqVar.s0(true);
                    return;
                } else {
                    return;
                }
            case 8:
                mr mrVar = (mr) obj;
                if (i10 == -1) {
                    if (mrVar.h0(true)) {
                        mrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    mrVar.v0();
                    return;
                } else {
                    return;
                }
            case 9:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj;
                if (i10 == -1) {
                    m8Var.dismiss();
                    return;
                } else {
                    m8Var.A0(i10);
                    return;
                }
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (i10 == -1) {
                    if (!tiVar.B0.j()) {
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.B0.v(i10);
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m40) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) obj;
                if (i10 == -1) {
                    if (!ua0Var.R.S(true)) {
                        ua0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 10) {
                    org.telegram.ui.Components.ta0 ta0Var = ua0Var.R;
                    ta0Var.l1(ta0Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.gg0) obj).f28582r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.oh0) obj).dismiss();
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.Components.nr0) obj).onBackPressed();
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.n71) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((kh1) obj).a(false, false);
                    return;
                }
                return;
            case 20:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 == -1) {
                    r5Var = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                    if (r5Var.o()) {
                        contactsActivity.i0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i10 == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    if (m10 == 1) {
                        e2Var.R = LocaleController.getString(R.string.DeleteContactTitle);
                        e2Var.T = LocaleController.getString(R.string.DeleteContactSubtitle);
                    } else {
                        e2Var.R = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                        e2Var.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new os(contactsActivity));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(3));
                    e2Var.show();
                    e2Var.i();
                    return;
                } else if (i10 == 1) {
                    SharedConfig.toggleSortContactsByName();
                    contactsActivity.f35497r = SharedConfig.sortContactsByName;
                    org.telegram.ui.ActionBar.y5 y5Var = contactsActivity.f35495n;
                    if (y5Var != null) {
                        org.telegram.ui.Components.bk0 iconView = y5Var.getIconView();
                        if (contactsActivity.f35497r) {
                            i11 = R.drawable.msg_contacts_time;
                        } else {
                            i11 = R.drawable.msg_contacts_name;
                        }
                        AndroidUtilities.updateImageViewImageAnimated(iconView, i11);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f35486e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f35479a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.ds.f27531g).withEndAction(new ns(contactsActivity, 0));
                    contactsActivity.f35486e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((qt) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((nu) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((bv) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((wy) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                oz ozVar = (oz) obj;
                if (i10 == -1) {
                    if (ozVar.X(true)) {
                        ozVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    ozVar.d0();
                    return;
                } else {
                    return;
                }
            case 28:
                q00 q00Var = (q00) obj;
                if (i10 == -1) {
                    if (q00Var.j0(true)) {
                        q00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    q00Var.s0();
                    return;
                } else {
                    return;
                }
            default:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
