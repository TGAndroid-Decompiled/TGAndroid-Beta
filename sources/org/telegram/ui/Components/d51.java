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
public class d51 extends org.telegram.ui.ActionBar.h3 {
    public final int f22290b;
    public final GradientDrawable f22291c;
    public final c51 d;
    public final r51 e;
    public int f22292f;

    public d51(Context context, org.telegram.ui.ActionBar.p2 p2Var, r51 r51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.f22290b = AndroidUtilities.dp(12.0f);
        this.f22291c = new GradientDrawable();
        c51 c51Var = new c51(this, context);
        this.d = c51Var;
        c51Var.addView(r51Var, w7.a6.c(-1.0f, -1));
        this.containerView = c51Var;
        this.e = r51Var;
        r51Var.setParentFragment(p2Var);
        r51Var.setOnScrollListener(new a51(this));
    }

    public static void m(d51 d51Var) {
        r51 r51Var = d51Var.e;
        if (r51Var.c()) {
            d51Var.f22292f = r51Var.getContentTopOffset();
            d51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        r51 r51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(r51Var.f26589a);
        notificationCenter.removeObserver(r51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(r51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        r51 r51Var = this.e;
        Objects.requireNonNull(r51Var);
        x6 x6Var = new x6(r51Var, 10);
        g51 g51Var = r51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.l6(g51Var.f23388a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        ImageView imageView = g51Var.f23389b;
        int i10 = org.telegram.ui.ActionBar.j6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(g51Var.f23390c, 8, null, null, null, null, i10));
        bi.t2 t2Var = g51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.l6(t2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Mh));
        q51 q51Var = r51Var.f26595s;
        h51 h51Var = r51Var.f26593n;
        q51Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, h51Var, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, h51Var);
        fg.h2 h2Var = r51Var.v;
        h51 h51Var2 = r51Var.f26593n;
        h2Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, h51Var2, x6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h51Var2, 8, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i11));
        ImageView imageView2 = h2Var.L;
        int i12 = org.telegram.ui.ActionBar.j6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(r51Var.f26592f, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        FrameLayout frameLayout = r51Var.f26596w;
        int i13 = org.telegram.ui.ActionBar.j6.f17998h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
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
