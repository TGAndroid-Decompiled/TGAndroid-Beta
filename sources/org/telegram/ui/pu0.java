package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
public final class pu0 implements Consumer {
    public final ProfileActivity f48838a;

    public pu0(ProfileActivity profileActivity) {
        this.f48838a = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        ProfileActivity profileActivity = this.f48838a;
        HashSet hashSet = profileActivity.f41760j5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (profileActivity.getMessagesController().f24881q7.f(profileActivity.f41721e1, ((Integer) arrayList.get(i7)).intValue()) == null) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.I5(true);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
