package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class jn extends View {
    public final ArrayList f40564a;
    public final ArrayList f40565b;
    public final wn f40566c;

    public jn(wn wnVar, Context context) {
        super(context);
        this.f40566c = wnVar;
        this.f40564a = new ArrayList();
        this.f40565b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f40564a;
        arrayList.clear();
        wn wnVar = this.f40566c;
        arrayList.add(wnVar.W1);
        arrayList.add(wnVar.f45339x0);
        arrayList.add(wnVar.X);
        arrayList.add(wnVar.W3);
        arrayList.add(wnVar.U1);
        arrayList.add(wnVar.f45165j3);
        arrayList.add(wnVar.Y);
        arrayList.add(wnVar.f45313v1);
        arrayList.add(wnVar.S);
        arrayList.add(wnVar.f45089d2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wn wnVar = this.f40566c;
        wnVar.Sc = true;
        ArrayList arrayList = this.f40565b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wnVar.Sc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wn wnVar = this.f40566c;
        wnVar.Sc = true;
        ArrayList arrayList = this.f40564a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f40565b.add(view);
            }
        }
        wnVar.Sc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f40564a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
