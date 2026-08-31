package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class or0 extends ph.p {
    public final zu0 D;

    public or0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(context, p2Var, j10);
        this.D = zu0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c3;
        zu0 zu0Var = this.D;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        if (messageObject.getDialogId() == zu0Var.f33979g1) {
            c3 = 0;
        } else {
            c3 = 1;
        }
        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(MessageObject messageObject) {
        char c3;
        int i10;
        int i11;
        zu0 zu0Var = this.D;
        ArrayList arrayList = zu0Var.K0;
        NumberTextView numberTextView = zu0Var.f34015x0;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == zu0Var.f33979g1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        zu0Var.X0++;
                    }
                    if (!zu0Var.f34021z1) {
                        AndroidUtilities.hideKeyboard(zu0Var.f34004s1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33982i0;
                        int i12 = 8;
                        if (zu0Var.X0 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.f34000r0;
                        if (w0Var2 != null) {
                            if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            w0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.f34003s0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.f34005t0;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var5 = zu0Var.f33997q0;
                        if (w0Var5 != null) {
                            if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            w0Var5.setVisibility(i12);
                        }
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        zu0Var.Y0 = false;
                        zu0Var.b1(true);
                    } else {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
        char c3;
        int i10;
        int i11;
        zu0 zu0Var = this.D;
        ArrayList arrayList = zu0Var.K0;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == zu0Var.f33979g1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c3].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    zu0Var.X0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(zu0Var.f34004s1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33982i0;
                    int i12 = 8;
                    if (zu0Var.X0 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.f34000r0;
                    if (w0Var2 != null) {
                        if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.f34003s0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.f34005t0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var5 = zu0Var.f33997q0;
                    if (w0Var5 != null) {
                        if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
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
                    zu0Var.Y0 = false;
                    AndroidUtilities.runOnUIThread(new oq0(this, 1), 20L);
                } else {
                    zu0Var.f34015x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.D.f34013w1;
    }
}
