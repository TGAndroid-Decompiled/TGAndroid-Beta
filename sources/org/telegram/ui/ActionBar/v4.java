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
import org.telegram.ui.Components.ct;
public final class v4 {
    public static final h4 f23870p = new Object();
    public static final List f23871q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List f23872r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View f23873a;
    public final t4 f23874b;
    public Menu f23876e;
    public final int f23879i;
    public Runnable f23880j;
    public ct f23881k;
    public final b6 f23884n;
    public final ig.a f23885o;
    public final Rect f23875c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f23877f = new ArrayList();
    public MenuItem.OnMenuItemClickListener f23878g = f23870p;
    public boolean h = true;
    public final i4 f23882l = new i4(this);
    public final j9.a f23883m = new j9.a(9);

    public v4(Context context, View view, int i9, b6 b6Var, ig.a aVar) {
        this.f23873a = view;
        this.f23879i = i9;
        this.f23885o = aVar;
        this.f23884n = b6Var;
        this.f23874b = new t4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i9, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i9);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(v4 v4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        float f10;
        int v02;
        int i9;
        int i10;
        int i11;
        float f11;
        b6 b6Var = v4Var.f23884n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        boolean z13 = false;
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        if (z10) {
            f10 = 42.0f;
        } else {
            f10 = 48.0f;
        }
        linearLayout.setMinimumHeight(AndroidUtilities.dp(f10));
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
        int v03 = f6.v0(f6.f23092i6, b6Var);
        int i12 = v4Var.f23879i;
        if (i12 == 0) {
            v02 = f6.v0(f6.f23108j5, b6Var);
            textView.setTextColor(v02);
        } else if (i12 == 2) {
            v02 = -328966;
            textView.setTextColor(-328966);
            v03 = 553648127;
        } else if (i12 == 1) {
            v02 = f6.v0(f6.G6, b6Var);
            textView.setTextColor(v02);
        } else {
            v02 = f6.v0(f6.G6, b6Var);
        }
        if (!z11 && !z12) {
            linearLayout.setBackground(f6.f0(v03, 2, -1));
        } else {
            int i13 = 12;
            if (z11) {
                i9 = 12;
            } else {
                i9 = 0;
            }
            if (z12) {
                i10 = 12;
            } else {
                i10 = 0;
            }
            if (z12) {
                i11 = 12;
            } else {
                i11 = 0;
            }
            if (!z11) {
                i13 = 0;
            }
            linearLayout.setBackground(f6.a0(v03, i9, i10, i11, i13));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        if (z10) {
            f11 = 42.0f;
        } else {
            f11 = 48.0f;
        }
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(f11)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.l1(0.4f, v02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, g7.e6.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            if (v4Var.f23880j != null) {
                z13 = true;
            }
            e(linearLayout, menuItem, z13);
        }
        return linearLayout;
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v4.c():void");
    }

    public final ArrayList d(Menu menu) {
        ct ctVar;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; menu != null && i9 < menu.size(); i9++) {
            MenuItem item = menu.getItem(i9);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ctVar = this.f23881k) == null || ((Boolean) ctVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.f23880j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
