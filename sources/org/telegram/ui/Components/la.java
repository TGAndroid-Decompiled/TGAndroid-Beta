package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class la {
    public int f30137a;
    public final View f30138b;
    public final ArrayList f30139c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f30140f;
    public EGLContext f30141g;
    public final Object h;
    public int f30142i;
    public fi.eb f30143j;
    public Object f30144k;
    public Object f30145l;
    public ra f30146m;
    public final qa f30147n;
    public Bitmap f30148o;
    public int f30149p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f30139c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f30140f = new Object();
        this.h = new Object();
        this.f30147n = new qa(0, new pg(this, 15));
        this.f30149p = 0;
        this.f30138b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.i6(this, 6));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f30140f) {
            try {
                if (this.f30141g == null) {
                    this.f30141g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f30146m;
        if (raVar == null) {
            return this.f30148o;
        }
        synchronized (raVar.f32196n) {
            try {
                if (!raVar.f32199q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f32198p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f30148o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f30145l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((pa) obj).f31477b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ra raVar = this.f30146m;
        if (raVar != null) {
            synchronized (raVar.f32196n) {
                raVar.f32199q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f30149p;
        this.f30149p = i10 + 1;
        sb2.append(i10);
        this.f30148o = this.f30147n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(fi.eb ebVar, Object obj) {
        this.f30143j = ebVar;
        this.f30144k = obj;
        this.f30142i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f30145l = renderNode2;
            return;
        }
        this.f30145l = null;
    }
}
