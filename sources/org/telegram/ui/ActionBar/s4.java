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
import org.telegram.messenger.bk;
import org.telegram.ui.Components.ct;
public final class s4 {
    public static final e4 f20772p = new Object();
    public static final List f20773q = Arrays.asList(2131296503, 2131296491, 2131296497, 2131296509, 2131296499, 2131296512, 2131296508, 2131296498, 2131296502, 2131296493);
    public static final List f20774r = Arrays.asList(2131296491, 2131296497, 2131296509, 2131296498, 2131296499, 2131296512, 2131296508, 2131296502);
    public final View f20775a;
    public final q4 f20776b;
    public Menu e;
    public final int f20780i;
    public Runnable f20781j;
    public ct f20782k;
    public final p6 f20785n;
    public final tg.b f20786o;
    public final Rect f20777c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f20778f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f20779g = f20772p;
    public boolean h = true;
    public final f4 f20783l = new f4(this);
    public final bk f20784m = new bk(25);

    public s4(Context context, View view, int i10, p6 p6Var, tg.b bVar) {
        this.f20775a = view;
        this.f20780i = i10;
        this.f20786o = bVar;
        this.f20785n = p6Var;
        this.f20776b = new q4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.s4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.b(org.telegram.ui.ActionBar.s4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ct ctVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296502 || (ctVar = this.f20782k) == null || ((Boolean) ctVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296503 || this.f20781j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
