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
public final class h4 extends ActionMode {
    public final Context f20907a;
    public final ActionMode.Callback2 f20908b;
    public final Menu f20909c;
    public final Rect d;
    public final Rect e;
    public final Rect f20910f;
    public final int[] f20911g;
    public final int[] h;
    public final int[] f20912i;
    public final Rect f20913j;
    public final Rect f20914k;
    public final Rect f20915l;
    public final View f20916m;
    public final Point f20917n;
    public final int f20918o;
    public final f4 f20919p = new f4(this, 0);
    public final f4 f20920q = new f4(this, 1);
    public final x4 f20921r;
    public final g4 f20922s;

    public h4(Context context, ActionMode.Callback2 callback2, View view, x4 x4Var) {
        this.f20907a = context;
        this.f20908b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20909c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20908b.onActionItemClicked(h4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f20910f = new Rect();
        int[] iArr = new int[2];
        this.f20911g = iArr;
        this.h = new int[2];
        this.f20912i = new int[2];
        this.f20913j = new Rect();
        this.f20914k = new Rect();
        this.f20915l = new Rect();
        this.f20916m = view;
        view.getLocationOnScreen(iArr);
        this.f20918o = AndroidUtilities.dp(20.0f);
        this.f20917n = new Point();
        x4Var.e = menu;
        x4Var.f21882g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                h4 h4Var = h4.this;
                return h4Var.f20908b.onActionItemClicked(h4Var, menuItem);
            }
        };
        this.f20921r = x4Var;
        g4 g4Var = new g4(x4Var);
        this.f20922s = g4Var;
        g4Var.f20872b = false;
        g4Var.f20873c = false;
        g4Var.d = false;
        g4Var.e = true;
        g4Var.f20874f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f20916m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20912i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20911g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20907a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20917n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20915l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20910f;
        if (a2) {
            Rect rect5 = this.f20913j;
            if (a(rect2, rect5)) {
                this.f20922s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20918o));
                if (!rect2.equals(rect4)) {
                    f4 f4Var = this.f20919p;
                    view.removeCallbacks(f4Var);
                    g4 g4Var = this.f20922s;
                    g4Var.getClass();
                    if (System.currentTimeMillis() - g4Var.f20875g > 500) {
                        g4Var.f20873c = true;
                    }
                    view.postDelayed(f4Var, 50L);
                    this.f20921r.f21880c.set(rect2);
                    x4 x4Var = this.f20921r;
                    if (x4Var.f21879b.f()) {
                        x4Var.c();
                    }
                }
                this.f20922s.a();
                rect4.set(rect2);
            }
        }
        this.f20922s.d = true;
        rect2.setEmpty();
        this.f20922s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20916m;
        int[] iArr = this.f20911g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20912i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20913j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20914k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        x4 x4Var = this.f20921r;
        x4Var.f21878a.removeOnLayoutChangeListener(x4Var.f21886l);
        v4 v4Var = x4Var.f21879b;
        if (!v4Var.F) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.f21820x.cancel();
            v4Var.f21819w.start();
            v4Var.D.setEmpty();
        }
        g4 g4Var = this.f20922s;
        g4Var.f20874f = false;
        x4 x4Var2 = g4Var.f20871a;
        x4Var2.f21878a.removeOnLayoutChangeListener(x4Var2.f21886l);
        v4 v4Var2 = x4Var2.f21879b;
        if (!v4Var2.F) {
            v4Var2.G = false;
            v4Var2.F = true;
            v4Var2.f21820x.cancel();
            v4Var2.f21819w.start();
            v4Var2.D.setEmpty();
        }
        f4 f4Var = this.f20919p;
        View view = this.f20916m;
        view.removeCallbacks(f4Var);
        view.removeCallbacks(this.f20920q);
        this.f20908b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20909c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20907a);
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
        View view = this.f20916m;
        f4 f4Var = this.f20920q;
        view.removeCallbacks(f4Var);
        if (min <= 0) {
            f4Var.run();
            return;
        }
        g4 g4Var = this.f20922s;
        g4Var.f20872b = true;
        g4Var.a();
        view.postDelayed(f4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20908b.onPrepareActionMode(this, this.f20909c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20908b;
        View view = this.f20916m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        g4 g4Var = this.f20922s;
        g4Var.e = z10;
        g4Var.a();
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
