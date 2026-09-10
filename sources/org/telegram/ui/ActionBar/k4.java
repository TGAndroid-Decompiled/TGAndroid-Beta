package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends ActionMode {
    public final Context f18344a;
    public final ActionMode.Callback2 f18345b;
    public final Menu f18346c;
    public final Rect d;
    public final Rect e;
    public final Rect f18347f;
    public final int[] f18348g;
    public final int[] h;
    public final int[] f18349i;
    public final Rect f18350j;
    public final Rect f18351k;
    public final Rect f18352l;
    public final View f18353m;
    public final Point f18354n;
    public final int f18355o;
    public final i4 f18356p = new i4(this, 0);
    public final i4 f18357q = new i4(this, 1);
    public final z4 f18358r;
    public final j4 f18359s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, z4 z4Var) {
        this.f18344a = context;
        this.f18345b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18346c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18345b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18347f = new Rect();
        int[] iArr = new int[2];
        this.f18348g = iArr;
        this.h = new int[2];
        this.f18349i = new int[2];
        this.f18350j = new Rect();
        this.f18351k = new Rect();
        this.f18352l = new Rect();
        this.f18353m = view;
        view.getLocationOnScreen(iArr);
        this.f18355o = AndroidUtilities.dp(20.0f);
        this.f18354n = new Point();
        z4Var.e = menu;
        z4Var.f18828g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18345b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18358r = z4Var;
        j4 j4Var = new j4(z4Var);
        this.f18359s = j4Var;
        j4Var.f17859b = false;
        j4Var.f17860c = false;
        j4Var.d = false;
        j4Var.e = true;
        j4Var.f17861f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f18353m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18349i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18348g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18344a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18354n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18352l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18347f;
        if (c10) {
            Rect rect5 = this.f18350j;
            if (c(rect2, rect5)) {
                this.f18359s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18355o));
                if (!rect2.equals(rect4)) {
                    i4 i4Var = this.f18356p;
                    view.removeCallbacks(i4Var);
                    j4 j4Var = this.f18359s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.f17862g > 500) {
                        j4Var.f17860c = true;
                    }
                    view.postDelayed(i4Var, 50L);
                    this.f18358r.f18826c.set(rect2);
                    z4 z4Var = this.f18358r;
                    if (z4Var.f18825b.f()) {
                        z4Var.c();
                    }
                }
                this.f18359s.a();
                rect4.set(rect2);
            }
        }
        this.f18359s.d = true;
        rect2.setEmpty();
        this.f18359s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18353m;
        int[] iArr = this.f18348g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18349i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18350j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18351k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        z4 z4Var = this.f18358r;
        z4Var.f18824a.removeOnLayoutChangeListener(z4Var.f18832l);
        x4 x4Var = z4Var.f18825b;
        if (!x4Var.F) {
            x4Var.G = false;
            x4Var.F = true;
            x4Var.f18751x.cancel();
            x4Var.f18750w.start();
            x4Var.D.setEmpty();
        }
        j4 j4Var = this.f18359s;
        j4Var.f17861f = false;
        z4 z4Var2 = j4Var.f17858a;
        z4Var2.f18824a.removeOnLayoutChangeListener(z4Var2.f18832l);
        x4 x4Var2 = z4Var2.f18825b;
        if (!x4Var2.F) {
            x4Var2.G = false;
            x4Var2.F = true;
            x4Var2.f18751x.cancel();
            x4Var2.f18750w.start();
            x4Var2.D.setEmpty();
        }
        i4 i4Var = this.f18356p;
        View view = this.f18353m;
        view.removeCallbacks(i4Var);
        view.removeCallbacks(this.f18357q);
        this.f18345b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18346c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18344a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.f18353m;
        i4 i4Var = this.f18357q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.f18359s;
        j4Var.f17859b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18345b.onPrepareActionMode(this, this.f18346c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18345b;
        View view = this.f18353m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        j4 j4Var = this.f18359s;
        j4Var.e = z10;
        j4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
