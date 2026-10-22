package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public class p51 extends org.telegram.ui.ActionBar.f3 {
    public final int f29223b;
    public final GradientDrawable f29224c;
    public final o51 d;
    public final d61 e;
    public int f29225f;

    public p51(Context context, org.telegram.ui.ActionBar.n2 n2Var, d61 d61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f29223b = AndroidUtilities.dp(12.0f);
        this.f29224c = new GradientDrawable();
        o51 o51Var = new o51(this, context);
        this.d = o51Var;
        o51Var.addView(d61Var, w7.z5.c(-1.0f, -1));
        this.containerView = o51Var;
        this.e = d61Var;
        d61Var.setParentFragment(n2Var);
        d61Var.setOnScrollListener(new l51(this));
    }

    public static void n(p51 p51Var) {
        d61 d61Var = p51Var.e;
        if (d61Var.c()) {
            p51Var.f29225f = d61Var.getContentTopOffset();
            p51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d61 d61Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(d61Var.f25350a);
        notificationCenter.removeObserver(d61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(d61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        d61 d61Var = this.e;
        Objects.requireNonNull(d61Var);
        z6 z6Var = new z6(d61Var, 10);
        s51 s51Var = d61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var.f31319a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = s51Var.f31320b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(s51Var.f31321c, 8, null, null, null, null, i10));
        ei.e2 e2Var = s51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        c61 c61Var = d61Var.f25356s;
        t51 t51Var = d61Var.f25354n;
        c61Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t51Var, z6Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21398z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, t51Var);
        hg.e2 e2Var2 = d61Var.v;
        t51 t51Var2 = d61Var.f25354n;
        e2Var2.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t51Var2, z6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var2, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(t51Var2, 8, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, i11));
        ImageView imageView2 = e2Var2.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var2.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var.f25353f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = d61Var.f25357w;
        int i13 = org.telegram.ui.ActionBar.h6.f21064h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
