package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class nm extends View {
    public final ArrayList f48078a;
    public final ArrayList f48079b;
    public final an f48080c;

    public nm(an anVar, Context context) {
        super(context);
        this.f48080c = anVar;
        this.f48078a = new ArrayList();
        this.f48079b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f48078a;
        arrayList.clear();
        an anVar = this.f48080c;
        arrayList.add(anVar.Y1);
        arrayList.add(anVar.f44038z0);
        arrayList.add(anVar.Y);
        arrayList.add(anVar.Y3);
        arrayList.add(anVar.W1);
        arrayList.add(anVar.f43864l3);
        arrayList.add(anVar.Z);
        arrayList.add(anVar.f44014x1);
        arrayList.add(anVar.T);
        arrayList.add(anVar.f43789f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        an anVar = this.f48080c;
        anVar.Vc = true;
        ArrayList arrayList = this.f48079b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        anVar.Vc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        an anVar = this.f48080c;
        anVar.Vc = true;
        ArrayList arrayList = this.f48078a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f48079b.add(view);
            }
        }
        anVar.Vc = false;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.f48078a;
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
