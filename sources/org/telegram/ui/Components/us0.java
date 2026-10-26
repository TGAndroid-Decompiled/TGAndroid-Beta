package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class us0 extends ei.v {
    public final aw0 G;

    public us0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        super(context, r2Var, j10);
        this.G = aw0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        aw0 aw0Var = this.G;
        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
        if (messageObject.getDialogId() == aw0Var.l1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(MessageObject messageObject) {
        char c10;
        int i10;
        int i11;
        aw0 aw0Var = this.G;
        ArrayList arrayList = aw0Var.P0;
        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
        if (messageObject != null) {
            if (messageObject.getDialogId() == aw0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        aw0Var.f26645c1++;
                    }
                    if (!aw0Var.E1) {
                        AndroidUtilities.hideKeyboard(aw0Var.f26704x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26677n0;
                        int i12 = 8;
                        if (aw0Var.f26645c1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.w0 w0Var2 = aw0Var.f26700w0;
                        if (w0Var2 != null) {
                            if (aw0Var.getClosestTab() != 8 && aw0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            w0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = aw0Var.f26703x0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = aw0Var.f26706y0;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var5 = aw0Var.f26697v0;
                        if (w0Var5 != null) {
                            if (aw0Var.getClosestTab() != 8 && aw0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            w0Var5.setVisibility(i12);
                        }
                        aw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            View view = (View) arrayList.get(i13);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        aw0Var.f26648d1 = false;
                        aw0Var.k1(true);
                    } else {
                        aw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(MessageObject messageObject) {
        char c10;
        int i10;
        int i11;
        aw0 aw0Var = this.G;
        ArrayList arrayList = aw0Var.P0;
        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
        if (messageObject != null) {
            if (messageObject.getDialogId() == aw0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    aw0Var.f26645c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(aw0Var.f26704x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26677n0;
                    int i12 = 8;
                    if (aw0Var.f26645c1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var2 = aw0Var.f26700w0;
                    if (w0Var2 != null) {
                        if (aw0Var.getClosestTab() != 8 && aw0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = aw0Var.f26703x0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = aw0Var.f26706y0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var5 = aw0Var.f26697v0;
                    if (w0Var5 != null) {
                        if (aw0Var.getClosestTab() != 8 && aw0Var.getClosestTab() != 13) {
                            i12 = 0;
                        }
                        w0Var5.setVisibility(i12);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        View view = (View) arrayList.get(i13);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    aw0Var.f26648d1 = false;
                    AndroidUtilities.runOnUIThread(new mp0(this, 5), 20L);
                } else {
                    aw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.B1;
    }
}
