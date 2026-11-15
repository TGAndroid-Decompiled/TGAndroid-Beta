package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.gl;
import org.telegram.ui.Components.xs;
public final class i4 {
    public static final v3 f28682p = new Object();
    public static final List f28683q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f28684r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f28685a;
    public final g4 f28686b;
    public Menu f28688e;
    public final int f28691i;
    public Runnable f28692j;
    public xs f28693k;
    public final e6 f28696n;
    public final dh.c f28697o;
    public final Rect f28687c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f28689f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f28690g = f28682p;
    public boolean h = true;
    public final w3 f28694l = new w3(this);
    public final gl f28695m = new gl(22);

    public i4(Context context, View view, int i7, e6 e6Var, dh.c cVar) {
        this.f28685a = view;
        this.f28691i = i7;
        this.f28697o = cVar;
        this.f28696n = e6Var;
        this.f28686b = new g4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.i4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i4.b(org.telegram.ui.ActionBar.i4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i4.c():void");
    }

    public final ArrayList d(Menu menu) {
        xs xsVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (xsVar = this.f28693k) == null || ((Boolean) xsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f28692j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
