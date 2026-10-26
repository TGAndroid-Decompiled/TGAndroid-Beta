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
    public final int f39578a;
    public final Object f39579b;

    public ga(Object obj, int i10) {
        this.f39578a = i10;
        this.f39579b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11;
        org.telegram.ui.ActionBar.r5 r5Var;
        int i12 = this.f39578a;
        Object obj = this.f39579b;
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
                    if (bdVar.f38037b >= bdVar.V0() && bdVar.T0()) {
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
                    bdVar.f38052n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f38053o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.bb(bdVar, 1));
                    bdVar.f38053o0.addListener(new kg.e(bdVar, 24));
                    bdVar.f38053o0.setDuration(400L);
                    bdVar.f38053o0.setInterpolator(org.telegram.ui.Components.ut.e);
                    bdVar.f38053o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(bdVar, 0));
                    return;
                } else {
                    return;
                }
            case 3:
                mo moVar = (mo) obj;
                if (i10 == -1) {
                    if (moVar.f0(true)) {
                        moVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    moVar.k0();
                    return;
                } else {
                    return;
                }
            case 4:
                ap apVar = (ap) obj;
                if (i10 == -1) {
                    apVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.ActionBar.u5 u5Var = apVar.f37865r;
                    if (u5Var == null || !u5Var.f23139x.f19327f) {
                        apVar.a0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((np) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((vp) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                gq gqVar = (gq) obj;
                if (i10 == -1) {
                    if (gqVar.n0(true)) {
                        gqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    gqVar.s0(true);
                    return;
                } else {
                    return;
                }
            case 8:
                kr krVar = (kr) obj;
                if (i10 == -1) {
                    if (krVar.h0(true)) {
                        krVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    krVar.v0();
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
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                if (i10 == -1) {
                    if (!ta0Var.R.S(true)) {
                        ta0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 10) {
                    org.telegram.ui.Components.sa0 sa0Var = ta0Var.R;
                    sa0Var.l1(sa0Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.fg0) obj).f28188r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.nh0) obj).dismiss();
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.Components.mr0) obj).onBackPressed();
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m71) obj).finishFragment();
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
                    ((ih1) obj).a(false, false);
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
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    if (m10 == 1) {
                        e2Var.R = LocaleController.getString(R.string.DeleteContactTitle);
                        e2Var.T = LocaleController.getString(R.string.DeleteContactSubtitle);
                    } else {
                        e2Var.R = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                        e2Var.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ms(contactsActivity));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(3));
                    e2Var.show();
                    e2Var.i();
                    return;
                } else if (i10 == 1) {
                    SharedConfig.toggleSortContactsByName();
                    contactsActivity.f35473r = SharedConfig.sortContactsByName;
                    org.telegram.ui.ActionBar.y5 y5Var = contactsActivity.f35471n;
                    if (y5Var != null) {
                        org.telegram.ui.Components.ak0 iconView = y5Var.getIconView();
                        if (contactsActivity.f35473r) {
                            i11 = R.drawable.msg_contacts_time;
                        } else {
                            i11 = R.drawable.msg_contacts_name;
                        }
                        AndroidUtilities.updateImageViewImageAnimated(iconView, i11);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f35462e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f35455a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.ds.f27587g).withEndAction(new ls(contactsActivity, 0));
                    contactsActivity.f35462e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 21:
                if (i10 == -1) {
                    ((ot) obj).finishFragment();
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
                    ((lu) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((zu) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((uy) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                lz lzVar = (lz) obj;
                if (i10 == -1) {
                    if (lzVar.X(true)) {
                        lzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    lzVar.d0();
                    return;
                } else {
                    return;
                }
            case 28:
                o00 o00Var = (o00) obj;
                if (i10 == -1) {
                    if (o00Var.j0(true)) {
                        o00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    o00Var.s0();
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
