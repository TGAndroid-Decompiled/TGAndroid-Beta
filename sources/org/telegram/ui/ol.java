package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class ol extends ViewOutlineProvider {
    public final int f40187a;
    public final Object f40188b;

    public ol(Object obj, int i10) {
        this.f40187a = i10;
        this.f40188b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f40187a;
        float f10 = 0.0f;
        Object obj = this.f40188b;
        switch (i10) {
            case 0:
                un unVar = (un) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296591);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.W0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < 4; i12++) {
                        i11 = Math.max(i11, iArr[i12]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i11);
                    return;
                }
                outline.setOval(0, 0, org.telegram.messenger.i0.f3(unVar.U9(), unVar.L9()), org.telegram.messenger.i0.f3(unVar.U9(), unVar.L9()));
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                org.telegram.ui.Components.bi biVar = chatAttachAlertPhotoLayout.f30964b;
                float f11 = biVar.A2[1];
                org.telegram.ui.Components.oh ohVar = biVar.f24837y4;
                if (ohVar != null) {
                    f7 = ohVar.d() + org.telegram.messenger.i0.L(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((biVar.f21587b.getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f23853b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f23857d0) {
                    min = org.telegram.messenger.i0.W1(chatAttachAlertPhotoLayout.f23859e0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f23857d0;
                if (z10) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f12 = chatAttachAlertPhotoLayout.f23877n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f23859e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f23872k1, chatAttachAlertPhotoLayout.f23874m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f23853b0) {
                    int L = org.telegram.messenger.i0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f23846q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                if (v5Var.getTag() != null) {
                    int intValue = ((Integer) v5Var.getTag()).intValue();
                    org.telegram.ui.Components.bm bmVar = (org.telegram.ui.Components.bm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = bmVar.f24892w;
                    if (bmVar.d && chatAttachAlertPhotoLayout2.T0 == chatAttachAlertPhotoLayout2.U0 && !chatAttachAlertPhotoLayout2.O0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f23864g1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = org.telegram.messenger.i0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        return;
                    } else if (intValue == chatAttachAlertPhotoLayout2.M0 - 1) {
                        int L3 = org.telegram.messenger.i0.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        return;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    }
                }
                return;
            case 3:
                int i13 = ((org.telegram.ui.Components.e50) obj).W0;
                outline.setOval(0, 0, i13, i13);
                return;
            case 4:
                outline.setRoundRect(0, ((org.telegram.ui.Components.ua0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(8.0f));
                return;
            case 5:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) obj;
                float f14 = c1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), c1Var.Q);
                        return;
                    }
                } else if (!c1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (c1Var.M) {
                        f10 = org.telegram.messenger.i0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 6:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) obj;
                if (z1Var.f31849b < 1.0f) {
                    outline.setRect((int) z1Var.O, (int) z1Var.N, (int) (view.getMeasuredWidth() - z1Var.O), (int) (view.getMeasuredHeight() - z1Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) z1Var.O, (int) z1Var.N, (int) (view.getMeasuredWidth() - z1Var.O), (int) (view.getMeasuredHeight() - z1Var.N), z1Var.f31849b);
                    return;
                }
            case 7:
                outline.setRoundRect(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.L(16.0f));
                return;
            default:
                vg.e eVar = ((vg.f) obj).P;
                vg.f.l(outline, eVar.f50854m, eVar.f50846b);
                return;
        }
    }
}
