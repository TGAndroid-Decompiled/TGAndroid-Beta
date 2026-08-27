package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class ki implements Utilities.Callback5, Utilities.Callback5Return {

    public final ri f30111a;

    public ki(ri riVar) {
        this.f30111a = riVar;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30111a.M((n41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30111a.M((n41) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
