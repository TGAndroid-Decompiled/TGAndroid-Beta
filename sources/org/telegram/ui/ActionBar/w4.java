package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tt;
public final class w4 {
    public static final i4 f21665p = new Object();
    public static final List f21666q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List f21667r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View f21668a;
    public final u4 f21669b;
    public Menu f21671e;
    public final int f21674i;
    public Runnable f21675j;
    public tt f21676k;
    public final d6 f21679n;
    public final ah.c f21680o;
    public final Rect f21670c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f21672f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f21673g = f21665p;
    public boolean h = true;
    public final j4 f21677l = new j4(this);
    public final a4.e f21678m = new a4.e(23);

    public w4(Context context, View view, int i10, d6 d6Var, ah.c cVar) {
        this.f21668a = view;
        this.f21674i = i10;
        this.f21680o = cVar;
        this.f21679n = d6Var;
        this.f21669b = new u4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(w4 w4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        float f7;
        int v02;
        int i10;
        int i11;
        int i12;
        float f10;
        d6 d6Var = w4Var.f21679n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        boolean z13 = false;
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        if (z10) {
            f7 = 42.0f;
        } else {
            f7 = 48.0f;
        }
        linearLayout.setMinimumHeight(AndroidUtilities.dp(f7));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int v03 = i6.v0(i6.f20913i6, d6Var);
        int i13 = w4Var.f21674i;
        if (i13 == 0) {
            v02 = i6.v0(i6.f20930j5, d6Var);
            textView.setTextColor(v02);
        } else if (i13 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i13 == 1) {
            v02 = i6.v0(i6.G6, d6Var);
            textView.setTextColor(v02);
        } else {
            v02 = i6.v0(i6.G6, d6Var);
        }
        if (!z11 && !z12) {
            linearLayout.setBackground(i6.f0(v03, 2, -1));
        } else {
            int i14 = 12;
            if (z11) {
                i10 = 12;
            } else {
                i10 = 0;
            }
            if (z12) {
                i11 = 12;
            } else {
                i11 = 0;
            }
            if (z12) {
                i12 = 12;
            } else {
                i12 = 0;
            }
            if (!z11) {
                i14 = 0;
            }
            linearLayout.setBackground(i6.a0(v03, i10, i11, i12, i14));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        if (z10) {
            f10 = 42.0f;
        } else {
            f10 = 48.0f;
        }
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(f10)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            if (w4Var.f21675j != null) {
                z13 = true;
            }
            e(linearLayout, menuItem, z13);
        }
        return linearLayout;
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w4.c():void");
    }

    public final ArrayList d(Menu menu) {
        tt ttVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ttVar = this.f21676k) == null || ((Boolean) ttVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f21675j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
