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
    public final Context f21583a;
    public final ActionMode.Callback2 f21584b;
    public final Menu f21585c;
    public final Rect d;
    public final Rect f21586e;
    public final Rect f21587f;
    public final int[] f21588g;
    public final int[] h;
    public final int[] f21589i;
    public final Rect f21590j;
    public final Rect f21591k;
    public final Rect f21592l;
    public final View f21593m;
    public final Point f21594n;
    public final int f21595o;
    public final i4 f21596p = new i4(this, 0);
    public final i4 f21597q = new i4(this, 1);
    public final z4 f21598r;
    public final j4 f21599s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, z4 z4Var) {
        this.f21583a = context;
        this.f21584b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f21585c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f21584b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f21586e = new Rect();
        this.f21587f = new Rect();
        int[] iArr = new int[2];
        this.f21588g = iArr;
        this.h = new int[2];
        this.f21589i = new int[2];
        this.f21590j = new Rect();
        this.f21591k = new Rect();
        this.f21592l = new Rect();
        this.f21593m = view;
        view.getLocationOnScreen(iArr);
        this.f21595o = AndroidUtilities.dp(20.0f);
        this.f21594n = new Point();
        z4Var.f22495e = menu;
        z4Var.f22497g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f21584b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f21598r = z4Var;
        j4 j4Var = new j4(z4Var);
        this.f21599s = j4Var;
        j4Var.f21498b = false;
        j4Var.f21499c = false;
        j4Var.d = false;
        j4Var.f21500e = true;
        j4Var.f21501f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f21586e;
        rect2.set(rect);
        View view = this.f21593m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f21589i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f21588g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f21583a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f21594n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f21592l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f21587f;
        if (c3) {
            Rect rect5 = this.f21590j;
            if (c(rect2, rect5)) {
                this.f21599s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f21595o));
                if (!rect2.equals(rect4)) {
                    i4 i4Var = this.f21596p;
                    view.removeCallbacks(i4Var);
                    j4 j4Var = this.f21599s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.f21502g > 500) {
                        j4Var.f21499c = true;
                    }
                    view.postDelayed(i4Var, 50L);
                    this.f21598r.f22494c.set(rect2);
                    z4 z4Var = this.f21598r;
                    if (z4Var.f22493b.f()) {
                        z4Var.c();
                    }
                }
                this.f21599s.a();
                rect4.set(rect2);
            }
        }
        this.f21599s.d = true;
        rect2.setEmpty();
        this.f21599s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f21593m;
        int[] iArr = this.f21588g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f21589i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f21590j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f21591k;
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
        z4 z4Var = this.f21598r;
        z4Var.f22492a.removeOnLayoutChangeListener(z4Var.f22501l);
        x4 x4Var = z4Var.f22493b;
        if (!x4Var.F) {
            x4Var.G = false;
            x4Var.F = true;
            x4Var.f22445x.cancel();
            x4Var.f22444w.start();
            x4Var.D.setEmpty();
        }
        j4 j4Var = this.f21599s;
        j4Var.f21501f = false;
        z4 z4Var2 = j4Var.f21497a;
        z4Var2.f22492a.removeOnLayoutChangeListener(z4Var2.f22501l);
        x4 x4Var2 = z4Var2.f22493b;
        if (!x4Var2.F) {
            x4Var2.G = false;
            x4Var2.F = true;
            x4Var2.f22445x.cancel();
            x4Var2.f22444w.start();
            x4Var2.D.setEmpty();
        }
        i4 i4Var = this.f21596p;
        View view = this.f21593m;
        view.removeCallbacks(i4Var);
        view.removeCallbacks(this.f21597q);
        this.f21584b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f21585c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f21583a);
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
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.f21593m;
        i4 i4Var = this.f21597q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.f21599s;
        j4Var.f21498b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f21584b.onPrepareActionMode(this, this.f21585c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f21584b;
        View view = this.f21593m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z4) {
        j4 j4Var = this.f21599s;
        j4Var.f21500e = z4;
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
