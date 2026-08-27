package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

public final class lr0 implements sk0 {

    public final br0 f30455a;

    public final hu0 f30456b;

    public lr0(hu0 hu0Var, br0 br0Var) {
        this.f30456b = hu0Var;
        this.f30455a = br0Var;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i10, View view) {
        boolean z10;
        int iIntValue;
        View view2 = view;
        hu0 hu0Var = this.f30456b;
        qs0 qs0Var = hu0Var.T;
        if (hu0Var.f29131k1) {
            return false;
        }
        br0 br0Var = this.f30455a;
        if (br0Var.h.getAdapter() == hu0Var.O) {
            return false;
        }
        if (!hu0Var.f29163y1 || br0Var.B == 11) {
            int i11 = br0Var.B;
            if (i11 == 7 && (view2 instanceof org.telegram.ui.Cells.sa)) {
                if (qs0Var.f31970e.isEmpty()) {
                    iIntValue = i10;
                } else {
                    if (i10 >= qs0Var.f31970e.size()) {
                        return false;
                    }
                    iIntValue = ((Integer) qs0Var.f31970e.get(i10)).intValue();
                }
                if (iIntValue < 0 || iIntValue >= qs0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = qs0Var.d.participants.participants.get(iIntValue);
                zk0 zk0Var = (zk0) view2.getParent();
                for (int i12 = 0; i12 < zk0Var.getChildCount(); i12++) {
                    View childAt = zk0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                }
                return hu0Var.I0(chatParticipant, true, view2);
            }
            if (i11 == 1 && (view2 instanceof org.telegram.ui.Cells.f7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.f7) view2).getMessage(), view2, 0, true);
            }
            if (i11 == 3 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if ((i11 == 2 || i11 == 4) && (view2 instanceof org.telegram.ui.Cells.e7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.e7) view2).getMessage(), view2, 0, true);
            }
            if (i11 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                return hu0Var.H0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
            }
            if ((i11 == 0 || (hu0.p0(i11) && hu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.o7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.o7) view2).getMessageObject();
                if (messageObject != null) {
                    return hu0Var.H0(messageObject, view2, br0Var.B, true);
                }
                return false;
            }
            int i13 = br0Var.B;
            if (i13 != 10) {
                if (i13 != 11) {
                    return false;
                }
                hu0Var.N.E(view2);
                return true;
            }
            ps0 ps0Var = hu0Var.M;
            ArrayList arrayList = ps0Var.d;
            hu0 hu0Var2 = ps0Var.f31661f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                }
                org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle);
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var2.f29145r1;
                if (n2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) n2Var;
                    if (profileActivity.Q == null) {
                        z10 = true;
                    } else {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z10 = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                        profileActivity.Q.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                        profileActivity.Q.setAlpha(0.0f);
                        profileActivity.Q.setVisibility(0);
                    }
                } else {
                    z10 = true;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, hu0Var2.getContext(), hu0Var2.B1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                if (!z11) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        return z10;
                    }
                    n2Var.presentFragmentAsPreview(rnVar);
                    return z10;
                }
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(hu0Var2.getContext(), false, false);
                f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                f1Var.setMinimumWidth(160);
                f1Var.setOnClickListener(new l70(ps0Var, 16));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(hu0Var2.getContext(), false, false);
                f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new gh.v2(ps0Var, (TLRPC.Chat) tLObject, i10, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                n2Var.presentFragmentAsPreviewWithMenu(rnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                return z10;
            }
        } else {
            er0 er0Var = br0Var.h;
            pk0 pk0Var = er0Var.R0;
            if (pk0Var != null) {
                pk0Var.a(i10, view2);
                return true;
            }
            qk0 qk0Var = er0Var.S0;
            if (qk0Var != null) {
                qk0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30456b.f29145r1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void s(float f10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30456b.f29145r1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f10);
            }
        }
    }
}
