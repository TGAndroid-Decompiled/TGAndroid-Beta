package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

public final class c01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final d01 E;

    public final ArrayList f27250a;

    public long f27251b;

    public float f27252c;
    public boolean d;

    public final Runnable f27253e;

    public Runnable f27254f;

    public float f27255g;
    public float h;

    public final float f27256i;

    public final float f27257j;

    public final float f27258k;

    public final float f27259l;

    public final float f27260m;

    public boolean f27261n;

    public final boolean f27262o;

    public final float[] f27263p;

    public final float[] f27264q;

    public final Matrix f27265r;

    public int f27266s;

    public final int f27267t;

    public final int f27268u;
    public int v;

    public int f27269w;

    public float f27270x;

    public final float f27271y;

    public int f27272z;

    public c01(d01 d01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = d01Var;
        this.f27250a = new ArrayList();
        this.f27251b = -1L;
        this.f27252c = 0.0f;
        this.d = true;
        this.f27255g = 0.0f;
        this.h = 0.0f;
        this.f27256i = 0.0f;
        this.f27257j = 0.0f;
        this.f27258k = AndroidUtilities.density;
        this.f27259l = 1.5f;
        this.f27260m = 1.15f;
        this.f27261n = true;
        this.f27262o = false;
        this.f27263p = new float[9];
        this.f27264q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f27265r = matrix2;
        this.f27271y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f27256i = fArr[0];
        this.f27257j = fArr[1];
        this.f27267t = (int) h7.y.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f27268u = (int) h7.y.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f27262o = true;
        matrix2.set(matrix);
        c();
        this.f27253e = runnable;
        this.f27254f = runnable2;
        this.f27259l = 4.0f;
        this.f27252c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11) {
        canvas.save();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.translate(f10, f11);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.l2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.V1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.H1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
            s1Var.c2(canvas, alpha, null);
            s1Var.M1(canvas, alpha);
        }
        s1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        d01 d01Var = this.E;
        int i10 = d01Var.f27601w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            d01Var.f27601w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f27254f;
        if (runnable != null) {
            f01.b(runnable);
            this.f27254f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f27265r;
        float[] fArr = this.f27264q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f27263p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f27261n = false;
    }

    public c01(d01 d01Var, ArrayList arrayList, Runnable runnable) {
        zk0 zk0Var;
        org.telegram.ui.jm jmVar;
        int i10;
        float f10;
        float f11;
        ArrayList arrayList2;
        int i11;
        float f12;
        float f13;
        ArrayList arrayList3;
        int i12;
        ?? obj = new Object();
        obj.E = d01Var;
        ArrayList arrayList4 = new ArrayList();
        obj.f27250a = arrayList4;
        obj.f27251b = -1L;
        obj.f27252c = 0.0f;
        obj.d = true;
        obj.f27255g = 0.0f;
        obj.h = 0.0f;
        obj.f27256i = 0.0f;
        obj.f27257j = 0.0f;
        obj.f27258k = AndroidUtilities.density;
        obj.f27259l = 1.5f;
        obj.f27260m = 1.15f;
        obj.f27261n = true;
        obj.f27262o = false;
        obj.f27263p = new float[9];
        obj.f27264q = new float[9];
        obj.f27265r = new Matrix();
        obj.f27271y = (float) (Math.random() * 2.0d);
        obj.A = new int[1];
        obj.B = new int[2];
        arrayList4.addAll(arrayList);
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            View view = (View) arrayList.get(i13);
            iMin2 = Math.min(iMin2, (int) view.getX());
            iMax = Math.max(iMax, view.getWidth() + ((int) view.getX()));
            iMin = Math.min(iMin, (int) view.getY());
            iMax2 = Math.max(iMax2, view.getHeight() + ((int) view.getY()));
        }
        float f14 = iMin;
        obj.f27257j = f14;
        float f15 = iMin2;
        obj.f27256i = f15;
        obj.f27267t = iMax - iMin2;
        obj.f27268u = iMax2 - iMin;
        obj.f27254f = runnable;
        obj.f27253e = new l1(arrayList, 1);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (arrayList.get(i14) instanceof org.telegram.ui.Cells.s1) {
                ((org.telegram.ui.Cells.s1) arrayList.get(i14)).f25411ke = true;
            }
        }
        obj.C = Bitmap.createBitmap(obj.f27267t, obj.f27268u, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(obj.C);
        if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof zk0)) {
            zk0 zk0Var2 = (zk0) ((View) arrayList.get(0)).getParent();
            if (zk0Var2.getParent() instanceof org.telegram.ui.jm) {
                org.telegram.ui.jm jmVar2 = (org.telegram.ui.jm) zk0Var2.getParent();
                org.telegram.ui.rn chatActivity = jmVar2.getChatActivity();
                ArrayList arrayList5 = new ArrayList(10);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int iSave = canvas.save();
                int i15 = 0;
                ?? r10 = obj;
                while (i15 < 3) {
                    arrayList5.clear();
                    if (i15 != 2 || zk0Var2.T1) {
                        zk0Var = zk0Var2;
                        int i16 = 0;
                        while (true) {
                            jmVar = jmVar2;
                            if (i16 >= arrayList.size()) {
                                break;
                            }
                            View view2 = (View) arrayList.get(i16);
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (view2.getY() > zk0Var.getHeight() || view2.getY() + view2.getHeight() < 0.0f) {
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                    if (s1Var.getVisibility() != 4 && s1Var.getVisibility() != 8) {
                                        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                                        MessageObject.GroupedMessagePosition position = (currentMessagesGroup == null || currentMessagesGroup.positions == null) ? null : currentMessagesGroup.getPosition(s1Var.getMessageObject());
                                        f12 = f14;
                                        if (i15 == 0 && (position != null || s1Var.getTransitionParams().f25186w0)) {
                                            if (position == null || position.last || (position.minX == 0 && position.minY == 0)) {
                                                if (position == null || position.last) {
                                                    arrayList6.add(s1Var);
                                                }
                                                if ((position == null || (position.minX == 0 && position.minY == 0)) && s1Var.S2()) {
                                                    arrayList7.add(s1Var);
                                                }
                                            }
                                            if (position != null || s1Var.getTransitionParams().C0 || s1Var.getTransitionParams().f25186w0) {
                                                if (position == null || (position.flags & s1Var.s0()) != 0) {
                                                    arrayList8.add(s1Var);
                                                }
                                                if (position != null) {
                                                    int i17 = position.flags;
                                                    if ((i17 & 8) != 0 && (i17 & 1) != 0) {
                                                        arrayList9.add(s1Var);
                                                    }
                                                } else {
                                                    arrayList9.add(s1Var);
                                                }
                                            }
                                        }
                                        if (currentMessagesGroup != null) {
                                            if (i15 == 0) {
                                                i12 = 1;
                                                if (currentMessagesGroup.messages.size() != 1) {
                                                }
                                            } else {
                                                i12 = 1;
                                            }
                                            if ((i15 != i12 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i15 != 0 || !s1Var.getMessageObject().deleted) && ((i15 != 1 || s1Var.getMessageObject().deleted) && ((i15 != 2 || s1Var.kc) && (i15 == 2 || !s1Var.kc))))) {
                                                if (!arrayList5.contains(currentMessagesGroup)) {
                                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                                    transitionParams.left = 0;
                                                    transitionParams.top = 0;
                                                    transitionParams.right = 0;
                                                    transitionParams.bottom = 0;
                                                    transitionParams.pinnedBotton = false;
                                                    transitionParams.pinnedTop = false;
                                                    transitionParams.cell = s1Var;
                                                    arrayList5.add(currentMessagesGroup);
                                                }
                                                currentMessagesGroup.transitionParams.pinnedTop = s1Var.m3();
                                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var.l3();
                                                int backgroundDrawableLeft = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                                                int backgroundDrawableRight = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                                                int backgroundDrawableTop = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                                                int backgroundDrawableBottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                                                i15 = i15;
                                                f13 = f15;
                                                int iDp = (s1Var.getCurrentPosition().flags & 4) == 0 ? backgroundDrawableTop - AndroidUtilities.dp(10.0f) : backgroundDrawableTop;
                                                arrayList3 = arrayList6;
                                                int iDp2 = (s1Var.getCurrentPosition().flags & 8) == 0 ? AndroidUtilities.dp(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                if (s1Var.kc) {
                                                    currentMessagesGroup.transitionParams.cell = s1Var;
                                                }
                                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                                int i18 = transitionParams2.top;
                                                if (i18 == 0 || iDp < i18) {
                                                    transitionParams2.top = iDp;
                                                }
                                                int i19 = transitionParams2.bottom;
                                                if (i19 == 0 || iDp2 > i19) {
                                                    transitionParams2.bottom = iDp2;
                                                }
                                                int i20 = transitionParams2.left;
                                                if (i20 == 0 || backgroundDrawableLeft < i20) {
                                                    transitionParams2.left = backgroundDrawableLeft;
                                                }
                                                int i21 = transitionParams2.right;
                                                if (i21 == 0 || backgroundDrawableRight > i21) {
                                                    transitionParams2.right = backgroundDrawableRight;
                                                }
                                            }
                                        }
                                        i15 = i15;
                                        f13 = f15;
                                        arrayList3 = arrayList6;
                                    }
                                }
                                f12 = f14;
                                f13 = f15;
                                arrayList3 = arrayList6;
                            } else {
                                i11 = i16;
                                f12 = f14;
                                f13 = f15;
                                arrayList3 = arrayList6;
                            }
                            i16 = i11 + 1;
                            arrayList6 = arrayList3;
                            jmVar2 = jmVar;
                            f14 = f12;
                            i15 = i15;
                            f15 = f13;
                        }
                        i10 = i15;
                        f10 = f14;
                        f11 = f15;
                        ArrayList arrayList10 = arrayList6;
                        int i22 = 0;
                        ?? r11 = r10;
                        while (i22 < arrayList5.size()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) arrayList5.get(i22);
                            float fD2 = groupedMessages.transitionParams.cell.D2(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages.transitionParams;
                            float f16 = transitionParams3.left + fD2 + transitionParams3.offsetLeft;
                            float fDp = transitionParams3.top + transitionParams3.offsetTop;
                            float f17 = transitionParams3.right + fD2 + transitionParams3.offsetRight;
                            int i23 = i22;
                            float fDp2 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (!transitionParams3.backgroundChangeBounds) {
                                fDp += transitionParams3.cell.getTranslationY();
                                fDp2 += groupedMessages.transitionParams.cell.getTranslationY();
                            }
                            fDp = fDp < (chatActivity.f42160o9 - ((float) chatActivity.q9)) - ((float) AndroidUtilities.dp(20.0f)) ? (chatActivity.f42160o9 - chatActivity.q9) - AndroidUtilities.dp(20.0f) : fDp;
                            fDp2 = fDp2 > ((float) (AndroidUtilities.dp(20.0f) + zk0Var.getMeasuredHeight())) ? AndroidUtilities.dp(20.0f) + zk0Var.getMeasuredHeight() : fDp2;
                            float f18 = r11.f27257j;
                            float f19 = fDp - f18;
                            float f20 = fDp2 - f18;
                            float f21 = r11.f27256i;
                            float f22 = f16 - f21;
                            float f23 = f17 - f21;
                            boolean z10 = (groupedMessages.transitionParams.cell.getScaleX() == 1.0f && groupedMessages.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                            if (z10) {
                                canvas.save();
                                canvas.scale(groupedMessages.transitionParams.cell.getScaleX(), groupedMessages.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f23, f22, 2.0f, f22), com.google.android.recaptcha.internal.a.A(f20, f19, 2.0f, f19));
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages.transitionParams;
                            ArrayList arrayList11 = arrayList8;
                            ArrayList arrayList12 = arrayList10;
                            ArrayList arrayList13 = arrayList7;
                            transitionParams4.cell.A1(canvas, (int) f22, (int) f19, (int) f23, (int) f20, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, jmVar.getKeyboardHeight());
                            MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages.transitionParams;
                            transitionParams5.cell = null;
                            transitionParams5.drawCaptionLayout = groupedMessages.hasCaption;
                            if (z10) {
                                canvas.restore();
                                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                                    View view3 = (View) arrayList.get(i24);
                                    if (view3 instanceof org.telegram.ui.Cells.s1) {
                                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view3;
                                        if (s1Var2.getCurrentMessagesGroup() == groupedMessages) {
                                            int left = s1Var2.getLeft();
                                            int top = s1Var2.getTop();
                                            view3.setPivotX(((f23 - f22) / 2.0f) + (f22 - left));
                                            view3.setPivotY(((f20 - f19) / 2.0f) + (f19 - top));
                                        }
                                    }
                                }
                            }
                            arrayList10 = arrayList12;
                            arrayList7 = arrayList13;
                            i22 = i23 + 1;
                            arrayList8 = arrayList11;
                            arrayList5 = arrayList5;
                            r11 = this;
                        }
                        arrayList2 = arrayList10;
                    } else {
                        zk0Var = zk0Var2;
                        i10 = i15;
                        jmVar = jmVar2;
                        f10 = f14;
                        f11 = f15;
                        arrayList2 = arrayList6;
                    }
                    i15 = i10 + 1;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    jmVar2 = jmVar;
                    f14 = f10;
                    f15 = f11;
                    arrayList5 = arrayList5;
                    r10 = this;
                    zk0Var2 = zk0Var;
                }
                zk0 zk0Var3 = zk0Var2;
                float f24 = f14;
                float f25 = f15;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList7;
                ArrayList arrayList16 = arrayList8;
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    View view4 = (View) arrayList.get(i25);
                    canvas.save();
                    canvas.translate(view4.getX() - f25, view4.getY() - f24);
                    view4.draw(canvas);
                    if (view4 instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) view4).W1(canvas);
                    } else if (view4 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view4).B(canvas);
                    }
                    canvas.restore();
                }
                zk0Var3.getY();
                float f26 = chatActivity.f42160o9;
                AndroidUtilities.dp(4.0f);
                int size = arrayList14.size();
                if (size > 0) {
                    for (int i26 = 0; i26 < size; i26++) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList14.get(i26);
                        b(canvas, s1Var3, 0, s1Var3.getX() - f25, s1Var3.getY() - f24);
                    }
                    arrayList14.clear();
                }
                int size2 = arrayList15.size();
                if (size2 > 0) {
                    for (int i27 = 0; i27 < size2; i27++) {
                        org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList15.get(i27);
                        b(canvas, s1Var4, 1, s1Var4.getX() - f25, s1Var4.getY() - f24);
                    }
                    arrayList15.clear();
                }
                int size3 = arrayList16.size();
                if (size3 > 0) {
                    for (int i28 = 0; i28 < size3; i28++) {
                        org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList16.get(i28);
                        if (s1Var5.getCurrentPosition() != null || s1Var5.getTransitionParams().f25186w0) {
                            b(canvas, s1Var5, 2, s1Var5.getX() - f25, s1Var5.getY() - f24);
                        }
                    }
                    arrayList16.clear();
                }
                int size4 = arrayList9.size();
                if (size4 > 0) {
                    for (int i29 = 0; i29 < size4; i29++) {
                        org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) arrayList9.get(i29);
                        if (s1Var6.getCurrentPosition() != null || s1Var6.getTransitionParams().f25186w0) {
                            b(canvas, s1Var6, 3, s1Var6.getX() - f25, s1Var6.getY() - f24);
                        }
                    }
                    arrayList9.clear();
                }
                try {
                    canvas.restoreToCount(iSave);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    if (arrayList.get(i30) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList.get(i30)).f25411ke = false;
                    }
                }
            }
        }
    }

    public c01(d01 d01Var, View view, float f10, Runnable runnable) {
        org.telegram.ui.Cells.s1 s1Var;
        this.E = d01Var;
        ArrayList arrayList = new ArrayList();
        this.f27250a = arrayList;
        this.f27251b = -1L;
        this.f27252c = 0.0f;
        this.d = true;
        this.f27255g = 0.0f;
        this.h = 0.0f;
        this.f27256i = 0.0f;
        this.f27257j = 0.0f;
        this.f27258k = AndroidUtilities.density;
        this.f27259l = 1.5f;
        this.f27260m = 1.15f;
        this.f27261n = true;
        this.f27262o = false;
        this.f27263p = new float[9];
        this.f27264q = new float[9];
        this.f27265r = new Matrix();
        this.f27271y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        arrayList.add(view);
        this.f27267t = view.getWidth();
        int height = view.getHeight();
        this.f27268u = height;
        this.f27257j = view.getY();
        this.f27256i = 0.0f;
        if (view instanceof org.telegram.ui.Cells.a0) {
            org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) view;
            this.f27267t = Math.max(1, a0Var.getBoundsRight() - a0Var.getBoundsLeft());
            this.f27256i = a0Var.getBoundsLeft() + 0.0f;
        }
        this.f27254f = runnable;
        this.f27253e = new up0(this, 15);
        this.f27259l = 1.5f * f10;
        this.f27260m = 1.15f / (((f10 - 1.0f) / 3.0f) + 1.0f);
        this.C = Bitmap.createBitmap(this.f27267t, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.C);
        int iSave = canvas.save();
        canvas.translate(-this.f27256i, 0.0f);
        boolean z10 = view instanceof org.telegram.ui.Cells.s1;
        if (z10) {
            ((org.telegram.ui.Cells.s1) view).f25411ke = true;
        }
        boolean z11 = view instanceof org.telegram.ui.Cells.v0;
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.J()) {
                canvas.save();
                canvas.translate(v0Var.f25743f0 / 2.0f, view.getPaddingTop());
                v0Var.z(canvas, true);
                v0Var.C(canvas, true);
                canvas.restore();
            } else if (z10) {
                s1Var = (org.telegram.ui.Cells.s1) view;
                if (s1Var.B1()) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    s1Var.C1(canvas, true, false);
                    canvas.restore();
                }
            }
        } else if (z10) {
            s1Var = (org.telegram.ui.Cells.s1) view;
            if (s1Var.B1()) {
                canvas.save();
                canvas.translate(0.0f, view.getPaddingTop());
                s1Var.C1(canvas, true, false);
                canvas.restore();
            }
        }
        view.draw(canvas);
        if (z10) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            ImageReceiver avatarImage = s1Var2.getAvatarImage();
            if (avatarImage != null && avatarImage.getVisible()) {
                canvas.save();
                canvas.translate(0.0f, -view.getY());
                avatarImage.draw(canvas);
                canvas.restore();
            }
            s1Var2.f25411ke = false;
        }
        if (z10) {
            canvas.save();
            canvas.translate(0.0f, view.getPaddingTop());
            ((org.telegram.ui.Cells.s1) view).W1(canvas);
            canvas.restore();
        } else if (z11) {
            ((org.telegram.ui.Cells.v0) view).B(canvas);
        }
        try {
            canvas.restoreToCount(iSave);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.f27256i = view.getX() + this.f27256i;
    }
}
