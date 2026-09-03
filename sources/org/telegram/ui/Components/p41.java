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
public class p41 extends org.telegram.ui.ActionBar.h3 {
    public final int f29975b;
    public final GradientDrawable f29976c;
    public final o41 d;
    public final d51 f29977e;
    public int f29978f;

    public p41(Context context, org.telegram.ui.ActionBar.p2 p2Var, d51 d51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        this.f29975b = AndroidUtilities.dp(12.0f);
        this.f29976c = new GradientDrawable();
        o41 o41Var = new o41(this, context);
        this.d = o41Var;
        o41Var.addView(d51Var, k7.c6.c(-1.0f, -1));
        this.containerView = o41Var;
        this.f29977e = d51Var;
        d51Var.setParentFragment(p2Var);
        d51Var.setOnScrollListener(new m41(this));
    }

    public static void m(p41 p41Var) {
        d51 d51Var = p41Var.f29977e;
        if (d51Var.c()) {
            p41Var.f29978f = d51Var.getContentTopOffset();
            p41Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        d51 d51Var = this.f29977e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(d51Var.f26186a);
        notificationCenter.removeObserver(d51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(d51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        d51 d51Var = this.f29977e;
        Objects.requireNonNull(d51Var);
        t6 t6Var = new t6(d51Var, 10);
        s41 s41Var = d51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.m6(s41Var.f26632a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.O5));
        ImageView imageView = s41Var.f26633b;
        int i10 = org.telegram.ui.ActionBar.k6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(s41Var.f26634c, 8, null, null, null, null, i10));
        lg.f fVar = s41Var.f26635e;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.Mh));
        c51 c51Var = d51Var.f26193s;
        t41 t41Var = d51Var.f26191n;
        c51Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t41Var, t6Var);
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, t41Var);
        uf.m1 m1Var = d51Var.v;
        t41 t41Var2 = d51Var.f26191n;
        m1Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, t41Var2, t6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(t41Var2, 8, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i11));
        ImageView imageView2 = m1Var.I;
        int i12 = org.telegram.ui.ActionBar.k6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(m1Var.J, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d51Var.f26190f, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        FrameLayout frameLayout = d51Var.f26194w;
        int i13 = org.telegram.ui.ActionBar.k6.f21733h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
