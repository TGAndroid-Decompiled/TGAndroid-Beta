package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nm extends View {
    public final ArrayList f49581a;
    public final ArrayList f49582b;
    public final an f49583c;

    public nm(an anVar, Context context) {
        super(context);
        this.f49583c = anVar;
        this.f49581a = new ArrayList();
        this.f49582b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f49581a;
        arrayList.clear();
        an anVar = this.f49583c;
        arrayList.add(anVar.Z1);
        arrayList.add(anVar.A0);
        arrayList.add(anVar.Z);
        arrayList.add(anVar.Z3);
        arrayList.add(anVar.X1);
        arrayList.add(anVar.f45279m3);
        arrayList.add(anVar.f45117a0);
        arrayList.add(anVar.f45430y1);
        arrayList.add(anVar.U);
        arrayList.add(anVar.f45201g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        an anVar = this.f49583c;
        anVar.Yc = true;
        ArrayList arrayList = this.f49582b;
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
        an anVar = this.f49583c;
        anVar.Yc = true;
        ArrayList arrayList = this.f49581a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f49582b.add(view);
            }
        }
        anVar.Yc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f49581a;
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
