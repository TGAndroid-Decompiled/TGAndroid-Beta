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
import org.telegram.messenger.dl;
import org.telegram.ui.Components.dt;
public final class l4 {
    public static final y3 f29267p = new Object();
    public static final List f29268q = Arrays.asList(2131296505, 2131296493, 2131296499, 2131296511, 2131296501, 2131296514, 2131296510, 2131296500, 2131296504, 2131296495);
    public static final List f29269r = Arrays.asList(2131296493, 2131296499, 2131296511, 2131296500, 2131296501, 2131296514, 2131296510, 2131296504);
    public final View f29270a;
    public final j4 f29271b;
    public Menu f29273e;
    public final int f29276i;
    public Runnable f29277j;
    public dt f29278k;
    public final i6 f29281n;
    public final dh.c f29282o;
    public final Rect f29272c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f29274f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f29275g = f29267p;
    public boolean h = true;
    public final z3 f29279l = new z3(this);
    public final dl f29280m = new dl(22);

    public l4(Context context, View view, int i7, i6 i6Var, dh.c cVar) {
        this.f29270a = view;
        this.f29276i = i7;
        this.f29282o = cVar;
        this.f29281n = i6Var;
        this.f29271b = new j4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i7, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i7);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static android.widget.LinearLayout b(org.telegram.ui.ActionBar.l4 r25, android.content.Context r26, android.view.MenuItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.b(org.telegram.ui.ActionBar.l4, android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l4.c():void");
    }

    public final ArrayList d(Menu menu) {
        dt dtVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; menu != null && i7 < menu.size(); i7++) {
            MenuItem item = menu.getItem(i7);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296504 || (dtVar = this.f29278k) == null || ((Boolean) dtVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296505 || this.f29277j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
