package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nm extends View {
    public final ArrayList f49580a;
    public final ArrayList f49581b;
    public final an f49582c;

    public nm(an anVar, Context context) {
        super(context);
        this.f49582c = anVar;
        this.f49580a = new ArrayList();
        this.f49581b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f49580a;
        arrayList.clear();
        an anVar = this.f49582c;
        arrayList.add(anVar.Z1);
        arrayList.add(anVar.A0);
        arrayList.add(anVar.Z);
        arrayList.add(anVar.Z3);
        arrayList.add(anVar.X1);
        arrayList.add(anVar.f45280m3);
        arrayList.add(anVar.f45118a0);
        arrayList.add(anVar.f45431y1);
        arrayList.add(anVar.U);
        arrayList.add(anVar.f45202g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        an anVar = this.f49582c;
        anVar.Yc = true;
        ArrayList arrayList = this.f49581b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        anVar.Yc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        an anVar = this.f49582c;
        anVar.Yc = true;
        ArrayList arrayList = this.f49580a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f49581b.add(view);
            }
        }
        anVar.Yc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f49580a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
