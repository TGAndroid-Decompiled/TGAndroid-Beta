package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class jm extends View {
    public final ArrayList f46650a;
    public final ArrayList f46651b;
    public final wm f46652c;

    public jm(wm wmVar, Context context) {
        super(context);
        this.f46652c = wmVar;
        this.f46650a = new ArrayList();
        this.f46651b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f46650a;
        arrayList.clear();
        wm wmVar = this.f46652c;
        arrayList.add(wmVar.Z1);
        arrayList.add(wmVar.A0);
        arrayList.add(wmVar.Z);
        arrayList.add(wmVar.Z3);
        arrayList.add(wmVar.X1);
        arrayList.add(wmVar.f51396m3);
        arrayList.add(wmVar.f51237a0);
        arrayList.add(wmVar.f51549y1);
        arrayList.add(wmVar.U);
        arrayList.add(wmVar.f51323g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wm wmVar = this.f46652c;
        wmVar.Wc = true;
        ArrayList arrayList = this.f46651b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wmVar.Wc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wm wmVar = this.f46652c;
        wmVar.Wc = true;
        ArrayList arrayList = this.f46650a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f46651b.add(view);
            }
        }
        wmVar.Wc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f46650a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
