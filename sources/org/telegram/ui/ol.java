package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class ol extends ViewOutlineProvider {
    public final int f40297a;
    public final Object f40298b;

    public ol(Object obj, int i10) {
        this.f40297a = i10;
        this.f40298b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f40297a;
        float f10 = 0.0f;
        Object obj = this.f40298b;
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
                outline.setOval(0, 0, org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()), org.telegram.messenger.i0.f3(unVar.P9(), unVar.G9()));
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                org.telegram.ui.Components.bi biVar = chatAttachAlertPhotoLayout.f30947b;
                float f11 = biVar.A2[1];
                org.telegram.ui.Components.oh ohVar = biVar.f24746y4;
                if (ohVar != null) {
                    f7 = ohVar.d() + org.telegram.messenger.i0.L(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((biVar.f21586b.getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f23852b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f23856d0) {
                    min = org.telegram.messenger.i0.W1(chatAttachAlertPhotoLayout.f23858e0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f23856d0;
                if (z10) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f12 = chatAttachAlertPhotoLayout.f23876n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f23845q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f23858e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f23871k1, chatAttachAlertPhotoLayout.f23873m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f23852b0) {
                    int L = org.telegram.messenger.i0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f23845q1;
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
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = bmVar.f24837w;
                    if (bmVar.d && chatAttachAlertPhotoLayout2.T0 == chatAttachAlertPhotoLayout2.U0 && !chatAttachAlertPhotoLayout2.O0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f23863g1) {
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
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) obj;
                float f14 = b1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), b1Var.Q);
                        return;
                    }
                } else if (!b1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (b1Var.M) {
                        f10 = org.telegram.messenger.i0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 6:
                org.telegram.ui.Components.voip.y1 y1Var = (org.telegram.ui.Components.voip.y1) obj;
                if (y1Var.f31769b < 1.0f) {
                    outline.setRect((int) y1Var.O, (int) y1Var.N, (int) (view.getMeasuredWidth() - y1Var.O), (int) (view.getMeasuredHeight() - y1Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) y1Var.O, (int) y1Var.N, (int) (view.getMeasuredWidth() - y1Var.O), (int) (view.getMeasuredHeight() - y1Var.N), y1Var.f31769b);
                    return;
                }
            case 7:
                outline.setRoundRect(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + PremiumPreviewFragment.i0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.L(16.0f));
                return;
            default:
                vg.e eVar = ((vg.f) obj).M;
                vg.f.l(outline, eVar.f50839m, eVar.f50831b);
                return;
        }
    }
}
