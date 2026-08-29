package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fr0 extends mh.v {
    public final qu0 C;

    public fr0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(context, o2Var, j10);
        this.C = qu0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c3;
        qu0 qu0Var = this.C;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        if (messageObject.getDialogId() == qu0Var.f32069f1) {
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
        qu0 qu0Var = this.C;
        ArrayList arrayList = qu0Var.J0;
        NumberTextView numberTextView = qu0Var.f32104w0;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == qu0Var.f32069f1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        qu0Var.W0++;
                    }
                    if (!qu0Var.f32111y1) {
                        AndroidUtilities.hideKeyboard(qu0Var.f32093r1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32072h0;
                        int i12 = 8;
                        if (qu0Var.W0 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.f32089q0;
                        if (w0Var2 != null) {
                            if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            w0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.f32092r0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.f32095s0;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var5 = qu0Var.f32087p0;
                        if (w0Var5 != null) {
                            if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
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
                        qu0Var.X0 = false;
                        qu0Var.b1(true);
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
        qu0 qu0Var = this.C;
        ArrayList arrayList = qu0Var.J0;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == qu0Var.f32069f1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c3].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    qu0Var.W0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(qu0Var.f32093r1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32072h0;
                    int i12 = 8;
                    if (qu0Var.W0 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.f32089q0;
                    if (w0Var2 != null) {
                        if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.f32092r0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.f32095s0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var5 = qu0Var.f32087p0;
                    if (w0Var5 != null) {
                        if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
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
                    qu0Var.X0 = false;
                    AndroidUtilities.runOnUIThread(new fq0(this, 1), 20L);
                } else {
                    qu0Var.f32104w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.C.f32102v1;
    }
}
