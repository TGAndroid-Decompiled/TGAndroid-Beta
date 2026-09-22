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
public class g51 extends org.telegram.ui.ActionBar.f3 {
    public final int f24419b;
    public final GradientDrawable f24420c;
    public final f51 d;
    public final u51 e;
    public int f24421f;

    public g51(Context context, org.telegram.ui.ActionBar.n2 n2Var, u51 u51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.f24419b = AndroidUtilities.dp(12.0f);
        this.f24420c = new GradientDrawable();
        f51 f51Var = new f51(this, context);
        this.d = f51Var;
        f51Var.addView(u51Var, w7.y5.c(-1.0f, -1));
        this.containerView = f51Var;
        this.e = u51Var;
        u51Var.setParentFragment(n2Var);
        u51Var.setOnScrollListener(new d51(this));
    }

    public static void m(g51 g51Var) {
        u51 u51Var = g51Var.e;
        if (u51Var.c()) {
            g51Var.f24421f = u51Var.getContentTopOffset();
            g51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        u51 u51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(u51Var.f28667a);
        notificationCenter.removeObserver(u51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(u51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        u51 u51Var = this.e;
        Objects.requireNonNull(u51Var);
        x6 x6Var = new x6(u51Var, 10);
        j51 j51Var = u51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.l6(j51Var.f26146a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        ImageView imageView = j51Var.f26147b;
        int i10 = org.telegram.ui.ActionBar.j6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j51Var.f26148c, 8, null, null, null, null, i10));
        ci.h2 h2Var = j51Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Mh));
        t51 t51Var = u51Var.f28673s;
        k51 k51Var = u51Var.f28671n;
        t51Var.getClass();
        org.telegram.ui.Cells.t3.a(arrayList, k51Var, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19511z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var, 0, new Class[]{org.telegram.ui.Cells.r3.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Qh));
        org.telegram.ui.Cells.w3.a(arrayList, k51Var);
        gg.g2 g2Var = u51Var.v;
        k51 k51Var2 = u51Var.f28671n;
        g2Var.getClass();
        org.telegram.ui.Cells.t3.a(arrayList, k51Var2, x6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k51Var2, 8, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.j6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u51Var.f28670f, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        FrameLayout frameLayout = u51Var.f28674w;
        int i13 = org.telegram.ui.ActionBar.j6.f19180h5;
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
